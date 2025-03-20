# Design Principle
The design Principle is a guideline to create robust, scalable, maintainable or easy to understand software.

# SOLID

1. Single Responsibility Function - A class should have only one reason to change
2. Open Close Principle - A software entity(classes, modules, functions,...) should be open for extension but closed for modification. we can do this through polymorphism and interface(or abstract class)
3. Liskov Substitution Principle -The  Object of the Superclass can be replaced with the object of its subclasses without altering the desirable property of the program. It encourages polymorphism.
4. Interface Segregation Principle - No client should be forced to depend on a method it does not use we should break longer interfaces into smaller ones. It decreases coupling
5. Dependency Inversion Principle - High-level concrete class should not depend on Low-level concrete class. Abstraction should not depend on details instead, details should depend on abstraction. It helps in reducing coupling
