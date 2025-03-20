package me.kishan.solid_demo.OpenClose

/**
 * Design Principle is guideline to create software that is robust, scalable, maintainable or easy to understand.
 *
 * Open Close Principle - A software entity(classes, modules, functions,...) should be open for extension but close for modification.
 *                        we can do this through polymorphism and interface(or abstract class)
 *
 *  Example - Strategy, Decorator, Template Method
 */

fun main() {

    // if we want to add new notification, we have to make change in existing logic
    /*val notificationService = NotificationService()
    notificationService.sendNotification("Email","sending Email Notification")
    notificationService.sendNotification("SMS","sending Email Notification")*/

    // if we want to add new notification, we can simply extend new notification without affecting existing code
    val notificationService = NotificationService()
    notificationService.sendNotification(EmailNotification(),"sending Email Notification")
    notificationService.sendNotification(SMSNotification(),"sending Email Notification")

}