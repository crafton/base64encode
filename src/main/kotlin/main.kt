import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    validateInput(args)
    println(Base64.getEncoder().encodeToString(args[0].toByteArray()))
}

fun validateInput(args: Array<String>) {
    if (args.isEmpty()) {
        println("You need to enter the string that you'd like to encode. If the string has spaces, be sure to wrap it in quotes.")
        exitProcess(0)
    }
}
