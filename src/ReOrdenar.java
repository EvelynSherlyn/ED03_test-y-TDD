import java.util.Arrays;

public class ReOrdenar {

    public static int ordenarDesc(final int num) {
        int resultado;
        try {
            //No se aceptan números negativos.
            if (String.valueOf(num).contains("-")) {
                throw new IllegalStateException("ERROR");
            }
                if (num == 0) {
                    return 0;
                }
                int cont = String.valueOf(num).length(); //Cuantos números hay
                int[] numeros = new int[cont]; //Array de números para ordenarlos.
                resultado = 0;
                int aux = num; //Como num es una variable final, creamos una variable igual para modificar.

                //Almacenando los números en la array.
                for (int i = 0; i < cont; i++) {
                    numeros[i] = aux % 10; //Saca número
                    aux = aux / 10; //Elimina número
                }

                Arrays.sort(numeros);

                //Se recorre el array en reverso para ordenarlo de forma decreciente.
                for (int i = cont - 1; i >= 0; i--) {
                    resultado = resultado * 10 + numeros[i];
                }

        } catch (Exception e) {
            resultado = 0;
            System.out.println("Sentencia no válida.");
        }
        return resultado;
    }

}
