package com.laboratoty.peliculas.datos;

import com.laboratoty.peliculas.dominio.Pelicula;
import com.laboratoty.peliculas.exception.ArchivoYaExisteException;

import java.util.List;

public interface AccesoDatos {

    public boolean existe (String nombreArchivo);

    public List<Pelicula> listar(String nombre);

    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);

    public String buscar(String nombreArchivo, String buscar);

    public void crear(String nombreArchivo);

    public void borrar(String nombreArchivo);

}
