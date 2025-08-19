package com.books.LiterALura.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Book {
    @JsonAlias("title")
    private String titulo;
    @JsonAlias("authors")
    private Author autor;
    @JsonAlias("languages")
    private List<String> idioma;
    @JsonAlias("id")
    private int id;
    @JsonAlias("download_count")
    private int descargas;

    private final String urlBase = "https://gutendex.com/books";
    // Constructor
    public Book(){

    }
    // Metodos
    // Busqueda por titulo.
    public String searchTitle(){
        return urlBase + "?search=" + titulo.replace(" ","+");
    }
    // Busqueda por autor.
    public String searchAuthor(){
        return urlBase + "?search=" + autor.getNombreAutor().replace(" ","+");
    }
    // Busqueda por id
    public String searchID(){
        return urlBase + "/" + id;
    }
    // Busqueda General
    public String searchGeneral(){
        return urlBase + "?search=";
    }

    // Getter y Setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author author) {
        this.autor = author;
    }

    public List<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDescargas() {
        return descargas;
    }

    // Salida

    @Override
    public String toString() {
        return "Titulo:     " + titulo + "\n" +
                "Autor:     " + autor + "\n" +
                "ID:        " + id + "\n" +
                "Descargas: " + descargas;
    }
}
