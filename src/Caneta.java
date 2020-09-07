public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(){ //este é o método construtor
        this.tampar();
        this.cor = "azul";

    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo (String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta=p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampada(){
        this.tampada = false;
    }

   public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
