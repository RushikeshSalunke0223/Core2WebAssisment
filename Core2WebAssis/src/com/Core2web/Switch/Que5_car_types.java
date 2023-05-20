package com.Core2web.Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que5_car_types {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Choice off Car");
		System.out.println("1 : sedan");
		System.out.println("2 : hachback");
		int cars = Integer.parseInt(bReader.readLine());
		
		switch (cars) {
		case 1:
			System.out.println("Enter The Sendan types of car's ");
			System.out.println("1 : maruti suzuki ciezz");
			System.out.println("2 : Hyundi verna");
			System.out.println("3 : honda city");
			int sedan = Integer.parseInt(bReader.readLine());
			switch (sedan) {
			case 1: {
				System.out.println("maruti suzuki ciezz");
				System.out.println("Engine Displacement1462 cc\r\n" + "Cylinders4\r\n" + "Max Power105PS @ 6000rpm\r\n"
						+ "Max Torque138Nm @ 4400rpm\r\n" + "Transmission5-speed MT\r\n" + "Kerb Weight1060Kg\r\n"
						+ "Power:Weight99.06PS/tonne\r\n" + "Torque:Weight130.19NM/tonne");
			}
				break;
				
			case 2: {
				System.out.println("hyundi verna");
				System.out.println("Engine Displacement1497 cc\r\n" + "Cylinders4\r\n" + "Max Power115PS @ 6300rpm\r\n"
						+ "Max Torque144Nm @ 4500rpm\r\n" + "Transmission6-speed MT\r\n" + "Kerb Weight1160Kg\r\n"
						+ "Power:Weight99.14PS/tonne\r\n" + "Torque:Weight124.14NM/tonne");
			}
				break;
				
			case 3: {
				System.out.println("honda city");
				System.out.println("Engine Displacement1498 cc\r\n" + "Cylinders4\r\n" + "Max Power121PS @ 6600rpm\r\n"
						+ "Max Torque145Nm @ 4300rpm\r\n" + "Transmission6-speed MT\r\n" + "Kerb Weight1107Kg\r\n"
						+ "Power:Weight109.30PS/tonne\r\n" + "Torque:Weight130.98NM/tonne");
			}
				break;
				
			default:
				System.out.println("invalied type");
			}
			
			break;

		case 2:
			System.out.println("Enter the hachback types of cars");
			System.out.println("1 : maruti suzuki Brezza");
			System.out.println("2 : Hyundai venue");
			System.out.println("3 : Hyundai i-20");
			int hachback = Integer.parseInt(bReader.readLine());
			switch (hachback) {
			case 1: {
				System.out.println("maruti suzuki Brezza");
				System.out.println("Engine Displacement1462 cc\r\n" + "Cylinders 4\r\n" + "Max Power103PS @ 6000rpm\r\n"
						+ "Max Torque137Nm @ 4400rpm\r\n" + "Transmission 5-speed MT\r\n" + "Kerb-Weight 1155Kg\r\n"
						+ "Power:Weight89.18PS/tonne\r\n" + "Torque:Weight118.61NM/tonne");
			}
			
				break;
			case 2: {
				System.out.println("Hyundai Venue");
				System.out.println("Engine Displacement1197 cc\r\n" + "Cylinders4\r\n" + "Max Power83PS @ 6000rpm\r\n"
						+ "Max Torque114Nm @ 4000rpm\r\n" + "Transmission5-speed MT\r\n" + "Kerb Weight1081Kg\r\n"
						+ "Power:Weight76.78PS/tonne\r\n" + "Torque:Weight105.46NM/tonne");
			}
			
				break;
			case 3: {
				System.out.println("Hyundi i-20");
				System.out.println("Engine Displacement1197 cc\r\n" + "Cylinders4\r\n" + "Max Power83PS @ 6600rpm\r\n"
						+ "Max Torque115Nm @ 4200rpm\r\n" + "Transmission5-speed MT\r\n" + "Kerb Weight-\r\n"
						+ "Power:Weight-\r\n" + "Torque:Weight-");
			}
			
				break;

			}
		}

	}

}
