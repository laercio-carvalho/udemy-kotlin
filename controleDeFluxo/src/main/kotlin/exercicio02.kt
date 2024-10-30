/*  1-  Escreva um programa capaz de ler 2 numeros inteiros que representam os lados de uma figura geométrica.
        Informar se formam um quadrado(lados iguais)
    2-  Escreva um programa capaz de ler 3 numeros inteiros que representam os lados de um triangulo.
        Informar se é um triângulo equilatero (todos os lados iguais)
    3   Considere o código abaiixo. Qual a saída do programa caso informado o valor 4?
 */

fun main() {
    println("Identificando um Quadrilátero")
    println("Informe o Lado A:");   val ladoA: String? = readLine()
    println("Informe o Lado B:");   val ladoB: String? = readLine()

    println("Identificando um Triangulo")
    println("Informe o Lado 01:");   val lado01: String? = readLine()
    println("Informe o Lado 02:");   val lado02: String? = readLine()
    println("Informe o Lado 03:");   val lado03: String? = readLine()

    println("Usando estes 2 dados afirmo que o objeto é um: ${identificaQuadrado("${ladoA}","${ladoB}")}")
    println("Usando estes 3 dados afirmo que o objeto é um: ${identificaTriangulo("${lado01}","${lado02}","${lado03}")}")
    qualASaida(4)
}

fun identificaQuadrado(ladoA: String, ladoB: String): String {
    if (ladoA != "" && ladoB != ""){
        ladoA.toInt()
        ladoB.toInt()
    }
    if (ladoA == ladoB){
        return "Quadrado"
    }else{
        return "Retangulo"
    }
}

fun identificaTriangulo(lado01: String, lado02: String, lado03: String): String {
    if (lado01 != "" && lado02 != "" && lado03 != ""){
        lado01.toInt()
        lado02.toInt()
        lado03.toInt()
    }
    return if (lado01 == lado02 && lado02 == lado03){
        "Triangulo Equilatero"
    }else if ((lado01 != lado02 && lado02!= lado03 && lado01 != lado03)){
        "Triangulo Escaleno"
    }else{
        "Triangulo Isóceles"
    }
}

fun qualASaida(num: Int){
    if(num >= 0){
        if (num == 0){
            println("Primeira String")
        }else{
            println("Segunda String")
        }
        println("Terceira String")
    }
}