//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



fun main() {
    val name = "Kotlin"
    var great = 2
    val message = when (great){
        5 -> "Exellent"
        4-> "Normal"
        3 -> "very bad"
        else -> "You are so stupid, lol kek cheburek"
    }
    println(message)
    for (number in 1..5){
        print(number)
    }
    while (great<5){
        great+=1
    }
    println(great)









}