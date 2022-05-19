// on click button[type = submit] -> first name should be valid -> if not: error
// array of search ID's for all input fields

const form = document.querySelector('form')
const ids = Array.from(document.querySelectorAll('input'));
const searchArray = ids.map(id => 
                        {return `#${id.name}`;
});
const emailError = document.getElementById('email-error')
console.log(searchArray);
const validEmailMessage = document.createElement('small');
validEmailMessage.textContent = "Looks like this is not a valid email";
validEmailMessage.classList.add('error');
// form.insertBefore(validEmailMessage, emailError);

console.log(validEmailMessage.classList);
console.log(emailError.classList);


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
                emailError.replaceWith(validEmailMessage);                
                validEmailMessage.style.visibility = "visible";
            } //replaceWith is causing issues if form is cleared, will not go back to empty message. Need to find a way to either toggle between the two or enter validMessage as it's own element
            
            // else { 
            //     emailError.classList.toggle('visibility');
            //     validEmailMessage.style.visibility = "hidden";
            //     console.log(emailError.classList);
            //     console.log(validEmailMessage.classList);
            // }
            
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
