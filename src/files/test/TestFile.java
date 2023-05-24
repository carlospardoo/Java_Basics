package files.test;

import files.FileManage;

import static files.FileManage.addToFile;
import static files.FileManage.createFile;
import static files.FileManage.readFile;
import static files.FileManage.writeFile;

public class TestFile {

    public static void main(String[] args) {
        var filename = "prueba1.txt";
        createFile(filename);
        writeFile(filename, "Hola desde java");
        writeFile(filename, "Adios");

        addToFile(filename, "Hola desde java");
        addToFile(filename, "Adios");

        readFile(filename);
    }
}
