
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="javax.mail.*"%>
<%@ page import="java.util.Properties"%>
<%@ page import="lectureedu.user.UserDAO"%>
<%@ page import="lectureedu.util.SHA256"%>
<%@ page import="lectureedu.util.Gmail"%>
<%@ page import="java.io.PrintWriter"%>
<%

    UserDAO userDAO = new UserDAO();
    String userID = null;
    if(session.getAttribute("userID") != null) {
        userID = (String) session.getAttribute("userID");
    }
    if(userID == null) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('로그인을 해주세요.');");
        script.println("location.href='userLogin.jsp';");
        script.println("</script>");
        script.close();
    }
    boolean emailChecked = userDAO.getUserEmailChecked(userID);
    if(emailChecked == true) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('이미 인증 된 회원입니다.');");
        script.println("location.href='index.jsp';");
        script.println("</script>");
        script.close();
    }

    String host = "http://localhost:8080/lecture_edu_war_exploded/";
    String from = "구글 이메일 계정"

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

%>

