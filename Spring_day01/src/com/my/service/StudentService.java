package com.my.service;

import com.my.dao.StudentDao;

/*
 * ѧ��ҵ����:
 */
public class StudentService {

	/*
	 * service������dao,һ����ǽ�dao����Ϊservice�ĳ�Ա����;
	 */
	
	//1)��ȷ�ӿ����ͺ�ʵ��������
	//private StudentDao studentDao = new StudentDaoA();
	
	//2)�������ģʽ:ֻ��Ҫ��ȷ�ӿ�����,��ͨ��������ȥ��ȡ��Ӧ��ʵ������󼴿�
	//private StudentDao studentDao = StudentDaoFactory.getStudentDao();
	
	/*
	 * 3)
	 * service����Ҫ�ӿڶ���,IOC�����ͻὫ�ӿڵ�ָ��ʵ��������Զ�ע���
     * service�ࡣ
	 */
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void test(){
		studentDao.show();
	}
	
}
