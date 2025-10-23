
import java.util.Scanner;

// check even or odd 
public class OddEven{
    public void oddeven(int n){
        if(n%2==0){
            System.out.println("it is an even number");
        }
        else{
            System.out.println("it is not a even number");
        }
            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            OddEven bp=new OddEven();
            bp.oddeven(n);

        }

    }
