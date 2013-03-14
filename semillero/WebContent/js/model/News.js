window.News = Backbone.Model.extend({

    urlRoot: "/news",

    idAttribute: "_id",

    initialize: function () {
        this.validators = {};
    },
    defaults: {
        _id: null,
        title: "",
        image_url: "",
        text: ""        
    }
});