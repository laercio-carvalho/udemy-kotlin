fun main() {
    maiorDeIdade(70)
    println(saudacao(true))

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
        println("Crança")
    }
}

fun saudacao(dia: Boolean): String {

    return if(dia){
        "Bom dia"
    }else{
        "Boa Noite"
    }
}