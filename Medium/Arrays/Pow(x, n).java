//Problem:  Pow(x, n)
//Link:
https://leetcode.com/problems/powx-n/description/
// Medium Level
//Approach: i really tell you that i got run time error in this problem because return type is double it confuses a lot
            // i Use Divide & Conquer
// Convert n to long (because of overflow)
// Handle negative powers
// Recursively compute x^(n/2)
// Multiply according to odd/even;
// this take time complexity of O(n)
class Solution {
    public double myPow(double x, int n) {
        long binform = n;
        if (x == 0) {
            return 0;
        }
        if (binform < 0) {
            x = 1 / x;
            binform = -binform;
        }
        return power(x, binform);
    }

    private double power(double x,long n){
        if(n==0){
            return 1.0;
        }
        double y=power (x, n/2);
        if (n % 2 == 0) {
            return y * y;
        } 
        else {
            return y * y * (x);
        }
    }
}
