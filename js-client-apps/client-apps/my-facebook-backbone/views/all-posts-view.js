var app = app || {};

var AllPosts = Backbone.View.extend({

    el: $('#all-posts-div'),

    initialize: function () {
        app.posts.fetch({
            reset: true
        });
        this.listenTo(app.posts, 'reset', this.addAll);
    },

    render: function () {
        return this;
    },

    addAll: function () {
        app.posts.each(this.addOne, this)
    },

    addOne: function (post) {
        var view = new app.PostView({
            model: post
        });
        this.$el.append(view.render().el);
    },

});


app.AllPosts = AllPosts;