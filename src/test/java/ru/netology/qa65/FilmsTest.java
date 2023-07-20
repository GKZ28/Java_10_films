package ru.netology.qa65;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilmsTest {


    @Test

    public void nameFilms() {
        Films films = new Films("Кровью и потом. Java'болики");
        System.out.println(films.getTitle());
    }



}