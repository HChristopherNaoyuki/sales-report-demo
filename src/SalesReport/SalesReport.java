package SalesReport;

import java.util.Random;

/**
 * CLASS NAME: SalesReport
 * DESCRIPTION:
 * 
 * A Java application that generates and displays a sales report for multiple 
 * items over a set number of days. It uses a two-dimensional array to store 
 * random sales data, calculates total and average sales, and provides 
 * performance feedback based on average sales metrics. Perfect for 
 * understanding basic data manipulation and reporting in Java.
 */

public class SalesReport
{
    public static void main(String[] args)
    { 
        /*
        Step 1: Declare and Populate the Two-Dimensional Array
        Create a 3x5 integer array to store sales data for 3 items over 5 days.
        Each row represents a single item, and each column represents sales data for that item on a specific day.
        */
        int[][] sales = new int[3][5];
        Random rand = new Random();  // Create a Random object to generate random sales values.
        
        /*
        Populate the array with random values between 1 and 100.
        Iterate over each item (row) and each day (column) to assign a random sales value.
         */
        for (int[] sale : sales)
        {
            for (int j = 0; j < sale.length; j++)
            {
                sale[j] = rand.nextInt(100) + 1; // Random value between 1 and 100.
            }
        }
        
        /*
        Step 2: Print Sales Data in Table Format
        Print the sales data in a readable table format.
        The first loop iterates over each item, and the second loop iterates over the sales for each day.
        */
        System.out.println("---------------------------------------------");
        System.out.println("SALES DATA");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < sales.length; i++)
        {
            System.out.print("ITEM " + (i + 1) + ": ");  // Print the item number (row).
            
            // Print sales for each day (column) for the current item.
            for (int j = 0; j < sales[i].length; j++)
            {
                System.out.print(sales[i][j] + "\t");  // Use tab spacing to align the columns.
            }
            
            System.out.println();  // Move to the next line after printing all sales for the current item.
        }
        
        /*
        Step 3: Calculate Total and Average Sales for Each Item
        For each item, sum the sales for all 5 days and calculate the average.
        Depending on the average, print an appropriate message.
        */
        for (int i = 0; i < sales.length; i++)
        {
            int totalSales = 0;  // Initialize the total sales for the current item.
            
            // Sum sales for the current item across all 5 days.
            for (int j = 0; j < sales[i].length; j++)
            {
                totalSales += sales[i][j];  // Add the sales for day j to the total sales.
            }

            // Calculate the average sales for the current item.
            // Since there are 5 days, divide the total sales by 5 to get the average.
            double averageSales = totalSales / 5.0;
            
            /*
            Step 4: Print Total, Average, and Message Based on Average
            Print the total and average sales for the current item.
             */
            System.out.println("---------------------------------------------");
            System.out.println("ITEM " + (i + 1));
            System.out.println("---------------------------------------------");
            System.out.println("TOTALSALES: \t" + totalSales);
            System.out.println("AVERAGE SALES: \t" + averageSales);

            // Determine the sales performance message based on the average sales value.
            if (averageSales >= 70)
            {
                System.out.println("ITEM " + (i + 1) + " : \tGOOD SALES");
            }
            else if (averageSales >= 50 && averageSales < 70)
            {
                System.out.println("ITEM " + (i + 1) + ": \tMODERATE SALES");
            }
            else
            {
                System.out.println("ITEM " + (i + 1) + ": \tLOW SALES");
            }
        }
        System.out.println("---------------------------------------------");
    }
}

