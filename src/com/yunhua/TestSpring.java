package com.yunhua;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yunhua.pojo.Person;
/*
 * 手动导入spring框架的jar包，和spring的日志记录jar包进行使用
 * */

public class TestSpring {
	
	public static void main(String[] args) {
		System.out.println("hello spring");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.toString());
		person.say();
		

	}

}
