//A - Crie um novo arquivo com uma função main
fun main() {
    //B - Declare uma variável mutável capaz de armazenar seu nome completo
    var nome_mutavel: String = "Leandro"
    nome_mutavel = "Laercio Carvalho Silva"
    //C - Declare uma variável sem valor algum
    var variavel_sem_valor: String
    //D - Declare uma variável imutavel com o menor tipo de dado possivel capaz de armazenar
    //o numero que você calça
    val numero_de_calcado: Byte = 44
    //E - Declare uma variável capaz de armazenar o PIB do Brasil
    var pib: Long = 1869000000000
    //F - Declare a variável capaz de armazenar a população do Brasil
    var populacao_brasileira: Int = 211000000
    //G - Imprima o valor do PIB per Capta
    println("O PIB per Capta do Brasil é: ${pib/populacao_brasileira}")
    //Rode seu programa de maneira que não possua erros de compilação ou execução

}