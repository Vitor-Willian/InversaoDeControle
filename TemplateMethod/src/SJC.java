public class SJC extends Cidade {
    
    public String getNome() {
        return "São José dos Campos";
    }
    public String getUnidade() {
        return "Celsius";
    }

    public double processarTemp(double temp) {
        return temp;
    }
    public double processarUmi(double umi) {
        if (umi < 30){
            return umi + 10;
        } else if (umi > 70){
            return umi - 10;
        } else {
            return umi;
        }
    }
    public double processarPH(double ph) {
        return ph;
    }
}