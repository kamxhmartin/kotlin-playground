import java.util.*

fun main(args: Array<String>){
    val greeting = if (args[0].toInt() > 12) "Good Morning" else "Good afternoon!"
    val day = randomDay()
    println("$greeting Biatch, ${args[0]}!")
    dayOfWeek()
    println("My favorite day is $day")
    val cookie = getFortuneCookie()
    println(cookie)
    shouldChange(day = "Yesterday")

    whatShouldIdoToday("happy")

}

fun dayOfWeek(){
    println("What day is it today?")
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("It's ${ when(day){
        1->"Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    }}")
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun getFortuneCookie() : String {
    val fortunes = listOf<String>("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}

fun doThings (thing : String) : String {

    return thing
}

fun swim(speed: String = "fast"){
    println("swimming $speed")
}

fun getDefaultDirty() = 20

fun shouldChange(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDefaultDirty()) : Boolean {

    fun isTooHot(temperature: Int) : Boolean = temperature > 30
    fun isDirty(dirty: Int) : Boolean = dirty > 30
    fun isSunday(day: String) : Boolean = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}


fun canAddFish(tankSize: Int, currentFish: Array<Int>, fishSize: Int, hasDecorations: Boolean = false) : Boolean{
    var result = false
    // decorations = 2inches
    // fish size == gallons
    //10 gallon tank can have 8 inches of fish
    //20 galloon tank can have 20 inch fish
    var totalAllowed = tankSize
    if(hasDecorations){
        totalAllowed = (tankSize * .80).toInt()
    }
    for(fish in currentFish){
        totalAllowed = totalAllowed - fish
    }

    totalAllowed = totalAllowed -  fishSize
    if(totalAllowed >= 0){
        result = true
    }

    return result
}

fun whatShouldIdoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String{
    fun whatMood (mood : String) = mood == "happy"
    fun isSadRainlyCold (mood: String, weather: String, temperature: Int)= mood == "sad" && weather == "rain" && temperature == 0
    fun isHot (temperature: Int) = temperature>35

   return when{
       whatMood(mood) -> "go for a walk"
       isSadRainlyCold(mood, weather, temperature) -> "stay in bed"
       isHot(temperature) -> "go swim"
    else -> "Stay home and read."
    }
}



