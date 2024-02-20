package assignments.exception;

public class Voter {

    public void setAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above to vote");
        }

    }
    public void castVote() {
        System.out.println("Vote cast successfully!");
    }
}
