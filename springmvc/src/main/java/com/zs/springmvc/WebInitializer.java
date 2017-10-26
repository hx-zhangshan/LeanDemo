package com.zs.springmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer{//
//WebApplicationInitializer实现替代了lweb.xml 启动 servelt的容器 
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext cxt=new AnnotationConfigWebApplicationContext();
		cxt.register(MyMvcConfig.class);
		//与servetcontext相连接
		cxt.setServletContext(servletContext);
		//注册mvc的dispatcher
		Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(cxt));
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);	
		
	}

}
