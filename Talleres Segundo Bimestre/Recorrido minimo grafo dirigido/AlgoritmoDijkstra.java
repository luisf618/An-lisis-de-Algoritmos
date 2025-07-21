package algoritmos;


import java.util.Arrays;

public class AlgoritmoDijkstra {
    static final int INF = Integer.MAX_VALUE; // Valor que representa "infinito"

    public static void dijkstra(int[][] grafo, int origen) {
        int n = grafo.length;
        int[] distancias = new int[n];
        boolean[] visitado = new boolean[n];

        Arrays.fill(distancias, INF); // Inicializa todas las distancias como infinitas
        distancias[origen] = 0;       // La distancia al nodo origen es 0

        for (int contador = 0; contador < n - 1; contador++) {
            int u = obtenerMinimaDistancia(distancias, visitado);
            visitado[u] = true;

            // Actualiza las distancias de los vértices adyacentes al vértice seleccionado
            for (int v = 0; v < n; v++) {
                if (!visitado[v] && grafo[u][v] != 0 && distancias[u] != INF &&
                        distancias[u] + grafo[u][v] < distancias[v]) {
                    distancias[v] = distancias[u] + grafo[u][v];
                }
            }
        }

        imprimirSolucion(distancias);
    }

    // Función auxiliar para encontrar el vértice con la menor distancia aún no visitado
    private static int obtenerMinimaDistancia(int[] distancias, boolean[] visitado) {
        int minimo = INF, indiceMinimo = -1;
        for (int v = 0; v < distancias.length; v++) {
            if (!visitado[v] && distancias[v] <= minimo) {
                minimo = distancias[v];
                indiceMinimo = v;
            }
        }
        return indiceMinimo;
    }

    // Función para imprimir la solución final
    private static void imprimirSolucion(int[] distancias) {
        System.out.println("Distancias más cortas desde el nodo origen:");
        for (int i = 0; i < distancias.length; i++) {
            System.out.println("Hacia " + i + ": " + distancias[i]);
        }
    }

    public static void main(String[] args) {
        int[][] grafo = {
                {0, 2, 0, 4, 0},
                {2, 0, 5, 0, 0},
                {0, 5, 0, 8, 0},
                {4, 0, 8, 0, 3},
                {0, 0, 0, 3, 0}
        };

        dijkstra(grafo, 0); // Ejecutar Dijkstra desde el nodo 0
    }
}