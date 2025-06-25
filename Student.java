package rePractice;

public class Student {
	private int id;
	private String name;
	private Double mark;
	
	public Student(int id,String name,double mark){
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	
	@Override
	public String toString() {
		return "Id :"+id + " Name :" + name + " Mark :" + mark;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
}
