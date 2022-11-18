var contador=0;

function virarCarta(){
    contador++;
    document.getElementById('movimentos').innerText = contador ;
    var audioVira = new Audio('inc/1.mp3');
    audioVira.play();
    //elementos que são descoberta mas nao sucesso. permite virar a 1a carta
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
//comparar entre dataset com o valor:
function comparar(mostraCarta){

    if(mostraCarta[0].dataset.value === mostraCarta[1].dataset.value){
        certo(mostraCarta);
    }
    else{
        errado(mostraCarta);
    }
}
