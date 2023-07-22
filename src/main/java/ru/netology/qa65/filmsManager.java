package ru.netology.qa65;

public class filmsManager {
    private Films[] films = new Films[0];

    public void addFilm(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public Films[] getFilms() {
        return films;
    }
}
