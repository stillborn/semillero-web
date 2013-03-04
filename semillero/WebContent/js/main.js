var AppRouter = Backbone.Router.extend({

    routes: {
        "" : "home"  ,
        "semillero/list" : "semilleros"
    },

    initialize: function () {
        this.headerView = new HeaderView();
        $('.header').html(this.headerView.el);
    },

    home: function (id) {
        if (!this.homeView) {
            this.homeView = new HomeView();
        }
        $('#content').html(this.homeView.el);        
    },
    semilleros : function(){
    	if (!this.semilleroList) {
            this.semilleroList = new SemilleroListView();
        }
        $('#content').html(this.semilleroList.el);
    }
});

utils.loadTemplate(['HomeView', 'HeaderView', 'SemilleroListView'], function() {
    app = new AppRouter();
    Backbone.history.start();
});