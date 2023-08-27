GFG
  Reverse a String


    class Reverse
{
    public static String reverseWord(String str)
    {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right)
        {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }

        return new String(charArray);
    }
}
