package tns.com.assignment3;
import java.util.Scanner;

public class Ticket {
private static int totalTickets;
private static Scanner scanner;

public static void main(String[] args) {
scanner = new Scanner(System.in);
totalTickets = 3; 

 while (true) {
	 System.out.println("Ticket Booking System");
	 System.out.println("1. Book Tickets");
	 System.out.println("2. Check Available Tickets");
	 System.out.print("Enter your choice: ");
	 int choice = scanner.nextInt();

	  switch (choice) {
	                     case 1:
			                    bookTickets();
			                    break;
			             case 2:
			                    checkAvailableTickets();
			                    break;
			              
			             default:
			                    System.out.println("Invalid choice.");
			            }
			        }
			    }

private static void bookTickets() {
	System.out.print("Enter your name: ");
	String name = scanner.next();

	  System.out.print("Enter number of tickets to book: ");
	   int numTickets = scanner.nextInt();

	     if (numTickets <= totalTickets) {
			            totalTickets -= numTickets;
			            System.out.println(name + " has booked " + numTickets + " tickets.");
			            System.out.println("Remaining tickets: " + totalTickets);
			        } else {
			            System.out.println("not Available");
			        }
			    }
			    private static void checkAvailableTickets() {
			        System.out.println("Available tickets: " + totalTickets);
			    }
			
	}


