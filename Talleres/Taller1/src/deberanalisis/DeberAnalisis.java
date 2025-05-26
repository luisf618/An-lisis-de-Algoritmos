package deberanalisis;

public class DeberAnalisis {

    public static void main(String[] args) {
        int[] array = {4, 8, 6, 2, 5, 7, 1};

        int p = 0;
        int q = (array.length - 1) / 2;
        int r = array.length - 1;

        merge(array, p, q, r);

        for (int num : array) {
            System.out.print(num + " ");
        }

    }

    public static void merge(int[] A, int p, int q, int r) {
        int nL = q - p + 1;
        int nR = r - q;

        int[] L = new int[nL];
        int[] R = new int[nR];

        for (int i = 0; i < nL; i++) {
            L[i] = A[p + i];
        }

        for (int j = 0; j < nR; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0; // índice en L
        int j = 0; // índice en R
        int k = p; // índice en A

        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < nL) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < nR) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

}
