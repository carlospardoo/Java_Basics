package com.laboratoty.peliculas.negocio;

import com.laboratoty.peliculas.datos.AccesoDatos;
import com.laboratoty.peliculas.dominio.Pelicula;

import java.util.List;

public class CatalogoPeliculasImpl implements CatalogoPeliculas{

    private final AccesoDatos accesoDatos;

    public CatalogoPeliculasImpl(AccesoDatos accesoDatos) {
        this.accesoDatos = accesoDatos;
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        accesoDatos.escribir(new Pelicula(nombrePelicula), nombreArchivo,true);
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        List<Pelicula> peliculaList = accesoDatos.listar(nombreArchivo);

        peliculaList.forEach( x -> System.out.println(x.getNombre()));

    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultadoBusqueda = accesoDatos.buscar(nombreArchivo, buscar);
        if("".equals(resultadoBusqueda))
            System.out.println("La pelicula no existe");
        else
            System.out.println(resultadoBusqueda);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        if(!accesoDatos.existe(nombreArchivo)){
            accesoDatos.crear(nombreArchivo);
        }
        else {
            System.out.println("El archivo ya existe. Inicializado");
        }
    }
}
