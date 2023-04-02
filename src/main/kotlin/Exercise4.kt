fun main() {
    val letters:String = "This is A letter with 23,4,5 5 03 4 ? ; kk AZ"
    var countLetter:Int=0
    var countChara:Int= 0
    var countNumb: Int =0
    println(letters.length)
    for( letter in letters){
        if(Character.isLetter(letter)){
            countLetter++
        }else if(Character.isDigit(letter)){
            countNumb++
        }
        else{
           countChara++
        }
    }
    println("Total String Number is ${letters.length}, consists of $countNumb digits, $countChara non characters, " +
            "and $countLetter characters")
}