package com.gifts.epam.NewYearGift;

import java.util.* ;

import com.gifts.epam.NewYearGift.gifting.Chocolate;
import com.gifts.epam.NewYearGift.gifting.Sweets;

public class GiftDriver extends Sweets{
	private static String name;
	private static int price;
	private static int quantity;
	Sweets sweets[];
	   Chocolate chocolates[];
	   int weight;
	   Scanner sc = new Scanner(System.in);
	  
	   public GiftDriver(Sweets sweet[],Chocolate chocolates[])
	   
	   { super(name, price, quantity);
		  sweets=sweet;
		  this.chocolates=chocolates;
		  weight=0;
	   }
	   void sortChocolates()
	   {	
		   //Bubble sorting
		   int n=sweets.length;
		   for(int i=0;i<n;i++)
		   {
			   for(int j=0;j<n-i; j++)
			   {
				   if(chocolates[j].price>chocolates[j+1].price)
				   {
					   Chocolate temp;
					   temp=chocolates[j];
					   chocolates[j]=chocolates[j+1];
					   chocolates[j+1]=temp;
				   }
			   }
		   }
	   }
	   void findCandies()
		{	
		   System.out.println("Enter the cost upto which the number of candies has to be found : ");
		   int numcandies = sc.nextInt();
		   System.out.println("Candies in the Children's Gift whose cost is less than "+numcandies+" is:");
			for(int i=0;i<chocolates.length;i++)
			{
				if(chocolates[i].price>=numcandies)
				{
					break;
				}
				System.out.println("Name:"+chocolates[i].name);
				System.out.println("Cost:"+chocolates[i].price);
			}
		}
	   void findWeight()
	   {
		    weight=weight(sweets)+weight(chocolates);
			System.out.println("Total weight of Gift is :"+weight);
	   }
	   
	}