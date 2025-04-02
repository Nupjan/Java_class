package MainProject;

public class DomesticStudent extends Student {
    private String stateOfResidence;

    public DomesticStudent(String studentID, String name, double gpa, String stateOfResidence) {
        super(studentID, name, gpa);
        this.stateOfResidence = stateOfResidence;
    }

    public String getStateOfResidence() {
        return stateOfResidence;
    }

    public void setStateOfResidence(String stateOfResidence) {
        this.stateOfResidence = stateOfResidence;
    }

    @Override
    public String toString() {
        return super.toString() + ", State of Residence: " + stateOfResidence;
    }
}