public class StringTest {



    public static int calculate(String number)
    {
         int sum = 0 ;
        if (number==null)
             throw new NumberFormatException() ;
        else
        {
            if (number=="-")
                 throw  new NegativeArraySizeException();

            else
             {
                String[] numbers = number.split(",");

                for (int i = 0 ; i<numbers.length ; i++)
                {
                     sum += Integer.parseInt(numbers[i]);

                }

            }

        }

         return  sum ;

    }


}


