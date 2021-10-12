fun main(args: Array<String>) {
    val string="Hello World !"
    println("Sentence : $string")
    val formattedString=string.replace("\\s".toRegex(),"")
    println("Without spaces : $formattedString")
}