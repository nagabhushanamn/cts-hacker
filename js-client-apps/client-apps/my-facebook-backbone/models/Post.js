
var app = app || {};

var Post = Backbone.Model.extend({
    id: '',
    name: '',
    message: ''
});

app.Post = Post;