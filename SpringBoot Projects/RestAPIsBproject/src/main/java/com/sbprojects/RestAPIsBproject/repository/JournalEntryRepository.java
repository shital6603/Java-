package com.sbprojects.RestAPIsBproject.repository;

import com.sbprojects.RestAPIsBproject.entity.journalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<journalEntry, ObjectId> {

}
