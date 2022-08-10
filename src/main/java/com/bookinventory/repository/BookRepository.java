package com.bookinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookinventory.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
