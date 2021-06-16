package prithvi;

import java.util.*;


public class PizzaProject {

	public static void main(String[] args) {
		int type,Veg_choice,pin;
		double cno;
		System.out.println("Welcome to Pizza Paradise!\n");
		System.out.println("Fast. Fresh. Delicious - You can't eat just one.\n");
		System.out.println("100% Safe - Zero Contact Ordering Delivery!");
		System.out.println("Order Online and Get Contactless Free Home Delivery within 30 minutes!");
		System.out.println("Less Waiting. More Eating! ");
		System.out.println("We ensure all the safety required!\n");
		System.out.println("All of our staff has daily temperature checking");
		System.out.println("Our Kitchen is santized every hour");
		System.out.println("All delivery staff undergo temperature checks and all riders have a handwash before delivering to you ");
		System.out.println("Get 10% discount on orders above Rs 800!\n");
		System.out.println("We are happy to serve you!\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String name = sc.next();
		System.out.print("Enter PIN Code: ");
		pin = sc.nextInt();
		System.out.print("Enter Address: ");
		String add = sc.next();
		System.out.print("Enter Contact Number: ");
		cno = sc.nextDouble();
		System.out.println();
		double cost = 0;
		Vector items = new Vector();
		
		System.out.println("*****PIZZA MENU******");
		System.out.println("1. Veg Pizza");
		System.out.println("2. Non Veg Pizza");
		System.out.print("Enter the type of Pizza you wish to have(1 or 2): ");
		type = sc.nextInt();
		System.out.println();
		
		if(type==1)
		{
			System.out.println("*****VEG PIZZA MENU*****");
			System.out.println("1.Margherita Pizza            Rs 300   ");
			System.out.println("2.Double Cheese Margherita    Rs 350   ");
			System.out.println("3.Farm House                  Rs 320   ");
			System.out.println("4.Peppy Paneer                Rs 280   ");
			System.out.println("5.Mexican Green Wave          Rs 250   ");
			System.out.println("6.Deluxe Veggie               Rs 350   ");
			System.out.println("7.Cheese & Corn               Rs 300   ");
			System.out.println("8.Veggie Paradise             Rs 300   ");
			System.out.println("9.Veg Extravaganza            Rs 360   ");
			System.out.println("10.Paneer Makhani             Rs 250   ");
			System.out.print("Enter your choice(1-10): ");
			Veg_choice = sc.nextInt();
			System.out.println();
			switch(Veg_choice)
			{
			case 1: items.addElement(new String("Margherita Pizza - Rs 300"));
					cost = cost + 300;
					break;
					
			case 2: items.addElement(new String("Double Cheese Margherita Pizza - Rs 350"));
					cost = cost + 350;
					break;
					
			case 3: items.addElement(new String("Farm House Pizza - Rs 320"));
					cost = cost + 320;
					break;
					
			case 4: items.addElement(new String("Peppy Paneer - Rs 280"));
					cost = cost + 280;
					break;
					
			case 5: items.addElement(new String("Mexican Green Wave - Rs 250"));
					cost = cost + 250;
					break;
			
			case 6: items.addElement(new String("Deluxe Veggie - Rs 350"));
					cost = cost + 350;
					break;
					
			case 7: items.addElement(new String("Cheese and Corn - Rs 300"));
					cost = cost + 300;
					break;
			
			case 8: items.addElement(new String("Veggie Paradise - Rs 300"));
					cost = cost + 300;
					break;
			
			case 9: items.addElement(new String("Veggie Extravaganza - Rs 360"));
					cost = cost + 360;
					break;
	
			case 10: items.addElement(new String("Paneer Makhani - Rs 250"));
					cost = cost + 250;
					break;
	
			}
			
			int toppings = 0;
			do
			{
				System.out.println("*****TOPPINGS MENU*****");
				System.out.println("1.Black Olives            Rs 50");
				System.out.println("2.Tomatoes                Rs 40");
				System.out.println("3.Crisp Capsicum          Rs 30");
				System.out.println("4.Crunchy Onion           Rs 40");
				System.out.println("5.Golden Corn             Rs 70");
				System.out.println("6.Red Paprika             Rs 30");
				System.out.println("7.Mushrooms               Rs 50");
				System.out.println("8.Extra Cheese            Rs 90");
				System.out.println("9.Exit                         ");
				System.out.print("Enter your choice(1-9):          ");
				toppings = sc.nextInt();
				System.out.println();
				switch(toppings)
				{
					case 1: cost = cost + 50;
							items.addElement(new String("TOPPINGS: Black Olives - Rs 50"));
							break;
							
					case 2: cost = cost + 40;
							items.addElement(new String("TOPPINGS: Tomatoes - Rs 40"));
							break;
							
					case 3: cost = cost + 30;
							items.addElement(new String("TOPPINGS: Crisp Capsicum - Rs 30"));
							break;
							
					case 4: cost = cost + 40;
							items.addElement(new String("TOPPINGS: Crunchy Onion - Rs 40"));
							break;
					
					case 5: cost = cost + 70;
							items.addElement(new String("TOPPINGS: Golden corn - Rs 70"));
							break;
							
					case 6: cost = cost + 30;
							items.addElement(new String("TOPPINGS: Red Paprika - Rs 30"));
							break;
							
					case 7: cost = cost + 50;
							items.addElement(new String("TOPPINGS: Mushrooms - Rs 50"));
							break;
					
					case 8: cost = cost + 90;
							items.addElement(new String("TOPPINGS: Extra Cheese - Rs 90"));
							break;
							
				}
			
		}while(toppings!=9);
		
		}
	else if(type == 2)	
	{
		System.out.println("*****NON VEG PIZZA MENU*****");
		System.out.println("1.Pepper Barbeque Chicken");
		System.out.println("2.Chicken Sausage");
		System.out.println("3.Chicken Golden Delight");
		System.out.println("4.Non Veg Supreme");
		System.out.println("5.Chicken Dominator");
		System.out.println("6.Pepper Barbeque and Onion Chicken");
		System.out.println("7.Chicken Fiesta");
		System.out.println("8.Chicken Tikka");
		System.out.print("Enter your choice(1-8): ");
		int NonVeg_choice = sc.nextInt();
		System.out.println();
		switch(NonVeg_choice)
		{
		case 1: items.addElement(new String("Pepper Barbeque Chicken - Rs 500"));
				cost = cost + 500;
				break;
				
		case 2: items.addElement(new String("Chicken Sausage - Rs 450"));
				cost = cost + 450;
				break;
				
		case 3: items.addElement(new String("Chicken Golden Delight - Rs 420"));
				cost = cost + 420;
				break;
				
		case 4: items.addElement(new String("Non Veg Supreme - Rs 450"));
				cost = cost + 450;
				break;
				
		case 5: items.addElement(new String("Chicken Dominator - Rs 430"));
				cost = cost + 430;
				break;
		
		case 6: items.addElement(new String("Pepper Barbeque and Onion Chicken - Rs 400"));
				cost = cost + 400;
				break;
				
		case 7: items.addElement(new String("Chicken Fiesta - Rs 420"));
				cost = cost + 420;
				break;
		
		case 8: items.addElement(new String("Chicken Fiesta - Rs 410"));
				cost = cost + 410;
				break;
		

		}
		
		int toppings = 0;
		do
		{
			System.out.println("*****TOPPINGS MENU*****");
			System.out.println("1.Black Olives");
			System.out.println("2.Tomatoes");
			System.out.println("3.Crisp Capsicum");
			System.out.println("4.Crunchy Onion");
			System.out.println("5.Golden Corn");
			System.out.println("6.Red Paprika");
			System.out.println("7.Mushrooms");
			System.out.println("8.Extra Cheese");
			System.out.println("9.Exit");
			System.out.print("Enter your choice(1-9): ");
			toppings = sc.nextInt();
			System.out.println();
			switch(toppings)
			{
				case 1: cost = cost + 50;
						items.addElement(new String("TOPPINGS: Black Olives - Rs 50"));
						break;
						
				case 2: cost = cost + 40;
						items.addElement(new String("TOPPINGS: Tomatoes - Rs 40"));
						break;
						
				case 3: cost = cost + 30;
						items.addElement(new String("TOPPINGS: Crisp Capsicum - Rs 30"));
						break;
						
				case 4: cost = cost + 40;
						items.addElement(new String("TOPPINGS: Crunchy Onion - Rs 40"));
						break;
				
				case 5: cost = cost + 70;
						items.addElement(new String("TOPPINGS: Golden corn - Rs 70"));
						break;
						
				case 6: cost = cost + 30;
						items.addElement(new String("TOPPINGS: Red Paprika - Rs 30"));
						break;
						
				case 7: cost = cost + 50;
						items.addElement(new String("TOPPINGS: Mushrooms - Rs 50"));
						break;
				
				case 8: cost = cost + 90;
						items.addElement(new String("TOPPINGS: Extra Cheese - Rs 90"));
						break;
						
			}
		
		}while(toppings!=9);

	}

		int side_order=0;
		do
		{
		System.out.println("*****SIDE ORDERS******");
		System.out.println("Complement your pizza with wide range of sides & beverages available at Pizza Bay!");
		System.out.println("1. Garlic Bread");
		System.out.println("2. Pasta");
		System.out.println("3. Dips");
		System.out.println("4. Desserts");
		System.out.println("5. Beverages");
		System.out.println("6. More");
		System.out.println("7. Exit");
		System.out.print("Enter your choice(1-7): ");
		side_order = sc.nextInt();
		System.out.println();
		
		if(side_order==1)
		{
			System.out.println("*****GARLIC BREAD*****");
			System.out.println("1.Garlic Breadsticks");
			System.out.println("2.Stuffed Garlic Bread");
			System.out.print("Enter your choice(1-2): ");
			int bread = sc.nextInt();
			System.out.println();
			switch(bread)
			{
				case 1: items.addElement(new String("GARLIC BREAD: Garlic Breadsticks - Rs 200"));
						cost = cost + 200;
						break;
				
				case 2: items.addElement(new String("GARLIC BREAD: Stuffed Garlic Bread - Rs 250"));
						cost = cost + 250;
						break;
			}
		}
		else if(side_order==2)
		{
			System.out.println("*****PASTA*****");
			System.out.println("1.Veg Pasta Italiano White");
			System.out.println("2.Non Veg Pasta Italiano White");
			System.out.print("Enter your choice(1-2): ");
			int pasta = sc.nextInt();
			System.out.println();
			switch(pasta)
			{
				case 1: items.addElement(new String("PASTA: Veg Pasta Italiano White - Rs 200"));
						cost = cost + 200;
						break;
				
				case 2: items.addElement(new String("PASTA: Non Veg Pasta Italiano White - Rs 250"));
						cost = cost + 250;
						break;
			}
		}
		else if(side_order==3)
		{
			System.out.println("*****DIPS*****");
			System.out.println("1.Cheese Jalapeno Dip");
			System.out.println("2.Cheese Dip");
			System.out.print("Enter your choice(1-2): ");
			int dip = sc.nextInt();
			System.out.println();
			switch(dip)
			{
				case 1: items.addElement(new String("DIPS: Cheese Jalapeno Dip - Rs 200"));
						cost = cost + 200;
						break;
				
				case 2: items.addElement(new String("DIPS: Cheese Dip - Rs 150"));
						cost = cost + 150;
						break;
			}
		}
		
		else if(side_order==4)
		{
			System.out.println("*****DESSERTS*****");
			System.out.println("1.Lava Cake");
			System.out.println("2.Butterscotch Mousse Cake");
			System.out.print("Enter your choice(1-2): ");
			int desserts = sc.nextInt();
			System.out.println();
			switch(desserts)
			{
				case 1: items.addElement(new String("DESSERTS: Lava Cake - Rs 200"));
						cost = cost + 200;
						break;
				
				case 2: items.addElement(new String("DESSERTS: Butterscotch Mousse Cake - Rs 150"));
						cost = cost + 150;
						break;
			}
		}
		else if(side_order==5)
		{
			System.out.println("*****BEVERAGES*****");
			System.out.println("1.Ice Tea");
			System.out.println("2.Cold Drinks");
			System.out.println("3.Juice");
			System.out.print("Enter your choice(1-3): ");
			int bev = sc.nextInt();
			System.out.println();
			switch(bev)
			{
				case 1: items.addElement(new String("BEVERAGES: Ice Tea - Rs 100"));
						cost = cost + 100;
						break;
				
				case 2: items.addElement(new String("BEVERAGES: Cold Drinks - Rs 90"));
						cost = cost + 90;
						break;
						
				case 3: items.addElement(new String("BEVERAGES: Juice - Rs 70"));
						cost = cost + 70;
						break;
			}
		}
		else if(side_order==6)
		{
			System.out.println("*****MORE*****");
			System.out.println("1.Potato Cheese Shots");
			System.out.println("2.Crunchy Strips");
			System.out.println("3.Taco Mexicana-Veg(Single)");
			System.out.println("4.Crinkle Fries");
			System.out.println("5.Taco Mexicana Non Veg");
			System.out.println("6.Brownie Fantasy");
			System.out.print("Enter your choice(1-6): ");
			int more = sc.nextInt();
			System.out.println();
			switch(more)
			{
				case 1: items.addElement(new String("MORE: Potato Cheese Shots - Rs 200"));
						cost = cost + 200;
						break;
				
				case 2: items.addElement(new String("MORE: Crunchy Strips - Rs 150"));
						cost = cost + 150;
						break;
						
				case 3: items.addElement(new String("MORE: Taco Mexicana-Veg(Single) - Rs 150"));
						cost = cost + 150;
						break;
				
				case 4: items.addElement(new String("MORE: Crinkle Fries - Rs 150"));
						cost = cost + 150;
						break;
				
				case 5: items.addElement(new String("MORE: Taco Mexicana Non Veg - Rs 250"));
						cost = cost + 250;
						break;
				
				case 6: items.addElement(new String("MORE: Brownie Fantasy - Rs 150"));
						cost = cost + 150;
						break;
			}
		}
		
		}while(side_order!=7);
		
		
	double disc =0;
	int code =0;
	System.out.println("-----------------------------");
	System.out.println("Thank You for your Order " +name);
	System.out.println();
	System.out.println("******DETAILS******");
	System.out.println("Address is: "+add);
	System.out.println("Contact Number is:  " +cno);
	System.out.println();
	System.out.println("Your Order is: ");
	for(int i=0;i<items.size();i++)
	{
		System.out.println(items.elementAt(i));
	}
	
	System.out.println("-----------------------------");
	System.out.println();
	System.out.println("Your Bill is: Rs "+cost);
	if(cost>=800)
	{
		System.out.println("Your Bill Amount exceeds Rs 800 - Discount of 10% on your bill");
		disc = (0.10*cost);
		System.out.println("Discount on your bill is: Rs " +disc);
		cost = cost - disc;
		System.out.println("*****MODE OF PAYMENT*****");
		System.out.println("1. Cash On Delivery");
		System.out.println("2. Credit Card");
		System.out.println("3. Debit Card");
		System.out.println("4. PayTm");
		System.out.println("Enter Mode of Payment(1-4): ");
		int mode = sc.nextInt();
		System.out.println();
		if(mode == 1)
		{
			System.out.println("Your Cash on Delivery Mode of Payment is successfully accepted!");
			System.out.println("Thank you for choosing us!");
			System.out.println();
		}
		else if(mode == 2)
		{
			System.out.println("Your Credit Card Mode of Payment is successfully accepted!");
			System.out.println("Thank you for choosing us!");
			System.out.println();
		}
		else if(mode == 3)
		{
			System.out.println("Your Debit Card Mode of Payment is successfully accepted!");
			System.out.println("Thank you for choosing us!");
			System.out.println();
		}
		else if(mode == 4)
		{
			System.out.println("Your PayTm Mode of Payment is successfully accepted!");
			System.out.println("Thank you for choosing us!");
			System.out.println();
		}
	
	}
	else
	{
		
	System.out.println("****VOUCHER/COUPON DISCOUNT*****");
	System.out.println("1. Coupon Code");
	System.out.println("2. Gift Card");
	System.out.println("3. Proceed to Payment");
	System.out.print("Enter your choice(1-3):");
	int voucher = sc.nextInt();
	System.out.println();
	if(voucher==1)
	{
		System.out.println("Enter last 2 digits Coupon Code to check validity: ");
		if(code>20 && code<40)
		{
			disc = (0.05*cost);
			System.out.println("Discount on your bill is: Rs " +disc);
			cost = cost - disc;
			System.out.println("Your bill amount after discount is: Rs "+cost);
		}
	}
	else if(voucher==2)
	{
		System.out.println("Enter last 2 digits Gift Card to check validity: ");
		if(code>20 && code<40)
		{
			disc = (0.05*cost);
			System.out.println("Discount on your bill is: Rs " +disc);
			cost = cost - disc;
			System.out.println("Your bill amount after discount is: Rs "+cost);
		}
	}
	
	if(voucher==3)
	{
		System.out.println("*****MODE OF PAYMENT*****");
		System.out.println("1. Cash On Delivery");
		System.out.println("2. Credit Card");
		System.out.println("3. Debit Card");
		System.out.println("4. PayTm");
		System.out.println("Enter Mode of Payment(1-4): ");
		int mode = sc.nextInt();
		System.out.println();
		if(mode == 1)
		{
			System.out.println("Your Cash on Delivery Mode of Payment is successfully accepted!");
			System.out.println("Thank you for choosing us!");
			System.out.println();
		}
		else if(mode == 2)
		{
			System.out.println("Your Credit Card Mode of Payment is successfully accepted!");
			System.out.println("Thank you for choosing us!");
			System.out.println();
		}
		else if(mode == 3)
		{
			System.out.println("Your Debit Card Mode of Payment is successfully accepted!");
			System.out.println("Thank you for choosing us!");
			System.out.println();
		}
		else if(mode == 4)
		{
			System.out.println("Your PayTm Mode of Payment is successfully accepted!");
			System.out.println("Thank you for choosing us!");
			System.out.println();
		}
	}
	}
	
	
	double tax = 0.08*cost;
	System.out.println("Tax on your bill is: Rs " +tax);
	System.out.println();
	double total = cost + tax;
	System.out.println("Total Amount is: Rs " + total);
	System.out.println();
	
	
    System.out.println("..................We hope you have an amazing time dining with us...............");
    System.out.println("..................Do visit us again ............................................");
    System.out.println("..................Do leave us a feedback @ PizzaProject.com.....................");
	System.out.println("******Thank you " +name +" - Your order will be delivered within 30 minutes!******");
}
}
