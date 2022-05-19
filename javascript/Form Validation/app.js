

const form = document.querySelector('form')
const ids = Array.from(document.querySelectorAll('input'));
const searchArray = ids.map(id => {
    return `#${id.name}`;
});
const messageArray = ["Email cannot be empty", "Looks like this is not a valid email"]

// console.log(ids);
// console.log(searchArray);

form.addEventListener('submit', validateForm)


function validateForm(e) {

    e.preventDefault();
    
    resetErrors(searchArray);
    
    for (let i = 0; i < searchArray.length; i++) {
        let inputField = document.querySelector(searchArray[i]).value;
        let currentId = searchArray[i];

        if (inputField == "") {

            document.querySelector(currentId + "-error").style.visibility = "visible";


        } else {

            if (currentId == "#email" && !validateEmailInput(inputField)) {

                console.log(document.getElementById("email-error"));
                document.getElementById("email-error").textContent = "Looks like this is not a valid email";
                document.getElementById('email-error').style.visibility = "visible";
            

            } else {

            document.querySelector(currentId + "-error").style.visibility = "hidden";
            }

        }

    }
}


function validateEmailInput(email) {
    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)) {
        return (true)
    }
}

function resetErrors(searchArray) {
    

    document.querySelector("#email-error").textContent = "Email cannot be empty"
    
}


// break out validate email function
// have a reset errors function
// clean up code
