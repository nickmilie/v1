package com.energysolution.recrutation.books.application;

import com.energysolution.recrutation.books.domain.*;
import com.energysolution.recrutation.common.create.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController for books domain
 */
@RestController
@RequestMapping("/books")
public class BookController extends AbstractController<BookId, Book, BookService, BookRequest, BookResponse, BookMapper, BookValidator> {
    public BookController(BookService service, BookMapper mapper, BookValidator validator) {
        super(service, mapper, validator);
    }
}
