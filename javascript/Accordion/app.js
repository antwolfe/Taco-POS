
const arrows = document.querySelectorAll('.arrow-icon') //img.arrow-icon list
const firstArrow = document.querySelector('.arrow-icon');
// console.log(arrows);

const answers = document.getElementsByClassName('answer hidden'); //p.answer.hidden list

answersArray = Array.from(answers); //turn HTMLcollection into array
// console.log(answers[0].textContent);

// for each arrow in list, create an alert when the image is clicked


console.log(firstArrow);

firstArrow.addEventListener('click', function(){
    answers[0].classList.toggle('hidden');
})





// arrows.forEach((arrow) => {
//     arrow.addEventListener('click', arrowClicked(arrow));
// });

// function arrowClicked(e) {
//     if (arrow == arrows[0]) {
//         console.log('yes');         
//     } else {
//         console.log("no");
//     }
// }


// function arrowClicked(e){
//     // show hidden answers
//     //refactor: if arrowclicked index matches answerhidden index, add answer under clicked arrow

// }




// answersArray.forEach(answer => {
//     answer.addEventListener('click', arrowClicked);
// })



//4. add shown 'answer hidden' class to event

// 5. refactor: for each or map through section list adding onclick event for each arrow image?


// const section = document.getElementsByClassName('faq-item');

