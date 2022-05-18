const section = document.getElementsByClassName('faq-item');

// console.log(section[0].lastElementChild.textContent);


// 1. define arrow to click
    const arrows = document.querySelectorAll('.arrow-icon')
    
    console.log(arrows);

    arrows.forEach(arrow => {
        arrow.addEventListener('click', hello);
    });

    // .addEventListener('click', hello);

    function hello(e){
        alert("Hello World");
    }

//2. create simple event when arrow is clicked like an alert

//3. find best route to show 'answer hidden' class

//4. add shown 'answer hidden' class to event

// 5. refactor: for each or map through section list adding onclick event for each arrow image?


// arrow.addEventListener("click", onClick())

// function onClick(e) {
    
// }

