package assignments.exception;

public class MainVoter {
    public static void main(String[] args) {
        Voter vote = new Voter();
        try{
            vote.setAge(20);
            vote.castVote();
        }catch (Exception e){
            System.out.println("Error : "+ e.getMessage());
        }
    }

}
