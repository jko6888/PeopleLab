package JamesKo_SabrinaLi_EugeneK;

public class Person {
    private String firstName, familyName;
    public String[] firstNames = {"Bob","Ernesto","Henry","Ben","Jennifer","Amy","Caroline","Justin","Greg","Nathan","Ivan"};
    public String[] familyNames = {"Wolf","Edwards","Gibbs","White","Brown","Li","Hughes","Brady","Rodriguez","Turner","Owen"};

    public Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }
-
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public boolean equals(Person person) {
        if (this.firstName.equals(person.getFirstName()) &&
                this.familyName.equals(person.getFamilyName())) {
            return true;
        } else return false;
    }
}
