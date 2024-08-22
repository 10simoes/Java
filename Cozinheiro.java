public class Cozinheiro {

    public static void main(String[]args){
        FritarOvo lanche = new FritarOvo();

        System.out.println("/n");
        lanche.pegarIngredientes();
        lanche.colocarOleo();
        lanche.acenderFogo();
        lanche.frigideiraFogo();
        lanche.esquentaOleo();
        lanche.colocarOvo();
        lanche.retirarOvo();

    }
}
