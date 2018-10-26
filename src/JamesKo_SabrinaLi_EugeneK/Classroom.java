package JamesKo_SabrinaLi_EugeneK;

public class Classroom {

    private Student[] students;
    private Teacher teacher;
    Student[][] seatingChart = new Student[6][6];

    public Classroom(Teacher teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
        fillSeats();
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public Student[] getStudents() {
        return students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }


    public void fillSeats(){
        int pos = 0;
        for(Student[] var : seatingChart){
            if(var ==  null){
                break;
            }
            for(int i = 0; i < var.length; i++){
                if(pos>=students.length){
                    break;
                }
                var[i] = students[pos];
                pos++;
            }
        }
    }

    public String getSubject() {
        return this.teacher.getSubject();
    }

    public double classAverage(){
        double classAverage = 0;
        for (Student student : this.students){
            classAverage += student.getGPA();
        }
        return classAverage/this.students.length;
    }

    public String toString(){
        String result = "";
        for(Student[] var : seatingChart){
            if(var != null){
                for(int i = 0; i <var.length;i++){
                    if(var[i]!=null){
                        result += var[i].getFirstName() + " ";
                    }
                }
            }
            result += System.lineSeparator();
        }
        return this.teacher.toString() + " teaches " + this.teacher.getSubject() + System.lineSeparator() + "Students in his class:" + System.lineSeparator() + result;
    }
}