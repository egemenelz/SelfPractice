package day04;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 150000;
        double taxRate = 0.28;

        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Yourt total tax will be :");
        System.out.println(totalTax);
        System.out.println();
        System.out.println("Your salary after tax will be :");
        System.out.println("$ "+salaryAfterTax);
    }
}
