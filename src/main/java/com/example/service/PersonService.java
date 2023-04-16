package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Sabry");
		p.setLastName("Elhasanin");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Ahmed");
		p.setLastName("Fawziy");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(25);
		p.setFirstName("Khaled");
		p.setLastName("Amrosy");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("Rawan");
		p.setLastName("Ayman");
		persons.add(p);
		
		p = new Person();
		p.setId("5");
		p.setAge(25);
		p.setFirstName("Zahra");
		p.setLastName("Mohamed");
		persons.add(p);
		
		p = new Person();
		p.setId("6");
		p.setAge(25);
		p.setFirstName("Marwa");
		p.setLastName("Awad");
		persons.add(p);
		
		p = new Person();
		p.setId("7");
		p.setAge(25);
		p.setFirstName("Israa");
		p.setLastName("Abdelhady");
		persons.add(p);
		
		p = new Person();
		p.setId("8");
		p.setAge(25);
		p.setFirstName("Asmaa");
		p.setLastName("Elhasanin");
		persons.add(p);
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

