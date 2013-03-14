window.Semillero = Backbone.Model.extend({

    urlRoot: "/semillero",

    idAttribute: "_id",

    initialize: function () {
        this.validators = {};
    },
    defaults: {
        _id: null,
        name: "",
        mision: "",
        vision: "",
        image_url : ""
    }
});