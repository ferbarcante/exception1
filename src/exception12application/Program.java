package exception12application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)  {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = scan.nextInt();
			System.out.print("Check-in date: ");
			Date checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date: ");
			Date checkOut = sdf.parse(scan.next());


			Reservation rv = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + rv);

			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date: ");
			checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date: ");
			checkOut = sdf.parse(scan.next());

			rv.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + rv);

		} catch (ParseException e){
			System.out.println("Invalid date format");
		} catch (IllegalArgumentException e){
			System.out.println("Error in reservation: " + e.getMessage());
		}


	}

}
