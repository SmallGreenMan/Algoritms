package topics

fun main() {
    // ["eat", "ate", "eta", "tae", "asd", "sda", "asdw"]

    val list = listOf("eat", "ate", "eta", "tae", "asd", "sda", "asw")




    println(calculateLettersRepeats(list))
    println(groupWords(arrayOf("eat", "ate", "eta", "tae", "asd", "sda", "asw")))
}

fun calculateLettersRepeats (s: List<String>): List<List<String>> {
    //var cmd: MutableList<String> = mutableListOf(s[0])
    var result: MutableList<MutableList<String>> = mutableListOf(mutableListOf(s[0]))
    var index = 0
    var flag = true

    for (el in s.subList(1,s.size)){
        index = 0
        flag = true
        for (subList in result) {
            if (elementComparation(el, subList[0])){
                flag = false
                result[index].add(el)
            }
            index++
        }
        if (flag) result.add(mutableListOf(el))
    }

    return result
}

fun elementComparation (s1: String, s2: String): Boolean{
    var result: Boolean = true

    s1.forEach { e -> if (e !in s2) result = false}

    return result
}



fun groupWords (words: Array<String>): List<List<String>>{
    val result: MutableList<List<String>> = mutableListOf()

    val map = mutableMapOf<String, MutableList<String>>()

    for (word in words){
        val sortedWord = word.toCharArray().sorted().joinToString("")

        if (map.contains(sortedWord))
            map[sortedWord]?.add(word)
        else
            map[sortedWord] = mutableListOf(word)
    }

    for ((key, value) in map){
        result.add(value)
    }

    return result
}