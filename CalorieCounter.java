import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class CalorieCounter {
    
	static Scanner userInput = new Scanner(System.in);
	public static HashMap<String, Integer> foodDatabase = new HashMap<String, Integer>();
	public static ArrayList<Integer> breakfast = new ArrayList<Integer>();
	public static ArrayList<Integer> lunch = new ArrayList<Integer>();
	public static ArrayList<Integer> dinner = new ArrayList<Integer>();
	static int breakfastTotal, lunchTotal, dinnerTotal = 0;
	// static int lunchTotal = 0;
	// static int dinnerTotal = 0;
	
	static void buildHashMap() {
		// Breakfast Menu
		foodDatabase.put("BACON", 43);
		foodDatabase.put("EGGS", 78);
		foodDatabase.put("OMELETTE", 94);
		foodDatabase.put("OATMEAL", 158);
		foodDatabase.put("CEREAL", 307);
		foodDatabase.put("PANCAKES", 64);
		foodDatabase.put("WAFFLES", 82);
		foodDatabase.put("SAUSAGE", 229);
		foodDatabase.put("BISCUITS", 49);
		foodDatabase.put("GRANOLA BAR", 132);
		foodDatabase.put("GRITS", 143);
		foodDatabase.put("TOAST", 75);
		foodDatabase.put("FRENCH TOAST", 149);
		
		// Lunch Menu
		foodDatabase.put("SANDWICH", 340);
		foodDatabase.put("NOODLES", 221);
		foodDatabase.put("PIZZA", 285);
		foodDatabase.put("BURGER", 354);
		foodDatabase.put("CHEESEBURGER", 303);
		foodDatabase.put("HAMBURGER", 354);
		foodDatabase.put("TACO", 156);
		foodDatabase.put("HOT DOG", 151);
		foodDatabase.put("POLISH", 210);
		foodDatabase.put("SALAD", 100);
		foodDatabase.put("BURRITO", 447);
		
		// Dinner Menu
		foodDatabase.put("CHICKEN", 335);
		foodDatabase.put("FRIED CHICKEN", 320);
		foodDatabase.put("CHICKEN BREAST", 231);
		foodDatabase.put("CHICKEN LEG", 52);
		foodDatabase.put("CHICKEN WING", 80);
		foodDatabase.put("TURKEY", 153);
		foodDatabase.put("STEAK", 679);
		foodDatabase.put("MEATLOAF", 149);
		foodDatabase.put("SALMON", 412);
		foodDatabase.put("HAM", 203);
		foodDatabase.put("PORK", 206);
		
		// Sides Menu
		foodDatabase.put("STRING BEANS", 31);
		foodDatabase.put("GRENN BEANS", 31);
		foodDatabase.put("CABBAGE", 6);
		foodDatabase.put("CARROTS", 25);
		foodDatabase.put("CORN", 606);
		foodDatabase.put("BROCCOLI", 50);
		foodDatabase.put("MACARONI", 390);
		foodDatabase.put("APPLE", 95);
		foodDatabase.put("PEACH", 59);
		foodDatabase.put("GRAPES", 62);
		foodDatabase.put("PLUM", 30);
		foodDatabase.put("ORANGE", 45);
		foodDatabase.put("POMEGRANATE", 72);
		
		// Dessert Menu
		foodDatabase.put("CAKE", 239);
		foodDatabase.put("DONUT", 195);
		
		
		foodDatabase.put("DONE", 0);
	}
	
	static void breakfastCalories() {
		System.out.println("BREAKFAST");
		System.out.println("\n \nWhat did you have for breakfast today? \n");	
		while(true) {
			String food = userInput.next().toUpperCase();
			if(foodDatabase.containsKey(food)) {
				int calories = foodDatabase.get(food);
				breakfastTotal += calories;			
				if(calories == 0) {
					System.out.println("\nBREAKFAST TOTAL: " + breakfastTotal + " calories \n");
					break;
				}			
				breakfast.add(calories);
				System.out.println("\t" + food + ": " + calories + "\n");
				//System.out.println("What else did you have for breakfast? ");
			} else {
				System.out.println("Sorry, that item isn't in our database. \n");
			}
		}
	}
	
	static void lunchCalories() {
		System.out.println("\nLUNCH\n \n");
		System.out.println("What did you have for lunch today? \n");
		while(true) {
			String food = userInput.next().toUpperCase();
			if(foodDatabase.containsKey(food)) {
				int calories = foodDatabase.get(food);
				lunchTotal += calories;
				if(calories == 0) {
					System.out.println("\nLUNCH TOTAL: " + lunchTotal + " calories \n");
					break;
				}
				lunch.add(calories);
				System.out.println("\t" + food + ": " + calories + "\n");
				//System.out.println("What else did you have for lunch? ");
			} else {
				System.out.println("Sorry, that item isn't in our database. \n");
			}
		}
	}
	
	static void dinnerCalories() {
		System.out.println("\nDINNER\n");
		System.out.println("What did you have for dinner today? \n");
		while(true) {
			String food = userInput.next().toUpperCase();
			if(foodDatabase.containsKey(food)) {
				int calories = foodDatabase.get(food);
				dinnerTotal += calories;
				if(calories == 0) {
					System.out.println(" ");
					System.out.println("\nDINNER TOTAL: " + dinnerTotal + " calories \n");
					break;
				}
				lunch.add(calories);
				System.out.println("\t" + food + ": " + calories + "\n");
				//System.out.println("What else did you have for dinner? ");
			} else {
				System.out.println("Sorry, that item isn't in our database. \n");
			}
		}
	}
	
	public static void main(String args[]) {
		buildHashMap();
		breakfastCalories();
		lunchCalories();
		dinnerCalories();
		int totalCalories = breakfastTotal + lunchTotal + dinnerTotal;
		System.out.println("\n \n \nYou have a total intake of " + totalCalories + " calories today. ");
	}
}
