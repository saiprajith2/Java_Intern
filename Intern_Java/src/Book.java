public class Book {
    private int noOfCopies;

    public void setNoOfCopies(int noOfCopies){
        if(noOfCopies>0) {
            this.noOfCopies = noOfCopies;
        }
    }
    public int getNoOfCopies(){
        return this.noOfCopies;
    }
    public void increaseNoOfCopies(int howMuch){
        setNoOfCopies(noOfCopies+howMuch);
    }
    public void decreaseNoOfCopies(int howMuch){
        setNoOfCopies(noOfCopies-howMuch);
    }
}
