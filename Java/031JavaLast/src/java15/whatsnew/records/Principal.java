package java15.whatsnew.records;

public class Principal {

	public static void main(String[] args) {

		Person p1 = new Person(null, 1); // CORRECTO
		System.out.println(p1);
		Person p2 = new Person(null, -1); // VALIDACIÓN
	}

}
