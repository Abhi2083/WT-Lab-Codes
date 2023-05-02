//Q1.Write a java program to remove "good night" from input string "bye bye good night see you".


public class StringRemoval {
    public static void main(String[] args) {
        String input = "Bye Bye good night see you";
        String target = "good night";
        String output = removeSubstring(input,target);
		 System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String removeSubstring(String input, String target) {
        int index = input.indexOf(target);
        if (index != -1) {
            String prefix = input.substring(0, index);
            String suffix = input.substring(index + target.length());
            return prefix + suffix;
        }
        return input;
    }
}
					