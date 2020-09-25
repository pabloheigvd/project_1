package ch.heigvd.amt.stack.presentation;

import ch.heigvd.amt.stack.model.Question;
import ch.heigvd.amt.stack.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "LoginCommandServlet", urlPatterns = "/login.do")
public class LoginCommandServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    User userModel = new User(username, password);

    PrintWriter out = response.getWriter();

    RegisterCommandServlet.users.forEach((user, pass) -> {
      out.println("USER = " + user + " : " + pass);
    });

    boolean exist = false;
    if (RegisterCommandServlet.users.containsKey(userModel.getUsername())) {
      if (RegisterCommandServlet.users.get(userModel.getUsername()).equals(userModel.getPassword())) {
        exist = true;
      }
    }

    if (exist) {
      response.sendRedirect(request.getContextPath() + "/");
    } else {
      response.sendRedirect(request.getContextPath() + "/login");
    }
  }
}
