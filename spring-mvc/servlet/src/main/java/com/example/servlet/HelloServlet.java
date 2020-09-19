package com.example.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * @author peili.wang
 * @date 2020/3/6 21:54
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Objects.requireNonNull(req);
        Objects.requireNonNull(resp);
        // 1.获取前端参数
        String method = req.getParameter("method");
        final String add = "add";
        if (add.equals(method)) {
            req.getSession().setAttribute("msg", "执行了add方法");
        }
        final String delete = "delete";
        if (delete.equals(method)) {
            req.getSession().setAttribute("msg", "执行了delete方法");
        }
        // 2. 继续往下转发
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }
}
