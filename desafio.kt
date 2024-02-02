

class Usuario ( val name: String, val email:String , val age:Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
    if(!inscritos.contains(usuario){
         
     inscritos.add(usuario)
     println("${usuario.name} foi adicionado a lista")
    }else {
            println("${usuario.name} já está matriculado na formação $nome.")
        }
}

fun main() {
 
  val user01 = Usuario("RogerArenas", "rogerioarenas@gmail.com", 35)
  val user02 = Usuario("RodrigoArenas", "rodrigoarenas@gmail.com", 09)

  val conteudo01 = ConteudoEducacional("Desbravando Kotlin com Springboot", 10)
  val conteudo02 = ConteudoEducacional("Logica de programacao", 100)

  val formacao = Formacao("Ciência da Computação", listOf(conteudo01, conteudo02))

  formacao.matricular(user01)
  formacao.matricular(user02)
  formacao.matricular(user01) 


}
