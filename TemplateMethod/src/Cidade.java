public abstract class Cidade implements Observer {
    protected abstract String getNome();
    protected abstract String getUnidade();
    protected abstract double processarTemp(double temp);
    protected abstract double processarUmi(double umi);
    protected abstract double processarPH(double ph);

    @Override
    public void updateTemp(Subject s) {
        double temperatura = ((PCD) s).getTemperatura();
        System.out.println("Dados atualizados " + getNome());
        System.out.println("Temperatura: " + processarTemp(temperatura) + " " + getUnidade());
    }

    @Override
    public void updateUmi(Subject s) {
        double umidade = ((PCD) s).getUmidade();
        System.out.println("Dados atualizados " + getNome());
        System.out.println("Umidade: " + processarUmi(umidade) + "%");
    }

    @Override
    public void updatePH(Subject s) {
        double ph = ((PCD) s).getPh();
        System.out.println("Dados atualizados " + getNome());
        System.out.println("pH: " + processarPH(ph));
    }

    
}
