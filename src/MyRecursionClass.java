public class MyRecursionClass
{
    public static void main(String [] args)
    {
        counting(3);
    }//end of main method

    public static void counting(int num)
    {
        if(num > 0)
        {
            counting(num-1); //this is the recursive call
        }//end if to get to base case
        switch(num)
        {
            case 1: //enacts when num contains one
                System.out.println("one");
                break;
            case 2: //enacts when num == 2
                System.out.println("two");
                break;
            case 3: //enacts when num == 3
                System.out.println("three");
                break;
        }
    }//end of counting
}//end of myRecursionClass
