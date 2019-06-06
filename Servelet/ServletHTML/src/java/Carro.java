import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Carro extends HttpServlet{
        protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RecebeDados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servidor Recebeu:<br></h1>"); 
            out.println("<h1>modelo: " + request.getParameter("modelo")     + "</h1>");
            out.println("<h1>placa: " + request.getParameter("placa")      + "</h1>");
            out.println("<h1>renavam: " + request.getParameter("renavam")    + "</h1>");
            out.println("<h1>ano: " + request.getParameter("ano")        + "</h1>");
            out.println("<h1>kilometragem: " + request.getParameter("km")         + "</h1>");
            out.println("<h1>acessorios: " + request.getParameter("acessorios") + "</h1>");
            out.println("<h1>valor: " + request.getParameter("valor")      + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    public String getServletInfo() {
        return "Servlet Recebe Dados";
    }// </editor-fold>

}
