package Aquarium

class Aquarium (var length: Int = 100, var width: Int = 20,var height: Int = 30){
    constructor(numberOfFish: Int): this(){
        val water: Int = numberOfFish * 2000
        val tank: Double = water + water *.1
        height = (tank / (length*width)).toInt()
    }

    var volume : Int
        get() =width * height * length / 1000
        set(value) {height = (value * 1000) / length * width}

    fun volume(): Int {
        return width * height * length / 1000
    }

    var water = volume * .9
}