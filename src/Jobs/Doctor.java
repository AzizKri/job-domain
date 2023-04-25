package Jobs;

public class Doctor extends Job {

    private String hospital;
    private Degree degree;
    private String field;

    public Doctor(String hospital, Degree degree, String field) {
        this.hospital = hospital;
        this.degree = degree;
        this.field = field;
    }

    public Doctor(String title, Degree degree, String field, String hospital, double salary) {
        super(title, salary);
        this.hospital = hospital;
        this.degree = degree;
        this.field = field;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
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
        return "Doctor Job:\nHospital: " + hospital + "\nDegree: " + degree + "\nField: " + field + "\n";
    }
}
