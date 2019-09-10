// import event module
var events = require('events');

// create an eventEmitter object
var eventEmitter = new events.EventEmitter();

// create an event handler as follows
var connectHandler = function connected() {
    console.log('connection succesfull');

    // Fire the data received event
    eventEmitter.emit('data_received');
}

// Bind the connection event with handler
eventEmitter.on('connection', connectHandler);

// Bind the data_received event the anonymous function
eventEmitter.on('data_received', function () {
    console.log("data received succesfully");
});

// Fire the connection event
eventEmitter.emit('connection');

console.log('Program Ended');