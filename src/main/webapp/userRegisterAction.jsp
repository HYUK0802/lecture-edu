
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="lectureedu.user.UserDTO"%>
<%@ page import="lectureedu.user.UserDAO"%>
<%@ page import="lectureedu.util.SHA256"%>
<%@ page import="java.io.PrintWriter"%>
<%
    request.setCharacterEncoding("UTF-8");
    String userID = null;
    String userPassword = null;
    String userEmail = null;
    if(request.getParameter("userID") != null) {
        userID = request.getParameter("userID");
    }if(request.getParameter("userPassword") != null) {
        userPassword = request.getParameter("userPassword");
    }if(request.getParameter("userEmail") != null) {
        userEmail = request.getParameter("userEmail");
    }
    if(userID == null || userPassword == null || userEmail == null) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('입력이 안된 사항이 있습니다.');");
        script.println("history.back();");
        script.println("</script>");
        script.close();
    }
    else {
        UserDAO userDAO = new UserDAO();
        int result = userDAO.join(new UserDTO(userID, userPassword,userEmail,SHA256.getSHA256(userEmail),false));
        if(result == -1) {
            PrintWriter script = response.getWriter();
            script.println("<script>");
            script.println("alert('이미 존재하는 아이디입니다.');");
            script.println("history.back();");
            script.println("</script>");
            script.close();

        }else {
            session.setAttribute("userID", userID);
            PrintWriter script = response.getWriter();
            script.println("<script>");
            script.println("location.href = 'emailSendAction.jsp'");
            script.println("</script>");
            script.close();
        }
    }

%>

