public class Caminhao extends Automovel { 
    
    private int quantidadeEixos;
    private int CargaMaxima;
    private String tipoCarga;
    private String tipo;
    private String nomeSeguradora;


    public Caminhao(String modelo, String placa, String montadora, int quantidadeEixos, int CargaMaxima, String tipoCarga, String tipo, String nomeSeguradora) {
        super(modelo, placa, montadora);
        this.quantidadeEixos = quantidadeEixos;
        this.CargaMaxima = CargaMaxima;
        this.tipoCarga = tipoCarga;
        this.tipo = tipo;
        this.nomeSeguradora = nomeSeguradora;
    }


    public String descricao() {

        String modelo = getModelo();
        String placa = getPlaca();
        String montadora = getMontadora();

        return "Modelo: " + modelo + " Placa: " + placa + " Placa valida?: " + validarPlaca() + " Montadora: " + montadora + 
        " Quantidade Eixos: " + quantidadeEixos + " Carga Maxima: " + CargaMaxima + " TipodeCarga: " + tipoCarga + " Tipo: " + tipo + 
        " NomeSeguradora" + nomeSeguradora;

    }

    public int getQuantidadeEixos() {return quantidadeEixos;}
    public void setQuantideEixeox(int quantidadeEixos) {this.quantidadeEixos = quantidadeEixos;}

    public int getCargaMaxima() {return CargaMaxima;}
    public void setCargaMaxima(int CargaMaxima) {this.CargaMaxima = CargaMaxima;}

    public String getTipoCarga() {return tipoCarga;}
    public void setTipoCarga(String tipoCarga) {this.tipoCarga = tipoCarga;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getNomeSeguradora() {return nomeSeguradora;}
    public void setNomeSeguradora(String nomeSeguradora) {this.nomeSeguradora = nomeSeguradora;}

    

}