open class Person(val name:String) {
    init {
        println("I am $name")
    }

    constructor(name:String, age:Int) :this(name) {
        println("Name $name, Age $age")
    }

    fun sayhello() {
        println("Hello I am $name")
    }
}



class Student(val n:String, val lu:Int) : Person(n) {
    init {
        println("I am $name and my lu is $lu")
    }
}


fun main(args: Array<String>) {
    val student = Student("Javier", 123456)
    student.sayhello()
}