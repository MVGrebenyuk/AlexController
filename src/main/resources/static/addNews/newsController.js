angular.module('app').controller('newsController', function ($scope, $http) {
    const contextPath = 'http://localhost:8190/alexApp';

    $scope.fillTable = function () {
        $http({
            url: contextPath + '/addNews/v1',
            method: 'GET',
        })
            .then(function (response) {
                $scope.NewsList = response.data;
            });
    };

    $scope.submitCreateNewNews = function () {
        $http.post(contextPath + '/addNews/v1', $scope.newNews)
            .then(function (response) {
                $scope.newNews = null;
                alert('Добавлена новая новость');
            });
    };

    $scope.addToCart = function (productId) {
        $http({
            url: contextPath + '/api/v1/cart/add/' + productId,
            method: 'GET'
        })
            .then(function (response) {
                console.log('ok');
            });
    }

    $scope.fillTable();
});