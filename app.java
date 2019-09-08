
public class app {

    public static void main(String[] args) {

        //create 1 student-athelete object
        //FirstName, LastName, Age, Hometown, StudentID, Major, GPA(randomized), Sport, SportRanking(randomized)
        studentAthlete stA1 = new studentAthlete("Satoshi", "Nakamoto", 35, "Osaka", 9675309, "Computer Science", 4.0, "Soccer", 100);

        //displays the complete information about the student-athlete object
        System.out.println(stA1.getInfo());

    }

}
