public class App {
    public static void main(String[] args) throws Exception {
        PCD pcd1 = new PCD();
        PCD pcd2 = new PCD();
        PCD pcd3 = new PCD();

        pcd1.addObserver(new Brasilia());
        pcd1.addObserver(new SJC());
        pcd2.addObserver(new SP());
        pcd2.addObserver(new SJC());
        pcd3.addObserver(new Rio());
        pcd3.addObserver(new Brasilia());

        pcd1.setUmidade(20.0);
        System.out.println("\n");
        pcd2.setTemperatura(25.0);
        System.out.println("\n");
        pcd3.setTemperatura(28.0);
        pcd3.setPh(7.0);
    }
}