package ch.heigvd.amt.stack.ui.web.login;

import ch.heigvd.amt.stack.application.ServiceRegistry;
import ch.heigvd.amt.stack.application.identifymgmt.IdentifyManagementFacade;
import ch.heigvd.amt.stack.application.identifymgmt.login.RegisterCommand;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterCommandEndpoint", urlPatterns = "/register.do")
public class RegisterCommandEndpoint extends HttpServlet {

    private ServiceRegistry serviceRegistry = ServiceRegistry.getServiceRegistry();
    private IdentifyManagementFacade identifyManagementFacade = serviceRegistry.getIdentifyManagementFacade();

    @SneakyThrows
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("errors");

        RegisterCommand registerCommand = RegisterCommand.builder()
                .username(request.getParameter("username"))
                .firstname(request.getParameter("firstname"))
                .lastName(request.getParameter("lastName"))
                .email(request.getParameter("email"))
                .clearTextPassword(request.getParameter("password"))
                .build();

        identifyManagementFacade.register(registerCommand);


        // TODO ADD EXCEPTION
    }


}
