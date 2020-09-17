package com.github.fabriciolfj.knote.domain.repository;

import com.github.fabriciolfj.knote.domain.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotesRepository extends MongoRepository<Note, String> {
}
