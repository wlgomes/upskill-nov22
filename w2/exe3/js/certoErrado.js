//o que constitui uma carta certa e qual o atributo
function certo(acertar){
    acertar.forEach(function(element){
        element.classList.add("sucesso");
    }
    )
    var audioCerto = new Audio('inc/2.mp3');
    audioCerto.play();
}

function errado(errar){
    errar.forEach(function(element){
        element.classList.add("erro"); 
    }
    )
    setTimeout(function(){
        errar.forEach(function(element){
        element.classList.remove("descoberta");
        element.classList.remove("erro");
    }
    )
    },1500);

}