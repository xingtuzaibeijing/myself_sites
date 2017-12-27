//package org.qhs.myselfSites.dome.servlet;
//
//import freemarker.template.Configuration;
//import freemarker.template.DefaultObjectWrapper;
//import freemarker.template.Template;
//import org.qhs.myselfSites.dome.entity.User;
//
//import javax.security.auth.login.Configuration;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by qianh on 2017/10/24.
// */
//@WebServlet(urlPatterns = "/SpringBootfrist/FreemarkerServlet",description="创建jspservlet")
//public class FreemarkerServlet  extends HttpServlet {
//    private Configuration configuration = null; //解释Configuration
//
//    //构造函数
//    public FreemarkerServlet(){
//        //创建Configuration实例
//        configuration = new Configuration();
//        //输出的数据默认的编码类型
//        configuration.setDefaultEncoding("utf-8");
//    }
//
//    @SuppressWarnings("unchecked")
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
//    {
//        //---------------1.准备数据-----------------
//        //要填入的数据文件
//        Map dataMap = new HashMap();//解释数据的容器
//        //添加数据
//        dataMap.put("title", "FreeMarker示例");
//        List<User> userList = new ArrayList<User>();
//        User user1 = new User();
//        user1.setId(1);
//        user1.setName("小依");
//        User user2 = new User();
//        user2.setId(2);
//        user2.setName("小耳");
//        userList.add(user1);
//        userList.add(user2);
//        dataMap.put("userList", userList); //将数据放到Map中
//        //---------------------------------------
//
//        //---------------2.设置模板装载的方法(有多种方法)-
//        //介绍两种方法：
//    //    System.out.println(configuration.getTemplate(getServletContext()));
//     //   configuration.setServletContextForTemplateLoading(getServletContext(),"templates/");
//        configuration.setDirectoryForTemplateLoading(new File("C:\\Users\\qianh\\eclipse-workspace\\SpringBoot_frist\\src\\main\\resources\\templates\\"));
//        configuration.setObjectWrapper(new DefaultObjectWrapper());
//        // configuration.setClassForTemplateLoading(this.getClass(),"../main/resources/templates");
//        //---------------------------------------
//
//        //----------------3.获得模板----------------
//        //获得需要装载的模版
//        Template template = null;
//        try {
//            template = configuration.getTemplate("model.ftl");
//            template.setEncoding("utf-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //---------------------------------------
//
//        //--------------4.开始准备生成输出--------------
//        //使用模版文件的charset作为本页面的charset
//        //使用text/html MIME-type
//        response.setContentType("text/html; charset=" + template.getEncoding());
//        PrintWriter out = response.getWriter();
//
//        //合并数据模型和模版，并将结果输出到out中
//        try
//        {
//            template.process(dataMap,out);// 用模板来开发servlet可以只在代码里面加入动态的数据
//        }
//        catch(Exception e)
//        {
//            throw new ServletException("处理Template模版中出现错误", e);
//        }
//        //------------------------------------------
//
//    }
//}
