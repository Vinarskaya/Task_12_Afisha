package ru.netology.javaqa.movies;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesTest {

    @Test
    public void shouldSaveMovies() {
        Movies movies = new Movies();

        movies.save("Movie1");
        movies.save("Movie2");
        movies.save("Movie3");

        String[] expected = {"Movie1", "Movie2", "Movie3"};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLast5() {
        Movies movies = new Movies(5);

        movies.save("Movie1");
        movies.save("Movie2");
        movies.save("Movie3");
        movies.save("Movie4");
        movies.save("Movie5");
        movies.save("Movie6");
        movies.save("Movie7");
        movies.save("Movie8");
        movies.save("Movie9");
        movies.save("Movie10");
        movies.save("Movie11");
        movies.save("Movie12");

        String[] expected = {"Movie12", "Movie11", "Movie10", "Movie9", "Movie8"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLast10() {
        Movies movies = new Movies();

        movies.save("Movie1");
        movies.save("Movie2");
        movies.save("Movie3");
        movies.save("Movie4");
        movies.save("Movie5");
        movies.save("Movie6");
        movies.save("Movie7");
        movies.save("Movie8");
        movies.save("Movie9");
        movies.save("Movie10");
        movies.save("Movie11");
        movies.save("Movie12");

        String[] expected = {"Movie12", "Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

