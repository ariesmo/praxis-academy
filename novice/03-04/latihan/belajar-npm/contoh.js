var http = require('http');
var url = require('url');

http.createServer(function (request, response) {
    response.writeHead(200, { 'Content-Type': 'text/html' });
    switch (request.url) {
        case '/about':
            response.write("Ini adalah halaman about");
            break;
        case '/search':
            var q = url.parse(request.url, true).query;
            response.write("Kata Kunci : " + q);
            break;
        case '/produk':
            response.write("Ini adalah halaman produk");
            break;
        default:
            response.write("404: Halaman tidak ditemukan");
            break;
    }
    response.end();
}).listen(8080);

console.log('Server running on http://localhost:8080');