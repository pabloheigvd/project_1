package ch.heigvd.amt.stack.application.identifymgmt;

import ch.heigvd.amt.stack.application.identifymgmt.login.RegisterCommand;
import ch.heigvd.amt.stack.domain.person.IPersonRepository;
import ch.heigvd.amt.stack.domain.person.Person;

import java.sql.SQLIntegrityConstraintViolationException;

public class IdentifyManagementFacade {
    private IPersonRepository personRepository;

    public  IdentifyManagementFacade(IPersonRepository personRepository) {this.personRepository = personRepository;}

    // TODO ADD EXCEPTION !
    // I'm not able to add a the same exception than the podcast...
    public void register(RegisterCommand command) throws RegistrationFailedException {
        Person existingPersonWithSameUsername = personRepository.findByUsername(command.getUsername()).orElse(null);


        if (existingPersonWithSameUsername != null) {
            throw new RegistrationFailedException("Username is already used");
        }

    try {
        Person newPerson = Person.builder()
            .username(command.getUsername())
            .firstName(command.getFirstname())
            .lastName(command.getLastName())
            .email(command.getEmail())
            .clearTextPassword(command.getClearTextPassword())
            .build();

        personRepository.save(newPerson);

    }catch (Exception e){
        throw new RegistrationFailedException(e.getMessage());
    }


    }
}
