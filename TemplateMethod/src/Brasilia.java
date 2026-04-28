public class Brasilia extends Cidade {
    
    public String getNome() {
        return "Brasilia";
    }
    public String getUnidade() {
        return "Kelvin";
    }

    public double processarTemp(double temp) {
        return temp + 273.15;
    }
    public double processarUmi(double umi) {
        return umi;
    }
    public double processarPH(double ph) {
        return ph;
    }

}
    
