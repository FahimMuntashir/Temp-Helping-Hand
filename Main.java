import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Online course details: ");
        System.out.print("Name: ");

        OnlineCourses onlineCourses = new OnlineCourses();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        onlineCourses.setCourseName(name);

        System.out.print("Code: ");
        String code = sc.nextLine();
        onlineCourses.setCourseCode(code);

        System.out.print("Total hours: ");
        double hours = sc.nextDouble();
        onlineCourses.setTotalHours(hours);

        System.out.print("Password: ");
        String pass = sc.nextLine();
        onlineCourses.setCoursePass(pass);


        FaceToFaceCourses faceToFaceCourses = new FaceToFaceCourses();
        System.out.print("What is the room number: ");
        int roomN = sc.nextInt();
        faceToFaceCourses.setRoomNumber(roomN);

        System.out.print("What is the Participant Quota: ");
        String parQ = sc.nextLine();
        faceToFaceCourses.setParticipantQuota(parQ);


//        System.out.println("Face to face course details");


        // print part:

        System.out.print("Online course details\nName: " + onlineCourses.getCourseName() + "\nCode: " + onlineCourses.getCourseCode() + "\nTotal Hours: " + onlineCourses.getTotalHours() + "\nPassword: " + onlineCourses.getCoursePass() + "\nFee: " + onlineCourses.feePerHours);


    }
}
