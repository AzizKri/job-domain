package Jobs;

public class Job {

    private String title;
    private double salary;

    public Job() {
        this.title = "None";
        this.salary = 0;
    }

    public Job(String title, double salary) {
        this.title = title;
        this.salary = (salary >= 0) ? salary : 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = (salary >= 0) ? salary : 0;
    }

    @Override
    public String toString() {
        return "Job title: " + title + "Salary: " + salary + "\n";
    }
}
