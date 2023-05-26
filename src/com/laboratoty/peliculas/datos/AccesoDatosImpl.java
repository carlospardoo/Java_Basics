package com.laboratoty.peliculas.datos;

import com.laboratoty.peliculas.dominio.Pelicula;
import com.laboratoty.peliculas.exception.ArchivoNoExisteException;
import com.laboratoty.peliculas.exception.ArchivoYaExisteException;
import com.laboratoty.peliculas.test.CPJLaboratorioFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements AccesoDatos{
    @Override
    public boolean existe(String nombreArchivo) {
        String rutaCompleta = getRutaCompleta(nombreArchivo);

        File archivo = new File(rutaCompleta);

        return archivo.exists();

    }

    @Override
    public List<Pelicula> listar(String nombre) {

        List<Pelicula> peliculaList = new ArrayList<>();
        String linea;

        if(!existe(nombre))
            throw new ArchivoNoExisteException("El archivo no existe");

        File file = new File(getRutaCompleta(nombre));

        try(BufferedReader input = new BufferedReader(new FileReader(file))){
            linea = input.readLine();
            while (linea !=null){
                Pelicula pelicula = new Pelicula(linea);
                linea = input.readLine();
                peliculaList.add(pelicula);
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }

        return peliculaList;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
        File file = new File(getRutaCompleta(nombreArchivo));

        try(PrintWriter output = new PrintWriter(new FileWriter(file, anexar))) {
            output.println(pelicula.getNombre());
            System.out.println("Se ha escrito información en el archivo");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        List<Pelicula> peliculaList = listar(nombreArchivo);

        for(Pelicula pelicula : peliculaList){
            if(pelicula.getNombre().equals(buscar)){
                return pelicula.getNombre();
            }
        }
        return "";
    }

    @Override
    public void crear(String nombreArchivo) {

        String rutaCompleta = getRutaCompleta(nombreArchivo);

        File archivo = new File(rutaCompleta);

        if(existe(nombreArchivo))
            throw new ArchivoYaExisteException("El archivo ya está registrado");

        try (PrintWriter output = new PrintWriter(archivo)) {
            System.out.println("Se ha creado el archivo");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override
    public void borrar(String nombreArchivo) {
        if(existe(nombreArchivo)){
            File file = new File(getRutaCompleta(nombreArchivo));

            boolean borrado = file.delete();

            if(borrado) System.out.println("Archivo borrado con éxito");
            else System.out.println("Error al borrar el archivo");

        }
        else {
            System.out.println("El archivo no existe");
        }
    }

    private String getRutaCompleta(String nombreArchivo){
        String rutaCompleta = String.join(
                "\\",
//                        CPJLaboratorioFinal.class.getResource("carpetaArchivos").getPath(),
                "src\\com\\laboratoty\\peliculas\\test\\carpetaArchivos",
                nombreArchivo
        );

        return rutaCompleta;
    }
}
