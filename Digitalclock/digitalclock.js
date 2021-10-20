var clck = document.getElementById("clock");

function digitalClock() {
  var date = new Date();

  var hours = date.getHours();
  var minutes = date.getMinutes();
  var seconds = date.getSeconds();

 clck.innerHTML = hours + " : " + minutes + " : " + seconds;
}
setInterval(() => {
  digitalClock();
}, 1000);
