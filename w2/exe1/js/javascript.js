function recolheDados(evento){
    evento.preventDefault();//barra no evento default.
    var nome=document.querySelector("#nome").value;
    var dn=document.querySelector("#anonasc").value;

    var idade=new Date().getFullYear()-dn; //idade=new Date().getFullYear();
    var boasvindas=document.querySelector("#bemvinda");
    if (nome =="" || dn == ""){
        boasvindas.innerHTML = "<p>Erro! Deve preencher o formulário </p>";
    }
    else if (idade>=18){
        boasvindas.innerHTML = "<p>Ola " + nome + " com " + idade + " anos.É adulto.</p>";
    }
    else{
        boasvindas.innerHTML = "<p>Ola " + nome + " com " + idade + " anos. É menor de idade.</p>";
    }

}
//boasvindas.textContent="<p>Ola "+nome+ " com "+idade+" anos</p>";

 /*function parabens(){
    console.log("O formulario foi enviado com sucesso");
 }*/
var meuForm=document.querySelector("#formulario").addEventListener("submit",recolheDados);
