package com.gifts.epam.NewYearGift;

import java.util.*;

import com.gifts.epam.NewYearGift.gifting.Chocolate;
import com.gifts.epam.NewYearGift.gifting.Sweets;
public class Main 
{
    public static void main(String[] args )
    {
    	int sweets, chocolates ;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Input total sweets in the gift");
    	sweets=sc.nextInt();
    	Sweets s[]=new Sweets[sweets];
    	for(int i=0;i<sweets;i++)
    	{
    		System.out.println("Enter details of sweet "+(i+1)+":");
    		System.out.println("Name:");
    		String sname=sc.next();
    		System.out.println("Quantity:");
    		int squantity=sc.nextInt();
    		System.out.println("Price:");
    		int sprice=sc.nextInt();
    		s[i]=new Sweets(sname,squantity,sprice);
    	}
    	System.out.println("Input total chocolates in the gift:");
    	chocolates=sc.nextInt();
    	Chocolate c[]=new Chocolate[chocolates];
    	for(int i=0;i<chocolates;i++)
    	{
    		System.out.println("Enter details of Chocolate "+(i+1)+":");
    		System.out.print("Name:");
    		String cname=sc.next();
    		System.out.print("Price:");
    		int cprice=sc.nextInt();
    		c[i]=new Chocolate(cname,cprice);
    	}
    	//Object of Gift
    	GiftDriver gift=new GiftDriver(s,c);
    	gift.findWeight();
    	gift.sortChocolates();
    	gift.findCandies();
    }
}