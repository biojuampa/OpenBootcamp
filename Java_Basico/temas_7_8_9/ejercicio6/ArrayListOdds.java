import java.util.ArrayList;


public class ArrayListOdds {
    public static void main(String[] args) {
    
        ArrayList<Integer> odds = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            odds.add(i);
        }
        
        // No creo que  manipular el índice sea una practica  recomendable,  por lo tanto
        // utilizo un offset para desplazar  el índice cada vez  que se borra un elemento.
        // Un agoritmo sin desplazar el índice en este caso  funcionaría, pero si hubiese
        // dos números pares seguidos, fallaría, ya que siempre que borra pierde un valor.
        int offset = 0;
        for (int i = 0; i < odds.size() + offset; i++) {
            int index = i - offset;
            int num = odds.get(index);
            if (num%2 == 0) {
                odds.remove(index);
                offset++;
                //i--;
            } else
                System.out.print(" " + num);
        }
        System.out.println();
    }
}

