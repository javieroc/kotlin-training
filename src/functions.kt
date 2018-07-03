fun hello() {
    println("Hello world")
}

fun suma(a:Int, b:Int) {
    println("La suma de $a y $b es igual ${a + b}")
}

fun max(a:Int, b:Int):Int {
    return if (a > b)
        a
    else
        b
}

fun max2(a:Int, b:Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println(max2(4, 1))
}
