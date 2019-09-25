function check() {
    var uname = document.getElementById("username").value;
    var pass = document.getElementById("password").value;
    var s1 = document.getElementById("s1")
    s1.innerHTML = " "
    var s2 = document.getElementById("s2")
    s2.innerHTML = " "
    if (uname.length < 7 || uname.length > 13) {
        s1.innerHTML = "<font color = black>Username should have 6-12 characters</font>"
        return false
    }
    else if (pass.charAt(0) != "A") {
        s2.innerHTML = "<font color = black>Password should start with A</font>"
        return false
    }
    else {
        alert("welcome")
    }
}