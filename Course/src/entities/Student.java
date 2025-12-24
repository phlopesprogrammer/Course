package entities;

public class Student {
	public String name;
	public double points1;
	public double points2;
	public double points3;

	public double finalGrade() {
		return points1 + points2 + points3;
	}

	public void result() {
		double grade = finalGrade();
		if (grade >= 60) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
			System.out.printf("Missing:%.2f%n ", 60 - finalGrade());
		}

	}

}
