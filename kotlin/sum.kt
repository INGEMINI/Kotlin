fun main() {
    println("Enter a number:")
    val n = readLine()!!.toInt()  // Take user input
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println("The sum of first $n natural numbers is: $sum")
}
