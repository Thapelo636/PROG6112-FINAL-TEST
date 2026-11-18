/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author khuma
 */

public interface IProducts {
    int calculateTotalSales(int[][] sales);
    double calculateAverageSales(int totalSales, int productCount, int monthsCount);
    String determineMostPopularProduct(String[] products, int[][] sales);
}
   