fun main() {
    val ranges = 1.rangeTo(20) step 1
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}