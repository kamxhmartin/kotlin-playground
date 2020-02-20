package Aquarium

fun main(args: Array<String>){
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length}\nHeight: ${myAquarium.height}\nWidth: ${myAquarium.width}")

    myAquarium.height = 80
    println("Length: ${myAquarium.length}\nHeight: ${myAquarium.height}\nWidth: ${myAquarium.width}")
    print("${myAquarium.volume()}\n")
    print(myAquarium.volume)

    val smallAquarium = Aquarium(numberOfFish = 9)

    val anotherAquarium = Aquarium(length = 15, width = 15, height = 50)
    println("Length: ${smallAquarium.length}\nHeight: ${smallAquarium.height}\nWidth: ${smallAquarium.width}")
    println("Length: ${anotherAquarium.length}\nHeight: ${anotherAquarium.height}\nWidth: ${anotherAquarium.width}")


}