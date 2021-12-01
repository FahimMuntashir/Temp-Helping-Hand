public class OnlineCourses extends Course{

    String coursePass;
    double feePerHours;

    public OnlineCourses() {

    }

    public OnlineCourses(String courseName, String courseCode, double totalHours, String coursePass, double feePerHours) {
        super(courseName, courseCode, totalHours);
        this.coursePass = coursePass;
        this.feePerHours = feePerHours;
    }

    @Override
    double TotalFee() {
        return feePerHours*getTotalHours();
    }

    public String getCoursePass() {
        return coursePass;
    }

    public void setCoursePass(String coursePass) {
        this.coursePass = coursePass;
    }

    public double getFeePerHours() {
        return feePerHours;
    }

    public void setFeePerHours(double feePerHours) {
        this.feePerHours = feePerHours;
    }
}
