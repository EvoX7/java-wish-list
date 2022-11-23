package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> wishes = new ArrayList<>();

		System.out.println("WishList");
		System.out.println("--------------------");



		while (true) {
			System.out.print("Do you want to insert a wish?: yes/no \n");
			String response = sc.nextLine();

			if (response.equals("yes")) {


				System.out.print("Add wish: \n");
				String wish = sc.nextLine();

				wishes.add(wish);

				System.out.println("\nList length is: " + wishes.size() + "\n");

				continue;


			}
			break;
		}
		
		System.out.println(wishes);
		Collections.sort(wishes);

	}
}

