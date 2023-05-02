import java.io.*;
import java.util.*;

public class BufferedReader1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = a + a;
        System.out.println(b);
    }
}
