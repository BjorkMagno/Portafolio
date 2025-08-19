package com.books.LiterALura.principal;

import com.books.LiterALura.modelos.*;
import com.books.LiterALura.service.ConsumoAPI;
import com.books.LiterALura.service.ConvierteDatos;

import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private Scanner scanner = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public Book busqueda = new Book();

    public void muestraMenu(){

        System.out.println("""
                --------------------------------------------
                **************** LiterAlura ****************
                --------------------------------------------
        """);

        var url = busqueda.searchGeneral();
        var json = consumoAPI.obtenerDatos(busqueda.searchGeneral());

        System.out.println(json);
        var datos = conversor.obtenerDatos(json, Datos.class);

        // Top 10 Libros más descargados
        System.out.println(" Top 10 libros más descargados");
        datos.resultados().stream()
                .sorted(Comparator.comparing(DatosBook::descargas).reversed())
                .limit(10)
                .map(book -> book.titulo().toUpperCase())
                .forEach(System.out::println);

        // Busqueda de libros por titulo.
        System.out.println("Ingrese el titulo del libro: ");
        var titleBook = scanner.nextLine();
        busqueda.setTitulo(titleBook);
        json = consumoAPI.obtenerDatos(busqueda.searchTitle());

        var datosBusqueda = conversor.obtenerDatos(json, Datos.class);
        datosBusqueda.resultados().stream()
                .filter(book -> book.titulo().toUpperCase().contains(titleBook.toUpperCase()))
                .limit(10);

        // Busqueda de libros por autor.
        System.out.println("Ingresa el autor del libro: ");
        var autor = scanner.nextLine();
        Author authorBook = new Author(autor);
        busqueda.setAutor(authorBook);
        json = consumoAPI.obtenerDatos(busqueda.searchAuthor());

        var autorBusqueda = conversor.obtenerDatos(json, Datos.class);
        autorBusqueda.resultados().stream()
                .filter(book -> book.titulo().toUpperCase().contains(titleBook.toUpperCase()))
                .limit(10)
                .collect(Collectors.toList());

        // Busqueda de libros por idioma
        System.out.println("Ingresa el idioma de los libros: ");
        var idioma = scanner.nextLine();
        json = consumoAPI.obtenerDatos(busqueda.searchGeneral());

        var idiomaBusqueda = conversor.obtenerDatos(json, Datos.class);
        idiomaBusqueda.resultados().stream()
                .filter(book -> book.idioma().contains(idioma))
                .sorted((b1, b2) -> Integer.compare(b2.descargas(), b1.descargas()))
                .limit(10)
                .collect(Collectors.toList());

        // Busqueda de libros por titulo.
        System.out.println("Ingrese el titulo del ID: ");
        var idBook = scanner.nextInt();
        busqueda.setId(idBook);
        json = consumoAPI.obtenerDatos(busqueda.searchID());

        var busquedaId = conversor.obtenerDatos(json, Datos.class);
        Optional<DatosBook> libroBuscadoId = datosBusqueda.resultados().stream()
                .findFirst();
        if(libroBuscadoId.isPresent()){
            System.out.println("Libro Encontrado ");
            System.out.println(libroBuscadoId.get());
        }else {
            System.out.println("Libro no encontrado");
        }

        // Busqueda de autores
        System.out.println("Ingrese el año del autor: ");
        var autorYear = scanner.nextInt();
        json = consumoAPI.obtenerDatos(busqueda.searchGeneral());

        var busquedaAutores = conversor.obtenerDatos(json, Datos.class);
        busquedaAutores.resultados().stream()
                .flatMap(book -> book.autor().stream())
                .filter(author -> (author.anoNacimiento() != null && author.anoNacimiento() <= autorYear))
                .filter(author ->( author.anoFallecimiento() == null))
                .distinct()
                .collect(Collectors.toList());
    }
}