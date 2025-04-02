package MainProject;

public class InternationalStudent extends Student {
    private String countryOfOrigin;

    public InternationalStudent(String studentID, String name, double gpa, String countryOfOrigin) {
        super(studentID, name, gpa);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return super.toString() + ", Country of Origin: " + countryOfOrigin;
    }
}