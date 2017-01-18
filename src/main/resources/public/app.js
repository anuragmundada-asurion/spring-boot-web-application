function getAgencies() {
    var xmlhttp = new XMLHttpRequest();
    var url = "api/v1/agencies";

    xmlhttp.onreadystatechange=function() {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            myFunction(xmlhttp.responseText);
        }
    }
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}
function myFunction(response) {
   document.getElementById("1").innerHTML = response;
}
