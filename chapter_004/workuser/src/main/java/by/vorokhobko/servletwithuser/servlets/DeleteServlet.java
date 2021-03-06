package by.vorokhobko.servletwithuser.servlets;

import by.vorokhobko.servletwithuser.html.SimpleBuilder;
import by.vorokhobko.servletwithuser.UserStore;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * DeleteServlet.
 *
 * Class DeleteServlet is the part of the work with web-service part 004, lesson 3.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @since 03.02.2018.
 * @version 1.
 */
public class DeleteServlet extends SimpleServlet {
    /**
     * The method handle a Delete request.
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        SimpleBuilder builder = new SimpleBuilder();
        UserStore users = UserStore.INSTANCE;
        PrintWriter writer = resp.getWriter();
        String id = req.getParameter("id");
        String element;
        if (id != null) {
            users.removeUser(id);
            element = builder.deleteUser(req.getContextPath());
        } else {
            element = builder.notDeleteUser(req.getContextPath());
        }
        writer.append(element);
        writer.flush();
    }
}