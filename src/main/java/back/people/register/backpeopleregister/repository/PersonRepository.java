package back.people.register.backpeopleregister.repository;

import back.people.register.backpeopleregister.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {
}
