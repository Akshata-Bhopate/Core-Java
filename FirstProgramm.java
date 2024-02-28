//Referring to Current Class Instance Variable:
package This_Keyword;

class Employe {
	int idno;
	String name;
	long phoneno;
	String address;

	Employe(int idno, String name, long phoneno, String address) {
		this.idno = idno;
		this.name = name;
		this.phoneno = phoneno;
		this.address = address;
	}

	void display() {
		System.out.println(idno + " " + name + " " + phoneno + " " + address);
	}

}

public class FirstProgramm {

	public static void main(String[] args) {

		Employe obj1 = new Employe(2001, "Jay", 901108765, "Karad");
		Employe obj2 = new Employe(2002, "Diya", 902319011, "Pune");
		obj1.display();
		obj2.display();
	}

}
