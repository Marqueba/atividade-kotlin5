/* Funções lambda e funções de ordem superior
*   1 - Como posso usar uma função lambda para classificar uma lista em ordem crescente em Kotlin?
*   2 - Como posso usar uma função de ordem superior para aplicar uma operação a cada elemento de uma lista em Kotlin?
*   3 - Como posso usar uma função lambda para filtrar elementos de uma lista em Kotlin?
*   4 - Como posso usar uma função lambda para encontrar o maior valor em uma lista em Kotlin?
*   5 - Como posso usar uma função de ordem superior para somar todos os elementos de uma lista em Kotlin?
*   6 - Como posso usar uma função de ordem superior para criar uma função que retorna a soma de dois números em Kotlin?
*   7 - Como posso usar uma função de ordem superior para imprimir uma mensagem n vezes em Kotlin?
* */

// 1. Para classificar uma lista em ordem crescente em Kotlin usando uma função lambda, podemos utilizar o método sortedBy() do tipo List. Por exemplo:
val lista = listOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)

val listaOrdenada = lista.sortedBy { it }

println(listaOrdenada) // [1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9]

// 2. Para aplicar uma operação a cada elemento de uma lista em Kotlin usando uma função de ordem superior, podemos utilizar o método map() do tipo List. Por exemplo:
val lista = listOf(1, 2, 3, 4, 5)

val listaDobrada = lista.map { it * 2 }

println(listaDobrada) // [2, 4, 6, 8, 10]

// 3. Para filtrar elementos de uma lista em Kotlin usando uma função lambda, podemos utilizar o método filter() do tipo List. Por exemplo:
val lista = listOf(1, 2, 3, 4, 5)

val listaFiltrada = lista.filter { it > 3 }

println(listaFiltrada) // [4, 5]

// 4. Para encontrar o maior valor em uma lista em Kotlin usando uma função lambda, podemos utilizar o método max() do tipo List. Por exemplo:
val lista = listOf(1, 3, 2, 5, 4)

val maiorValor = lista.max()

println(maiorValor) // 5


// 5. Para somar todos os elementos de uma lista em Kotlin usando uma função de ordem superior, podemos utilizar o método reduce() do tipo List. Por exemplo:
val lista = listOf(1, 2, 3, 4, 5)

val soma = lista.reduce { acc, valor -> acc + valor }

println(soma) // 15

// 6. Para criar uma função que retorna a soma de dois números em Kotlin usando uma função de ordem superior, podemos usar uma função lambda como parâmetro da função. Por exemplo:
fun somar(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a, b)
}

val resultado = somar(3, 4) { a, b -> a + b }

println(resultado)

// 7. Para imprimir uma mensagem n vezes em Kotlin usando uma função de ordem superior, podemos usar o método repeat() do tipo Int. Por exemplo:
fun repetirMensagem(mensagem: String, vezes: Int) {
    vezes.repeat { println(mensagem) }
}

repetirMensagem("Olá", 3)





