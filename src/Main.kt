import java.time.LocalDate

fun main(args: Array<String>) {
    println("Hello, World!")

    val roman = Person("Roman", "Lazunin", LocalDate.of(1975, 12, 6))

    roman.LastName = "Lazunin sr."

    println("Hello, ${roman.FirstName} ${roman.LastName}, birthdate: ${roman.BirthDate}!")

    roman.display()
}