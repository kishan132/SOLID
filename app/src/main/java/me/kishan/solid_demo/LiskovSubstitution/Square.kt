package me.kishan.solid_demo.LiskovSubstitution

class Square(private val side:Int) : Shape {
    override fun getArea(): Int {
        return side*side
    }
}