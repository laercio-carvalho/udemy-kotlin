fun main() {
    val conseguiu = "O que você conseguiu de Bonus foi:"
    val naoConseguiu = "Aqui como você não especificou corretamente você estará:"
    val naCategoria = "De acordo com a sua categoria você receberá um bonus adicional e agora o valor passa de"

    println("$naoConseguiu ${bonus("uebhiuebh")}")
    println("$conseguiu ${bonusWhen("Estagiário")} R$")
    println("$conseguiu ${bonus("Gerente")} R$")

    println("$naCategoria ${bonusWhen("Engenheiro de Software")}" +
            "0 R$ atualizado para: ${abono(3,bonusWhen("Engenheiro de Software"))}0 R$ ")
}
   //Forma de calcular o bonus usando uma função com if e else onde os valores internos podem não são de tipo especificado podendo ser uma String(else)
fun bonus(cargo: String):Any {
    return if (cargo == "Gerente") {
        2000f
    }else if (cargo == "Coordenador"){
        1500f
    }else if (cargo == "Engenheiro de Software"){
        1000f
    }else if (cargo == "Estagiário"){
        500f
    }else {
        "Sem Bonus".uppercase()
    }
}
//Forma de calcular o bonus usando uma função usando when de maneira mais simplificado
fun bonusWhen(cargo: String):Float{
    return when (cargo){
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}
fun abono(categoria: Int, bonus: Float): Float {
    //var categoria = 2

    return when (categoria){
        in 1..2 -> 1.1f * bonus
        in 3..4 -> 1.2f * bonus
        in 5..6 -> 1.3f * bonus
        in 7..8 -> 1.4f * bonus
        in 9..10 -> 1.5f * bonus
        else -> bonus
    }
}