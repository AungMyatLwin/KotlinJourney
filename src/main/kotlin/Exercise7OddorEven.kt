fun main() {
    val arrayInt:Array<Int> = arrayOf(5,7,2,4,9)
    var even=0
    var odd=0
    for(element in arrayInt)
    {
        if(element %2==0) even++
        else odd++
    }
    println("No. of even: $even and odd: $odd")
}