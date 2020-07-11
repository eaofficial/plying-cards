import java.util.*;
public class Histogram
{
    int n = 100000;
    int hArr[] = new int[n];
    int min, max;
    Histogram(int[] arr)
    {
        //hArr = new int[n];
        hArr = arr.clone();
        Arrays.sort(hArr);
        min = hArr[0];
        max = hArr[n-1];
        System.out.println("min max = " + min + " " + max);
    }

    public void displayHist()
    {
        for(int i=0;i<n/100;i++)
        {
            System.out.println(i+1 + ":       " + toHist(hArr[i]));
        }
    }
    public String toHist(int x)
    {
        int stars = Math.round(x/min);
        String str = "";
        for(int i=0;i<stars;i++)
        {
            str += "*";
            //str.concat("*");
        }
        return str;
    }

    
}
