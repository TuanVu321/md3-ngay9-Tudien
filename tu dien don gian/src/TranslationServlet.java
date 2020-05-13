import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet", urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chao");
        dictionary.put("how", "The nao");
        dictionary.put("book", "Quyen vo");
        dictionary.put("computer", "May tinh");
        String search = request.getParameter("txtSearch");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        String result = dictionary.get(search);
        if (result != null) {
            printWriter.println("word: "+search);
            printWriter.println("result: "+result);
        }else{
            printWriter.println("Not found");
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
