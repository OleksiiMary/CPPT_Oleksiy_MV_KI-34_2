	package lab2;
	
	import java.io.*;
	import java.util.*;
	
	public class lab2 {
	    public static void main(String[] args) throws FileNotFoundException {
	        int nRows;
	        String filler;
	        Scanner in = new Scanner(System.in);
	        File dataFile = new File("MyFile.txt");
	        PrintWriter fout = new PrintWriter(dataFile);
	
	        System.out.print("Enter matrix size: ");
	        nRows = in.nextInt();
	        in.nextLine();
	        if (nRows % 2 == 1)
	        {
	            System.out.print ("Odd matrix value!");
	            fout.close(); 
	            return;
	        }
	        char[][] arr = new char[nRows][nRows];
	        for (int i = 0; i < nRows; i++) {
	            for (int j = 0; j < nRows; j++) {
	                arr[i][j] = ' ';
	            }

	        }
	        System.out.print("\nEnter filler symbol: ");
	        filler = in.nextLine();
	        if (filler.length() > 1)
	        {
            System.out.print ("Too much symbols!");
	            fout.close(); 
	            return;
	        }
	        else if (filler.length() == 0)
	        {
	            System.out.print ("Small number of symbols!");
	            fout.close(); 
	            return;
	        }
	
	        int temp = 0;
	        for (int i = temp; i < nRows; i++) {
	            i++;
	            System.out.print("\n");
            fout.print("\n");
	            for (int j = 0; j < nRows; j++) {
	                arr[i][j] = filler.charAt(0);
	                System.out.print(filler);
	                fout.print(filler);
	            }
	            System.out.print("\n");
	            fout.print("\n"); 
	            
	        }
	        fout.flush();
	        fout.close(); 
	    }
	}
