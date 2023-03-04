public class BuclesSwitch {
    public static void main (String[] args) {
        int countWhile = 0;
        int topWhile = 3;
        int numberFor = 3;
        
        switch (args.length) {
            case 0:
                break;
            case 1:
                numberFor = Integer.valueOf(args[0]);
                break;
            default:
                numberFor = Integer.valueOf(args[0]);
                topWhile  = Integer.valueOf(args[1]);
        }
        
        while (countWhile < topWhile) {
            countWhile++;
            System.out.println("--- n" + countWhile + " ---");
            for (int i=1; i<=numberFor; i++)
                System.out.println(i);            
            
        }
            
        System.out.println("----------");

    }
}

