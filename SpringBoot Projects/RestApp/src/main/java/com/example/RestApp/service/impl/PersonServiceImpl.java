package com.example.RestApp.service.impl;

import com.example.RestApp.dto.Person;
import com.example.RestApp.service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Value("${user.gender}")
    String userGender;
    Person amit=new Person("Amit","delhi","M",23,"BTech");
    Person sumit=new Person("Sumit","Bhopal","M",24,"BCA");
    Person neha=new Person("Neha","Pune","F",22,"MCA");
    Person ayushi=new Person("Ayushi","Haidrabai","F",27,"BCom");
    Person angel_priya=new Person("Angel Priya","Nagpur","F",26,"MBA");
    List<Person> personList=new ArrayList<>();
    @Override
    public List<Person> getAllPersonData() {

    personList.add(amit);
    personList.add(sumit);
    personList.add(neha);
    personList.add(ayushi);
    personList.add(angel_priya);

    return personList;

    }

    @Override
    public List<Person> filterDataBasedOnGen(List<Person> personList) {
        List<Person> per=new ArrayList<>();
        for (Person obj:personList)
        {
            if(!userGender.equalsIgnoreCase(obj.getGender()))
            {
                per.add(obj);
            }
        }
        return per;
    }
}
