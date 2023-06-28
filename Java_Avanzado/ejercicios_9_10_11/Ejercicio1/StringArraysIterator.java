public class StringArraysIterator {
    public static void main(String[] args) {
//        StringsMemory words = new StringsMemory();
//
//        words.addNewWord("pablito");
//        words.addNewWord("clavó");
//        words.addNewWord("un");
//        words.addNewWord("clavito");
//
//        while (words.hasMore())
//            System.out.println(words.next());

        StringsFileDisk words = new StringsFileDisk();

        words.addNewWord("Hola");
        words.addNewWord(" ");
        words.addNewWord("Mundo!");

    }
}
