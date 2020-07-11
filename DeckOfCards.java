import java.util.*;
public class DeckOfCards
{
    int noOfSuits, maxRanks, noOfCards;
    Card cArr[] ;

    public DeckOfCards(int suits, int ranks)
    {
        noOfSuits = suits;
        maxRanks = ranks;
        noOfCards = suits*ranks;
        cArr = new Card[noOfCards];

        int n=0;

        while(n<noOfCards)
        {
            for(int i=1;i<=noOfSuits;i++)
                for(int j=1;j<=maxRanks;j++)
                {
                    cArr[n] = new Card(i,j);
                    n++;
                }
        }
    }

    @Override
    public String toString()
    {
        String str;
        str = "Deck of "+ noOfCards + " Cards: " + "low = 1 " + "high = " + maxRanks + " top = " + cArr[0].toString();
        return str;
    }

    public void shuffle()
    {
        List<Card> intList = Arrays.asList(cArr);

		Collections.shuffle(intList);

		intList.toArray(cArr);
    }

    public String dealHand(int nCards)
    {
        if(nCards>noOfCards)
            return "Cannot deal more than " + noOfCards + " cards!!";
        String str = "";
        for(int i=0;i<nCards;i++)
            str +=  cArr[i].toString() + " ";
        return str;
    }

    public void dealhundThausand(int nCards)
    {
        int hist[] = new int[100000];
        for(int i=0;i<100000;i++)
        {
            shuffle();
            int sum = 0;
            for(int j=0;j<nCards;j++)
            {
                sum += cArr[j].getVal();
            }
            
            hist[i] = sum;
        }

        Histogram h = new Histogram(hist);
        h.displayHist();

    }

} 