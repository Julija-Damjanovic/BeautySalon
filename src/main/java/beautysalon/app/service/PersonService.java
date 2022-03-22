package beautysalon.app.service;

import java.util.List;

import beautysalon.app.model.Person;

public interface PersonService {
List<Person> getAllPersons();
void savePerson(Person person);
Person getPersonById(long id);
void deletePersonById(long id);
}
