package model;

public class ContaDeAgua {
    public double valorDoConsumo;



    public double calcularConsumo(){

        if (this.valorDoConsumo>= 0 && this.valorDoConsumo<=0){
            return (this.valorDoConsumo * 0.69);
        }else if(this.valorDoConsumo>=11 && this.valorDoConsumo<=15){
            return (this.valorDoConsumo * 1.17);
        }else if (this.valorDoConsumo>=16 && this.valorDoConsumo<=25){
            return (this.valorDoConsumo * 1.48);
        }else if (this.valorDoConsumo>25){
            return (this.valorDoConsumo * 1.60);
        }else{
            return 0.0;
        }
    }

    public double calcularTarEsg(){
        return this.calcularConsumo() * 0.025;
    }

    public double calcularJurosTotal(){
        return this.calcularConsumo() + calcularTarEsg() + 5.00;
    }

}
