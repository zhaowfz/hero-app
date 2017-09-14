/* -----------------------------------------------
/* Author : Denny
/* QQ: 772930508
/* v1
/* ----------------------------------------------- */
//**********************  Start with disable/enable scroll function  **********************
// left: 37, up: 38, right: 39, down: 40,
// spacebar: 32, pageup: 33, pagedown: 34, end: 35, home: 36

var keys = [37, 38, 39, 40];

function preventDefault(e) {
    event.preventDefault();
    e = e || window.event;
    if (e.preventDefault)
        e.preventDefault();
    e.returnValue = false;
}

function keydown(e) {
    for (var i = keys.length; i--;) {
        if (e.keyCode == keys[i]) {
            preventDefault(e);
            return;
        }
    }
}

function wheel(e) {
     e = e || window.event;
    if (e.preventDefault)
        e.preventDefault();
    e.returnValue = false;
}

function disable_scroll() {
    if (window.addEventListener) {
        window.addEventListener('DOMMouseScroll', wheel, false);
    }
    window.onmousewheel = document.onmousewheel = wheel;
    window.document.onkeydown = keydown;
}

function enable_scroll() {
    if (window.removeEventListener) {
        window.removeEventListener('DOMMouseScroll', wheel, false);
    }
    window.onmousewheel = document.onmousewheel = document.onkeydown = null;
}


function disableRefresh(evt){
evt = (evt) ? evt : window.event
if (evt.keyCode) {
    //console.log(evt.keyCode);
    if(evt.keyCode == 27){
    document.getElementById('close').click();
   }
}
}



//**********************  End with disable/enable scroll function  **********************