import java.util.Scanner;
public class guess_the_number {
    public static void main(String[] args) {
        int random_number=(int)(Math.random()*101);
        Scanner s=new Scanner(System.in);
        System.out.println("GUESS THE NUMBER");
        
        int count=0;
        System.out.println("Enter The Game Mode");
        System.out.println("1.EASY \n2.MEDIUM \n3.HARD");
        int mode=s.nextInt();
        if (mode==1) {
            count+=15;
        }
        else if(mode==2){
        count+=10;
        }
        else if(mode==3){
            count+=5;
        }
        else{
            count-=1;
        }
        while(count>0){
            System.out.println("Your Life line = "+count);

            System.out.println("Guess The Number Between 0 to 100");
            int user_number=s.nextInt();
            if(user_number>random_number){
                System.out.println("oops! your guess is too high try again!");
            }
            else if(user_number<random_number){
                System.out.println("oops! your guess is too low try again!");

            }
            else if(user_number==random_number){
                System.out.println("Congrats! You Guess The Right Number\n* YOU WON THE GAME *");
                break;
            }
            count--;    

         }
         if(count==0){
            System.out.println("YOU LOST THE MATCH");
         }
         System.out.println("* GAME IS OVER *");
    }
}
