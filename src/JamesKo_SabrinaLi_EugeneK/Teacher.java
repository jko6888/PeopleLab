package JamesKo_SabrinaLi_EugeneK;

public class Teacher extends Person {

    private String subject;
    private String title;

    private String teacherFirst = firstNames[(int)((Math.random() * (firstNames.length)))];
    private String teacherLast = firstNames[(int)((Math.random() * (familyNames.length)))];

    public Teacher(String subject, String title, String teacherFirst, String teacherLast) {
        super(teacherFirst,teacherLast);
        this.subject = subject;
        this.title = title;

    }

    public String getSubject() {
        return subject;
    }


}
