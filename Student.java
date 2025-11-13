class Student
{
	int id;
	String name;
	String adr;
	String branch;
	long mo;

	Student(){}
	Student(int id,String name, String adr ,String branch,long mo){

		this.id=id;
		this.name=name;
		this.adr=adr;
		this.branch=branch;
		this.mo=mo;
	}

	public String toString(){
		return "id"+id+"name"+name+"adr"+adr+"branch"+branch+"mo"+mo;
	}
	public boolean equals(Object o){
		if();
	}
}
class Abstraction3MethodDriver
{
	public static void main(String[] args) {
		
		Student s1=new Student(123,"Dipak","Beed","BCA",1234567890l);
		System.out.println(s1);
	}
}