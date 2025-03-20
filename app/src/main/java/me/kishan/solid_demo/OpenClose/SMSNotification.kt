package me.kishan.solid_demo.OpenClose

class SMSNotification : Notification {
    override fun notify(msg: String) {
        println("Sending SMS notification")
    }
}