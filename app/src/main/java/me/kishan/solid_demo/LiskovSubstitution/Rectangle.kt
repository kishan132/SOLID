package me.kishan.solid_demo.LiskovSubstitution

class Rectangle(private val width:Int, private val height:Int) : Shape {
    override fun getArea(): Int {
        return width*height
    }
}