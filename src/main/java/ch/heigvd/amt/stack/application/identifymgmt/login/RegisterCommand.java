package ch.heigvd.amt.stack.application.identifymgmt.login;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class RegisterCommand {
    private String username;
    private String firstname;
    private String lastName;
    private String email;
    private String clearTextPassword;
}
