import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = id;
    }
    
    public char calculate(){
        int sum = 0; 
        int averageScore = 0;
        for(int i=0;i<testScores.length;i++){
            sum=sum+testScores[i];
        }
        averageScore=sum/testScores.length;
        
        if(90 <= averageScore && averageScore <= 100){
            return 'O';
        } else if(80 <=averageScore && averageScore < 90){
            return 'E';
        } else if(70 <= averageScore && averageScore < 80){
            return 'A';
        } else if(55 <=averageScore && averageScore < 70){
            return 'P';
        } else if(40 <= averageScore && averageScore < 55){
            return 'D';
        } else if(0 <= averageScore && averageScore < 40){
            return 'T';
        } else {
            return Character.MIN_VALUE;
        }
    }
}

