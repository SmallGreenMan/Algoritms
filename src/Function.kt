package topics

fun main () {
    println(testSimple())
    println(testSimple2(10, 2))
    println(testSimple3(20, 3))

    println(testString(30))

    println(testNamedArguments(4,3,2))
    println(testNamedArguments(z = 10, y = 11, x = 12))

    testDefoltArguments()
    testDefoltArguments(y = 10)

    //println(${foo("alex")})
    //println(foo("alex", toUpperCase = true))

    printEven(1,2,3,4,5,6,7,8,9)
    printEven(*intArrayOf(10,11,12,13,14), 15, 16, 17, 18)
}

fun testSimple (): Int {
    return 5 + 5
}
fun testSimple2 (x: Int, y: Int): Int = x + y
fun testSimple3 (x: Int, y: Int) = x + y

fun testString (x: Int): String {
    return "String is $x"
}

fun testNamedArguments (x: Int, y: Int, z: Int): List<Int> {
    return listOf(x,y,z)
}

// void - java
fun testDefoltArguments (x: Int = 1, y: Int = 2){
    println(x + y)
}

// --- ???
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false){
   (if (toUpperCase) name.toUpperCase() else name.toUpperCase()) + number
}

// vararg   -----    ist: List<Int> -> vararg number: Int
fun printEven(vararg numbers: Int){
    numbers.forEach { e -> if (e%2 == 0) println(e) }
}