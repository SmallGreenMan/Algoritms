package topics

fun main(){
    println("Hello world")

    val items = listOf("apple", "Banana", "orange")
    // var items = mutableListOf("apple", "Banana", "orange")

    for (item in items) {
        println(item)
    }

    var index = 0
    while (index < items.size){
        println("- item at $index is ${items[index]}")
        index++
    }


    // Диапазоны
    print(5 in 3..10)

    for (i in 1..10)
        println(i)

    for (i in 1 until 10)
        println(i)

    for (i in 10 downTo 1)
        println(i)

    for (i in 0..100 step 10)
        println(i)
}