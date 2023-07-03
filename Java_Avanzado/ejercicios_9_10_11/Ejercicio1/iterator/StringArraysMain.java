package iterator;

public class StringArraysMain {
    public static void main(String[] args) {
        StringsMemory wordsMem = new StringsMemory();

        wordsMem.addNewWord("pablito");
        wordsMem.addNewWord("clavó");
        wordsMem.addNewWord("un");
        wordsMem.addNewWord("clavito");

        while (wordsMem.hasMore())
            System.out.println(wordsMem.next());

        wordsMem.next();
        wordsMem.next();
        wordsMem.next();

        StringsFileDisk wordsDisk = new StringsFileDisk();

        wordsDisk.addNewWord("Hola");
        wordsDisk.addNewWord("co ti va");
        wordsDisk.addNewWord("Mundo!");

        while (wordsDisk.hasMore())
            System.out.println(wordsDisk.next());

        wordsDisk.next();
    }
}
