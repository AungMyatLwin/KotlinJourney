fun main() {
    val num1:Int= readln().toInt()
    val num2:Int= readln().toInt()
    val num3:Int = readln().toInt()
    val max=if(num1>=num2 && num1>=num3) num1
    else if(num2>=num1 && num2>=3) num2
    else num3
    println(max)
}