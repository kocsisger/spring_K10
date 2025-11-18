package hu.unideb.inf.SpringJavaFX.backend;

import hu.unideb.inf.SpringJavaFX.backend.model.Person;
import hu.unideb.inf.SpringJavaFX.backend.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJavaFxApplication implements CommandLineRunner {
	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaFxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person();
		p.setName("Béla");
		p.setDateOfBirth(LocalDate.of(2000,1,1));

		Person p2 = Person.builder()
				.name("Bella")
				.dateOfBirth(LocalDate.of(2001,2,2))
				.build();

		personRepository.save(p);
	}

	public void print(){
		for(Person p : personRepository.findAll()){
			System.out.println(p);
		}
	}
}
