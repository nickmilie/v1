package com.energysolution.recrutation.books.domain;

import com.energysolution.recrutation.common.framework.Response;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Model to send response for books domain
 */
@Getter
@Setter
public class BookResponse implements Response {

    private String title;

    private String author;

    private String ISBN;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime publicationDate;
}
