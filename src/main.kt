fun main(){
    //question1
    var sabaru = Car("subaru", "legacy", " white",32)
    sabaru.carry(35)
    sabaru.identity()
    println(sabaru.calculateParkingFees(8))


    //question2
    var gaaga = Bus("gaaga","camry", "red", 64)
    println(gaaga.calculateParkingFees(6))
    println(gaaga.maxTripFare(100.0))


}
//question1
open class Car(var make:String, var model:String, var color:String, var capacity:Int){

    fun carry(people: Int) {
        var x = people-capacity
        if (capacity>=people) {
            println(" Carrying $people passengers ")
        } else{
            println("Over capacity by $x")
        }
    }

    fun identity(){
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int):Int{
        var parkfees = hours*20
        return parkfees
    }
}

//question2
class Bus(make:String, model:String, color:String, capacity:Int): Car(make, model, color, capacity) {
    fun maxTripFare(fare: Double):Double {
        var maxamount = capacity*fare
        return (maxamount)
    }

    override fun calculateParkingFees(hours: Int): Int {
        // super.calculateParkingFees(hours)
        var product = hours*capacity
        return product
    }
}
