package encapulation;

public class TestEtudiant {
	public static void main(String args[]) {
		Etudiant saf = new Etudiant();
		saf.setName("Safkai");
		saf.setAge(20);
		saf.setMatricule("FS6464A");

		System.out.println("Name : " + saf.getName() + ", Age : "
				+ saf.getAge() + ", Matricule : " + saf.getMatricule());
		
		//Attribute marked as public
		System.out.print("=======Name : " + saf.name + ", Age : "
				+ saf.age);
		

	}
}
