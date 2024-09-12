package com.itsgalichcode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId
                   ) {


    public static List<Book> books = Arrays.asList(
            new Book(1, "Book1", 600, 1),
            new Book(2, "Math2", 360, 3),
            new Book(3, "English1", 560, 2),
            new Book(4, "Spring Boot", 456, 1)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books
                .stream()
                .filter(b -> b.id.equals(id))
                .findFirst();
    }


}
