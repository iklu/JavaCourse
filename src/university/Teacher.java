package university;

/**
 * Created by ovidiu on 10-Jan-17.
 */
public class Teacher extends AbstractPerson {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
