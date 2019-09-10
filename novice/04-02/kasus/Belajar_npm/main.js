const https = require('https');

https.get('https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY', (res) => {
    let data = '';

    // a chunk of data has been received
    res.on('data', (chunk) => {
        data += chunk;
    });

    // the whole response has been received. print out the result
    res.on('end', () => {
        console.log(JSON.parse(data).explanation);
    });
}).on("error", (err) => {
    console.log("Error : " + err.message);
});