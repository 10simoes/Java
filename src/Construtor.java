public class Construtor{
    private double largura;
    private double altura;
    private double profundidade;

    public Construtor(){
        this.altura = 10;
        this.largura = 10;
        this.profundidade = 10;
    }

    public double volume(){
        return largura + altura * profundidade;
    }

    public static void main(String[]args){
        System.out.println("Vamos ver as dimensões da caixa");
        Construtor caixa = new Construtor();
        System.out.println(caixa.volume());
    }
}