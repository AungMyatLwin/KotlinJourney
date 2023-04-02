fun main() {
    println("Enter Number 1")
    var userInput:Int= readln().toInt()
    var temp:Int
    println("Enter Number 2")
    var userInput2:Int = readln().toInt()
    println("Before Swapping $userInput and $userInput2")
    temp=userInput
    userInput=userInput2
    userInput2=temp
    println("After Swapping $userInput and $userInput2")
}