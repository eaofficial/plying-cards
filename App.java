import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int suits, ranks, noOfCards, option;

        System.out.println("How many suits?");
        suits = sc.nextInt();
        System.out.println("How many ranks?");
        ranks = sc.nextInt();

        DeckOfCards deck = new DeckOfCards(suits, ranks);
        //System.out.println(deck.toString());

        //System.out.println("1=shuffle, 2=deal 1 hand, 3=deal 100000 times, 4=quit: ");
        //option = sc.nextInt();

        boolean flag=true;
        while(flag)
        {
            System.out.println(deck.toString());
            System.out.println("1=shuffle, 2=deal 1 hand, 3=deal 100000 times, 4=quit: ");
            option = sc.nextInt();

            switch(option)
            {
                case 1:
                deck.shuffle();
                //System.out.println(deck.toString());
                break;

                case 2:
                System.out.println("How many cards? ");
                noOfCards = sc.nextInt();
                System.out.println(deck.dealHand(noOfCards));
                break;

                case 3:
                System.out.println("How many cards? ");
                noOfCards = sc.nextInt();
                deck.dealhundThausand(noOfCards);
                break;

                case 4:
                flag = false;
                break;

                default:
                System.out.println("Please enter a valid option!!");
            }  
        }
        sc.close();

    }

}