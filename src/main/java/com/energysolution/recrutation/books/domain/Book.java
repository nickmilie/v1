package com.energysolution.recrutation.books.domain;

import com.energysolution.recrutation.common.framework.IdentifiableAggregateRoot;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "BOOKS")
public class Book implements IdentifiableAggregateRoot<BookId> {

  @EmbeddedId private BookId id;
}
