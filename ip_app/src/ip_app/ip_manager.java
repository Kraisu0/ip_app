package ip_app;

public class ip_manager {

    public static int f_binary_change(int[] num, int value)
    {
        int num1 = num[0] % value;
        if(num1 < num[0]) {
            num[0] = num1;
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static int[] numeric_to_binary(int number)
    {
        int[] num = {number};
        int[] binary = new int[8];


        binary[0] = f_binary_change(num, 128);
        binary[1] = f_binary_change(num, 64);
        binary[2] = f_binary_change(num, 32);
        binary[3] = f_binary_change(num, 16);
        binary[4] = f_binary_change(num, 8);
        binary[5] = f_binary_change(num, 4);
        binary[6] = f_binary_change(num, 2);
        binary[7] = f_binary_change(num, 1);

        return binary;
    }

}
