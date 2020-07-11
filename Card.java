public class Card
{
    int suit;
    int rank;

    Card(int suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString()
    {
        return "Card S" + this.suit + "R" + this.rank + " ";
    }
    public int getVal()
    {
        return suit*rank;
    }
}
