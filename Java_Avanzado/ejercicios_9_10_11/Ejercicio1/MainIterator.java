import iterator.StringsFileDisk;
import iterator.StringsMemory;

public class MainIterator {
    public static void main(String[] args) {
        StringsMemory wordsMem = new StringsMemory();

        wordsMem.addNewWord("pablito");
        wordsMem.addNewWord("clavó");
        wordsMem.addNewWord("un");
        wordsMem.addNewWord("clavito");

        while (wordsMem.hasMore())
            System.out.println(wordsMem.next());

        // busco el fallo
        System.out.println(wordsMem.next());
        System.out.println(wordsMem.next());
        wordsMem.reset();
        System.out.println(wordsMem.next());

        System.out.println("-".repeat(30));

        StringsFileDisk wordsDisk = new StringsFileDisk();

        wordsDisk.addNewWord("Hola");
        wordsDisk.addNewWord("co ti va");
        wordsDisk.addNewWord("Mundo!");

        while (wordsDisk.hasMore())
            System.out.println(wordsDisk.next());

        // busco el fallo
        System.out.println(wordsDisk.next());
        System.out.println(wordsDisk.next());
        wordsDisk.reset();
        System.out.println(wordsDisk.next());
    }
}
