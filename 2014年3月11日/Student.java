package net.gupt.cs.jee.task;

public class Student  implements Comparable<Student> {
	private long classmark;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (classmark ^ (classmark >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classmark != other.classmark)
			return false;
		return true;
	}
	private String name;
	
	@Override
	public String toString() {
		return "Student [classmark=" + classmark + ", name=" + name + "]";
	}
	public long getClassmark() {
		return classmark;
	}
	public void setClassmark(long classmark) {
		this.classmark = classmark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(){};
	public Student(long classmark,String name){
		this.classmark = classmark;
		this.name = name;
	};
	
    public int compareTo(Student anOtherStudent) {
        return compare(this.classmark, anOtherStudent.classmark);
    }
    
    public static int compare(long classmark2, long classmark3) {
        return (classmark2 > classmark3) ? -1 : ((classmark2 == classmark3) ? 0 : 1);
    }
}
