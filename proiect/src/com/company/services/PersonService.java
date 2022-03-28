package com.company.services;

import com.company.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private List<Person> people = new ArrayList<>();
    private static PersonService instance;

    private PersonService(){}

    public static PersonService getInstance(){
        if(instance==null){
            instance=new PersonService();
        }
        return instance;
    }

    public List<Person> getPeople(){
        return new ArrayList<>(this.people);
    }

    public Person getPersonById(int id){
        Person person = new Person();
        for(Person p : this.people)
            if(p.getPerson_id()==id)
                person=p;
        return person;
    }

    public void updatePerson(int id, Person person){
        for(Person p : this.people)
            if(p.getPerson_id()==id)
            {
                this.people.remove(p);
                person.setPerson_id(id);
                this.people.add(person);
                return;
            }
    }

    public void addPerson(Person person){
        this.people.add(person);
    }

    public void deletePersonById(int id){
        for(Person p : this.people)
            if(p.getPerson_id()==id)
            {
                this.people.remove(p);
                return;
            }
    }

    public void deletePeople(){
        this.people.clear();
    }

}
