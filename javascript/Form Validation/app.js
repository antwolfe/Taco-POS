

const form = document.querySelector('form')
const ids = Array.from(document.querySelectorAll('input'));
const searchArray = ids.map(id => {
    return `#${id.name}`;
});
const messageArray = ["Email cannot be empty", "Looks like this is not a valid email"]



form.addEventListener('submit', validateForm)

function validateForm(e) {

    for (let i = 0; i < searchArray.length; i++) {
        let inputField = document.querySelector(searchArray[i]).value
        let currentId = searchArray[i];

        if (inputField == "") {

            document.querySelector(currentId + "-error").style.visibility = "visible";

        // } else if (inputField == "" && currentId == "#email") {

        //     document.getElementById('email-error').innerText = "Email cannot be empty"
        //     document.getElementById('email-error').style.visibility = "visible";

        } else if (inputField != "") {

            if (currentId == "#email" && !validateEmail(inputField)) {

                console.log(document.getElementById("email-error"));
                document.getElementById("email-error").innerText = "Looks like this is not a valid email";
                document.getElementById('email-error').style.visibility = "visible";
            

            } else {

            document.querySelector(currentId + "-error").style.visibility = "hidden";
            }

        }
        e.preventDefault();

    }
}


function validateEmail(email) {
    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)) {
        return (true)
    }
}

// switch statement refactor?
// could maybe use a while loop
// variable refactor?
 // clean up code
