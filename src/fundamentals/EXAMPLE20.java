package fundamentals;

public class EXAMPLE20 {
	public static void main(String[] args) {
        int num,reversed = 0;
        num=Integer.parseInt(args[0]);
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}

