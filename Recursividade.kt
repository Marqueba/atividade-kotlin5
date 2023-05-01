/* Funções Recursivas
*   1 - Crie uma função recursiva que calcule o fatorial de um número inteiro positivo.
*   2 - Crie uma função recursiva que calcule o enésimo termo da sequência de Fibonacci.
*   3 - Crie uma função recursiva que calcule o MDC (Máximo Divisor Comum) entre dois números inteiros positivos.
*   4 - Crie uma função recursiva que verifique se uma string é palíndromo.
*   5 - Crie uma função recursiva que calcule a soma dos elementos de um array de inteiros.
* */

fun main () {
    println(fatorial(3))

    print("Insira um número limite para visualizar a sequência de fibonacci: ")
    val number = readln().toInt()
    for (i in 0 .. number) {
        print("${fibbonaci(i)}, ")
    }

    println(mdc(4, 15))

    println(isPalindrome("arara"))
    println(isPalindrome("cavalo"))
}

// Exercício 1
tailrec fun fatorial(n: Int, acc: Int = 1): Int {
    if (n == 0) {
        return acc
    } else {
        return fatorial(n - 1, acc * n)
    }
}

// Exercício 2
fun fibbonaci(number: Int): Int {
    return if (number < 2 )
        number
    else
        fibbonaci(number-1) + fibbonaci(number-2)
}
// Exercício 3
tailrec fun mdc(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    }
    return mdc(b, a % b)
}

// Exercício 4
fun isPalindrome(str: String): Boolean {
    if (str.length <= 1) {
        return true
    }
    if (str[0] != str[str.length - 1]) {
        return false
    }
    return isPalindrome(str.substring(1, str.length - 1))
}

// Exercício 5
fun sumArray(array: IntArray, index: Int = 0): Int {
    if (index == array.size) {
        return 0
    }
    return array[index] + sumArray(array, index + 1)
}
