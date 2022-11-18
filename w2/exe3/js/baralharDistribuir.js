function funcionalidadeCartas(){
    //retorna todas as cartas com classe carta, cada uma dessas cartas é atribuido um eventlistener. quando clicado executa
    // a função virarCarta
document.querySelectorAll(".carta").forEach(function(element){
        element.addEventListener("click", virarCarta);
    }
)
}

function distribuirCartas1() {
    var baralho;
    baralho=grupoCartas1.sort(function(){
            return 0.5-Math.random();
        }
    );
    var baralhar=baralho;
    var mesa=document.querySelector("#mesa");
    mesa.innerHTML= "";
    baralhar.forEach(
        //para cada elemento do array de cartas, é gerada uma carta com esse conteudo
        function(element){
            var carta=document.createElement("div");
            carta.innerHTML=
                "<div class='carta' data-value="+element+">"+
                "<div class='carta_conteudo'>"+
                element+
                "</div>"+
                "</div>";
            mesa.appendChild(carta);
        });
    funcionalidadeCartas();
}

function distribuirCartas2(){
    var baralho;
    baralho=grupoCartas2.sort(function(){
            return 0.5-Math.random();
        }
    );

    var baralhar=baralho;
    var mesa=document.querySelector("#mesa");
    mesa.innerHTML= "";
    baralhar.forEach(
        function(element){
            var carta=document.createElement("div");
            carta.innerHTML=
                "<div class='carta' data-value="+element+">"+
                "<div class='carta_conteudo'>"+
                element+
                "</div>"+
                "</div>";
            mesa.appendChild(carta);
        });
    funcionalidadeCartas();
}

function distribuirCartas3() {
    var baralho;
    baralho=grupoCartas3.sort(function(){
            return 0.5-Math.random();
        }
    );
    var baralhar=baralho;
    var mesa=document.querySelector("#mesa");
    mesa.innerHTML= "";
    baralhar.forEach(
        function(element){
            var carta=document.createElement("div");
            carta.innerHTML=
                "<div class='carta' data-value="+element+">"+
                "<div class='carta_conteudo'>"+
                element+
                "</div>"+
                "</div>";
            mesa.appendChild(carta);
        });
    funcionalidadeCartas();
}

