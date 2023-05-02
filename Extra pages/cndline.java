import java.util.Arrays;
public class cndline {
    public static void main(String[] args) {
        int notprimecount = 0;
        for (int i = 0; i < args.length; i++) {
            int a = Integer.parseInt(args[i]);
                for(int j=2;j<a/2;j++){

                    if(a%j == 0){
                        notprimecount++;
                        break;
                    }
                }
            }
            System.out.print(args.length-notprimecount);
        }
    }
