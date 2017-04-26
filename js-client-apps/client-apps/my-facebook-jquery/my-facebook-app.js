

/*

     How to use jQuery ?

     syntax
     --------

     $('select DOM elements').action1().action1()

*/

$(function () { 

    const apiUrl = "http://0.0.0.0:3000/api/posts";
    
    // load existing posts
    let allPosts = [];
    $.ajax(apiUrl, {
        method: 'GET',
        success: function (posts) { 
            allPosts = posts;
            renderPosts();
        }
    })    
    

    //------------------------------------------------------

    let $all_posts_div =$('#all-posts-div');    
    function renderPosts() {
        $all_posts_div.children().remove();
        allPosts.forEach(function (post) { 
            let postTemplate = `
            <div class="list-group-item each-post">
                <div class="alert alert-info" data-id="${post.id}">
                    <span class="badge">${post.name}</span> 
                     <button class="btn btn-danger btn-sm pull-right delete"><span class="glyphicon glyphicon-trash"></span></button>
                    <p>${post.message}</p><br/>
                </div>    
            </div>
            `;
            $all_posts_div.append($(postTemplate));

        });
    }    

    //------------------------------------------------------

    // code executing before delete buttons added to DOM with each Post    
    // let allDeleteBtns = $('#all-posts .delete');
    // console.log(allDeleteBtns.length);

    // Event Delegation
    
    $('#all-posts-div').on('click', '.delete', function (e) { 
        let postId = $(this).closest('div').data("id"); 
        $.ajax(apiUrl + "/" + postId, {
            method: 'DELETE',
            success: function (resp) {
                let filteredPosts=_.filter(allPosts, function (post) { 
                    return post.id !== postId;
                })
                allPosts = filteredPosts;
                renderPosts();
            }
        });
    });


    $('#post-form').submit(function (e) { 
        e.preventDefault();

        // get form-data
        
        let $nameField = $("input", $(this));
        let $messageField = $("textarea", $(this));

        // Validate 

        let name = $nameField.val();
        let message = $messageField.val();
        if (name === "") {
            $nameField.closest('div').addClass('has-error').end().focus();
            return;
        } else {
            $nameField.closest('div').removeClass('has-error')
        }

        // Read all form-fields valus to Model obj
        let newPost = { name, message };
        // console.log(newPost);

        // API call with XHR API ( AJAX )
       
        $.ajax(apiUrl, {
            method: 'POST',
            data: JSON.stringify(newPost),
            contentType: 'application/json',
            success: function (post) {
                allPosts.push(post);
                renderPosts();
                $nameField.val('');
                $messageField.val('');
            }
        });


    });

});