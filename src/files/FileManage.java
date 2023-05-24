package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManage {

    public static void createFile(String filename){
        File file = new File(filename);
        try (PrintWriter output = new PrintWriter(file)) {
            // close not necessary if output is inside try
//            output.close();
            System.out.println("Se ha creado el archivo");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void writeFile(String filename, String content){
        File file = new File(filename);
        try (PrintWriter output = new PrintWriter(file)) {

            output.println(content);

            System.out.println("Se ha agregado datos al archivo");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void addToFile(String filename, String content){
        File file = new File(filename);
        //FileWriter para la opcion si se desea anexar informacion al archivo
        try (PrintWriter output = new PrintWriter(new FileWriter(file, true))) {

            output.println(content);

            System.out.println("Se ha anexado datos al archivo");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){

        }
    }

    public static void readFile(String filename){
        var file = new File(filename);

        try (BufferedReader input = new BufferedReader(new FileReader(file))) {

            var read = input.readLine();
            while (read != null){
                System.out.println("read = " + read);
                read = input.readLine();
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
