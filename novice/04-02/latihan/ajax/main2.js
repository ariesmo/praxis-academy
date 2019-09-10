var events = require('events');
var eventEmmiter = new events.EventEmitter();

// Listener #1
var listner1 = function listner1() {
    console.log('Listner1 executed');
}

// Listner #2
var listner2 = function listner2() {
    console.log("Listner2 executed");
}

// Bind the connection event with the listner1 function
eventEmmiter.addListener('connection', listner1);

// Bind the connection event with the listner2 function
eventEmmiter.on('connection', listner2);

var eventListeners = require('events').EventEmitter.listenerCount(eventEmmiter, 'connection');
console.log(eventListeners + " Listener(s) listening to connection event");

// Fire the connection event
eventEmmiter.emit('connection');

// Remove the binding of listner1 function
eventEmmiter.removeListener('connection', listner1);
console.log("Listner1 will not listen now");

// fire the connection event
eventEmmiter.emit('connection');

eventListeners = require('events').EventEmitter.listenerCount(eventEmmiter, 'connection');
console.log(eventListeners + " Listener(s) listening to connection event");

console.log("Program Ended");