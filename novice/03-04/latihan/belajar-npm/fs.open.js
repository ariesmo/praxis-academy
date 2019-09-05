var fs = require('fs');

fs.open('mynewfile2.txt', 'W', function (err, file) {
    if (err) throw err;
    console.log('Saved!');
});