package com.energysolution.recrutation.books.domain;

import com.energysolution.recrutation.common.framework.CommonRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for books domain
 */
@Repository
public interface BookRepository extends CommonRepository<Book, BookId> {
}