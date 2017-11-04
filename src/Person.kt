import java.time.LocalDate

class Person(
        var FirstName: String,
        var LastName: String,
        var BirthDate: LocalDate
) {
    fun display(){
        println("First name: $FirstName\nLast name: $LastName\nDate of birth: $BirthDate")
    }

    fun displayWithLambda( func: (s:String) -> Unit){
        func(FirstName)
    }

}