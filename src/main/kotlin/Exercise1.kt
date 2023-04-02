fun main() {
    var userInput:Int= readln().toInt()
    var userInput2:Int= readln().toInt()
    division(userInput, userInput2)
    reminder(userInput, userInput2)
}

fun division(numberOne:Int, numberTwo: Int):Unit=println("$numberOne/$numberTwo=${numberOne/numberTwo}")
fun reminder(numberOne:Int, numberTwo: Int):Unit=println("$numberOne % $numberTwo=${numberOne%numberTwo}")
