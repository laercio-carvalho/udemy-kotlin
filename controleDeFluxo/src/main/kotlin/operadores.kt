fun main() {
    entre(18)
}

fun entre(numero: Int) {
    if (numero in 0..17) {
        println("Menor de idade")
    }else if(numero >= 18){
        println("Maior de idade")
        if (numero >= 65) {
            println("Idoso")
        }
    }
}