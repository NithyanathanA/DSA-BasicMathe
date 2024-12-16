import java.util.ArrayList;

public class MatheMethod {

    public static int couint(int n){
        int tem=n;
        int count=0;
        while (n>0){
            int last=n%10;
            n=n/10;

            if (tem%last==0){
                count++;
            }
        }
        return count;
    }
    public static int reversenumber(int n) {

        int pervies = 0;

        int last = 0;
        while (n != 0){
            last = n % 10;
        n /= 10;

        pervies = (pervies * 10) + last;// we Add the pervies value

    }
    return pervies;
    }
    public static boolean checkplainndrum(int x) {
        int pervies = 0;
        int last = 0;
        int tem = x;

        while (tem != 0) {
            last = tem % 10;
            tem = tem / 10;

            pervies = (pervies * 10) + last;

        }
        if (pervies == x) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean Armstarm(int x){

        int temm=x;
        int comper=0;

        while (temm!=0){
            int last=temm%10;
            temm/=10;
            comper+=last*last*last;

        }
        if (comper==x){
         return true;
        }
        else return false;
    }
    public static int Sumoflldivisorsfromton(int n){

        int amwer=0;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    amwer+=j;
                }
            }
        }
        return amwer;
    }
    public static ArrayList<Integer> GCDandLCD(int a, int b) {
ArrayList<Integer>list=new ArrayList<>();
        int gcd=gcd(a,b);
        list.add(gcd);
        int lcm=(a*b)/gcd;
        list.add(lcm);
return list;
    }
public static int gcd(int a,int b){

        if (b==0)
            return a;
        else {
           return gcd(b,a%b);
        }
}
}

