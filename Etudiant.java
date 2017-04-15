package encapulation;

public class Etudiant {

	   public String name;
	   private String matricule;
	   public int age;

	   public int getAge(){
	      return age;
	   }

	   public String getName(){
	      return name;
	   }

	   public String getMatricule(){
	      return matricule;
	   }

	   public void setAge( int newAge){
	      age = newAge;
	   }

	   public void setName(String newName){
	      name = newName;
	   }

	   public void setMatricule( String newMatricule){
	      matricule = newMatricule;
	   }
}
