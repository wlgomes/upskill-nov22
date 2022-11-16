var grupoCartas = ["🦄", "🍦", "🌈", "👽", "👾", "🤖", "👹", "👺" ];
//var grupoCartas2 = ["🦄", "🍦", "🌈", "👽", "👾", "🤖", "👹", "👺" ];
//var grupoCartas3 = ["🦄", "🍦", "🌈", "👽", "👾", "🤖", "👹", "👺" ];

//var totalCartas = grupoCartas.concat(grupoCartas2, grupoCartas3);
var totalCartas = grupoCartas.concat(grupoCartas);

//var arrayAninhado = [["🦄", "🍦", "🌈", "👽", "👾", "🤖", "👹", "👺" ],
//["🦄", "🍦", "🌈", "👽", "👾", "🤖", "👹", "👺" ],
//["🦄", "🍦", "🌈", "👽", "👾", "🤖", "👹", "👺" ]]
//console.log(arrayAninhado);
function distribuirCartas(){
    var baralhar = cartasBaralhadas();
    var mesa = document.querySelector("#mesa");
    mesa.innerHTML="";
    baralhar.forEach(
    //totalCartas.forEach()
    //grupoCartas.forEach()
    function (element){
        var carta=document.createElement("div");
        carta.innerHTML= "<div class='carta' data-value="+element+">"+
             "<div class='carta_conteudo'>"+
             element+
            "</div>"+
          "</div>";
        //console.log(element);
        mesa.appendChild(carta);
    })
}
distribuirCartas();
function descobrir(){
    var totalDescobertas = document.querySelectorAll(".descoberta");
        if(totalDescobertas.length > 1){
            return;
        }
        this.classList.add("descoberta");

        var mostra=document.querySelectorAll(".descoberta");
        if(mostra.length < 2){
            return;
        }
        if(mostra[0].dataset.value===mostra[1].dataset.value){
            console.log("certo");
        }else{
            console.log("errado");
        }
}
document.querySelectorAll(".carta").forEach(function(element){
    element.addEventListener("click", descobrir);
})
function cartasBaralhadas(){
    var baralho=Math.random();
    console.log(baralho);
    baralho=totalCartas.sort(function(){
        return 0.5-Math.random();
      })
    return baralho;
}