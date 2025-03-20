package me.kishan.solid_demo.ISP


/**
 * Design Principle is guideline to create software that is robust, scalable, maintainable or easy to understand.
 *
 * Interface Segregation Principle - No client should be force to depend on method it does not use
 *                                 - we should break longer interface into smaller one
 *                                 - It decreases coupling
 *
 *  Example - Adapter, Proxy, Composite
 */

/*interface PaymentProcess{
    fun processPayment(amount:Double)
    fun refundPayment(amount:Double)
    fun applyDiscount(amount:Double)
}


class CreditCard : PaymentProcess{
    override fun processPayment(amount: Double) {
        println("process payment $amount")
    }

    override fun refundPayment(amount: Double) {
        println("refund payment $amount")
    }

    //not required still have to override
    override fun applyDiscount(amount: Double) {
        // not supported
    }

}*/

// split up into two interface according to usecase
interface DiscountAplicable {
    fun applyDiscount(amount:Double)
}

interface PaymentProcess {
    fun processPayment(amount:Double)
    fun refundPayment(amount:Double)
}

class CreditCard : PaymentProcess{
    override fun processPayment(amount: Double) {
        println("process payment $amount")
    }

    override fun refundPayment(amount: Double) {
        println("refund payment $amount")
    }
}

class PayPal : PaymentProcess, DiscountAplicable {
    override fun processPayment(amount: Double) {
        println("process payment $amount")
    }

    override fun refundPayment(amount: Double) {
        println("refund payment $amount")
    }

    override fun applyDiscount(amount: Double) {
        println("discount applicable of $amount")
    }
}


fun main() {
    val creditCard = CreditCard()
    creditCard.processPayment(3000.0)

    val payPal = PayPal()
    payPal.applyDiscount(50.0)
}