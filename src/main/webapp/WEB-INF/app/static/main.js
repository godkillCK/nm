/**
 * Created by hewu on 2016/2/27 0027.
 */
requirejs.config({
    //定义requre加载的根目录
    baseUrl:"/nm/app/static/lib",
    //css加载（需要依赖require的css.js）
    map:{
        "*":{
            'css':'require-css/css'
        }
    },
    //定义模块间的依赖
    shim:{
        foundation:{
            deps:[
                "jquery","css!../css/foundation/foundation.css","css!../css/nm-nav.css","css!../css/foundation/normalize.css"
            ]
        }
    },
    //模块定义
    paths:{
        "jquery":"jquery-1.9.1",
        "util":"../module/util",
        "foundation":"foundation/foundation.min",
        "domReady":"domReady/domReady"
    }
});
//入口加载
requirejs(['jquery',"util","foundation","domReady"],function($, util,f,ready){
    //首页模块加载
    ready(function(){
        // $(document).foundation();

    });
});


