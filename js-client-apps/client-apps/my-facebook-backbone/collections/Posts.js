

var app = app || {};

var Posts = Backbone.Collection.extend({
    model: app.Post,
    url:'http://localhost:3000/api/posts'  
});


// create sinle collection and export

var posts = new Posts();
app.posts = posts;