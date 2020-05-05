package Ashkelon;

import java.util.Scanner;
public class test_version1 
{
	public static void main(String[] args) 
	{
		int rating;
		String title;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Give name of movie: ");
		title = scan.nextLine();
		System.out.println(" Give rating as number 0 - 9: ");
		rating = scan.nextInt();
		String stars = Display.starString (rating); 
		System.out.println(" title: " + title + " rating: " + stars);
	}
} 