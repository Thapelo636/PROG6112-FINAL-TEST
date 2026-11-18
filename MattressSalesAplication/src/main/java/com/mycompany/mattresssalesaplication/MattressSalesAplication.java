/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.scanner
package com.mycompany.mattresssalesaplication;

/**
 *
 * @author khuma
 */

public class MattressSalesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product productObj = new Product();
        
        String[] products = {
            "Cozy Nights Monarch mattress", 
            "Restonic Barbados mattress", 
            "Sealy Phuket mattress"
        };
        
        int[][] sales = new int[3][3];
        
        // Input sales data for each product and month
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }
        
        // Use methods from the Product class
        int total = productObj.calculateTotalSales(sales);
        double average = productObj.calculateAverageSales(total, products.length, 3);
        String mostPopular = productObj.determineMostPopularProduct(products, sales);
        
        // Display Report matching sample output
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");
        System.out.println("TOTAL PRODUCT SALES: " + total);
        System.out.println("AVERAGE PRODUCT SALES: " + (int) average);
        System.out.println("MOST POPULAR PRODUCT: " + mostPopular);
        
        scanner.close();
    }
}
    

