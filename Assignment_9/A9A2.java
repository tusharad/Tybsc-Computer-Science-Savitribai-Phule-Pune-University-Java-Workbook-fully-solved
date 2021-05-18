/**
 * @author : tushar
 * @created : 2021-05-18
**/
//VisitServlet.java
        import java.io.*;
        import javax.servlet.*;
        import javax.servlet.http.*;
public class VisitServlet extends HttpServlet
{
    static int i=1;
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String k=String.valueOf(i);
        Cookie c=new Cookie("visit",k);
        response.addCookie(c);
        int j=Integer.parseInt(c.getValue());
        if(j==1)
        {
            out.println("Welcome to web page ");
        }
        else        {
            out.println("You are visited at "+i+" times");
        }
        i++;
    }
}
/*
Web.xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<web-app>
<servlet>
<servlet-name>VisitServlet</servlet-name>
<servlet-class>VisitServlet</servlet-class>
</servlet>
        36<servlet-mapping>
<servlet-name>VisitServlet</servlet-name>
<url-pattern>/VS</url-pattern>
</servlet-mapping>
</web-app>*/
