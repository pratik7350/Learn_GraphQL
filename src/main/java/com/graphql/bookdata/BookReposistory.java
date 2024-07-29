package com.graphql.bookdata;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReposistory extends JpaRepository<Book, Integer> {

}
