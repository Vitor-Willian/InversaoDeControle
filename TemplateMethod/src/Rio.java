public class Rio implements Observer {
    
    @Override
    public void updateTemp(Subject s) {
        double temperatura = ((PCD) s).getTemperatura();
        System.out.println("Dados atualizados Rio");
        System.out.println("Temperatura: " + temperatura);

    }

    @Override
    public void updateUmi(Subject s) {
        double umidade = ((PCD) s).getUmidade();
        System.out.println("Dados atualizados Rio");
        System.out.println("Umidade: " + umidade);
    }

    @Override
    public void updatePH(Subject s) {
        double ph = ((PCD) s).getPh();
        System.out.println("Dados atualizados Rio");
        System.out.println("pH: " + ph);
      
    }
}