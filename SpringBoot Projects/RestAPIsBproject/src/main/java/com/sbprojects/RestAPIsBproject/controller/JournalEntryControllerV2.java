package com.sbprojects.RestAPIsBproject.controller;

import com.sbprojects.RestAPIsBproject.entity.journalEntry;
import com.sbprojects.RestAPIsBproject.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;


    @GetMapping
    public List<journalEntry> getAll()
    {

       return journalEntryService.getAll();
    }

   @PostMapping
    public journalEntry createEntry(@RequestBody journalEntry myEntry)
   {
       myEntry.setDate(LocalDateTime.now());
       journalEntryService.saveEntry(myEntry);
       return myEntry;
   }

   @GetMapping("id/{myid}")
   public journalEntry getJournalEntryById(@PathVariable ObjectId myId)
   {

       return journalEntryService.findById(myId).orElse(null);
   }

   @DeleteMapping("id/{myId}")
    public boolean deleteJournalMapping(@PathVariable ObjectId myId)
   {

       journalEntryService.deleteByid(myId);
       return true;
   }

   @PutMapping("/id/{id}")
    public journalEntry updateJournalEntry(@PathVariable ObjectId id, @RequestBody journalEntry newEntry)
   {
       journalEntry old=journalEntryService.findById(id).orElse(null);
       if (old!=null)
       {
            old.setTitle(newEntry.getTitle() != null && newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent() != null && newEntry.equals("") ? newEntry.getContent(): old.getContent());
       }
       journalEntryService.saveEntry(myEntry);
       return myEntry;
   }
}
