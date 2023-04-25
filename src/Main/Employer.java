package Main;

import Jobs.Degree;

public class Employer extends Person {

    private Degree reqDegree;
    private int reqExperience;

    public Employer(String name, int age, char gender, Degree reqDegree, int ReqExperience) {
        super(name, age, gender);
        this.reqDegree = reqDegree;
        this.reqExperience = (reqExperience >= 0)? reqExperience : 0;
    }

    public Degree getReqDegree() {
        return reqDegree;
    }

    public void setReqDegree(Degree reqDegree) {
        this.reqDegree = reqDegree;
    }

    public int getReqexperience() {
        return reqExperience;
    }

    public void setReqexperience(int reqExperience) {
        this.reqExperience = (reqExperience >= 0)? reqExperience : 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Required Degree: " + reqDegree + "\nRequired years of experience: " + reqExperience + "\n";
    }

}
