/**
 * Created by ovidiu on 05.12.2016.
 */
public class ShowProperties {
    public static void main(String[] args) {

        System.getProperties().list(System.out);

        System.out.println(System.getProperty("user.name"));

        System.out.println(
                System.getProperty("java.library.path")
        );
    }
}
