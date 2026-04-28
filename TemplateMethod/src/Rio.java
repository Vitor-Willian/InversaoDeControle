public class Rio extends Cidade {
    
    public String getNome() {
        return "Rio de Janeiro";
    }
    public String getUnidade() {
        return "Celsius";
    }

    public double processarTemp(double temp) {
        return temp;
    }
    public double processarUmi(double umi) {
        return umi;
    }
    public double processarPH(double ph) {
        return ph;
    }

}