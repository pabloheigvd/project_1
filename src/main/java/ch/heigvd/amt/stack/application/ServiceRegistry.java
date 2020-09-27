package ch.heigvd.amt.stack.application;

import ch.heigvd.amt.stack.application.identifymgmt.IdentifyManagementFacade;
import ch.heigvd.amt.stack.domain.person.IPersonRepository;
import ch.heigvd.amt.stack.infrastructure.persistence.memory.InMemoryPersonRepository;

public class ServiceRegistry {

    private static ServiceRegistry singleton;

    private static IPersonRepository personRepository;
    private static IdentifyManagementFacade identifyManagementFacade;

    public static ServiceRegistry getServiceRegistry(){
        if(singleton == null){
            singleton = new ServiceRegistry();
        }
        return singleton;
    }

    public static IdentifyManagementFacade getIdentifyManagementFacade(){
        return identifyManagementFacade;
    }

    private ServiceRegistry(){
        singleton = this;
        personRepository = new InMemoryPersonRepository();
        identifyManagementFacade = new IdentifyManagementFacade(personRepository);
    }
}
