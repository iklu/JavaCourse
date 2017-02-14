package OOP;

/**
 * Created by nina on 20.12.2016.
 */
public class Planet {

    public double radius;
    public double mass;
    public Planet next;

    public Planet(int radius ,int mass){
        this.radius = radius;
        this.mass = mass;
    }

    public void o(){

    }

    public String toString() {
        return "Planet{" +
                    "this=" + super.toString()+
                    "radius=" + radius +
                    ", mass=" + mass +
                    ", next=" + next +
                 "}";
    }

    final void printDensity(){
        return;
    }
}
