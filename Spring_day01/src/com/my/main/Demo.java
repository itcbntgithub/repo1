package com.my.main;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.beans.Student;
import com.my.service.StudentService;

public class Demo {

	/*
	 * ֮ǰ��javaBean:
	 * �����Լ�����javaBean����,�Լ���bean��������Ը�ֵ
	 */
	@Test
	public void testA(){
		//ʹ�ù�����������javaBean����
		Student student = new Student();
		//����set���������Ը�ֵ
		student.setSno(10101);
		student.setSname("����");
		//����
		System.out.println(student);
	}
	
	/*
	 * Spring��javaBean:
	 * bean����Ĵ��������Եĸ�ֵ����IOC����ȥ��,���ǽ�����Ҫ�������õ�IOC����,�ٴ�IOC�����������bean�������;
	 */
	@Test
	public void testB(){
		/*
		 * 1>����IOC���� ----- ����ApplicationContext����
		 *   ApplicationContext�ǽӿ�����
		 *   ClassPathXmlApplicationContext��ApplicationContext�ӿڵ�һ��ʵ����,��ʾͨ������
		 *   ��·���µĲ������Ƶ�bean�����ļ��õ�IOC����;
		 */
		ApplicationContext appContext = 
				 new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		 * 2>��IOC�����л�ȡbean����:
		 *   ����IOC������getBean()����,����������Ҫ��ȡ��bean�����id������,����ֵ��Object������Ҫǿת;
		 */
		Student s1 = (Student) appContext.getBean("s1");
		//Student s1 = appContext.getBean(Student.class);
		
		//����  Student [sno=10102, sname=����]
		System.out.println(s1);
		
	}
	
	@Test
	public void testC(){
		ApplicationContext appContext = 
				 new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = (StudentService) appContext.getBean("stuService");
		studentService.test();
	}
}














