package topics

fun main () {
    val children1 = Person("Max", "Volt", 6)
    val p1 = Person("Alex", "Volt", 40, children1)
    println(p1.children[0].firsName)

    val  rectungle1 = Rectungle(5.0, 2.0)
    println("The perimiter is ${rectungle1.perimiter} hashCode: ${rectungle1.hashCode()}")
    println(rectungle1.toString())

    val  rectungle2 = Rectungle(5.0, 2.0)
    println("The perimiter is ${rectungle2.perimiter} hashCode: ${rectungle2.hashCode()}")
    println(rectungle2.toString())

    println(rectungle1 == rectungle2)

}

class Person (val firsName: String, val secondName: String = "", var age: Int = 0){     // ---  Первичный коструктор (Primary Constructor)
    var children: MutableList<Person> = mutableListOf() // --- Java -> ArrayList

    init {                                                                              // --- Блок выполняется при создании обьекта НО после конструктора
        println("Person $firsName is created, age: $age")
    }

    constructor(firsName: String, secondName: String, age: Int, child: Person ): this (firsName, secondName, age){
                                                                                        // --- вторичный конструктор (обязан вызывать в себе первичный)
        children.add(child)
    }

    constructor(): this("","",-1)                                // --- Вторичный конструктор без акгументов
}


data class Rectungle(var hight: Double, var length: Double){                            // --- Слова DATA овтаматический создает код для методов ToString, HashCone, Equals и т.д.
    var perimiter = (hight + length) * 2

    var test = 1
        get() = field + 1 // --- Java - this.поле -> Kotlin - field
        set(value) {
            if (value<0) println("Negative value")
            else field = value
        }

    fun area() = hight * length
}