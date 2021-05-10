package com.day4;

public class MemberShipCard extends Card {
	public MemberShipCard(String holderName, String cardNumber, String expiryDate) {
		super(holderName, cardNumber, expiryDate);

	}

	private int rating;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
