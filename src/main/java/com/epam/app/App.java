package com.epam.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings({"resource", "unused" })
	public static void main( String[] args ) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        char op = 'y';
	        while(true) {
	        System.out.println("Enter First number:\n");
	        double a = scan.nextInt();
	        System.out.println("Enter Second number:\n");
	        double b = scan.nextInt();
	        System.out.println("Enter operation choice:\n1.Add\n2.Substract\n3.Multiply\n4.Divide\n5.Modulus\n");
	        int oc = scan.nextInt();
	        oc=oc-1;
	        if(oc<0 || oc>5) throw new Exception("Enter a valid option.");
	        	double[] x = new double[5];
				double[] operations = {
						x[0] = opt.add(a,b),
	        			x[1] = opt.sub(a,b),
	        			x[2] = opt.mul(a,b),
	        			x[3] = opt.div(a,b),
	        			x[4] = opt.md(a,b),
	        	};
				System.out.println(x[oc]);
				System.out.println("Exit (0):");
				int ch = scan.nextInt();
				if(ch==0) {
					break;
				}
	        }
	        
    }
}
