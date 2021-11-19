package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
    PosterItem first = new PosterItem(1,"G1","N1");
    PosterItem second = new PosterItem(2,"G2","N2");
    PosterItem third = new PosterItem(3,"G3","N3");

    @Test
    public void shouldGetCountLastAddPoster() {
        PosterManager poster = new PosterManager(2);
        poster.add(first);
        poster.add(second);
        poster.add(third);
        PosterItem[] actual = poster.getCountLast();
        PosterItem[] expected = new PosterItem[]{third, second};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetCountLastPosterDefault() {
        PosterManager poster = new PosterManager();
        PosterItem[] actual = poster.getCountLast();
        PosterItem[] expected = new PosterItem[10];
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetAllPoster() {
        PosterManager poster = new PosterManager(15);
        PosterItem[] actual = poster.getCountLast();
        PosterItem[] expected = new PosterItem[15];
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldCountLast() {
        PosterManager poster = new PosterManager(20);
        PosterItem[] actual = poster.getCountLast();
        PosterItem[] expected = new PosterItem[15];
        assertArrayEquals(expected, actual);
    }

}