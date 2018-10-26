package JamesKo_SabrinaLi_EugeneK;

public class Runner {

    static String[] firstNames = {"Bob","Ernesto","Henry","Ben","Jennifer","Amy","Caroline","Justin","Greg","Nathan","Ivan"};
    static String[] familyNames = {"Wolf","Edwards","Gibbs","White","Brown","Li","Hughes","Brady","Rodriguez","Turner","Owen"};

    public static void main(String[] args)
    {
        Teacher teacher = new Teacher("English", "Mr", "Kevin", "Liu");
        Student[] students = new Student[33];

        for(int i =0; i<students.length;i++){
            students[i] = randomStudent();
        }
        Classroom classA = new Classroom(teacher, students);
        System.out.println(classA);
        System.out.println("The class average is " + classA.classAverage());
    }

    public static Student randomStudent(){
        int randomStudent = (int) (Math.random() * firstNames.length);
        int age = (int) (Math.random()*4)+14;
        int GPA = (int) (Math.random()*100+1);
        return new Student(familyNames[randomStudent],firstNames[randomStudent],age,"Brooklyn Technical High School",GPA);

    }

}
