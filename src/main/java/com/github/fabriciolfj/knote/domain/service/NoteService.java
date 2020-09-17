package com.github.fabriciolfj.knote.domain.service;

import com.github.fabriciolfj.knote.domain.entity.Note;
import com.github.fabriciolfj.knote.domain.repository.NotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NotesRepository notesRepository;

    public List<Note> findAll() {
        return notesRepository.findAll();
    }

    public List<Note> saveAndList(final String description) {
        notesRepository.save(new Note(null, description));
        return findAll();
    }
}
