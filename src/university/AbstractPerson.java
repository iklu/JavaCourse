package university;

/**
 * Implements Comparable
 * Created by ovidiu on 10-Jan-17.
 */
public abstract class AbstractPerson implements PersonInterface, Comparable<AbstractPerson> {

    private String title;
    private Gender gender;
    private String cnp;
    private int age;
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(AbstractPerson o) {
        if(age > o.age) return 1;
        if(age < o.age) return -1;
        return 0;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPerson)) return false;

        AbstractPerson that = (AbstractPerson) o;

        if (gender != that.gender) return false;
        if (age != that.age) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (cnp != null ? !cnp.equals(that.cnp) : that.cnp != null) return false;
        return nickname != null ? nickname.equals(that.nickname) : that.nickname == null;
    }

//    @Override
//    public int hashCode() {
//        int result = title.hashCode();
//        result = 31 * result + gender.hashCode();
//        result = 31 * result + cnp.hashCode();
//        result = 31 * result + age;
//        result = 31 * result + nickname.hashCode();
//        return result;
//    }
}
