/**
 * Created by hewu on 2016/2/27 0027.
 */
requirejs.config({
    //定义requre加载的根目录
    baseUrl: "/nm/static/lib",
    //css加载（需要依赖require的css.js）
    map: {
        "*": {
            'css': 'require-css/css'
        }
    },
    //定义模块间的依赖
    shim: {
        foundation: {
            deps: [
                "jquery", "css!../css/foundation/foundation.css", "css!../css/nm-nav.css", "css!../css/foundation/normalize.css"
            ]
        },
        slick: {
            deps: [
                "jquery", "css!../lib/slick/slick.css", "css!../lib/slick/slick-theme.css"
            ]
        }
    },
    //模块定义
    paths: {
        "jquery": "jquery-1.9.1",
        "util": "../module/util",
        "foundation": "foundation/foundation.min",
        "domReady": "domReady/domReady",
        "slick": "slick/slick"

    }
});
//入口加载
requirejs(['jquery', "util", "foundation", "slick", "domReady"], function ($, util, f, slick, ready) {
    //首页模块加载
    //轮播插件
    ready(function () {
        $('.autoplay').slick({
            lazyLoad: 'ondemand',
            dots: true,
            infinite: true,
            speed: 500,
            slidesToShow: 1,
            slidesToScroll: 1,
            autoplay: true,
            autoplaySpeed: 2000
        });

    });
});


