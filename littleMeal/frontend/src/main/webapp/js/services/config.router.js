'use strict';


/**
 * 配置路由
 * @sherlock221b
 */
Demoapp.config(
      function ($stateProvider,   $urlRouterProvider,VERSION) {
          $stateProvider

              .state('index', {
                  url: '/index',
                  templateUrl: 'html/index.html?v='+VERSION.vs,
                  controller:"IndexCtrl"
              })
              .state('page1', {
                  url: '/home/page1',
                  templateUrl: 'html/page1.html?v='+VERSION.vs,
                  controller:"Page1Ctrl"
              })
              .state('page2', {
                  url: '/home/page2',
                  templateUrl: 'html/page2.html?v='+VERSION.vs,
                  controller:"Page2Ctrl"
              })
              .state('page3', {
                  url: '/home/page3',
                  templateUrl: 'html/page3.html?v='+VERSION.vs,
                  controller:"Page3Ctrl"
              })
          $urlRouterProvider.otherwise('/index');

      }
  );


