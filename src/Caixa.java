public class Caixa{
    private double largura;
    private double altura;
    private double profundidade;


    public Caixa(double l, double a, double p){
        this.largura = l;
        this.altura = a;
        this.profundidade = p;
    }

    public double volume(){
        return largura * altura * profundidade;
    }

    public static void main(String[]args){

        System.out.println("Caixa de fosforo");
        Caixa f1 = new Caixa(1,2,1);
        Caixa f2 = new Caixa(10,20,30);
        Caixa f3 = new Caixa(100,200,300);
        System.out.println("Volume caixa 1:" + f1.volume());
        System.out.println( "Volume caixa 2:" +f2.volume());
        System.out.println("Volume caixa 2:" +f3.volume());

    }

}