package topics

fun main(){
    var a: String = "Hello"
    // a = null // a - can't be null

    println(a.length)

    var b: String? = "Test"
    b = null

    //b.length - а вот так нельзя, из-за тоого что переменная может быть null
    println(b?.length) // нужно так, это safeCall

    //цепочка вызовов методов
    // bob?.departament?.head?.name -> null


    // Elvis оператор - ?:
    val l = b?.length ?: -1


    // !! оператор - выбрасывает NPE (null pointer exaption) если в переменной null
    b = if ((0..10).random() > 5) "qweqwe" else null
    val t = b!!.length
    println(t)


}