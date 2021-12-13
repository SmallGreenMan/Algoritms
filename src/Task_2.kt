package topics

fun main() {
    // AAAABBBCCXYKKKKEEEEJRRAAAAAAAAAAAAAAAD -> A4B3......A15

    val text = "AAAABBBCCXYKKKKEEEEJRRAAAAAAAAAAAAAAAD"

    println(stringCompressor(text))

}

fun stringCompressor (s: String): String {
    var result: String = ""
    var i = 0
    var ch = s[0]

    for (el in s){
        if (ch == el) i++
        else{
            result += "$ch$i"
            ch = el
            i = 1
        }
    }
    result += "$ch$i"

    return result
}
