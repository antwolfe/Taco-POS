
const arrows = document.querySelectorAll('.arrow-icon') //img.arrow-icon list

// console.log(arrows);

const answers = document.getElementsByClassName('answer hidden'); //p.answer.hidden list

//answersArray = Array.from(answers); //turn HTMLcollection into array
// console.log(answers[0].textContent);

// for each arrow in list, create an alert when the image is clicked
arrows.forEach(arrow => {
    arrow.addEventListener('click', arrowClicked);
});

function arrowClicked(e){
    // show hidden answers
    //if arrowclicked index matches answerhidden index, add answer under clicked arrow

    

}




answersArray.forEach(answer => {
    answer.addEventListener('click', arrowClicked);
})

function arrowClicked(e) {
    console.log("Is this my arrow?");
}


//4. add shown 'answer hidden' class to event

// 5. refactor: for each or map through section list adding onclick event for each arrow image?


// const section = document.getElementsByClassName('faq-item');

