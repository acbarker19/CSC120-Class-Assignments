package Lab9a;


import java.awt.*;
import java.applet.Applet;

public class Student {

    private String name, dorm;
    private Integer classCode;
    private Boolean isAthlete;
    private Double gpa;

	
	
	
    public Student(String name, String dorm, Integer classCode,
                   Boolean isAthlete, Double gpa) {
				   
        setName(name);
        setDorm(dorm);
        setClassCode(classCode);
        setIsAthlete(isAthlete);
        setGpa(gpa);
    } // end of constructor

    public String getName() { return name; }
    public String getDorm() { return dorm; }
    public Integer getClassCode() { return classCode; }
    public Boolean getIsAthlete() { return isAthlete; }
    public Double getGpa() { return gpa; }

    public void setName(String n) {
        if (n.length() == 0) {
            n = "unknown name";
        } 
        name = n;
    } // end of setName()

    public void setDorm(String d) {
        if (d.length() == 0) {
            d = "unknown dorm";
        }
        dorm = d;
    } // end of setDorm()

    public void setClassCode(Integer cc) {
        if ( (cc < 1) || (cc > 4) ) {
            cc = 1;
        } 
        classCode = cc;
    } // end of setClassCode()

    public void setIsAthlete(Boolean ath) {
        isAthlete = ath;
    } // end of setIsAthlete()

    public void setGpa(Double g) {
        if ( (g < 0.0) || (g > 4.0) ) {
            g = 0.0;
        } 
        gpa = g;
    } // end of setGPA()

    public String toString() {
        String answer;

        // dorm
        answer = name + ", " + dorm + ", ";

        // class
        if (classCode == 1) {
            answer = answer + "Freshman, ";
        }
        else if (classCode == 2) {
            answer = answer + "Sophomore, ";
        }
        else if (classCode == 3) {
            answer = answer + "Junior, ";
        }
        else if (classCode == 4) {
            answer = answer + "Senior, ";
        }
        else {
            answer = answer + "Unknown Status, ";
        }

        // athlete
        if (isAthlete == false) {
            answer = answer + "Non-";
        }
        answer = answer + "Athlete, " + gpa;

        return answer;
    } // end of toString()

} // end of class Student
