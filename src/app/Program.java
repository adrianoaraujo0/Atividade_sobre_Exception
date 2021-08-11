package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.println("Number: ");
			int number = sc.nextInt();

			System.out.println("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();

			System.out.println("Initial balance: ");
			double balance = sc.nextDouble();

			System.out.println("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account ac = new Account(number, holder, balance, withdrawLimit);

			System.out.println("Enter amount for withdraw: ");
			ac.withdraw(sc.nextDouble());

			System.out.println("New balance: " + ac.getBalance());
			System.out.println();

		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Invalid caractere");
		}

	}

}
