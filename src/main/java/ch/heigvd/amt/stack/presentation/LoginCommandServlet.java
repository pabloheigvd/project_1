package ch.heigvd.amt.stack.presentation;

import ch.heigvd.amt.stack.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "LoginCommandServlet", urlPatterns = "/login.do")
public class LoginCommandServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User userModel = new User(username,password);

        PrintWriter out = resp.getWriter();

        out.println("HELLo");
        RegisterCommandServlet.users.forEach((user, pass) -> { out.println("USER = " + user + " : " + pass); });

        if(RegisterCommandServlet.users.containsKey(userModel.getUsername())) {
            out.println("EXIST");
            if (RegisterCommandServlet.users.get(userModel.getUsername()).equals(userModel.getPassword())) {
                //request.getRequestDispatcher("/WEB-INF/views/questions.jsp").forward(request, resp);
                out.println("OK");
            }
        }

        //request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, resp);
        out.println("PAS OK");
    }
}
