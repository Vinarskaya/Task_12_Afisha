package ru.netology.javaqa.movies;

public class Movies {
    private String[] movies = new String[0];
    private int limit;

    public Movies() {
        limit = 10;
    }

    public Movies(int limit) {
        this.limit = limit;
    }

    public void save(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (limit == 10) {
            resultLength = 10;
        } else {
           resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < resultLength ; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }



}

