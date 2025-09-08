package oop.introduceOOP

import oop.introduceOOP.profile.Human

fun main() {

    val human = Human()

    human.name = "Kotlin"
    human.family = "Jetbrains"

    println("${human.name} ${human.family}")

    human.showMyAge(25)

}