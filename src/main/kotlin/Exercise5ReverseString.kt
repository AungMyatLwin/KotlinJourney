fun main() {
    val msg:String = "This is a reverse able string"
    val list = mutableListOf<Char>()
    for(i in msg.length-1 downTo 0)
    {
        list.add(msg[i])
    }
    println(list.joinToString(" "))

}