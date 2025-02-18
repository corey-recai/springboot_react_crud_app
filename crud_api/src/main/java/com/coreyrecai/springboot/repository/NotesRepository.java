package com.coreyrecai.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coreyrecai.springboot.entity.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {

}
