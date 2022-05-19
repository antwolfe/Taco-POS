// on click button[type = submit] -> first name should be valid -> if not: error
// array of search ID's for all input fields

const form = document.querySelector('form')
const ids = Array.from(document.querySelectorAll('input'));
const searchArray = ids.map(id => 
                        {return `#${id.name}`;
});
const emailError = document.getElementById('email-error')
console.log(emailError);
const emailErrorMessage = document.createElement('small');
emailErrorMessage.textContent = "Looks like this is not a valid email";
emailErrorMessage.classList.add('error');

// console.log(emailErrorMessage);
form.repl

form.addEventListener('submit', validateForm)

function validateForm(e) {

    console.log("hello");

    for (let i = 0; i < searchArray.length; i++){
        let inputField = document.querySelector(searchArray[i]).value

        if (inputField == ""){
            document.querySelector(searchArray[i] + "-error").style.visibility = "visible";
            
        } else if (inputField != "" && searchArray[i] == "#email"){
            //email validation
            if (!(validateEmail(inputField))){
                console.log("ERROR");
                emailError.replaceWith(emailErrorMessage);
                emailErrorMessage.style.visibility = "visible";
                // add error class to emailError
                // find error child and replace with emailError
            }
            
        } else if (inputField != "") {
            document.querySelector(searchArray[i] + "-error").style.visibility = "hidden";
        }
            e.preventDefault();
            console.log(inputField);
        }
        // this works!
        
    }
    
    function validateEmail(email) {
        if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)){
          return (true)
        }
    }

    // switch statement refactor?
    // could maybe use a while loop
    // variable refactor?
    // clean up code
