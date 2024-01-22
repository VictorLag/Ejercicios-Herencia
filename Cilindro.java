public class Cilindro extends Circulo{

    private double Altura;


    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }


    public double Volumen(){
        return getArea() * getAltura();
    }



    public Cilindro(double Radio, double Altura) {

        super(Radio);
        if (Altura<0){
            Altura=0;
            this.Altura=Altura;
        }
        else {
            this.Altura=Altura;
        }
    }

    @Override
    public String toString() {
        return "Cilindro {" +
                " Altura= " + Altura +
                " Volumen= " + Volumen() +
                '}';
    }
}
