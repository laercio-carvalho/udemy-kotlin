/*
4-  Escreva um programa para ficar na portaria de um evento.
        a-> Peça a idade. Menores de idade não são permitidos. Mensagem: "Negado. Menorees de idade não são permitidos."
        b-> Peça o tipo de convite. Os tipos de convites são: comum, premium e luxo.
            Negar caso não seja nenhum desses. Mensagem: "Negado. Convite inválido."
        c-> Peça o código do convite. Convites Premium e Luxo começam com "XL". Convites comuns começam com "XT".
            Caso não esteja nos padrões, negar a entrada. Mensgem: "Negado, convite inválido."
        d-> Caso todos os critérios sejam satisfeitos, exibir: Welcome :)"
 */
fun main() {

    println("Informe a idade dos participantes do evento:");    val idadeParticipante: String? = readLine()
    println("Informe o Tipo de Convite:");                      val convite: String? = readLine()
    println("Informe o Código do Convite:");                    val codigoConvite: String? = readLine()

    val idade: String = verificaIdade("$idadeParticipante")
    val categoriaConvite: String = tipoConvite("$convite")
    val verificacao: String = verificaConvite("$codigoConvite")
    println("$idade")
    println("$categoriaConvite")
    println("$verificacao")

    validadorGeral("$idade","$categoriaConvite","$verificacao")
}
fun verificaIdade(idade: String): String {
    if(idade.toInt() >= 18){
        return "Aceito"
    }else {
        return "Negado. Menorees de idade não são permitidos."
    }
}
fun tipoConvite(tipo: String): String {
    return when(tipo){
        in  "comum"     -> "Aceito"
        in  "premium"   -> "Aceito"
        in  "luxo"      -> "Aceito"
        else            -> "Negado. Tipo de Convite Inválido"
    }
}
fun verificaConvite(codigo: String): String {
    return if (codigo.startsWith("XL",ignoreCase = true) || codigo.startsWith("XT",ignoreCase = true)){
        "Aceito"
    }else{
        "Negado, Código de Convite inválido."
    }
}
fun validadorGeral(idade: String, tipo: String, codigo: String) {
    if (idade == "Aceito" && tipo == "Aceito" && codigo == "Aceito"){
        println("Welcome!")
    }else{
        println("Um ou mais requisitos foram negados, por gentileza verificar erros acima")
    }
}