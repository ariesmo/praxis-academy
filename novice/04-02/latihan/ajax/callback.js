function p1() {
    console.log('p1 done');
}
function p2(callback) {
    // set timeout or delay for asynchronous simulation
    setTimeout(() => {
        console.log('p2 done')
        callback()
    }, 100)
}
function p3() {
    console.log('p3 done')
}
p1()
p2(p3)
