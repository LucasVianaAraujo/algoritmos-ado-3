public class Fibonacci {
    public static int fib(int num){
        int limite = 100;
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }
        return fib(num-1) + fib(num-2);
        
    }

    public static String serie (int limite){
          String resultado = " ";
        for (int i = 0; i < limite; i++) {
            resultado += fib(i) + " ";
        }
        return resultado;
    }
}
