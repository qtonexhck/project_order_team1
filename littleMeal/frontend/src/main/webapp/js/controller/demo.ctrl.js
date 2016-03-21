Demoapp.controller("demoCtrl", function ($rootScope, $scope, $cookieStore, Util, $state, SERVER, VERSION, $timeout, ConnectSev) {


    var animation = function () {
        $scope.scale = true;
    }
    $timeout(animation, 10000);
});