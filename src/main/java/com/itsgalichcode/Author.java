package com.itsgalichcode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(
        Integer id,
        String name)
{
    public static List<Author> authores = Arrays.asList(
            new Author(1, "John Brain"),
            new Author(2, "Sten Sheford"),
            new Author(3, "David Zalts")
    );

    public static Optional<Author> getAuthorById(Integer id) {

        return  authores
                .stream()
                .filter(a -> a.id.equals(id))
                .findFirst();
    }
}
