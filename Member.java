import java.util.Date;

public class Member {
    private int memberID;
    private String LastName;
    private String firstName;
    private int handicap;
    private char gender;
    private String team;
    private String memberType;
    private int coach;
    private long phone;
    private Date joinDate;

    // Constructor
    public Member(int memberID, String lastName, String firstName, int handicap, char gender, String team,
                  String memberType, int coach, long phone, Date joinDate) {
        this.memberID = memberID;
        this.LastName = lastName;
        this.firstName = firstName;
        this.handicap = handicap;
        this.gender = gender;
        this.team = team;
        this.memberType = memberType;
        this.coach = coach;
        this.phone = phone;
        this.joinDate = joinDate;
    }

    // Display method to print member details
    public void display() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Last Name: " + LastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Handicap: " + handicap);
        System.out.println("Gender: " + gender);
        System.out.println("Team: " + team);
        System.out.println("Member Type: " + memberType);
        System.out.println("Coach: " + coach);
        System.out.println("Phone: " + phone);
        System.out.println("Join Date: " + joinDate);
        System.out.println();
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {
        // Create an array of Member objects
        Member[] members = new Member[3];

        // Sample member details
        Date joinDate1 = new Date(121, 3, 1); // Note: Year is offset by 1900
        Date joinDate2 = new Date(122, 4, 15);
        Date joinDate3 = new Date(123, 7, 20);

        // Initialize Member objects and add them to the array
        members[0] = new Member(1, "Doe", "John", 10, 'M', "Team A", "Regular", 0, 1234567890, joinDate1);
        members[1] = new Member(2, "Smith", "Alice", 15, 'F', "Team B", "Regular", 0, 9876543210L, joinDate2);
        members[2] = new Member(3, "Johnson", "Robert", 8, 'M', "Team C", "Regular", 0, 5554443333L, joinDate3);

        // Display member details
        for (Member member : members) {
            member.display();
        }
    }
}
