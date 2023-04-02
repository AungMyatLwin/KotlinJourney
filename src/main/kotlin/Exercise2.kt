import kotlin.math.pow

fun main() {
    println("Please Enter Radius:")
    var radius:Int= readln().toInt()
    val PI = 3.14
    var area=PI* radius.toDouble().pow(2.0)

    var perimeter=2*PI*radius
    println("Area is ${area.toInt()} and Perimeter of a circle is ${perimeter.toInt()}")
}