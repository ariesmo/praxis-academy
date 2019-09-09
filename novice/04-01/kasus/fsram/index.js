var _ = require('lodash');
var R = require('ramda');
var U = require('underscore');

var companies = [
    { name: "tw", since: 1993 },
    { name: "pucrs", since: 1930 },
    { name: " tw br", since: 2009 }
];

var r1 = _(companies).chain()
    .filter(function (c) {
        return c.name.split(" ")[0] === "tw";
    })
    .map(function (c) {
        return {
            name: c.name.toUpperCase(),
            since: c.since
        };
    })
    .sortBy(function (c) {
        return c.since;
    })
    .reverse()
    .value();

console.log("with lodash : ", r1);

var r2 = R.compose(
    R.reverse,
    R.sortBy(R.prop("since")),
    R.map(R.over(R.lensProp("name"), R.toUpper)),
    R.filter(R.where({ name: R.test(/^tw/) }))
)(companies);
console.log("with ramda : ", r2);

var r3 = U.chain(companies)
    .filter(function (c) {
        return c.name.split(" ")[0] === "tw";
    })
    .map(function (c) {
        return {
            name: c.name.toUpperCase(),
            since: c.since
        };
    })
    .sortBy(function (c) {
        return c.since;
    })
    .reverse()
    .value();

console.log("with underscore : ", r3);