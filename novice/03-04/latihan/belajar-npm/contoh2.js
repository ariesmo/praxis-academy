var http = require('http');
var url = require('url');

http.createServer(function (request, response) {
    response.writeHead(200, { 'Content-Type': 'text/html' });
    // response.write(url.parse(request.url).query);
    // response.write(request.url);
    // http://localhost:8080/search?keyword=Belajar%20NodeJs
    var q = url.parse(request.url, true).query;
    // memngambil properti keyword
    var txt = 'Kata kunci : ' + q.keyword;

    response.end(txt);
}).listen(8080);

console.log("Server berjalan di http://localhost:8080");