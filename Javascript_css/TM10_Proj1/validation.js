var d = new Date();

document.getElementById("demo").innerHTML = d;
setTimeout(function () {
  alert("3 min passed");
}, 180000);

// var size = document.getElementsByClassName("pass").innerHTML.length;

function check() {
  if (
    document.getElementById("pass").value ==
    document.getElementById("cpass").value
  ) {
    document.getElementById("passmessage").innerHTML = "";
    document.getElementById("submit").disabled = false;
  } else {
    document.getElementById("passmessage").innerHTML =
      "password and confirmed not matching";
    document.getElementById("submit").disabled = true;
  }
}
