	$(function() {
    var nav = $('.my-container');
    nav.css({backgroundColor: "rgba(44,62,80,0.5)"});
    $(window).on('scroll',function(){
        var nav = $('.dbmail_logo');
        var bottomnav = $('.credits_navbar');
        var subnav = $('.sub_navbar');
        var nav_tr = $('.nav_tr');

        var max_shift = 300;
        stop = Math.round($(window).scrollTop());
        if(stop > max_shift){
            nav.css({marginTop: "5px", marginBottom: "5px"});
            nav_tr.css({paddingTop: "5px", paddingBottom: "5px"});
            subnav.css({boxShadow:"0px 1px 20px rgba(0,0,0,0.6)"});
            bottomnav.css({height: "0px!important", padding: "0px", fontSize: "0px"});
        }else{
            value = 20 - 15*(stop/(1.0*max_shift));
            nav.css({marginTop: value + "px", marginBottom: value + "px"});
            
            value_tr = 10 - 5*(stop/(1.0*max_shift));
            nav_tr.css({paddingTop: value_tr + "px",paddingBottom: value_tr + "px"});
                
            bottomvalue = (1 - stop/(1.0*max_shift));
            bottomnav.css({height: 20*bottomvalue + "px", padding: 10*bottomvalue + "px", fontSize: 15*bottomvalue + "px"});
            
            subnav.css({boxShadow:"0px 1px " + 20*(1-bottomvalue) + "px rgba(0,0,0,0.6)"});

        }
    });
    });