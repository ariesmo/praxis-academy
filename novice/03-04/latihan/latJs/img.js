let myImage = document.querySelector('img');

myImage.onclick = function () {
    let mySrc = myImage.getAttribute('src');
    if (mySrc === '1.jpg') {
        myImage.setAttribute('src', '12.png');
    } else {
        myImage.setAttribute('src', 'i.jpg');
    }
}