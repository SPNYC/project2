package project2;

public class MarksTester {
    public static void main(String[] args) {

        Marks studA=new A(65,75,85);
        double averPercentA=studA.getPercentage();
        System.out.println("Average percentage of marks of student A is "+averPercentA);

        Marks studB=new B(75,85,95,99);
        double averPercentB=studB.getPercentage();
        System.out.println("Average percentage of marks of student B is "+averPercentB);

    }
}
