public  class Recursion1{
    public int recur(int n){
        if(n<0)
        return 0;
        recur(n-1);
        System.out.println(n);
        return 0;
        


        
    }
    public static void main(String[] args) {
        Recursion1 r = new Recursion1();
        r.recur(10);
    }

}