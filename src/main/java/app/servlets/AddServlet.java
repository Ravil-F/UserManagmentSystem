package app.servlets;

import app.entities.User;
import app.model.Model;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/add.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        char gender = (char)req.getIntHeader("gender");
        int age = req.getIntHeader("age");
        String email = req.getParameter("email");
        User user = new User(name, lastName, gender, age, email);
        Model model = Model.getInstance();
        model.add(user);

        req.setAttribute("userName", name);
        doGet(req, resp);
    }
}
