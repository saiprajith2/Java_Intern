public class BookRunner {
    public static void main(String[] args) {
        Book artOfProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfProgramming.setNoOfCopies(30);
        effectiveJava.setNoOfCopies(23);
        cleanCode.setNoOfCopies(55);

        artOfProgramming.increaseNoOfCopies(50);
        effectiveJava.increaseNoOfCopies(50);

        artOfProgramming.decreaseNoOfCopies(20);
        cleanCode.decreaseNoOfCopies(20);

        System.out.println(artOfProgramming.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());
//        System.out.println(effectiveJava.noOfCopies=23);
//        System.out.println(cleanCode.noOfCopies=55);
    }
}
