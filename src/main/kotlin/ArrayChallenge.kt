fun indexes(): Int {
    return (Math.random() * 10).toInt()
}

fun main(args: Array<String>) {
    val sizeOfArray: Int = indexes()
    val randomArray:ArrayList<Int> = arrayListOf()
    for(i in 0..sizeOfArray){
        randomArray.add(indexes())
        print(randomArray[i])
        print(",")
    }
//    println(" ")
//    val isMax = combination(true, randomArray)
//    println(isMax)
//    val isMin = combination(false, randomArray)
//    println(isMin)

    val isMaxCombine:String= betterCombine(randomArray,true)
    println(isMaxCombine)
}
// max value in arr
fun max(arr:ArrayList<Int>):Int{
    var temp=arr[0]
    for(element in arr){
      temp = if(temp<=element) element else temp
    }
    return temp
}

// min value in arr
fun min(arr:ArrayList<Int>):Int{
    var temp=arr[0]
    for(element in arr){
        temp = if(temp>=element) element else temp
    }
    return temp
}

// combine above fun with boolean do decide max or min
fun combination(isMax:Boolean, arr: ArrayList<Int>):String{
    return  if(isMax) "Max Value is ${max(arr)}" else  "Minimum Value is ${min(arr)}"
}


fun betterCombine(arr:ArrayList<Int>, isMax:Boolean):String{
    var temp=arr[0].toString()
    for(element in arr){
        temp = if(isMax){
            if(temp.toInt() <= element) "$element" else temp
        } else{
            if(temp.toInt() >= element) "$element" else temp
        }
    }
    return if(isMax) "Max is $temp" else "Min is $temp"
}
