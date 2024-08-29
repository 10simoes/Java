import java.awt.desktop.SystemSleepListener;

public class Erros {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10,0);
            System.out.println("Resultado:" + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida");
        } finally {
            System.out.println("Bloco finally: Sempre executado");
        }
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}


