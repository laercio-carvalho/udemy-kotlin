fun main() {
    val str = "Programação Kotlin"
    println("Taanho da String: ${str.length}")

    println("Posição (index) 0 da string: ${str[0]}")
    println(str.startsWith("Pro",true))
    println(str.endsWith("abc"))
    println(str.substring(2,4))
    println(str.replace("Kotlin", "flutter é show!"))
    println(str.lowercase())
    println(str.uppercase())

}