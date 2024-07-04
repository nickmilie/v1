package com.energysolution.recrutation.books.domain;

import com.energysolution.recrutation.common.framework.Request;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Model to receive request for books domain
 */
@Getter
@Setter
public class BookRequest implements Request {

    @NotNull
    private String title;

    @NotNull
    private String author;

    @NotNull
    private String ISBN;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime publicationDate;

}
