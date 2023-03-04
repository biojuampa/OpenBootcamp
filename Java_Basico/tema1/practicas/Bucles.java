public class Bucles {
    public static void main (String[] args) {
        int count = 0;
        int num;
        while (count < 3) {
            count++;
            System.out.println("--- n" + count + " ---");
            if (args.length > 0)
                num = Integer.valueOf(args[0]);
            else
                num = 3;
                
            for (int i=0; i<=num; i++)
                System.out.println(i);            
            
        }
            
        System.out.println("----------");

    }
}

