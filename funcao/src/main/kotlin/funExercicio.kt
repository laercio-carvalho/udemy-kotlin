/*1 - Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias
horas, minutos e segundos
2 - Escreva uma função capaz de receber uma string e retornar
3 - Escreva uma função capaz de calcular o cubo de um numero inteiro
4 - Escreva uma função capaz de receber milhas e converter em km
5 - Escreva um programa que seja capaz de receber uma String e trocar todas as letras "a" ou "A" por "x"
    a)  Não deve conter lógica dentro da função Main. Deve ser usado somente como ponto de entrada.
    b)  Escrever uma função para troca de letras e impressão do valor final
    c)  String final deve estar com todas as letras minúsculas
6 - Sobre as funções criadas nos exercícios 2, 3 e 4. É possivel transformal em funções de linha únicas? Se sim: Transforme-os
*/

fun main() {
    transfAno(2)
    contaLetra("Teste de digitação ")
    cubo(3)
    kmConverter(10.0)
    converteString("Testar Esta Digitação Agora")
}

fun transfAno(valor: Int, ano: Int = 12, mes: Float = 30.416666f, dias: Int = 24, horas: Int = 60, minutos: Int = 60){
    println("$valor Anos equivale a: " +
            "\n${(valor*ano)} meses" +
            "\n${(valor*ano*mes).toInt()} dias" +
            "\n${(valor*ano*mes*dias).toInt()} horas" +
            "\n${(valor*ano*mes*dias*horas).toInt()} minutos" +
            "\n${(valor*ano*mes*dias*horas*minutos).toInt()} segundos")
}
fun contaLetra(palavra: String) {
    println("A quantidade de caractere do que foi digitado é: ${palavra.length} caracteres")
}
fun cubo(numero: Int){
    println("O cubo de $numero é ${numero*numero*numero}")
}
fun kmConverter(milhas: Double) {
    println("$milhas Milhas são ${milhas*1.6}km")
}
fun converteString(textoAConverter: String) {
    println(textoAConverter.replace("a","x",ignoreCase = true).lowercase())
}