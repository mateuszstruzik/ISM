/**
 * Created by MATI on 05.04.2017.
 */
angular.module('demo', []).controller('Users', function($scope, $http) {
    $http.get('http://localhost:8080/users').then(function(response) {
        $scope.users = response.data;
    });
});
https://www.youtube.com/watch?v=iDXP04BPbSY