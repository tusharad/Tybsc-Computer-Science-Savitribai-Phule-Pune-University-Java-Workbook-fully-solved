/**
 * @author : tushar
 * @created : 2021-05-18
**/
/* slip22html*/

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <form action="Slip22.jsp" method="post">
            Enter Your Name : <input type="text" name="name"><br>
           
            <input type="submit" value="Submit">
        </form>
    </body>
</html>

/*slip22.jsp*/

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    String name = request.getParameter("name");
   
   Calendar rightnow = Calendar.getInstance();
   int time = rightnow.get(Calendar.HOUR_OF_DAY);
  
    if(time > 0 && time <= 12)
    {
        out.println("Good Morning"+name);
    }
      else if(time < 12 && time >=16)
      {
          out.println("Good Afternoon"+name);
      }
      else
      {
          out.println("Good Night"+name);
      }
%>

