package Main;

import Jobs.Degree;

public class Applicant extends Person {

    private int experience;
    private Degree degree;

    public Applicant(String name, int age, char gender, Degree Degree, int experience) {
        super(name, age, gender);
        this.degree = Degree;
        this.experience = (experience >= 0)? experience : 0;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = (experience >= 0)? experience : 0;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return super.toString() + "Years of experience: " + experience + "\nHighest Degree: " + degree + "\n";
    }

}
