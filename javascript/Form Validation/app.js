

const form = document.querySelector('form')
const ids = Array.from(document.querySelectorAll('input'));
const searchArray = ids.map(id => {
    return `#${id.name}`;
});

form.addEventListener('submit', validateForm);

function validateForm(e) {
    resetEmailError();
    
    for (let i = 0; i < searchArray.length; i++) {
        
        let inputField = document.querySelector(searchArray[i]).value;
        let currentId = searchArray[i];
        
        if (inputField == "") {
            document.querySelector(currentId + "-error").style.visibility = "visible";
            e.preventDefault();
        } else {
            if (currentId == "#email" && !validateEmailInput(inputField)) {
                displayInvalidErrorMessage();
                e.preventDefault();

            } else {
                document.querySelector(currentId + "-error").style.visibility = "hidden";
            }
        }
    }
}

function validateEmailInput(email) {
    // validates email with regex

    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)) {
        return (true)
    }
};

function displayInvalidErrorMessage() {
    // changes "#email-error" textContent and changes class visibility

    document.getElementById("email-error").textContent = "Looks like this is not a valid email";
    document.getElementById('email-error').style.visibility = "visible";
};

function resetEmailError() {
    // resets "#email-error" to original message

    document.querySelector("#email-error").textContent = "Email cannot be empty";
};
