fun main() {
    val a1 = arrayOf(1,3,-5,4)
    val a2 = arrayOf(1,4,-5,-2)
    val a3:Array<Int> = arrayOf(0,0,0,0)
    for(i in 0..a1.size-1){
    a3[i]=a1[i]*a2[i]
        println(a3[i])
    }

}