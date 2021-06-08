package com.car_inventory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Car;
import com.service.CarServices;

public class CarInventory_Main {

	public static void main(String[] args) {
		String make, model;
		int year;
		float sale_price;
		List<Car> carlist;
		List<Car> list = new ArrayList<Car>();
		System.out.println("Welcome to Mullet Joe's Gently Used Autos! ");
		Scanner input = new Scanner(System.in);
		CarServices carServices = new CarServices();
		Car car = new Car();
		while (true) {
			System.out.println(" add\n list\n delete\n update\n quit");
			System.out.println("enter your Command");
			String choice = input.nextLine();
			if (choice.equalsIgnoreCase("quit")) {
				System.out.println("Thank you!! For choosing our Services");
				break;
			} else {
				switch (choice) {
				case "add":
					System.out.println("Enter Make");
					make = input.nextLine();
					System.out.println("Enter Model");
					model = input.nextLine();
					System.out.println("Enter year");
					year = input.nextInt();
					System.out.println("enter sale_price");
					sale_price = input.nextFloat();
					car.setMake(make);
					car.setModel(model);
					car.setYear(year);
					car.setSale_price(sale_price);
					try {
						carServices.addCar(car);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case "list":
					System.out.println("Inventory list..");
					carServices.viewCars();

					break;
				case "delete":
					System.out.println("Enter Make to delete");
					make = input.nextLine();
					System.out.println("Enter Model to delete");
					model = input.nextLine();
					String deletecar;
					try {
						deletecar = carServices.deleteCar(make, model);
						System.out.println(deletecar);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;

				case "update":
					System.out.println("enter sale_price to be updated");
					sale_price = input.nextFloat();
					System.out.println("Enter Make.");
					make = input.nextLine();
					System.out.println("Enter Model");
					model = input.nextLine();
					String updatecar;
					try {
						updatecar = carServices.updateCar(make, model, sale_price);
						System.out.println(updatecar);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				default:
					System.out.println("Invalid option");
				}
			}
		}
		input.close();;
	}

}
