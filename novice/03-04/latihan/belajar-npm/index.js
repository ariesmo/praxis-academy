var http = require('http');
var moment = require('moment');
var salam = require('./salam');

http.createServer(function (req, res) {
    // res.writeHead(200, { 'Content-type': 'text/html' });
    res.writeHead(200, { 'Content-type': 'application/json' });
    // res.writeHead(200, { 'Content-type': 'application/pdf' });
    // res.writeHead(200, { 'Content-type': 'application/xml' });
    // res.write('Hello <b>World</b>');
    res.write('{"message": "Hello World!"}');
    res.end();
}).listen(8080);

console.log("server running on http://localhost:8080");
console.log(salam.salamPagi());
console.log("Sekarang : " + moment().format('D MMMM YYYY, h:mm:ss a'));