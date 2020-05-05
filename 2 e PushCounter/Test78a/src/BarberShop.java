import java.awt.event.*;
import java.util.Scanner;
import javax.swing.Timer;
import java.awt.*;

public class BarberShop {
/** A solution to the Sleeping Barber Problem using instrumentation
 * and random events.
 * 
 * Instrumentation refers to an ability to monitor or measure 
 * the level of a product's performance, to diagnose errors, 
 * and to write trace information.
 * Programmers implement instrumentation in the form of code instructions 
 * that monitor specific components in a system 
 * (for example, instructions may output logging information to appear on the screen).
 */
	
	private static Object key = new Object();
	private static final int Seats = 10;
	private static int emptySeats;
	static int i = 0; static int j = 0;
	
	
	public static void main(String[] args) {
		
		Client client = new Client();
		Barber barber = new Barber();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of empty Seats: " + "\n");
		emptySeats = scan.nextInt();
		client.start();
		barber.start();
	} // end Main
	
	
	private static class Barber extends Thread{
		// Barber gives client haircut, Barber is CONSUMER
		
		public void run() {
			while(i < 10) {
			synchronized (BarberShop.key) {
				if (BarberShop.emptySeats== BarberShop.Seats) {
					// No Clients, Barber goes to sleep
					System.out.println("BTHREAD: No Clients, Barber waits: "+emptySeats+" empty seats");
					try {BarberShop.key.wait();}
					catch(Exception ex){};}
				// Barber calls for next Client 	
				// A Client is served and then leaves
				try{sleep(3000);} 
				catch(Exception ex){};
				emptySeats++;
				System.out.println("BTHREAD: Barber:Client served and leaves: "+emptySeats+" empty seats" );
				// Barber lets in new client
				if (BarberShop.emptySeats == 1) {
				BarberShop.key.notify();
				System.out.println("BTHREAD: Allow new Clients: " + emptySeats + " empty seats");}
			} //end synchronised()
			i++;
			} // end while()
			System.out.println("BTHREAD Dies. " + " i= " + i );
		} // end run()
	} // end class Barber
	
	
	private static class Client extends Thread{
		// Client is PRODUCER

		public void run(){
			while(j < 10) {
				synchronized(BarberShop.key) {
					// New Client wishes to come in
					if(BarberShop.emptySeats == 0) {
						System.out.println("CTHREAD: Full Clients: " + emptySeats + " empty seats");	
						try{BarberShop.key.wait();}
					    catch(Exception ex) {}; }
					
					// there are empty seats,add new Client
					try{sleep(5000);} 
					catch(Exception ex){};
					emptySeats--;
					System.out.println("CTHREAD: Let new Client in: " + emptySeats + " empty seats");
					// There is a Client - wakeup Barber
					if (BarberShop.emptySeats == 9)
						BarberShop.key.notify();
				} // end synchronised()
				j++;
			} // end while()
			System.out.println("CTHREAD Dies. " + " j= " + j);
			} // end run()
		} // end class Client
	
	} // end class BarberShop
