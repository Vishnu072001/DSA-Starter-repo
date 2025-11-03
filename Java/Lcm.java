public class Lcm{
    public int gcd(int a , int b){
        while(b!=0){
            int temp=b;
            b= b%a;
            a=temp;
        }
        return a;
    }

    public int lcm(int a, int b){
        int res= (a*b)/gcd(a,b);
        return res;
    
    }
    public static void main(String[] args) {
        Lcm l= new Lcm();
        System.out.println(l.gcd(12,18));
        System.out.println(l.lcm(12,18));
    }

}