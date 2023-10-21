/**
 *
 * @author user
 */
public class IntArray {
    
    public static void main (String[] args)
    {
        int [] ArrayExample = {1, 2, 3, 4, 5};
        int [] ArrayExample2 = {5, 4 ,3 ,2, 1};

   System.out.println("The first number to last: ");
        for (int x=0; x<5; ++x)
        {
        System.out.println(ArrayExample[x]);
        }
        
        System.out.println("The last number to first: ");
        for (int y=0; y<5; ++y)
        {
        System.out.println(ArrayExample2[y]);
        }
    }
}