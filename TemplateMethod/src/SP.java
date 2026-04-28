public class SP extends Cidade {
    
    public String getNome() {
        return "São Paulo";
    }

    public String getUnidade() {
        return "Fahrenheit";
    }

    public double processarTemp(double temp) {
        return (temp * 9/5) + 32;
    }

    public double processarUmi(double umi) {
        return umi;
    }

    public double processarPH(double ph) {
        return ph;
    }

}