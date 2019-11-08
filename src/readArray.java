public class readArray
{
    private int[] numbers;
    public readArray(int[] numbers)
    {
        this.numbers = numbers;
    }
    public String getArray()
    {
        String output = "";
        for (int count = 0; count < numbers.length; count++)
        {
            output += numbers[count] + " ";
        }
        return output;
    }
}