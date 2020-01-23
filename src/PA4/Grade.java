package PA4;

/** CSC 120
 * PA 4
 *
 * Alec Barker
 * 10/25/17
 */
public class Grade {
    private String name;
    private Integer exam1, exam2, exam3, homework;
    
    private Integer finalGrade;
    
    private Double exam1Per;
    private Double exam2Per;
    private Double exam3Per;
    private Double homeworkPer;
    
    private Double finalGradePer;
    
    public Grade(String n, Integer e1, Integer e2, Integer e3, Integer hw){
        name = n;
        exam1 = e1;
        exam2 = e2;
        exam3 = e3;
        homework = hw;
        
        finalGrade = exam1 + exam2 + exam3 + homework;
        
        exam1Per = (exam1 / 100.0) * 100;
        exam2Per = (exam2 / 125.0) * 100;
        exam3Per = (exam3 / 130.0) * 100;
        homeworkPer = (homework / 50.0) * 100;
        
        finalGradePer = (finalGrade / 405.0) * 100;
    }
    
    public String toString(){
        String msg = "Name: " + name + "\n     Exam 1: " + exam1 + "/100 (" + exam1Per + " %)\n     Exam 2: " +
                exam2 + "/125 (" + exam2Per + " %)\n     Exam 3: " + exam3 + "/130 (" + exam3Per + " %)\n     Homework: " 
                + homework + "/50 (" + homeworkPer + " %)\n     Final Grade: " + finalGrade + "/405 (" + finalGradePer + " %)\n";
        return msg;
    }
    
    public String getName(){
        return name;
    }
    
    public Integer getExam1(){
        return exam1;
    }
    
    public Integer getExam2(){
        return exam2;
    }
    
    public Integer getExam3(){
        return exam3;
    }
    
    public Integer getHomework(){
        return homework;
    }
    
    public Integer getFinalGrade(){
        return finalGrade;
    }
    
    
    public Double getExam1Per(){
        return exam1Per;
    }
    
    public Double getExam2Per(){
        return exam2Per;
    }
    
    public Double getExam3Per(){
        return exam3Per;
    }
    
    public Double getHomeworkPer(){
        return homeworkPer;
    }
    
    public Double getFinalGradePer(){
        return finalGradePer;
    }
}
