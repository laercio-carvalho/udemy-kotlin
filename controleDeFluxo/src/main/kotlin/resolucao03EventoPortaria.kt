fun main() {
    portaria2()
}
//Primeira alternativa do professor
fun portaria() {
    println("Qual sua idade?")
    val idade = readLine()
    if (idade != null && idade != ""){
        if (idade.toInt() < 18){
            println("Negado. Menorees de idade não são permitidos.")
            return
        }
    }
    println("Qual é o tipo de convite? ")
    var tipoCovite = readLine()
    if (tipoCovite != null && tipoCovite != ""){
        tipoCovite = tipoCovite.lowercase()
        if (tipoCovite == "comum" || tipoCovite == "luxo" || tipoCovite == "premium"){
            println("Qual é o codigo do convite? ")
            var codigo = readLine()
            if (codigo != null && codigo != ""){
                codigo = codigo.lowercase()
                if (tipoCovite == "comum" && codigo.startsWith("XT")){
                    tipoCovite = tipoCovite.lowercase()
                    println("Welcome :)")
                } else if (tipoCovite == "premium" || tipoCovite == "luxo" && codigo.startsWith("XL")){

                    println("Welcome :)")
                }else{
                    println("Convite Inválido!")
                    return
                }
            }
        } else {
            println("Negado. Convite Inválido")
            return
        }
    }
}
//segenda alternativa do Professor
fun portaria2() {
    println("Qual sua idade?")
    val idade = readLine()
    if (idade != null && idade != ""){
        if (idade.toInt() < 18){
            println("Negado. Menorees de idade não são permitidos.")
            return
        }
    }
    println("Qual é o tipo de convite? ")
    var tipoCovite = readLine()
    if (tipoCovite != "comum" && tipoCovite != "premium" && tipoCovite != "luxo"){
        println("Negado. Convite Invalido!")
        return
    }
    println("Qual é o codigo do convite? ")
    var codigo = readLine()
    if (codigo != null && codigo != ""){
        codigo = codigo.lowercase()
        if (tipoCovite == "comum" && codigo.startsWith("XT")){
            println("Welcome :)")
        } else if (tipoCovite == "premium" || tipoCovite == "luxo" && codigo.startsWith("XL")){
            println("Welcome :)")
        }else{
            println("Convite Inválido!")
            return
        }
    }
    else {
        println("Negado. Convite Inválido")
        return
    }
}
