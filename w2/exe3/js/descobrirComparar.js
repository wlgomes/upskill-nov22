var contador=0;

function virarCarta(){
    contador++;document.getElementById('movimentos').innerText = contador ;
    var audioVira = new Audio('inc/1.mp3');
    audioVira.play();
    var cartasViradas = document.querySelectorAll(".descoberta:not(.sucesso)");
    if(cartasViradas.length > 1){
        return;
    }
    this.classList.add("descoberta");
    var mostraCarta = document.querySelectorAll(".descoberta:not(.sucesso)"); 
    if(mostraCarta.length < 2){
        return;
    }
    comparar(mostraCarta);

}

function comparar(mostraCarta){

    if(mostraCarta[0].dataset.value === mostraCarta[1].dataset.value){
        certo(mostraCarta);
    }
    else{
        errado(mostraCarta);
    }
}
