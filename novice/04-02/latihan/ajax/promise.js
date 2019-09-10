var promise1 = new Promise(function (resolve, reject) {
    setTimeout(() => {
        resolve('foo');
    }, 300);
});

// sama saja
// setTimeOut(function(){resolve('foo');},300);

promise1.then(function (value) {
    console.log(value);
});