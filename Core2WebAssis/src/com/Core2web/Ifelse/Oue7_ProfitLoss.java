package com.Core2web;

public class Oue7_ProfitLoss {

	public static void main(String[] args) {
		int sellingPrice=121,costPrice=231;
		
		if(sellingPrice>costPrice) {
			System.out.println("Profit "+(sellingPrice-costPrice));
		}else if(costPrice>sellingPrice) {
			System.out.println("Loss "+(sellingPrice-costPrice));
		}else {
			System.out.println("No Profit or No Loss");
		}

	}

}
