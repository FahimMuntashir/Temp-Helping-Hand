public class FaceToFaceCourses extends Course{
    private int roomNumber;
    private String participantQuota;

    double feePerHours;
    double mealFee;

    public FaceToFaceCourses(){

    }
    public FaceToFaceCourses(String courseName, String courseCode, double totalHours, double feePerHours, double mealFee) {
        super(courseName, courseCode, totalHours);
        this.feePerHours = feePerHours;
        this.mealFee = mealFee;
    }

    public FaceToFaceCourses(String courseName, String courseCode, double totalHours) {
        super(courseName, courseCode, totalHours);

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getParticipantQuota() {
        return participantQuota;
    }

    public void setParticipantQuota(String participantQuota) {
        this.participantQuota = participantQuota;
    }
    public double  facetoFaceFee() {
        return (feePerHours*this.getTotalHours())+mealFee;
    }
    @Override
    double TotalFee() {
        return this.getTotalHours()*this.TotalFee();
    }
}
