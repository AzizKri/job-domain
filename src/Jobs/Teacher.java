package Jobs;

public class Teacher extends Job {

    private String school;
    private Degree degree;
    private String field;

    public Teacher(String school, Degree degree, String field) {
        this.school = school;
        this.degree = degree;
        this.field = field;
    }

    public Teacher(String title, Degree degree, String field, String school, double salary) {
        super(title, salary);
        this.school = school;
        this.degree = degree;
        this.field = field;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Teacher Job:\nSchool: " + school + "\nDegree: " + degree + "\nField: " + field + "\n";
    }
}
