


var app = app || {};

var PostView = Backbone.View.extend({
    tagName: 'div',
    className: 'list-group-item',
    template:_.template($('#post-template').html()), // compiling template with _
    render: function () {
        this.$el.html(this.template(this.model.toJSON()));
        return this;
    }
});

app.PostView = PostView;