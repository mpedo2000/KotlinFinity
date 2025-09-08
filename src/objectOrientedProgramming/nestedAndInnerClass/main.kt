import oop.nestedAndInnerClass.HumanClass
import oop.nestedAndInnerClass.UserClass

fun main() {

    val userClass = UserClass()
    userClass.showName()

    val userClassCity = UserClass.City()
    userClassCity.showCity()

    val userClassAge = UserClass.Age()
    userClassAge.showAge()

    println()

    val humanClass = HumanClass()
    humanClass.showName()
    humanClass.City().showCity()
    humanClass.Age().showAge()
}