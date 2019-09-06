var url = require('url');
var adr = 'https://www.petanikode.com/search.php?year=2010&month=february';
var q = url.parse(adr, true);

// hasil parse URL
console.log(q);
console.log("protocol : " + q.protocol);
console.log("hostname : " + q.host);
console.log("pathname : " + q.pathname);
console.log("." + q.pathname);
console.log("params : " + q.search);

// ambil query string sebagai objek
var qdata = q.query;

console.log(qdata);

