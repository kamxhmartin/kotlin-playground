package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int = if(friendly){
        volumeNeeded
    } else{
        volumeNeeded *2
    }
    fun makeDefaultFish() = Fish(true, 50)
}