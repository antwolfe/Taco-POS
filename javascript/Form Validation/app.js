// on click button[type = submit] -> first name should be valid -> if not: error


const ids = Array.from(document.querySelectorAll('input'));
const submitBtn = document.querySelector('button');
const searchArray = ids.map(id => 
                        {return `#${id.name}`;
                    })

// array of search ID's for all input fields




// searchArray.forEach(inputTerm => {
//     if (document.querySelector(`${inputTerm.value}`) == "") {
//         // document.querySelector(`${inputTerm}-error`).style.visibility = 'visible';
//         console.log("Do Something");
//     }
// });



// const firstName = document.querySelector('#first-name');
// console.log(firstName);

submitBtn.addEventListener('click', validateForm)

function validateForm(e) {

    console.log(searchArray);
  
    // if (firstName.value == ""){
    //     document.querySelector('#first-name-error').style.visibility = 'visible';
    // } else {
    //     console.log("what now?");
    // }
    e.preventDefault();
};

// switch()

