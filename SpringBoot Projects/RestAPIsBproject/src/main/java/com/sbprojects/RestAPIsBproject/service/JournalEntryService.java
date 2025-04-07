package com.sbprojects.RestAPIsBproject.service;

import com.sbprojects.RestAPIsBproject.entity.journalEntry;
import com.sbprojects.RestAPIsBproject.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(journalEntry journalEntry)
    {

        journalEntryRepository.save(journalEntry);
    }

    public List<journalEntry> getAll()
    {
        return journalEntryRepository.findAll();
    }

    public Optional<journalEntry> findById(ObjectId id)
    {
        return journalEntryRepository.findById(id);
    }

    public void deleteByid(ObjectId id)
    {
        journalEntryRepository.deleteById(id);
    }
}
