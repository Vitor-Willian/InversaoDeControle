public class PCD extends Subject {
  
    private double temperatura;
    private double umidade;
    private double ph;

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notifyObserversTemp();
    }
    
    public double getTemperatura() {
        return temperatura;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
        notifyObserversUmi();
    }

    public double getUmidade() {
        return umidade;
    }

    public void setPh(double ph) {
        this.ph = ph;
        notifyObserversPH();
    }

    public double getPh() {
        return ph;
    }

}