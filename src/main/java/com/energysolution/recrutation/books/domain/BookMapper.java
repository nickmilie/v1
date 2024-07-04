package com.energysolution.recrutation.books.domain;

import com.energysolution.recrutation.common.framework.Mapper;
import org.springframework.stereotype.Component;

/**
 * Mapper class for books domain
 */
@Component
public class BookMapper implements Mapper<BookRequest, BookResponse, Book> {
    /**
     * map BookRequest on Book entity
     * @param request from BookController
     * @return Book entity
     */
    @Override
    public Book mapEntity(BookRequest request) {

        Book book = new Book();
        book.setId(new BookId());
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setISBN(request.getISBN());
        book.setPublicationDate(request.getPublicationDate());
        return book;
    }

    @Override
    public BookResponse mapResponse(Book entity) {
        BookResponse response = new BookResponse();
        response.setTitle(entity.getTitle());
        response.setAuthor(entity.getAuthor());
        response.setISBN(entity.getISBN());
        response.setPublicationDate(entity.getPublicationDate());
        return response;
    }
}
