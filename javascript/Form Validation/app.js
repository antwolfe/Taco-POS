// on click button[type = submit] -> first name should be valid -> if not: error

//submitbutton.addEventListener('click', function)

/* function() {
    if (firstName == "") {
        expose -> first-name-error
    }
}

// will need a way to continue checking forms even if one pops an error.
*/
let searchName;
let searchArray = [];
const ids = document.querySelectorAll('input');

for (let i = 0; i < ids; i++){
    searchArray.push(ids[i].name);
}
console.log(searchArray);

ids.forEach(id => {
    searchArray.push(id.name);
});

console.log(searchArray);



const submitBtn = document.querySelector('button');
const firstName = document.querySelector('#first-name');
// console.log(firstName);

submitBtn.addEventListener('click', validateForm)

function validateForm(e) {

    // switch()
    if (firstName.value == ""){
        document.querySelector('#first-name-error').style.visibility = 'visible';
    } else {
        console.log("what now?");
    }
    e.preventDefault();
};

