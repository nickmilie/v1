package com.energysolution.recrutation.books.application;

import com.energysolution.recrutation.books.domain.Book;
import com.energysolution.recrutation.books.domain.BookId;
import com.energysolution.recrutation.books.domain.BookRepository;
import com.energysolution.recrutation.common.create.AbstractService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service for books domain
 */
@Service
public class BookService extends AbstractService<BookId, Book, BookRepository> {
    public BookService(BookRepository repository) {
        super(repository);
    }

    @Override
    public Optional<Book> save(Book entity) {

        entity.setId(new BookId());
        return super.save(entity);
    }
}
