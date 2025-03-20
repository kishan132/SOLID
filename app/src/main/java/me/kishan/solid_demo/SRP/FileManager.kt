package me.kishan.solid_demo.SRP

class FileManager{
    var files: List<String> = ArrayList()

    fun openFile(fileName: String){
        println("open file $fileName")
    }


    fun saveFile(fileName: String){
        println("saveFile file $fileName")
    }


    /*fun convertToPfd(fileName: String){
        println("convertToPfd file $fileName")
    }


    fun thumbnailGenerate(fileName: String){
        println("thumbnailGenerate file $fileName")
    }*/
}