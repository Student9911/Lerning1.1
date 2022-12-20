package LR4.Example8;

public class Caesar {
    static String encryptText;
    public static String encrypt(String enText, int key)
    {
        char[] ArrayText = enText.toCharArray();
        int[] CharCode = new int[ArrayText.length];
        for (int i = 0; i < ArrayText.length; i++)
        {
            CharCode[i] = ArrayText[i];
            CharCode[i] = CharCode[i] + key;
        }
        for (int i = 0; i < ArrayText.length; i++)
        {
            ArrayText[i] = (char) CharCode[i];
        }
        encryptText = new String(ArrayText);
        return encryptText;
    }

    public static String decrypt(String enText, int key)
    {
        char[] ArrayText = enText.toCharArray();
        int[] CharCode = new int[ArrayText.length];
        for (int i = 0; i < ArrayText.length; i++)
        {
            CharCode[i] = ArrayText[i];
            CharCode[i] = CharCode[i] - key;
        }
        for (int i = 0; i < ArrayText.length; i++)
        {
            ArrayText[i] = (char) CharCode[i];
        }
        encryptText = new String(ArrayText);
        return encryptText;
    }
}

