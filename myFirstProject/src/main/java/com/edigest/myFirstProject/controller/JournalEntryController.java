package com.edigest.myFirstProject.controller;


import com.edigest.myFirstProject.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.*;

@RestController
@RequestMapping("Hello")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntry=new HashMap<>();

    @GetMapping("abc")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntry.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry)
    {
       journalEntry.put(myEntry.getId(),myEntry);
       return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId)
    {
        return journalEntry.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId)
    {
        return journalEntry.remove(myId);
    }

    @PutMapping("id/{id}")
    public JournalEntry upateJournalEntryById(@PathVariable Long id,@RequestBody JournalEntry myEntry)
    {
        return journalEntry.put(id,myEntry);
    }



}
