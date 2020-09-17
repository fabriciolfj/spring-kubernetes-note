package com.github.fabriciolfj.knote.api;

import com.github.fabriciolfj.knote.domain.entity.Note;
import com.github.fabriciolfj.knote.domain.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/note")
@RestController
public class KNoteController {

    private final NoteService noteService;

    @GetMapping
    public List<Note> findAll() {
        return noteService.findAll();
    }

    @PostMapping
    public List<Note> saveNotes(@RequestParam final String description) {
        return noteService.saveAndList(description);
    }

}
