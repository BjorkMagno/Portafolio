package com.books.LiterALura.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosBook(
    @JsonAlias("title") String titulo,
    @JsonAlias("authors") List<DatosAuthor> autor,
    @JsonAlias("languages") List<String> idioma,
    @JsonAlias("id") int id,
    @JsonAlias("download_count") int descargas
){

}
