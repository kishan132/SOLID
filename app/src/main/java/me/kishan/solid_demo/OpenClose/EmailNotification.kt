package me.kishan.solid_demo.OpenClose

class EmailNotification : Notification {
    override fun notify(msg: String) {
        println("Sending Email notification")
    }
}