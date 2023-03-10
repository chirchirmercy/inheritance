fun main(){
var me=Car("vol","mercedes","blue",50)
    me.carry(10)
    me.identity()
    println(me.calculateParkingFee(10))

    var x=Bus("Isuzu","isuzu70","Yellow", 5)
   println(x.maxTripFare(100.00))
    println(x.calculateParkingFee(5))


}
//1. Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)


open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        if(people<=capacity){
            println("carry $people passengers")
        }else{
            var x = people-capacity
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("i am a  $color  $make $model ")
    }
    open fun calculateParkingFee(hours:Int):Int{
        var fees=hours*20
        return fees
    }
}
//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)

//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.
class Bus( make:String,model:String, color: String, capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var maxi=capacity*fare
        return maxi

    }

    override fun calculateParkingFee(hours: Int): Int {
//        return super.calculateParkingFee(hours)
        var cap=hours*capacity
        return cap
    }
}
