package me.kishan.solid_demo.DependencyInversion

/**
 * Design Principle is guideline to create software that is robust, scalable, maintainable or easy to understand.
 *
 * Dependency Inversion Principle - High level concrete class should not depend on Low level concrete class
 *                                - Abstraction should not depends on details instead, details should depends on abstraction
 *                                - It helps in reducing coupling
 *
 *  Example - Dependency Injection, Observer, Abstract Factory
 */

// High level class is directly accessing Low level class
// it is tightly coupled with sqlDatabase class - can't write test case as its hordcoded
// can't use multiple type of database

/*class UserController(private val sqlDatabase: SQLDatabase) {
    fun saveUser(){
        sqlDatabase.saveUser()
    }

}

// Low level class
class SQLDatabase {
    fun saveUser(){
        println("user saved to sql database")
    }
}
*/


// High level class is not directly accessing Low level class
// coupling is break now
class UserController(private val database: Database) {
    fun saveUser(){
        database.saveUser()
    }
}

// Low level class
class SQLDatabase : Database {
    override fun saveUser(){
        println("user saved to sql database")
    }
}


fun main() {
    val sqlDatabase = SQLDatabase()
    val userController = UserController(sqlDatabase)
    userController.saveUser()
}