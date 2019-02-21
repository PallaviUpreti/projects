/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudproject;

/**
 *
 * @author User
 */
public class CloudProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x = 1000;
        int q = (x / 100)-1;
        int r = x / 1000;
        int p = 0;
       
        p = p + (q * 7) + (r * 8);
        p= p+(q*100*3); // to count and used as one hundred "and" one

        for (int j = 0; j <= x; j++) {
            int n=j;
             
            while( n >0)
            { 
                n = j % 10;
            
            if (n == 1) {
                p = p + 3;
            } else if (n == 2) {
                p = p + 3;
            } else if (n == 3) {
                p = p + 5;
            } else if (n == 4) {
                p = p + 4;
            } else if (n == 5) {
                p = p + 4;
            } else if (n == 6) {
                p = p + 3;
            } else if (n == 7) {
                p = p + 5;
            } else if (n == 8) {
                p = p + 5;
            } else if (n == 9) {
                p = p + 4;
            } else if (n == 11) {
                p = p + 6;
                n = n % 10;
            } else if (n == 12) {
                p = p + 6;
                n = n % 10;
            } else if (n == 13) {
                p = p + 8;
                n = n % 10;
            } else if (n == 14) {
                p = p + 8;
                n = n % 10;
            } else if (n == 15) {
                p = p + 7;
                n = n % 10;
            } else if (n == 16) {
                p = p + 7;
                n = n % 10;
            } else if (n == 17) {
                p = p + 9;
                n = n % 10;
            } else if (n == 18) {
                p = p + 8;
                n = n % 10;
            } else if (n == 19) {
                p = p + 7;
                n = n % 10;
            } else if (n == 10) {
                p = p + 3;
            } else if (n == 20) {
                
                p = p + 6;
            } else if (n == 30) {
                p = p + 6;
            } else if (n == 40) {
                p = p + 5;
            } else if (n == 50) {
                p = p + 5;
            } else if (n == 60) {
                p = p + 5;
            } else if (n == 70) {
                p = p + 7;
            } else if (n == 80) {
                p = p + 6;
            } else if (n == 90);
            {
                p = p + 5;
            }
            n=n/10;
            }
                    
            
        }
        
        System.out.println("Total number of words : "+p);

    }

}
