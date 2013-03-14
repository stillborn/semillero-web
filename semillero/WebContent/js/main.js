var AppRouter = Backbone.Router.extend({

    routes: {
        "" : "home"  ,
        "semillero/list" : "semilleros",
        "semillero/:id"  : "semilleroDetail",
        "news/list" : "news"        
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
    },
    news : function(){
    	if (!this.newsList) {
            this.newsList = new NewsListView();
        }
        $('#content').html(this.newsList.el);
    },
    semilleroDetail: function(id){    	    	
    	var semillero = new Semillero({_id: id});
    	    	    		
        $("#content").html(new SemilleroView({model: semillero}).el);       
        
        $('#inputDate').datepicker();
    }
});

utils.loadTemplate(['HomeView', 'HeaderView', 'SemilleroListView', 'NewsListView', 'NewsView', "SemilleroView"], function() {
    app = new AppRouter();
    Backbone.history.start();
});