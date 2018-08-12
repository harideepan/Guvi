/*
Anna and Brian order n  items at a restaurant, but Anna declines to eat any of the kth item due to an allergy. When the check comes, they decide to split the cost of all the items they shared; however, Brian may have forgotten that they didn't split the kth item and accidentally charged Anna for it. You are given n,k the cost of each of the n items, and the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print 'Bon Appetit'; otherwise, print the amount of money that Brian must refund to Anna.
Input Format
The first line contains two space-separated integers denoting the respective values of n (the number of items ordered) and k (the 0-based index of the item that Anna did not eat). The second line contains n space-separated integers where each integer i denotes the cost c[i], of item i. The third line contains an integer ,b(charged), denoting the amount of money that Brian charged Anna for her share of the bill.
Output Format
If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e.b(charged) - b(actual), ) that Brian must refund to Anna (it is guaranteed that this will always be an integer).
Input Size : N<=1000000 
Example:
INPUT
4 1
3 10 2 9
12
OUTPUT
5
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class BonAppetit {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int bill[]=new int[n];
        int total=0;
        for(int i=0;i<n;i++)
        {
            bill[i]=sc.nextInt();
            if(i!=k)
            {
                total+=bill[i];
            }
        }
        int annaShare=total/2;
        int b=sc.nextInt();
        System.out.println("Output :");
        if(b==annaShare)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-annaShare);
        
    }
}
