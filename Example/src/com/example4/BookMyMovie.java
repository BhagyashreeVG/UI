package com.example4;

import java.util.Scanner;

public class BookMyMovie {
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	
	public BookMyMovie(int movieId, int noOfTickets) {
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double calculateDiscount() {

		if (this.movieId == 101 || this.movieId == 103) {
			if (this.noOfTickets < 5) {
				return 0;
			} else if (this.noOfTickets >= 5 && this.noOfTickets < 10) {
				return 15;
			} else if (this.noOfTickets  >=10 && this.noOfTickets <= 15) {
				return 20;
			}
		} else if (this.movieId == 102) {
			if (this.noOfTickets < 5) {
				return 0;
			} else if (this.noOfTickets >= 5 && this.noOfTickets < 10) {
				return 10;
			} else if (this.noOfTickets  >=10 && this.noOfTickets <= 15) {
				return 15;
			}
		} 
		return 0;
	}
	
	public void calculateTicketAmount() {
		int baseFare = 0;
		double discount;
		
		switch(this.movieId) {
			case 101: 
				baseFare = 120;
				break;
			case 102: 
				baseFare = 170;
				break;
			case 103: ;
				baseFare = 150;
				break;
			default: 
				break;
			}
		discount = this.calculateDiscount();
		
		this.totalAmount = 
				baseFare * this.noOfTickets - (baseFare * this.noOfTickets * (discount/100)) ;
		System.out.println("Total amount for booking: " + this.totalAmount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter movie id: ");		
		int id = Integer.parseInt(scanner.next());
		
		System.out.println("Enter no. of tickets: ");		
		int tickets = Integer.parseInt(scanner.next());
		
		scanner.close();
		if (id == 101 || id == 102 || id == 103) {
			BookMyMovie b1 = new BookMyMovie(id,tickets);
			b1.calculateTicketAmount();
		} else {
			System.out.println(id);
			System.out.println("1. Sorry! Invalid Movie ID!");
			System.out.println("2. Please check the Movie ID and enter once again. ");
		}
	}
}
