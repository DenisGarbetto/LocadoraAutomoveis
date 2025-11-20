public class Automovel { // Classe base que representa um automóvel genérico

// Atributos comuns a todos os veículos
    private String modelo;
    private String placa;
    private String montadora;

    // Construtor: inicializa os atributos ao criar um objeto
    public Automovel (String modelo, String placa, String montadora) {
        this.modelo = modelo;
        this.placa = placa;
        this.montadora = montadora;
    }

    // Método que valida a placa no formato: "ABC-1234"
    public String validarPlaca() {
        if (placa.matches("[A-Z]{3}-\\d{4}")) {
            return "Sim";
            
        }
        else { 
            return "Não";
        }
        
    }

    
 // Métodos Getters e Setters (Encapsulamento)
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}


    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {this.placa = placa;}

    public String getMontadora() {return montadora;}
    public void setMontadora(String montadora) {this.montadora = montadora;}
    
}
