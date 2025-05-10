import java.util.*;
public class Numbergame {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        double n=Math.random()*100;
        int c=(int)n;
        int score=10;
        int ch=1;
        while(ch!=0){
        while(score!=0){
            System.out.println("Enter choice");
            int un=x.nextInt();
            if(c==un){
                System.out.println("the guess is correct");
                System.out.println("your score is"+score);
                ch=0;
                break;
            }
            else if(c<un){
                System.out.println("the guese is high");
                score--;
            }
            else{
                System.out.println("the guese is low");
                score--;
            }
        }
        if(score==0){
            System.out.println("Play again --->1  exit-->0");
            ch=x.nextInt();
            score=10;
        }
    }
    }
}
