package com.energysolution.recrutation.books.domain;

import com.energysolution.recrutation.common.framework.IdentifiableAggregateRoot;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Main entity in books domain
 */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "BOOKS")
public class Book implements IdentifiableAggregateRoot<BookId> {

  @EmbeddedId
  private BookId id;

  @Column
  private String title;

  @Column
  private String author;

  @Column
  private String ISBN;

  @Column
  private LocalDateTime publicationDate;
}
