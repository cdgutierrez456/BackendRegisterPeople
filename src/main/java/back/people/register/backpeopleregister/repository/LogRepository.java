package back.people.register.backpeopleregister.repository;

import back.people.register.backpeopleregister.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, String> {
}
