package Jobs;

public class Degree {
    private String degree;
    private String specilization;

    public Degree(String degree, String Specilization) {
        this.degree = degree;
        this.specilization = Specilization;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecilization() {
        return specilization;
    }

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }

    @Override
    public String toString() {
        return "Required Degree: " + degree + "\nSpecilization: " + specilization;
    }

}
