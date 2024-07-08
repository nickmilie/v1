package com.energysolution.recrutation.books.domain;

import com.energysolution.recrutation.common.framework.Request;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
    @NotEmpty
    @Pattern(regexp = "[a-zA-Z0-9]{1,100}")
    private String title;

    @NotNull
    @NotEmpty
    private String author;

    @NotNull
    @NotEmpty
    private String ISBN;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime publicationDate;

}
