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
}
