var http = require('http');
var url = require('url');
var fs = require('fs');

http.createServer(function (req, res) {
    var q = url.parse(req.url, true);

    if (q.pathname == "/search/" && req.method === "GET") {
        // ambil parameter dari URL
        var keyword = q.query.keyword;

        if (keyword) {
            // Ambil data dari form dengen method GET
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.write("<h3>Search Eesults : </h3>");
            res.write("<p>Anda mencari : </p>");
            res.write("<pre>Tidak ada hasil! Maaf website ini masih dalam pengembangan</pre>");
            res.end("<a href='/search/'>Kembali</a>");
        } else {
            // tampilkan form search
            fs.readFile('search.html', (err, data) => {
                if (err) {
                    res.writeHead(404, { 'Content-Type': 'text/html' });
                    return res.end("404 Not Found");
                }
                // kirim form search.html
                res.writeHead(200, { 'Content-Type': 'text/html' });
                res.write(data);
                return res.end();
            });
        }
    }
}).listen(8080);

console.log('Server is running on http://localhost:8080');