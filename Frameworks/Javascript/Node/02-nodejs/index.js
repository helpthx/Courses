/*
0 - Obter um usuario
1 - Obter o numero de telefone de um usuario a partir do seu id
2 - Obter o endereco do usuario pelo

*/

function obterUsuario(callback){
  setTimeout(function(){
    return callback(null,{
      id: 1,
      nome: 'Aladin',
      dataNascimento: new Date()
    })
  }, 1000)
}

function obterTelefone(idUsuario){
  setTimeout(() =>{
      return{
        telefone: '11999020',
        ddd: 11
      }
  }, 2000);

}

function obterEndereço(idUsuario){

}

function resolverUsuario(erro, usuario) {
  console.log('usuario', usuario);

}

obterUsuario(resolverUsuario)
//const telefone = obterTelefone(usuario.id)

console.log('Usuario: ', usuario)
//console.log('Telefone: ', telefone)
