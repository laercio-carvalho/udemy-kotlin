fun main() {
    helloWorld()

    println("A soma de 10 e 5 é ${sum(10,5)}")
    println("A subtração de 10 e 5 é ${sub(10,5)}")
    println("A Divisão de 10 por 5 é ${div(10f,5.5f)}")

}
//Função comum
fun sum(a: Int, b: Int): Int {
    return (a+b)
}
//função de linha unica
fun sub(c: Int, d: Int): Int = (c-d)

fun div(e: Float, f: Float) = (e/f)

fun helloWorld(){
    println("Hello, World")
}