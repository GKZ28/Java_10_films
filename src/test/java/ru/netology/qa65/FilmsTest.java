package ru.netology.qa65;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsTest {

    Films film1 = new Films("Кровью и потом. JAVA'болики");
    Films film2 = new Films("JAVA'навт");
    Films film3 = new Films("JAVA'завр");
    Films film4 = new Films("JAVA vs PYTHON");
    Films film5 = new Films("JAVA vs PYTHON 2. Возвращение легенды.");

    @Test

    public void titleTest() {
        filmsManager list = new filmsManager();
        list.addFilm(film1);
        list.addFilm(film2);
        list.addFilm(film3);
        list.addFilm(film4);
        list.addFilm(film5);
        Films[] expected = {film1, film2, film3, film4, film5};
        Films[] actual = list.findAll();
        Assertions.assertArrayEquals(expected, actual);
//        for (Films film : actual) {
//            System.out.println("Фильм: " + film.getTitle());
//        }
    }

    @Test

    public void addFilmTest() {
        filmsManager list = new filmsManager();
        list.addFilm(film1);
        list.addFilm(film2);
        list.addFilm(film3);
        list.addFilm(film4);
        list.addFilm(film5);
        Films film6 = new Films("JAVA'нутые");
        list.addFilm(film6);
        Films[] expected = {film1, film2, film3, film4, film5, film6};
        Films[] actual = list.findAll();
        Assertions.assertArrayEquals(expected, actual);
//        for (Films film : list.findAll()) {
//            System.out.println("Фильм: " + film.getTitle());
//        }

    }

    @Test

    public void lastFilmsTest(){
        filmsManager list = new filmsManager(2);
        list.addFilm(film1);
        list.addFilm(film2);
        list.addFilm(film3);
        list.addFilm(film4);
        list.addFilm(film5);
        Films[] lastFilms = list.findLast();
        Films[] expected = {film5, film4};
        Films[] actual = list.findLast();
        Assertions.assertArrayEquals(expected, actual);
//        for (Films film : lastFilms) {
//            System.out.println(film.getTitle());
//        }
    }
    @Test

    public void lastFilmsTest5(){
        filmsManager list = new filmsManager(5);
        list.addFilm(film1);
        list.addFilm(film2);
        list.addFilm(film3);
        list.addFilm(film4);
        list.addFilm(film5);
        Films[] lastFilms = list.findLast();
        Films[] expected = {film5, film4, film3, film2, film1};
        Films[] actual = list.findLast();
        Assertions.assertArrayEquals(expected, actual);
//        for (Films film : lastFilms) {
//            System.out.println(film.getTitle());
//        }
    }

    @Test

    public void FilmsTest(){
        Films films = new Films();
        films.getTitle();
    }

}