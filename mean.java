import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class mean {

	public static void main(String[] args) {
		
		Scanner userInpt = new Scanner(System.in);
		
		System.out.println("Enter the total number of data:");
		int rowsNum = userInpt.nextInt();
		System.out.println("");
		System.out.println("*******************************************************************************");
		System.out.println("");
		
		int rows[] = new int[rowsNum];
		int data[] = new int[rowsNum];
		int frequency[] = new int[rowsNum];
		int product[] = new int[rowsNum];
		float sum_fx = 0;
		float num_freq = 0;
		float mean = 0;
		
		for (int i=0; i<rowsNum;i++) {
			System.out.println("Enter data:");
			data[i] = userInpt.nextInt();
			
			System.out.println("Enter frequency:");
			frequency[i] = userInpt.nextInt();
			
			product[i] = data[i] * frequency[i];
			sum_fx = sum_fx + product[i];
			num_freq = num_freq + frequency[i];
			System.out.println("");
			}
		System.out.println("");
		System.out.println("*******************************************************************************");
		System.out.println("");
		
		System.out.println("TABLE:");
		System.out.println("");
		
		System.out.println("---------------------------------------------------------");
		System.out.println("- Data(x) \t-\t Frequency(f) \t-\t (fx)\t-");
		System.out.println("---------------------------------------------------------");
		for(int x=0; x < rowsNum; x++) {
		
			System.out.println("- "+data[x] + " \t\t-\t " + " " + frequency[x] + " \t\t-\t " + " " + product[x] + "\t-" );
			System.out.println("---------------------------------------------------------");
			}
		System.out.println("-\t\t-\tN="+num_freq +"\t\t-    Σfx="+sum_fx+" -");
		System.out.println("---------------------------------------------------------");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		mean= sum_fx/num_freq;
		System.out.println("Mean(x̅) = " + mean);
		
		
	}

}
