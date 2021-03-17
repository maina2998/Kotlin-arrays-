import java.util.*

fun main() {
students()
    cities()
    numbers()

    var c = arrayOf("Natalie","Grace","Mary")
    println(Arrays.toString(c))
}
fun students() {
    var studentArray = arrayOf("Grace","Maggie","Dorcas","Milly")
    println(Arrays.toString(studentArray))

}
fun cities() {
    var citiesArray = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println("harare".capitalize() + "," + "mumbai".capitalize() + "," + "dodoma".capitalize() + "," + "jakarta".capitalize())

}
fun numbers() {
    var numberArray = arrayOf(32,17,4,213,78,43,90,31,3,73,11,153,62)
    val total = numberArray.component2() + numberArray.component5()
    println(total)
    var index =numberArray.indexOf(158)
    println(index)
    var sortedNum = numberArray.sortedArray()
    println(Arrays.toString(sortedNum))
}
fun name(name1:String,name2: String,name:String):Array<String>{
    var b = arrayOf(name1,name2,name)
    return b





}