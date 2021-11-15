package javaapplication12;

import java.util.*;


/*
 * Name: Peanut Bichon
 * Student ID: C93939e
 */

public class CollegeEnrollmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // @TODO figure out how to make the invocation of our application work later
    }
    
}

class StudentADT{
    String studentFirstname;
    String studentLastname;
    String studentID;
    
}


class StudentList{
    ArrayList<StudentADT> StudentNames;
    
    // cohortID is the set of students in one program / term / group
    // cohortID encodes:  programName, Term {1,2,3,4}, group
    // sample cohort name: CSD_term3_group2
    String cohortID;
    

}
