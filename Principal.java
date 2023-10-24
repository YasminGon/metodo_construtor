public class Principal {
    public static void main(String[] args){

        Carro car = new Carro();
        Carro carAro = new Carro(18);
        Carro carDoisConstrutores = new Carro(18, "dodge Ram 2023", 500.000, "Azul", "JYG 2808");
        Carro carQuatroParametros = new Carro(18, "dodge Ram 2023", 500.000, "Preta", "MIN 2808");

        System.out.println(carAro.getAro());
        System.out.println(carQuatroParametros.getAro()+ " " + carQuatroParametros.getCor());
        System.out.println(carAro);
        System.out.println(carAro);
       }
}
