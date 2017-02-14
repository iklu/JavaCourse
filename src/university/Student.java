package university;

/**
 * Created by ovidiu on 10-Jan-17.
 */
public class Student extends AbstractPerson  {

    private String title;

    public String getTitle() {
        switch (getGender()){
            case F:
                return "ms.";
            case M:
                return  "mr.";
            default:
                throw new IllegalArgumentException("Gender "+ getGender() + "not suported");
        }
    }

}
