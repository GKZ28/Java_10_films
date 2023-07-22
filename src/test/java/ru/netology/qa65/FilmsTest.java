package ru.netology.qa65;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsTest {

    Films film1 = new Films("Кровью и потом. Java'болики");
    Films film2 = new Films("Java'навт");

    @Test

    public void titleTest() {
        filmsManager list = new filmsManager();
        list.addFilm(film1);
        list.addFilm(film2);
        Films[] expected = {film1, film2};
        Films[] actual = list.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

}