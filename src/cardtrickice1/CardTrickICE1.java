/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/*
 * @author Jaswinder Singh Sehgal June 1st 2022
 */
import java.util.Scanner;
public class CardTrickICE1 extends Card{

    /**
     * @param String array args
     */
    public static void main(String[] args) 
    {
        int temp=0;
        String s="";
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue((int)(Math.random()*12+1));//use a method to generate random *13
            
            temp=(int)(Math.random()*3+1);
            s=calcSuits(temp);
            c1.setSuits(s);//random method suit
            magicHand[i]=c1;
        }
        for(int i=0;i<magicHand.length;i++)
            System.out.println(magicHand[i].getValue()+" of "+magicHand[i].getSuits());
        
        System.out.println("Please choose the Suit \n1:Hearts\n2:Diamonds\n3:Spades\n4.Clubs");
        int in1 =sc.nextInt();
        System.out.println("Please choose the value 1 to 12");
        int in2 =sc.nextInt();
        String type=SUITS[in1];
        
        boolean flag = false;
        for( int i=0;i<magicHand.length;i++)
        {
            if(magicHand[i].getValue()==in2 && magicHand[i].getSuits().equalsIgnoreCase(type))
            {
                flag=true;
            }
        }
        if(flag)
            System.out.println("The card is prsent in the array");
        else
            System.out.println("The card is not present in the array");
       
  
}
