import java.io.FileReader
import java.util.Scanner

fun main(args: Array<String>) {


    ///////////////////////////////Check Even or Odd///////////////////////////////

//    var input = Scanner(System.`in`)
//    print("Enter a number: ")
//
//    var int : Int = input.nextInt()
//    when(int % 2 == 0) {
//        true -> println("EVEN")
//        false -> println("ODD")
//        else -> println("I don't know")
//    }

    /////////////////////////////////Factorial Number///////////////////////////////

//    var input = Scanner(System.`in`)
//    print("Enter a number: ")
//
//    var int : Int = input.nextInt()
//    var fac : Int = 1
//    for (i in 2..int)
//        fac *= i
//    println("Factorial number is $fac")

    ///////////////////////////////Fibonacci Sequence///////////////////////////////

//    var input = Scanner(System.`in`)
//    print("Enter a number: ")
//
//    var int : Int = input.nextInt()
//    var a = 1
//    var b = int
//    var fib = 0
//    var fib2 = 1
//
//    while(a <= b) {
//        print("$fib, ")
//
//        val sum = fib + fib2
//        fib = fib2
//        fib2 = sum
//        a++
//    }


//////////////////////////Largest among 3 numbers//////////////////////////////////

//    println("Enter a numbers: ")
//    var input = Scanner(System.`in`)
//
//    var int1 = input.nextInt()
//    var int2 = input.nextInt()
//    var int3 = input.nextInt()
//
//    if(int1 > int2 && int1 > int3) {
//        println("$int1 is largest")
//    }
//    else if(int2 > int1 && int2 > int3) {
//        println("$int2 is largest")
//    }
//    else {
//        println("$int3 is largest")
//    }


    val row1 = 2
    val col1 = 3
    val row2 = 3
    val col2 = 2

    val firstMatrix = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6))
    val secondMatrix = arrayOf(intArrayOf(7,8), intArrayOf(9, 0), intArrayOf(0, 1))

    val newMatrix = multiplyMatrices(firstMatrix, secondMatrix, row1, col1, col2)

    display(newMatrix)
}

fun multiplyMatrices(firstMatrix: Array<IntArray>, secondMatrix: Array<IntArray>, row1: Int, col1: Int, col2: Int): Array<IntArray> {
    val result = Array(row1) { IntArray(col2) }
    for (i in 0..row1 - 1) {
        for (j in 0..col2 - 1) {
            for (k in 0..col1 - 1) {
                result[i][j] += firstMatrix[i][k] * secondMatrix[k][j]
            }
        }
    }
    return result
}

fun display(matrix: Array<IntArray>) {
    println("Product of two matrices is: ")
    for (row in matrix) {
        for (col in row) {
            print("$col    ")
        }
        println()
    }
}