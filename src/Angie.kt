fun main() {
var person=Human("Nambooze",22,55)
person.eat(2)
person.speak("I am Akirachix")
    person.birthday()
    var angella=User("Angella","Nambooze","angellasimbwa@gmail.com","0752853816",34566789)
println("Nambooze")
    println("Angella")
}

class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
     println("I am eating $foodWeight kgs of food.")
        weight=foodWeight+weight
        println(weight)

    }
    fun speak(speech:String){
println(speech)
    }
    fun birthday(){
        println(age+1)
    }
}
data class User (var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int)
