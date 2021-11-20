package back.people.register.backpeopleregister.rest;

import back.people.register.backpeopleregister.model.Log;
import back.people.register.backpeopleregister.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogRest {

    @Autowired
    private LogService logService;

    /* private ResponseEntity<List<Log>> getAllLosByAdministrator(String id){
        return ResponseEntity.ok(logService);
    } */
}
