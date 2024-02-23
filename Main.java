import CIE.Internals;
import SEE.External;

public class Main {
    public static void main(String[] args) {
        int n = 3;  // Assuming 3 students for demonstration

        // Creating objects for Internals and External classes
        Internals[] internalsArray = new Internals[n];
        External[] externalArray = new External[n];

        // Initializing data for demonstration
        for (int i = 0; i < n; i++) {
            internalsArray[i] = new Internals();
            internalsArray[i].usn = "USN" + (i + 1);
            internalsArray[i].name = "Student" + (i + 1);
            internalsArray[i].sem = 5;
            // Assigning some random internal marks for demonstration
            for (int j = 0; j < 5; j++) {
                internalsArray[i].internalMarks[j] = 40 + i * 5 + j;
            }

            externalArray[i] = new External();
            externalArray[i].usn = "USN" + (i + 1);
            externalArray[i].name = "Student" + (i + 1);
            externalArray[i].sem = 5;
            // Assigning some random SEE marks for demonstration
            for (int j = 0; j < 5; j++) {
                externalArray[i].seeMarks[j] = 50 + i * 5 + j;
            }
        }

        // Displaying final marks
        System.out.println("Final Marks of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("USN: " + internalsArray[i].usn);
            System.out.println("Name: " + internalsArray[i].name);
            System.out.println("Semester: " + internalsArray[i].sem);
            System.out.println("Internal Marks: " + arrayToString(internalsArray[i].internalMarks));
            System.out.println("SEE Marks: " + arrayToString(externalArray[i].seeMarks));
            System.out.println();
        }
    }

    // Helper method to convert an array to string for printing
    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}