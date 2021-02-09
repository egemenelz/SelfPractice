package BankofAmerica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Bank bank1 = new Bank();
        bank1.welcome();
        System.out.println(bank1);
    }


}

//Openinng new saving Account
//Declare random number for account


class Bank {
    public String name, email, address, phoneNumber;
    public int accountNumber;
    public LocalDate localDate;
    public double balance;

    public DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm:ss  MMM,dd,yyyy");
    public Scanner scan = new Scanner(System.in);

    private static String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    private static String phonePattern = "^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$";

    public void welcome() throws InterruptedException {
        System.out.println("+===================================+");
        System.out.println("\t\tWelcome to Chase");
        Thread.sleep(3000);
        System.out.println("What would you like to do today?");
        System.out.println("[1] Open New Saving Account");
        System.out.println("[2] Open New Checking Account");
        System.out.println("[3] Deposit");
        System.out.println("[4] Withdrawal");
        System.out.println("[5] Check Balance");
        int answer = scan.nextInt();
        switch (answer){
            case 1:
                openSavingAccount();
                break;
            case 2:
                openCheckingAccount();
                break;
            case 3:
                deposit();
                break;
            case 4:
                withdrawal();
                break;
            case 5:
                getBalance();
                break;

        }

    }
    public void openCheckingAccount(){

    }

    public double getBalance() {
        return balance;
    }

    public void openSavingAccount() throws InterruptedException {

        System.out.print("Please Enter Your Full name: ");
        scan.nextLine();
        this.name = scan.nextLine();

        while (!validName(name)) {
            System.err.println("Invalid Name");
            System.err.println("Please re-enter your full name: ");
            this.name = scan.nextLine();
        }

        System.out.print("Please Enter Your Address: ");
        this.address = scan.nextLine();

        System.out.print("Please enter your e-mail address: ");
        this.email = scan.nextLine();
        while (!validEmail(email)) {
            System.err.println("Invalid e-mail address");
            System.err.println("Please re-enter your e-mail address");
            this.email = scan.nextLine();
        }

        System.out.print("Please enter your phone number: ");
        this.phoneNumber = scan.nextLine();
        while (!validPhone(phoneNumber)) {
            System.err.println("Invalid phone number");
            System.err.println("Please re-enter your phone number");
            this.phoneNumber = scan.nextLine();
        }

        System.out.println("Saving account processing...");
        Thread.sleep(5000);
        System.out.println("Congrulations! You created new saving account!");
        System.out.println("Your current balance is " + balance);

        System.out.println("Would you like to add deposit or withdrawal today?");
        String answer = scan.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("What would you like to do? Deposit/Witdrawal");
            answer = scan.nextLine();

            while (!(answer.equalsIgnoreCase("deposit") || !(answer.equalsIgnoreCase("withdrawal")))) {
                System.err.println("Invalid Entry! Please Re-Enter");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("deposit")) deposit();
            else if (answer.equalsIgnoreCase("witdrawal")) withdrawal();


        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("See you later!!");

        } else {
            System.err.println("Invalid Entry!");
        }
    }

    public boolean validEmail(String email) {
        Pattern emailPat = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(email);
        return matcher.find();
    }

    public boolean validPhone(String phoneNumber) {
        Pattern pat = Pattern.compile(phonePattern);
        Matcher matcher = pat.matcher(phoneNumber);
        return matcher.find();
    }

    public boolean validName(String name) {
        boolean atLeast8 = name.length() > 8;
        boolean hasLetter = false;
        boolean hasDigit1 = true;

        for (int i = 0; i < name.length(); i++) {
            char eachChar = name.charAt(i);
            if (Character.isLetter(eachChar)) {
                hasLetter = true;
            } else if (Character.isDigit(eachChar)) {
                hasDigit1 = false;
            }
        }
        return atLeast8 && hasLetter && hasDigit1;
    }

    public void deposit() throws InterruptedException {
        System.out.println("How much money would you deposit?");
        double amountOfDeposit = scan.nextDouble();
        balance += amountOfDeposit;
        System.out.println("Deposit processing...");
        Thread.sleep(4000);
        System.out.println("Deposit is succesfull current balance is $" + balance);
        doMore();

    }

    public void withdrawal() throws InterruptedException {
        System.out.println("How much money would you withdrawal?");
        double amountOfWithdrawal = scan.nextDouble();

        if (balance - amountOfWithdrawal >= 0) {
            System.out.println("Withdrawal processing...");
            Thread.sleep(4000);
            balance -= amountOfWithdrawal;
            System.out.println("Withdrawal is succesfull current balance is $" + balance);
        } else {
            System.err.println("Withdrawal not processed. Insufficient Funds");
        }
        doMore();
    }


    public void doMore() throws InterruptedException {
        System.out.println("Would you like to continue?");
        scan.nextLine();
        String answer = scan.nextLine();

        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("What would you like to do? Deposit/Witdrawal");
            answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || !(answer.equalsIgnoreCase("no")))) {
                System.err.println("Invalid Entry! Please Re-Enter");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("deposit")) deposit();
            if (answer.equalsIgnoreCase("withdrawal")) withdrawal();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println(LocalDateTime.now().format(dtf));
                System.out.println("Your new balance is $" + balance);
                System.out.println("See you later!!");
                break;
            }

        }

    }

    public int setAccountNumber() {
        Random r = new Random();
        accountNumber = r.nextInt(Integer.MAX_VALUE);
        return accountNumber;
    }


    public String toString() {
        return "+===================================+" + '\n' +
                "\t\t Chase" + '\n' +
                "\t Mr/Mrs: '" + name + '\n' +
                "\t Account Number: '" + setAccountNumber() + '\n' +
                "\t Email: '" + email + '\n' +
                "\t Balance: $" + balance +'\n'+
                "+===================================+";
    }
}
