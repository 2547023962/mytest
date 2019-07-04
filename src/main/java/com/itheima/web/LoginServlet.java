package com.itheima.web;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/login", name="LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.getWriter().print("<h1>hello, maven</h1>");
        response.getWriter().print("你输入的用户名是：" + username +", 密码是：" +password);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}