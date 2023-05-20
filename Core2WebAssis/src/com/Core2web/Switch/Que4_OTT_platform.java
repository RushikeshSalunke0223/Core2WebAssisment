package com.Core2web.Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que4_OTT_platform {

	public static void main(String[] args) throws IOException {
		BufferedReader brReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the choice ");
		System.out.println(" 1 : Movies ");
		System.out.println(" 2 : Series");
		int ott_choice = Integer.parseInt(brReader.readLine());

		switch (ott_choice) {
		case 1:
			System.out.println("Wish your movies you want to watch : ");
			System.out.println("1 : Founder");
			System.out.println("2 : Snowden");
			System.out.println("3 : her");
			System.out.println("4 : jobs");
			System.out.println("5 : sociel network");
			System.out.println("6 : wall-E");
			System.out.println("7 : AI");
			System.out.println("Enter the Choice : ");
			int movies = Integer.parseInt(brReader.readLine());
			switch (movies) {
			case 1:
				System.out.println("You wish to watch founder movie ");
				break;
			case 2:
				System.out.println("You wish to watch Snowden movie ");
				break;
			case 3:
				System.out.println("You wish to watch her movie ");
				break;
			case 4:
				System.out.println("You wish to watch jobs movie ");
				break;
			case 5:
				System.out.println("You wish to watch sociel network movie ");
				break;
			case 6:
				System.out.println("You wish to watch wall-E movie ");
				break;
			case 7:
				System.out.println("You eish to watch AI movie ");
				break;
			default:
				System.out.println("Enter the valied INPUT");
				break;
			}
			
			break;

		case 2:
			System.out.println("Wish Your series you want");
			System.out.println("1 : silicon valley");
			System.out.println("2 : devs");
			System.out.println("3 : the-it-crowed");
			System.out.println("4 : mr robot");
			System.out.println("Enter the choice ");
			int sries = Integer.parseInt(brReader.readLine());
			switch (sries) {
			case 1:
				System.out.println("You wish to watch silicon valley");
				break;
			case 2:
				System.out.println("You wish to watch devs");
				break;
			case 3:
				System.out.println("You wish to watch the-it-crowed");
				break;
			case 4:
				System.out.println("You wish to watch mr robot");
				break;
			default:
				System.out.println("Enter invalied choice");
				break;
			}
		}

	}

}
