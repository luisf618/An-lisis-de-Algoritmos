/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;

// Programa en Java para implementar
// el Algoritmo de Kruskal
import java.util.*;

class Arista implements Comparable<Arista> {

    int origen, destino, peso;

    public Arista(int origen, int destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    // Comparar dos aristas en base a su peso
    @Override
    public int compareTo(Arista otraArista) {
        return this.peso - otraArista.peso;
    }
}

class Grafo {

    int numVertices, numAristas;
    Arista[] aristas;

    public Grafo(int numVertices, int numAristas) {
        this.numVertices = numVertices;
        this.numAristas = numAristas;
        aristas = new Arista[numAristas];
    }

    int encontrar(int[] padre, int i) {
        if (padre[i] == -1) {
            return i;
        }
        return encontrar(padre, padre[i]);
    }

    void unir(int[] padre, int x, int y) {
        int conjuntoX = encontrar(padre, x);
        int conjuntoY = encontrar(padre, y);
        padre[conjuntoX] = conjuntoY;
    }

    void kruskalAEM() {
        Arista[] resultado = new Arista[numVertices - 1];
        int e = 0, i = 0;

        Arrays.sort(aristas);

        int[] padre = new int[numVertices];
        Arrays.fill(padre, -1);

        while (e < numVertices - 1) {
            Arista siguienteArista = aristas[i++];

            int x = encontrar(padre, siguienteArista.origen);
            int y = encontrar(padre, siguienteArista.destino);

            if (x != y) {
                resultado[e++] = siguienteArista;
                unir(padre, x, y);
            }
        }

        System.out.println("Aristas en el árbol de expansión mínima:");
        for (i = 0; i < e; ++i) {
            System.out.println(resultado[i].origen + " - "
                    + resultado[i].destino + ": " + resultado[i].peso);
        }
    }
}

public class MainKruskal {

    public static void main(String[] args) {
        int vertices = 4;
        int aristas = 5;

        Grafo grafo = new Grafo(vertices, aristas);

        grafo.aristas[0] = new Arista(0, 1, 10);
        grafo.aristas[1] = new Arista(0, 2, 6);
        grafo.aristas[2] = new Arista(0, 3, 5);
        grafo.aristas[3] = new Arista(1, 3, 15);
        grafo.aristas[4] = new Arista(2, 3, 4);

        grafo.kruskalAEM();
    }
}
