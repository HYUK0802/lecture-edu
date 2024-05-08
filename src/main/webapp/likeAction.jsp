
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ page import="lectureedu.user.UserDAO"%>
<%@ page import="lectureedu.evaluation.EvaluationDAO"%>
<%@ page import="lectureedu.likey.LikeyDAO"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="static sun.net.www.protocol.http.AuthCacheValue.Type.Proxy" %>
<%!
    public static String getClientIP(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
%>
<%

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
    request.setCharacterEncoding("UTF-8");
    String evaluationID = null;
    if(request.getParameter("evaluationID")!=null){
        evaluationID = request.getParameter("evaluationID");
    }
    EvaluationDAO evaluationDAO = new EvaluationDAO();
    LikeyDAO likeyDAO = new LikeyDAO();
    int result = likeyDAO.like(userID, evaluationID, getClientIP(request));

    if(result == 1) {
        result = evaluationDAO.like(evaluationID);
        if(result == 1) {
            PrintWriter script = response.getWriter();
            script.println("<script>");
            script.println("alert('추천이 완료되었습니다.');");
            script.println("location.href='index.jsp';");
            script.println("</script>");
            script.close();
        } else {
            PrintWriter script = response.getWriter();
            script.println("<script>");
            script.println("alert('데이터 베이스 오류.');");
            script.println("history.back();");
            script.println("</script>");
            script.close();
        }

    }else {
    PrintWriter script = response.getWriter();
    script.println("<script>");
    script.println("alert('이미 추천을 누른 글입니다.');");
    script.println("history.back();");
    script.println("</script>");
    script.close();
}


%>
