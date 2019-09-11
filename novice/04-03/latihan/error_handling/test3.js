function test(label, body) {
    if (!body()) console.log('Failed: ${label}');
}

test("convert Latin text to uppercase", () => {
    return "hello".toLocaleUpperCase() == "HELLO";
});
test("convert Greek text to uppercase", () => {
    return "Xaipete".toUpperCase() == "XAIPETE";
});
