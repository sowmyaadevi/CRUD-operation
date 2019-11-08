package com.example.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.crud.domain.Book;

@RepositoryRestResource(path="notes", collectionResourceRel="notes")
public interface BookRepository extends JpaRepository<Book,Long>{
	

}
