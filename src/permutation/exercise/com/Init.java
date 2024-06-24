package permutation.exercise.com;

public class Init {

	  // _ define-ocg _
    public static int pasoDePermutacion(int num) {
        // Convierte el número en un arreglo de dígitos
        char[] arregloNum = Integer.toString(num).toCharArray();

        // Encuentra el primer par de dígitos en orden inverso donde el dígito izquierdo es menor que el dígito derecho
        int i = arregloNum.length - 1;
        while (i > 0 && arregloNum[i - 1] >= arregloNum[i]) {
            i--;
        }

        // Si no se encuentra tal par, no hay una permutación mayor
        if (i <= 0) {
            return -1;
        }

        // Encuentra el dígito más pequeño a la derecha del par encontrado que es mayor que el dígito izquierdo
        int j = arregloNum.length - 1;
        while (arregloNum[j] <= arregloNum[i - 1]) {
            j--;
        }

        // Intercambia los dígitos izquierdo y derecho
        char temp = arregloNum[i - 1];
        arregloNum[i - 1] = arregloNum[j];
        arregloNum[j] = temp;

        // Invierte los dígitos a la derecha del par original
        j = arregloNum.length - 1;
        while (i < j) {
            temp = arregloNum[i];
            arregloNum[i] = arregloNum[j];
            arregloNum[j] = temp;
            i++;
            j--;
        }

        // Convierte el arreglo de nuevo a un número
        int varOcg = Integer.parseInt(new String(arregloNum));
        return varOcg;
    }

    public static void main(String[] args) {
        // Casos de prueba
        System.out.println(pasoDePermutacion(123));    // Salida: 132
        System.out.println(pasoDePermutacion(12453));  // Salida: 12534
        System.out.println(pasoDePermutacion(999));    // Salida: -1
    }
}
