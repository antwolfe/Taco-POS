
const arrows = Array.from(document.querySelectorAll('.arrow-icon'));
const answers = Array.from(document.getElementsByClassName('answer hidden'));
const questions = document.getElementsByClassName('question');


arrows.forEach(arrow => {
    arrow.addEventListener('click', function(){
        index = arrows.indexOf(arrow);
        questions[index].classList.toggle('selected-question');
        answers[index].classList.toggle('hidden');
    });
});
