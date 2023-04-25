package Jobs;

public class Engineer extends Job {
    
    private String company;
    private Degree degree;
    private String field;

    public Engineer(String company, Degree degree, String field) {
        this.company = company;
        this.degree = degree;
        this.field = field;
    }

    public Engineer(String title, Degree degree, String field, String company, double salary) {
        super(title, salary);
        this.company = company;
        this.degree = degree;
        this.field = field;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
        return "Engineer's Job\nCompany: " + company + "\nDegree: " + degree + "\nField: " + field + "\n";
    }
}
