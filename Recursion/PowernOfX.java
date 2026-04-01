

public class PowernOfX {
    public static int power(int x ,int n){
        if (n==0) {
            return 1;
            
        }

        int halfPower = power(x,n/2);
        int halfPowerSq = halfPower * halfPower;

        if (n%2 !=0) {
            halfPowerSq= x * halfPowerSq;
        }
        return halfPowerSq;

    }
     public static void main(String[] args) {
        int x =2;
        int n=5;

        System.out.println("Answer is "+power(x, n));
     }
}
