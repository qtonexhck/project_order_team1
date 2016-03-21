Demoapp.controller("Page1Ctrl", function ($rootScope, $scope, Util, $state, SERVER, VERSION, $timeout) {

    $rootScope.showTop=true;
    $rootScope.nav="home";


    $scope.hello=function(model){
        //alert(model.id);
    }
    $scope.onChangeSel=function(){

        angular.forEach($scope.list1, function (v, k) {
            console.log(k + ': ' + v.id)
            if($scope.opt1== v.id){
                $scope.currentName= v.name;
            }
        });
    }

    $scope.list1=[{
        name:"我是1",
        id:1
    },{
        name:"我是2",
        id:2
    },{
        name:"我是3",
        id:3
    },{
        name:"我是4",
        id:4
    },{
        name:"我是5",
        id:5
    },{
        name:"我是6",
        id:-1
    }];

    $scope.optaaaa1=$scope.list1[0].id;
});