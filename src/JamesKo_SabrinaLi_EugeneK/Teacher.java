public class Teachers extends Person
{
  private string subject;
  private string title;
  
  public Teacher(String subject, String title, String firstName, String familyName)
    {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }

    public String getSubject()
    {
        return subject;
    }

    public String toString()
    {
        return title + ". " + getFamilyName();
    }

}
    
