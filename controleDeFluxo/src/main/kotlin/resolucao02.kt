fun main() {
    quadrado()
    triangulo()
    qualASaidaResolucao(4)
}

fun quadrado(){
    print("Informe o lado 1: ")
    val lado1 = readLine()
    print("Informe o lado 2: ")
    val lado2 = readLine()
    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" ){
        val x = lado1.toInt()
        val y = lado2.toInt()
        if (x == y) {
            println("É um quadrado")
        }else{
            println("Não é um quadrado")
        }
    }
}

fun triangulo() {
    print("Informe o lado 1: ")
    val lado1 = readlnOrNull()
    print("Informe o lado 2: ")
    val lado2 = readlnOrNull()
    print("Informe o lado 3: ")
    val lado3 = readlnOrNull()
    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "" ){
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()
        if (x == y && y == z) {
            println("É um Triangulo Equilatero")
        }else{
            println("Não é um Triangulo Equilatero")
        }
    }
}

fun qualASaidaResolucao(num: Int) {
    if(num >= 0){
        if (num == 0){
            println("Primeira String")
        }else{
            println("Segunda String")
        }
        println("Terceira String")
    }
}