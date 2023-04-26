package Main;

import Jobs.Degree;
import Jobs.Job;
import java.util.ArrayList;

public class Employer extends Person {

    private Degree reqDegree;
    private int reqExperience;
    private Job joob;
    private static ArrayList <Employer> employers = new ArrayList();
    private int reqdegreeind;

    public Employer(String name, int age, char gender, Degree reqDegree, int ReqExperience, Job joob, int ind) {
        super(name, age, gender);
        this.reqDegree = reqDegree;
        this.reqExperience = ReqExperience;
        this.joob = joob;
        this.reqdegreeind = ind;
        employers.add(this);
    }

    public static ArrayList<Employer> getEmployers() {
        return employers;
    }

    public Job getJoob() {
        return joob;
    }

    public void setJoob(Job joob) {
        this.joob = joob;
    }

    public int getReqdegreeind() {
        return reqdegreeind;
    }

    public void setReqdegreeind(int reqdegreeind) {
        this.reqdegreeind = reqdegreeind;
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
        return super.toString() +  reqDegree + "\nRequired years of experience: " + reqExperience
                +  joob.toString();
    }

}
