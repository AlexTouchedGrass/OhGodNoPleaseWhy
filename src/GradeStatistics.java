import java.util.HashMap;

public class GradeStatistics {
    public static void main(String[] args) {
        int low = 100;
        String lowClass = "";
        String highClass = "";
        int high = 0;
        int avg = 0;

        // Import the HashMap class
        // Create a HashMap object called grade
        HashMap<String, Integer> grade = new HashMap<String, Integer>();
        grade.put("AP CSP", 74);
        grade.put("AP Lit & Comp", 74);
        grade.put("Comp Prog I", 77);
        grade.put("Health", 89);
        grade.put("Physics", 90);
        grade.put("Pre Calc", 80);
        grade.put("Weightlifting", 78);

        //Code
        //Lowest
        for (String grades : grade.keySet()) {
            if (grade.get(grades) < low) {
                low = grade.get(grades);
                lowClass = grades;
            }
        }

        //Highest
        for (String grades : grade.keySet()) {
            if (grade.get(grades) > high) {
                high = grade.get(grades);
                highClass = grades;
            }
        }

        //Average
        for (String grades : grade.keySet()) {
            int temp = grade.get(grades);
            avg += temp;
        }

        avg = avg / grade.size();

        System.out.println("Grades by Subject: ");
        System.out.printf("\nAP CSP" + "%19s", grade.get("AP CSP")); //this first \n adds a buffer space
        System.out.printf("\nAP Lit & Comp " + "%11s", grade.get("AP Lit & Comp"));
        System.out.printf("\nComp Prog I" + "%14s", grade.get("Comp Prog I"));
        System.out.printf("\nHealth" + "%19s", grade.get("Health"));
        System.out.printf("\nPre Calc" + "%17s", grade.get("Pre Calc"));
        System.out.printf("\nWeightlifting" + "%12s", grade.get("Weightlifting"));
        System.out.println(); //Buffer
        System.out.printf("\nNumber of Classes" + "%8s", grade.size());

        System.out.println(); //Buffer
        System.out.println("\nLowest Grade");
        System.out.println("Subject: " + lowClass);
        System.out.println("Grade: " + low);

        System.out.println("\nHighest Grade");
        System.out.println("Subject: " + high);
        System.out.println("Grade: " + grade.get(high));

        System.out.println("\nOverall Average: " + avg);
    }
}