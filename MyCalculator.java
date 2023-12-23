package calculatorPackage;

import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        while (true) { ///big while loop curley bracses start . this is the thirst curley braces 
            System.out.println("Enter the calculator mode: Standard/Scientific?");
            
            String modeselection = scnr.next();
            
            modeselection = modeselection.toLowerCase();

            if (modeselection.equals("standard")) { //if Standard mode curley braces start
                System.out.println("The calculator will operate in standard mode.");
                System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");

                String x = scnr.next();

                while (!"+-*/".contains(x)) {
                    System.out.println("Invalid operator " + x);
                    System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
                    x = scnr.next();
                }
                
                if ("+".contains(x)) {
            		    System.out.println("How many numbers do you want to add?");
            		    int numCount = scnr.nextInt();
            		    double result = 0;

            		    System.out.println("Enter " + numCount + " numbers");

            		    for (int i = 1; i <= numCount; i++) {
            		        double num = scnr.nextDouble();
            		        result += num;
            		    }
            		    System.out.println("Result: " + result);
            		}
                if ("-".contains(x)) {
                    	System.out.println("How many numbers do you want to subtract?");
            		    int numCount = scnr.nextInt();
            		    double result = 0;

            		    System.out.println("Enter " + numCount + " numbers");

            		    if (numCount >= 1) {
            		        result = scnr.nextDouble();
            		        for (int i = 1; i < numCount; i++) {
            		            double num = scnr.nextDouble();
            		            result -= num;
            		        }
            		    } else {
            		        System.out.println("Invalid "+numCount+" of numbers to subtract.");
            		    }

            		    System.out.println("Result: " + result);
            		}
                if ("*".contains(x)) {
            		    System.out.println("How many numbers do you want to multiply?");
            		    int numCount = scnr.nextInt();
            		    double result = 1;

            		    System.out.println("Enter " + numCount + " numbers");

            		    for (int i = 0; i < numCount; i++) {
            		        double num = scnr.nextDouble();
            		        result *= num;
            		    }

            		    System.out.println("Result: " + result);
            		}
                if ("/".contains(x)) {
            		    System.out.println("How many numbers do you want to divide?");
            		    int numCount = scnr.nextInt();
            		    

            		    System.out.println("Enter " + numCount + " numbers");

            		    if (numCount >= 2) {
            		        double num1 = scnr.nextDouble();
            		        double num2 = scnr.nextDouble();

            		        if (num2 != 0) {
            		        	double result = 0;
            		        	
            		        	result = num1 / num2;
            		     
            		            for (int i = 2; i < numCount ; i++) {
            		                double num = scnr.nextDouble();
            		                result /= num;
            		                
            		            }
            		            
            		            System.out.println("Result: " + result);
            		        } 
            		        else {
            		            System.out.println("Result: Infinity");
            		        }
            		    } 
            		    else {
            		        System.out.println("Invalid "+numCount+" of numbers to divide.");
            		    }
            		}
                }//if standard mode curley braces ends
            
            else if (modeselection.equals("scientific")) { //else if scientific mode curley braces start
                System.out.println("The calculator will operate in scientific mode.");
                System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");

                String y = scnr.next();

                while (!"+-*/sincostan".contains(y)) {
                    System.out.println("Invalid operator: " + y);
                    System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
                    y = scnr.next();
                }
                
                if ("+".contains(y)) {
                		    System.out.println("How many numbers do you want to add?");
                		    int numCount = scnr.nextInt();
                		    double result = 0;

                		    System.out.println("Enter " + numCount + " numbers");

                		    for (int i = 0; i < numCount; i++) {
                		        double num = scnr.nextDouble();
                		        result += num;
                		    }
                		    System.out.println("Result: " + result);
                		}
                        
                        else if ("-".contains(y)) {
                        	System.out.println("How many numbers do you want to subtract?");
                		    int numCount = scnr.nextInt();
                		    double result = 0;

                		    System.out.println("Enter " + numCount + " numbers");

                		    if (numCount >= 1) {
                		        result = scnr.nextDouble();
                		        for (int i = 1; i < numCount; i++) {
                		            double num = scnr.nextDouble();
                		            result -= num;
                		        }
                		    } else {
                		        System.out.println("Invalid "+numCount+" of numbers to subtract.");
                		    }

                		    System.out.println("Result: " + result);
                		}
                        
                        else if ("*".contains(y)) {
                		    System.out.println("How many numbers do you want to multiply?");
                		    int numCount = scnr.nextInt();
                		    double result = 1;

                		    System.out.println("Enter " + numCount + " numbers");

                		    for (int i = 0; i < numCount; i++) {
                		        double num = scnr.nextDouble();
                		        result *= num;
                		    }

                		    System.out.println("Result: " + result);
                		}
                        else if ("/".contains(y)) {
                        	double result = 0;
                		    System.out.println("How many numbers do you want to divide?");
                		    double numCount = scnr.nextDouble();
                		    

                		    System.out.println("Enter " + numCount + " numbers");

                		    if (numCount >= 2) {
                		        double num1 = scnr.nextDouble();
                		        double num2 = scnr.nextDouble();

                		        if (num2 != 0) {
                		            result = num1 / num2;
                		            
                		            for (int i = 2; i < numCount; i++) {
                		            	
                		                double num = scnr.nextDouble();
                		                
                		                result /= num;
                		            }
                		            System.out.println("Result: " + result);
                		        } else {
                		            System.out.println("Result: Infinity");
                		        }
                		    } else {
                		        System.out.println("Invalid "+numCount+" of numbers to divide.");
                		    }
                		}
                        else {
                        	
                        	String z = null;
                        	
                        	if (y.equals("sin")) {
                        		z = "sine";
                        	}
                        	else if (y.equals("cos")) {
                        		z = "cosine";
                        	}
                        	else if (y.equals("tan")) {
                        		z = "tangent";
                        	}
                        	
                        System.out.printf("Enter a number in radians to find the %s%n",z);
                        double radians = scnr.nextDouble();

                        double result = 0;
						switch (y) {
                            case "sin":
                                result = Math.sin(radians);
                                break;
                            case "cos":
                                result = Math.cos(radians);
                                break;
                            case "tan":
                                result = Math.tan(radians);
                                break;
                        }

                        System.out.println("Result: " + result);
                    }
                
            } ////else if scientific mode curley braces ends
            else { //else statement start
                System.out.println("Invalid mode selection. Please enter 'Standard' or 'Scientific'.");
            }//else statement ends 
            
            System.out.println("Do you want to start over? (Y/N)");
            String g = scnr.next();
            if (!g.equalsIgnoreCase("Y")) {
                System.out.println("Goodbye");
                break;
            }
        } ///big while loop curley bracses ends  . this is the thirst curley braces
    }
}
