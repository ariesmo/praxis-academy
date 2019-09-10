// var http = require('http');

function requestAjax(callback) {
    // inisialisasi library XML Http Request
    var XMLHttpRequest = require("xmlhttprequest").XMLHttpRequest;
    var xhr = new XMLHttpRequest();
    // set target request
    xhr.open('GET', 'https://jsonplaceholder.typicode.com/users/2')

    // terapkan callback
    xhr.onload = function () {
        if (xhr.status === 200) {
            callback(xhr.responseText)
        } else {
            callback('Failed')
        }
    }

    // mulai request
    xhr.send()
}

function showResult(data) {
    if (data != 'Failed') {
        // tampilkan Data
        datas = JSON.parse(data)
        console.log(datas)
    }
}

requestAjax(showResult)