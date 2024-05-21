package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Name: ");
		aluno.name = sc.nextLine();
		
		System.out.print("Grade 1 : ");
		aluno.grade1 = sc.nextDouble();
		
		System.out.print("Grade 2 : ");
		aluno.grade2 = sc.nextDouble();
		
		System.out.print("Grade 3 : ");
		aluno.grade3 = sc.nextDouble();
		
		System.out.println("Final Grade : " + aluno.finalGrade());
		
		if(aluno.finalGrade() >= 60) {
			System.out.println("Pass");
			
		}else {
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points%n",aluno.missingPoints());
		}
		
		
		
		
		
		
		sc.close();
		
	}

}
