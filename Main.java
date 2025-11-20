public class Main {
    public static void main(String[] args) {
        //Cria o objeto Moto
        Moto moto =  new Moto("Mt07", "ASD-4554", "Yamaha", 700, 2025, "Vermellha", "Flex");
    //Cria o objeto Carro
        Carro carro = new Carro("911 TurboS", "PSH-9110", "Porsche", 2, 711, 4, "Alcantra", "4x4");
    //Cria o objeto Caminhao
        Caminhao caminhao = new Caminhao("S 700", "SCN-7000", "Scania", 4, 12500, "Cana", "Bi Trem", "Porto Seguro");

        System.out.println(moto.descricao());
        System.out.println(carro.descricao());
        System.out.println(caminhao.descricao());
        
    }
    
}
