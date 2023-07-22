package ru.netology.qa65;

public class filmsManager {
   // private Films[] films = new Films[0];
    private Films[] films;
    private int limit;

    public filmsManager() {
        this.films = new Films[0];
        this.limit = 5;
    }

    public filmsManager (int limit) {
        this.films = new Films[0];
        this.limit = limit;
    }

    //

    public void addFilm(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {
        int resultLength;
        if (films.length == limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        Films[] result = new Films[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}
