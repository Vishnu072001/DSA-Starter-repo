public  class Recursion{
    public int recur(int n){
        if(n<0)
        return 0;
        System.out.println("ahbi");
        return recur(n-1);


        
    }
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.recur(3);
    }

}