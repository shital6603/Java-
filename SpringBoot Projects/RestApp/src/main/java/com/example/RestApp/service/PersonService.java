package com.example.RestApp.service;

import com.example.RestApp.dto.Person;

import java.util.List;

public interface PersonService {


    List<Person> getAllPersonData();
    List<Person> filterDataBasedOnGen(List<Person> personList);
}
