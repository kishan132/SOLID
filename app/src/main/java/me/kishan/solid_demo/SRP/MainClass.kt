package me.kishan.solid_demo.SRP

/**
 * Design Principle is guideline to create software that is robust, scalable, maintainable or easy to understand.
 *
 * Single Responsibility Function - A class should have only one reason to change
 *
 * Example - Factory, Builder, Facade
*/

/*
fun main() {

    // same class is handling all responsibility
    val fileManager = FileManager()
    val fileName = "test.txt"

    fileManager.openFile(fileName)
    fileManager.saveFile(fileName)
    fileManager.convertToPfd(fileName)
    fileManager.thumbnailGenerate(fileName)
}
*/


fun main() {
    val fileManager = FileManager()
    val fileName = "test.txt"

    // only file operation related function/logic
    fileManager.openFile(fileName)
    fileManager.saveFile(fileName)

    // only conversion related function/logic
    val conversionService = ConversionService()
    conversionService.convertToPfd(fileName)

    // only thumbnail generation related logic
    val thumbnailService = ThumbnailService()
    thumbnailService.thumbnailGenerate(fileName)
}