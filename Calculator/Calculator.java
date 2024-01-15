import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator
{
    public Calculator()
    {
    }

    public Double squareRoot(Double number)
    {
        if(number < 0)
        {
            throw new IllegalArgumentException("It's not possible to calculate the square root of a negative number.");
        }
        return Math.sqrt(number);
    }

    public void bhaskara()
    {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        try{
            System.out.println("\nEnter the 'a' value: ");
            Double a = scanner.nextDouble();

            System.out.println("\nEnter the 'b' value: ");
            Double b = scanner.nextDouble();

            System.out.println("\nEnter the 'c' value: ");
            Double c = scanner.nextDouble();

        
            Double delta = (b * b) - (4 * a * c);

            if(delta > 0)
            {
                Double xI = (-b + calculator.squareRoot(delta))/(2 * a);
                Double xII = (-b - calculator.squareRoot(delta))/(2 * a);

                System.out.print("\nTwo distinct real roots: ");
                System.out.print("\nxI: " + xI + "\nxII: " + xII);
            }
            else if(delta == 0)
            {
                Double x = -b / (2 * a);
                System.out.println("\nOne real root: x = " + x);
            }
            else
            {
                System.out.println("\nNo real roots for the given equation.");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("\nCannot divide by zero.");
        }
        catch(InputMismatchException e)
        {
            System.out.println("\nInvalid input. Please enter numeric values.");
        }
        finally
        {
            scanner.close();
        }
    }

    public void linearEquation()
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("\nEnter the 'a' value: ");
            Double a = scanner.nextDouble();

            System.out.print("Enter the 'b' value: ");
            Double b = scanner.nextDouble();

            if(a != 0)
            {
                Double x = -b / a;  
                System.out.println("The solution for the linear equation " + a + "x + " + b + " = 0 is: x = " + x);
            }
            else if(b == 0)
            {
                System.out.println("The equation is an identity. It has infinite solutions.");
            }
            else
            {
                System.out.println("The equation is a contradiction. It has no solution.");
            }
        }   
        catch(InputMismatchException e)
        {
            System.out.println("\nInvalid input. Please enter numeric values.");
        }
        finally
        {
            scanner.close();
        }
    }
}