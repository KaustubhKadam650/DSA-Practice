

public class PowernOfX {
    // public static int power(int x ,int n){
    //     //base case
    //     if (n == 0) {
    //         return 1;
            
    //     }
    //     //  recursion
    //     int halfPower = power(x,n/2);
    //     int halfPowerSq = halfPower * halfPower;

    //     if (n%2 !=0) {
    //         halfPowerSq = x * halfPowerSq;
    //     }
    //     return halfPowerSq;

        public static double power(double x, int n) {
        double ans = 1.0;
        long nn = n ;
        if(nn==0){return 1;}

        if(nn<0){
            nn = -1* nn;
        }
       
       while(nn> 0){
        if( nn%2 == 1){
            ans = ans * x;
            nn = nn -1 ;
        }else{
            x = x * x;
            nn = nn /2;
        }
       }
    if(n < 0) ans = (double)(1.0)/ (double)(ans);
    return ans;


    }
     public static void main(String[] args) {
        double x = 2 ;
        int n = -2 ;

        System.out.println("Answer is = " + power(x, n));
     }
}
