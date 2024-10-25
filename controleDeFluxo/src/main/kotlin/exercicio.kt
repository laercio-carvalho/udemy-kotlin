/**
1-  Escreva um programa para ajudar empresa XPTO calcular o beonus que on funcionários receberão no final do ano
 Os Bonus são classificados por cargo.
    a   Gerentes recebem R$ 2.000,00
    b   Coordenadores recebem R$ 1.500,00
    c   Engenheiros de Software recebem R$ 1.000,00
    d   Estagiários recebem R$ 500,00

 2- Modifique o primeiro exercicio para considerar o tempo de experiencia no calculo do Bônus.
    a   Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
    b   Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
    c   Engenheiros de Software recebem R$ 1.000,00
    d   Estagiários recebem R$ 500,00
 3- Qual o resultado das comparações abaixo?            A       B       C       D
    a   (a && b && c && d)                              false   false   true    true
    b   (!a && !b && (c && d))                          false   false   true    true
    c   (a && ((b || c) || d))                          false   false   true    true
    d   (a || ((!b && c) || !d))                        false   false   true    true
*/
fun main() {
    println("Quantos ganha o funcionário abaixo?" +
            "\n1 - Gerente" +
            "\n2 - Coordenador" +
            "\n3 - Engenheiro de Software" +
            "\n4 - Estagiário")
    //funcionario(1)
    funcionarios(1.0,0.8)
    comparacao(false,false,true,true)
}
fun comparacao(a: Boolean , b: Boolean , c: Boolean , d: Boolean ) {
    println(a && b && c && d)
    println(!a && !b && (c && d))
    println(a && ((b || c) || d))
    println(a || ((!b && c) || !d))
}
fun funcionarios(anosGerentes: Double, anosCoordenadores: Double) {
    var gerentes = 2000.00
    var coordenadores = 1500.00
    val engenheirosDeSoftware = 1000.00
    val estagiarios = 500.00
    if (anosGerentes >= 2) {
        gerentes += 1000
    }
    if (anosCoordenadores >= 1) {
        coordenadores += 300
    }
    println("Gerentes recebem R$ $gerentes" +
            "\nCoordenadores recebem R$ $coordenadores"+
            "\nEngenheiros de Software recebem R$ $engenheirosDeSoftware" +
            "\nEstagiágios recebem R$ $estagiarios")
}