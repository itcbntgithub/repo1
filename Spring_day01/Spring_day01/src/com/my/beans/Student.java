package com.my.beans;
/*
 * ѧ��javaBean��:
 */
public class Student {

	private Integer sno;
	
	private String sname;

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
		System.out.println("sno���Ա���ֵ��.....");
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
		System.out.println("sname���Ա���ֵ��.....");
	}

	public Student() {
		System.out.println("Student���󱻴�����.....");
	}

	public Student(Integer sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
    	
}
