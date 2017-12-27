//package org.qhs.myselfSites.dome.controller;
//
//import org.qhs.myselfSites.dome.xmlentity.Item;
//import org.qhs.myselfSites.dome.xmlentity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.jms.JmsProperties;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.security.auth.login.Configuration;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class Firsttst {
//	@Autowired
//	Configuration configuration;
//	@RequestMapping("/First")
//	public String First() {
//		return "hellow world";
//	}
//	public void CreateJsp(){
//		Map dataMap = new HashMap();//解释数据的容器
//		//添加数据
//		dataMap.put("title", "FreeMarker示例");
//		List<User> userList = new ArrayList<User>();
//		User user1 = new User();
//		user1.setId(1);
//		user1.setName("小依");
//		User user2 = new User();
//		user2.setId(1);
//		user2.setName("小耳");
//		userList.add(user1);
//		userList.add(user2);
//		dataMap.put("userList", userList);
//		//configuration.setServletContextForTemplateLoading(getServletContext(),"templates");
//		//----------------3.获得模板----------------
//		//获得需要装载的模版
//		JmsProperties.Template template = null;
//		try {
//			template = configuration.getTemplate("hello.ftl");
//			template.setEncoding("utf-8");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		//---------------------------------------
//
//		//--------------4.开始准备生成输出--------------
//		//使用模版文件的charset作为本页面的charset
//		//使用text/html MIME-type
//		//response.setContentType("text/html; charset=" + template.getEncoding());
//		//PrintWriter out = response.getWriter();
//
//		//合并数据模型和模版，并将结果输出到out中
//
//
//	}
//
//	@RequestMapping(value = "reqCheck", method = RequestMethod.POST,
//			consumes = {MediaType.APPLICATION_JSON_VALUE,"application/json;charset=UTF-8"},
//			produces ={MediaType.APPLICATION_JSON_VALUE,"application/json;charset=UTF-8"})
//	public Item createXMLPerson(@RequestBody Item item) {
//		System.out.println(item.getName()+item.getValue());
//		return item;
//	}
//}
