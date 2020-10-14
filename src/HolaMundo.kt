import java.util.*

fun main() {
    val sn = Scanner(System.`in`)
    println("¿De quién es el aniversario?")
    val nombre = sn.nextLine()
    println("¿Cuántos años cumple?")
    val edad= sn.nextInt()
    val capas = 4
    printCakeCandles(edad)
    printCakeTop(edad)
    printCakeBottom(edad, capas, nombre)
}

fun printCakeCandles(edad: Int) {
    print (" ")
    repeat(edad) {
        print(",")
    }
    println()

    print(" ")
    repeat(edad) {
        print("|")
    }
    println()
}

fun printCakeTop(edad: Int) {
    repeat(edad + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(edad: Int, capas: Int, nombre: String) {
    repeat(capas) {
        repeat(edad + 2) {
            print("@")
        }
        println()
    }
    println("    ~ Feliz ${edad} cumpleaños, ${nombre}! ~")
}