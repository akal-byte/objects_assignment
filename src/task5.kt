fun main() {
var human=Human("akal",21,55)
    println(human.eat(31))
    human.speak("I love writing poetry")
    human.birthday()
    var user=User("akal","Erupe","akalerupe@gmail.com","0741888967","muhimu")
    println(user.lastName)
    println(user.password)

}
class Human(var name:String, var age:Int,var weight:Int){
       fun eat(foodweight:Int):Int{
           println (" I am eating $foodweight kgs of food")
           weight= weight+foodweight
           return weight
       }
      fun speak(speech:String){
           println(speech)
      }
      fun birthday (){
          var newAge=age+1
          println(newAge)

      }
}
data class User (var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}
