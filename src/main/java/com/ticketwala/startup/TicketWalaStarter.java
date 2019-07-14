package com.ticketwala.startup;

import com.ticketwala.command.api.Command;
import com.ticketwala.command.api.CommandFactory;
import com.ticketwala.command.api.Result;
import com.ticketwala.model.CinemaHall;
import com.ticketwala.model.Seat;

import java.util.Scanner;

public class TicketWalaStarter {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

//		String userCommandLine = "";
//		CommandFactory commandFactory = new CommandFactory();
//		while (!"bye".equals(userCommandLine)){
//			try {
//				System.out.println("please enter command");
//				userCommandLine = scanner.nextLine();
//
//
//				Command c = commandFactory.createCommand(userCommandLine);
//
//				Result result = c.execute();
//
//				System.out.println(result.getMsg());
//
//			}catch (Exception e){
//				System.err.println("Unexpected Command Line Error! " + e.getMessage());
//			}
//		}
//		System.out.println("Bye...");
//		scanner.close();
		CinemaHall c = new CinemaHall(10,10,100);
		System.out.println(c);

	}
}
