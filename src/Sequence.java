public class Sequence
{
    private int mMin = 0;
    private int mMax = 0;

    public Sequence(int min, int max)
    {
        //TODO: assign the arguments to the class member variables
        mMin =  min;
        mMax = max;
    }

    public int[] list()
    {
        //TODO: return array of the consecutive integers between the bounds (inclusive)
        // i.e. the first number is the min bound and the last number is the max bound

        int array[] = new int[mMax - mMin + 1];
        for (int i = 0; i< array.length; i++)
            array[i] = mMin + i;
        return array;
    }

    public int[] backwards()
    {
        //TODO: return array of the consecutive integers between bounds in descending order
        // i.e. the first number is the max bound and the last number is the min bound

        int array_b[] = new int[mMax - mMin + 1];
        for (int i = 0; i< array_b.length; i++)
            array_b[i] = mMax - i;
        return array_b;
    }

    public int[] evens()
    {
        //TODO: return array of only even integers in the sequence
        // the array should be the exact correct size containing only the even numbers
        
        return new int[0];
    }

    public int[] squares()
    {
        //TODO: return array of sequence integers squared
        // i.e. square each integer in the sequence

        int array_s[] = new int[mMax - mMin + 1];
        for (int i = 0; i< array_s.length; i++)
            array_s[i] = (int) Math.pow(mMin + i, 2);
        return array_s;
    }

    public int summation()
    {
        //TODO: return the summation of the sequence
        // i.e. add all the sequence integers together and return the result

        int sum = 0;
        int x = mMax - mMin + 1;
        for (int i = 0; i<x; i++)
            sum += mMin + i;
        return sum;
    }
}
