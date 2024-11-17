fun main() {
    maiorDeIdade(70)
    println(saudacao(true))
    println("Aceita bebida alcólica? \n${aceitaBebidaAlcoolica(false)}")
    aceitaCha(true)
    informarIdade(12)
}

fun maiorDeIdade(idade: Int){
    if (idade > 18){
        println("Maior de Idade")
        if (idade > 65){
            println("Terceira idade")
        }
    }else if (idade < 18){
        println("Menor de Idade")
    }else{
        println("Criança")
    }
}

fun saudacao(dia: Boolean): String {
    return if(dia){
        "Bom dia"
    }else{
        "Boa Noite"
    }
}
//utilizando Operador Ternário com Elvis Operator
fun aceitaBebidaAlcoolica(respostaSobreBebida: Boolean = true): String {
    return if (respostaSobreBebida) "Sim" else "não"
}
fun aceitaCha(respostaSobreCha:Boolean = false) = if (respostaSobreCha) println("Aceito") else println("Não Aceito")
//Aqui é um teste de extrapolação em linha unica.
fun informarIdade(informeIdade: Int) = if (informeIdade >= 18 && informeIdade <= 64) println("Maior de idade") else if (informeIdade >= 65 && informeIdade <= 100) println("Idoso") else if(informeIdade > 99) println("Quase Morto") else println("Menor de idade")