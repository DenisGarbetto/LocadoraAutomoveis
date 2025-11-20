// Classe Carro herda de Automovel
public class Carro extends Automovel { 
    
    // Atributos específicos de Carro
    private int quantidadePortas;
    private int potencia;
    private int quantidadeLugares;
    private String materialBanco;
    private String tracao;


// Construtor que usa super() para chamar o construtor de Automovel
    public Carro(String modelo, String placa, String montadora, int quantidadePortas, int potencia, int quantidadeLugares, String materialBanco,
    String tracao ) {
        super(modelo, placa, montadora); // Chamando o construtor da classe pai
        this.quantidadePortas = quantidadePortas;
        this.potencia = potencia;
        this.quantidadeLugares = quantidadeLugares;
        this.materialBanco = materialBanco;
        this.tracao = tracao;
    }

// Método que retorna uma descrição do carro
    public String descricao() {

        String modelo = getModelo();
        String placa = getPlaca();
        String montadora = getMontadora();

        return "Modelo: " + modelo + "Placa: " + placa + "Placa valida?: " + validarPlaca() + ")" + "Montadora: " + montadora + 
        "Quantidade Portas: " + quantidadePortas + "Potencia: " + potencia + "QuantidadedeLugares" + quantidadeLugares + "MaterialBanco" 
        + materialBanco + "Tração" + tracao;

    }

    public int getQuantidadePortas() {return quantidadePortas;}
    public void setQuantidadePortas(int quantidadePortas) {this.quantidadePortas = quantidadePortas;}

    public int getPotencia() {return potencia;}
    public void setPotencia(int potencia) {this.potencia = potencia;}

    public int getQuantidadeLugares() {return quantidadeLugares;}
    public void setQuantidadeLugares(int quantidadeLugares) {this.quantidadeLugares = quantidadeLugares;}

    public String getMaterialBanco() {return materialBanco;}
    public void setMaterialBanco(String materialbanco) {this.materialBanco = materialbanco;}

    public String getTraçao() {return tracao;}
    public void setTracao(String tracao) {this.tracao = tracao;}

}
