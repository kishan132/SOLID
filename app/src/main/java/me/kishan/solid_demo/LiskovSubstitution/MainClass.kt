package me.kishan.solid_demo.LiskovSubstitution

/**
 * Design Principle is guideline to create software that is robust, scalable, maintainable or easy to understand.
 *
 * Liskov Substitution Principle - Object of Super class can be replaceable with object of its subclasses
 *                                 without altering the desirable property of program.
 *
 *                               -  It encourage polymorphism
 *
 *  Example - Template Method, Bridge, Factory Method
 *
 */

/*open class Rectangle{
    protected var width : Int = 0
    protected var height: Int = 0
    open fun setWidth(width:Int){this.width = width}

    open fun setHeight(height:Int){this.height = height}
    open fun getArea():Int {return width*height}

}

class Square  : Rectangle() {
    override fun setWidth(width:Int){
        this.width = width
        this.height = width
    }

    override fun setHeight(height:Int){
        this.width = height
        this.height = height
    }

    override fun getArea():Int {return width*height}

}*/


/*
fun main() {
    val rectangle = Rectangle()
    rectangle.setWidth(12)
    rectangle.setHeight(6)

    println("Rectangle Area ${rectangle.getArea()}")

    // created object of child class but it will change its behaviour - getArea() will give wrong ans
    val square  = Square()
    square.setWidth(12)
    square.setHeight(6)

    println("Square Area ${square.getArea()}")
}
*/

fun main() {
    // encourage polymorphism
    val rectangle = Rectangle(5,10)
    println("Rectangle Area ${rectangle.getArea()}")

    // created object of child class without changing its behaviour - getArea() will give wrong ans
    val square  = Square(6)
    println("Square Area ${square.getArea()}")
}

