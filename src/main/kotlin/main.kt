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

    println("Enter a numbers: ")
    var input = Scanner(System.`in`)

    var int1 = input.nextInt()
    var int2 = input.nextInt()
    var int3 = input.nextInt()

    if(int1 > int2 && int1 > int3) {
        println("$int1 is largest")
    }
    else if(int2 > int1 && int2 > int3) {
        println("$int2 is largest")
    }
    else {
        println("$int3 is largest")
    }



}