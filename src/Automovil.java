public class Automovil {
    //Atributos
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

    //Funciones
    public String verDetalle(){
        return "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "el auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + modelo + " frenado!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
}
