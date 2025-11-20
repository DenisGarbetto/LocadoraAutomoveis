public class Moto extends Automovel { 
    
    private int cilindradas;
    private int ano;
    private String cor;
    private String combustivel;

    public Moto(String modelo, String placa, String montadora, int cilindradas, int ano, String cor, String combustivel) {
        super(modelo, placa, montadora);
        this.cilindradas = cilindradas;
        this.ano = ano;
        this.cor = cor;
        this.combustivel = combustivel;
    }


    public String descricao() {

        String modelo = getModelo();
        String placa = getPlaca();
        String montadora = getMontadora();

        return "Modelo: " + modelo + "Placa: " + placa + "Placa valida?: " + validarPlaca() + ")" + "Montadora: " + montadora +
         "Cilindradas:" + cilindradas + "Ano: " + ano + "Cor" + cor + "Combustivel" + combustivel;

    }

    

    public int getCilindradas() {return cilindradas;}
    public void setCilindradas(int cilindradas) {this.cilindradas = cilindradas;}

    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}

    public String getCombustivel() {return combustivel;}
    public void setCombustivel(String combustivel) {this.combustivel = combustivel;}



    
}
