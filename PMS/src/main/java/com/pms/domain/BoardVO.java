package com.pms.domain;

import org.apache.ibatis.type.Alias;

@Alias("board")
public class BoardVO {
	String name;
	int age;
	String sex;
	String local;
	int deptno;
	String title;
	String content;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getTitile() {
		return title;
	}
	public void setTitile(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString(){
		return "Board=[name:" + name + ", age:" + age + ", sex:" + sex + ", local:" + local + ", deptno:" + deptno + ", title:" + title + ", content:" + content + "]";
	}
}
