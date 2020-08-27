fun main() {
    val rangeInt = 6..30 step 6
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}