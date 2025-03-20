package me.kishan.solid_demo.OpenClose

// this class can easily modify
/*
class NotificationService {

    fun sendNotification(type:String, msg:String){
        if(type == "Email"){
            println("Sending Email notification")
        }
        else if(type == "SMS"){
            println("Sending SMS notification")
        }
        else{
            println("Invalid notification type.")
        }
    }
}
*/


// we can extend any notification without changing existing code.
class NotificationService {
    fun sendNotification(notification: Notification, msg:String){
        notification.notify(msg)
    }
}