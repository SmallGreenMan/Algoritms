package topics

fun main() {
    val a = listOf(1,2,3,4,5)

    a.forEach{e -> println(e)}
    println(a.map { e -> e*2 })             // --- Умножаем каждый элемент на 2
    println(a.filter { e -> e%2 == 0 })     // --- Оставляем только четные значения
    println(a.reduce{sum, e -> sum + e})    // --- Сумируем все элементы списка

    a.sorted()                              // --- Сортировка
    a.sortedDescending()                    // --- Сортировка по убыванию

    //a.sortedDescending{it.item}           // --- Таким обрпзом можно вызывать одино из полей обьекта и сортировать по нему

    println(a.any {it>10})                  // --- any - возвращяет true если в коллекции есть хотябы один элемент удовлетворяющий условию
    println(a.all {it<10})                  // --- all - возвращяет true если все элементы в коллекции удовлетворяют условию

    a.sum()                                 // --- сумма элементов коллекции

    val numbers = listOf(1,3,-4,2,-11)
    val (positiv, negativ) = numbers.partition { it > 0 }   // --- Разделение списка на два других по какому либо критерию

    println(positiv)
    println(negativ)


    val result = listOf("a","d","dd","rrr","hr").groupBy { it.length } // --- группирует элементы списка по какому либо критерию (получаем HashMap или LinckedHashMap)
    println(result)




}