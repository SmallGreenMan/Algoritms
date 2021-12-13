package topics

fun main () {
    println(" --- WhenExpretion --- ")
    testWhen(1)
    testWhen("hello")
    testWhen(11)
    testWhen(31)
}

// Java: (Object object) -> Kotlin: (input: Any)
fun testWhen (input: Any){
    when(input){
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("In Diapazon")
        is String -> println("A string was resived, length is: ${input.length}")
        else -> println("Something else")
    }

    if (input is String) {
        println("Действитеьлно строка")
        println("${input.length}")
    }
}