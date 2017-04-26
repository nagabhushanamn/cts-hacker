

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
            <div class="list-group-item">
                <div class="alert alert-info">
                    <span class="badge">${post.name}</span><br/>
                    <p>${post.message}</p>
                </div>    
            </div>
            `;
            $all_posts_div.append($(postTemplate));
        });
    }    

    //------------------------------------------------------


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