public class Circulo {

    private double Radio;
    private double Area;


    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getArea() {
        Area= Radio*Radio*Math.PI;
        return Area;
    }

    public Circulo (double Radio){
        this.Radio=Radio;

    }

    @Override
    public String toString() {
        return "Circulo {" +
                " Radio= " + getRadio() +
                ", Area= " + Area +
                '}';
    }
}
