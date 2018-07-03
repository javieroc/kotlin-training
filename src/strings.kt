fun main(args: Array<String>) {
    // println("Hello kotlin from intellij")

    val a = 5
    var b = 6

    val nombre:String = "Javier"
    val edad:Int = 29

    val text = "Soy $nombre y tengo $edad años"

    println(text)

    var birt = "$nombre cumple ${edad + 1}"
    println(birt)

    val text2 = """
       |Este es un string demasiado largo
        |y tiene varios renglones
        |otro renglon
    """.trimMargin()

    println(text2)
}
