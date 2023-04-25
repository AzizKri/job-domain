package Main;

import Jobs.Degree;
import Jobs.Job;

public class Employer extends Person {

    private Degree reqDegree;
    private int reqExperience;
    private Job joob;

    public Employer(String name, int age, char gender, Degree reqDegree, int ReqExperience, Job joob) {
        super(name, age, gender);
        this.reqDegree = reqDegree;
        this.reqExperience = (reqExperience >= 0)? reqExperience : 0;
        this.joob = joob;
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
