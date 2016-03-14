Demoapp.controller("IndexCtrl", function ($rootScope, $scope,$http, Util, $state, SERVER, VERSION, $timeout,$q) {

    $rootScope.showTop=false;

    $scope.user={
        account:"111",
        password:"",
        saveme:false
    };

    var user=$rootScope.getUser();
    if(user){
        $scope.user.account=user.account;
        $scope.user.password=user.password;
        $scope.user.saveme=true;
    }

    function formatJson(jsonObject) {
        if(jsonObject==""){
            jsonObject={};
        }
        var tempData = {
            "style": "",
            "data": jsonObject,
            "clientInfo": {}
        };
        return angular.toJson(tempData);
    }
    $scope.onLogin=function(obj){

        //var data="name="+$scope.user.account+"&password="+$scope.user.password;
        var jsonObjec={
            name:$scope.user.account,
            password:$scope.user.password
        };

        var defer = $q.defer();
        ////连接服务器
        //var url=SERVER.url.url+"/cross/login.do";
        var url=SERVER.url.url+"/test/login";
        var jd=formatJson(jsonObjec);
        $http.post(url,jd)
            .success(function(result){
                defer.resolve(result);

                $state.go('page1');
                console.log("successUrl:["+url+"]"+" returnData："+JSON.stringify(result));
                console.log("sendData: "+JSON.stringify(jd));
            })
            .error(function(err){
                defer.reject(err);
                console.log("errorUrl:["+url+"]"+JSON.stringify(err));
                console.log("sendData: "+JSON.stringify(jd));
            });

    }

});