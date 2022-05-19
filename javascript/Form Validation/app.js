// on click button[type = submit] -> first name should be valid -> if not: error
// array of search ID's for all input fields

const form = document.querySelector('form')
// form.addEventListener('submit', function)
const ids = Array.from(document.querySelectorAll('input'));
// const submitBtn = document.querySelector('button');
const searchArray = ids.map(id => 
                        {return `#${id.name}`;
                    });



// const firstName = document.querySelector('#first-name');
// console.log(firstName.value);

// console.log(searchArray);

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
            } else {
                console.log("NO EMAIL ERROR");
            }
            
        } else if (inputField != "") {
            document.querySelector(searchArray[i] + "-error").style.visibility = "hidden";
        }
            console.log(inputField);
            // console.log(searchArray[i] == "#password");
        }
        // this works!
        e.preventDefault();
    }
    
    function validateEmail(email) {
        if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)){
          return (true)
        }
    }


    // searchArray.forEach(inputTerm => {
    //     if (document.querySelector(inputTerm).value == null){
    //         document.querySelector(inputTerm + "-error").style.visibility = 'visible';
    //         console.log(inputTerm.value);
    //     } 
    //     else {
    //         document.querySelector(inputTerm + "-error").style.visibility = 'hidden';
    //     };

        // e.preventDefault();
    // });
// })
    

function firstName() {
    searchArray.forEach(inputTerm => {
       
    // console.log("Do Something");
    })
};

 
    


// switch()