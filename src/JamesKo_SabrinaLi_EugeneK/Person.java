package JamesKo_SabrinaLi_EugeneK;

public class Person {
    private String firstNames, familyNames;

    public Person(String firstNames, String familyName) {
        this.firstNames = firstNames;
        this.familyNames = familyName;
    }

    public String getFirstName() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getFamilyName() {
        return familyNames;
    }

    public void setFamilyNames(String familyNames) {
        this.familyNames = familyNames;
    }

    public boolean equals(Person person) {
        if (this.firstNames.equals(person.getFirstName()) &&
                this.familyNames.equals(person.getFamilyName())) {
            return true;
        } else return false;
    }
}
