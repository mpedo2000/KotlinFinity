package objectOrientedProgramming.packageDefinitionAndImports

import objectOrientedProgramming.packageDefinitionAndImports.my.demo.User

fun main(args:Array<String>){

    val userClass = User()

    println(userClass.name)
    println(userClass.year)

    println()

    println(args.contentToString())

}