package com.energysolution.recrutation.books.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BooksTest {

    BookMapper mapper = new BookMapper();

    BookValidator validator = new BookValidator();

    @Test
    void should_map_book_request_on_book() {

        BookRequest request = new BookRequest();

        request.setTitle("title");
        request.setAuthor("author");
        request.setISBN("9780521705266");
        request.setPublicationDate(LocalDateTime.MIN);

        Book book = mapper.mapEntity(request);

        assertThat(book.getAuthor()).isEqualTo(request.getAuthor());
    }

    @Test
    void should_map_book_on_book_response() {

        Book book = new Book();

        book.setTitle("title");
        book.setAuthor("author");
        book.setISBN("9780521705266");
        book.setPublicationDate(LocalDateTime.MIN);

        BookResponse response = mapper.mapResponse(book);

        assertThat(response.getAuthor()).isEqualTo(book.getAuthor());
    }

    @Test
    void should_return_proceed_if_ISBN_is_correct() {
        BookRequest request = new BookRequest();

        request.setTitle("title");
        request.setAuthor("author");
        request.setISBN("9780521705266");
        request.setPublicationDate(LocalDateTime.MIN);

        validator.validate(request);
    }

    @Test
    void should_throw_an_exception_if_ISBN_is_not_correct() {
        BookRequest request = new BookRequest();

        request.setTitle("title");
        request.setAuthor("author");
        request.setISBN("1");
        request.setPublicationDate(LocalDateTime.MIN);

        assertThatThrownBy(() -> validator.validate(request))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
