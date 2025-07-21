# 🧠 Análisis de Algoritmos

El análisis de algoritmos es una rama fundamental de la teoría de la complejidad computacional. Su objetivo es estimar teóricamente los recursos necesarios (tiempo y espacio) que un algoritmo requiere para resolver un problema específico. Dado que la mayoría de los algoritmos están diseñados para manejar entradas de longitud arbitraria, es esencial determinar cómo escalan en eficiencia.

- **Complejidad de tiempo**: Relaciona la longitud de la entrada con el número de pasos necesarios para ejecutar el algoritmo.
- **Complejidad de espacio**: Relaciona la longitud de la entrada con la cantidad de memoria requerida durante la ejecución.

---

# 🔧 Algoritmo

Un algoritmo es una secuencia clara y ordenada de pasos que, al seguirse, permite resolver un problema o realizar una tarea específica. Son esenciales en programación y se aplican en diversas áreas, desde la cocina hasta la inteligencia artificial.

En informática, un algoritmo es un conjunto de instrucciones definidas, ordenadas y finitas que permiten resolver un problema, realizar un cálculo o llevar a cabo una tarea. Es decir, es un procedimiento paso a paso para alcanzar un objetivo. A partir de un estado e información iniciales, se siguen pasos ordenados hasta llegar a la solución.

> 💡 **Nota**: En programación, diseñar un algoritmo es el paso previo a escribir el código.

## 📝 Ejemplos

- **Recetas de cocina**: Explican paso a paso cómo preparar un platillo.
- **Instrucciones de ensamblaje**: Como las de armar un set de LEGO, detallan cada paso para construir una figura.
- **Manuales de usuario**: Guían al usuario en la configuración o uso de dispositivos.

---

# 🧮 Algoritmia

La algoritmia es la ciencia que estudia los algoritmos, es decir, conjuntos de instrucciones que permiten resolver problemas o realizar tareas. Se enfoca en el diseño, análisis y eficiencia de los algoritmos, buscando la mejor manera de solucionar problemas de forma automática.

## 🎯 Objetivos

- Diseñar algoritmos eficientes que resuelvan problemas de forma óptima, utilizando la menor cantidad de recursos (tiempo y memoria).
- Analizar la eficiencia de los algoritmos, determinando su tiempo de ejecución y espacio de memoria requerido.
- Desarrollar herramientas y técnicas para la creación de algoritmos, como pseudocódigo o diagramas de flujo.

## 🧪 Casos de Entrada

- **Mejor caso**: Situación más favorable para el algoritmo, donde el tiempo de ejecución o el espacio requerido son mínimos.
- **Caso promedio**: Tiempo de ejecución o espacio requerido para una entrada aleatoria típica.
- **Peor caso**: Situación más desfavorable para el algoritmo, donde el tiempo de ejecución o el espacio requerido son máximos.

## 🧰 Tipos de Análisis

- **Cuantitativos y cualitativos**: Basados en cálculos matemáticos o secuencias lógicas.
- **Computacionales o no computacionales**: Dependiendo de si requieren o no el uso de un ordenador.
- **Algoritmos de búsqueda**: Encuentran elementos con ciertas propiedades dentro de una estructura de datos.
- **Algoritmos de ordenamiento**: Reorganizan elementos de una lista siguiendo un orden numérico o alfanumérico.
- **Algoritmos voraces**: Aplicados a problemas de optimización, toman decisiones lógicas para llegar a una solución global. No son reversibles una vez ejecutados.
- **Programación dinámica**: La solución de un problema depende de soluciones a subproblemas más pequeños.
- **Algoritmos probabilísticos**: Basan sus resultados en el azar, buscando obtener buenas soluciones para cualquier distribución aleatoria de entradas.

---

# 🧩 Complejidad Computacional

La complejidad computacional es una área clave en informática que estudia los recursos necesarios para resolver problemas computacionales, enfocándose en:

- **Tiempo**: Cantidad de pasos necesarios para llegar a una solución.
- **Espacio**: Cantidad de memoria que un algoritmo necesita durante su ejecución.

---

# 📅 SEMANA 1

## 🧠 Algoritmia Elemental

Introduce conceptos básicos como eficiencia, análisis de casos y algoritmos simples (búsqueda lineal, binaria, ordenamientos). También incluye la comprensión de operaciones básicas y estructuras de control, como bucles y sentencias condicionales.

### 🔤 Notación

- **Pseudocódigo**: Representación textual de un algoritmo.
- **Diagramas de flujo**: Representación visual de los pasos de un algoritmo.

### 📐 Introducción Matemática

La matemática en algoritmia elemental se basa en operaciones básicas para resolver problemas de manera estructurada y lógica. Un algoritmo es una serie de instrucciones claras y ordenadas que permiten resolver un problema específico.

### ⚠️ Contradicción

Una contradicción ocurre cuando las declaraciones lógicas dentro de un algoritmo son incompatibles o producen resultados opuestos.

---

# 📅 SEMANA 2

## ⚙️ Eficiencia de los Algoritmos

La eficiencia de un algoritmo se refiere a su capacidad para resolver problemas de manera óptima en términos de tiempo y espacio de memoria.

Medir la eficiencia ayuda a predecir el comportamiento del algoritmo y a compararlo con otros, mejorando la resolución de problemas y la gestión de datos.

## 📊 Caso Medio

Representa el rendimiento promedio de un algoritmo considerando todas las entradas posibles y sus probabilidades.

### 🧪 Ejemplo:

En una búsqueda lineal en una lista:

- **Mejor caso**: El elemento buscado es el primero → 1 comparación.
- **Peor caso**: El elemento es el último o no está → n comparaciones.
- **Caso medio**: Aproximadamente n/2 comparaciones.

---

# 📅 SEMANA 3

## 🚨 Peor Caso

El peor caso representa el escenario más desfavorable en la ejecución de un algoritmo. Este análisis determina el máximo de recursos (tiempo o memoria) que puede consumir un algoritmo.

### 🧭 Importancia

- **Garantía de rendimiento**: Saber cuánto puede tardar como máximo.
- **Toma de decisiones**: Útil en sistemas donde el tiempo de respuesta es crítico.
- **Optimización**: Permite mejorar algoritmos al conocer sus límites.

### 🧪 Ejemplo:

En una **búsqueda secuencial**:

- **Peor caso**: El elemento no está en la lista → se recorren los `n` elementos.

En **ordenamiento por selección (selection sort)**:

- Siempre realiza la misma cantidad de comparaciones, sin importar el orden → el peor caso es igual al caso promedio.

### 📌 Notación Big-O (O-grande)

La notación Big-O se utiliza para describir el comportamiento del algoritmo en el peor de los casos. Ejemplos:

- Búsqueda lineal: O(n)
- Búsqueda binaria: O(log n)
- Ordenamiento burbuja: O(n²)
- Ordenamiento rápido (QuickSort): O(n²) en el peor caso, pero en promedio O(n log n)

---
# 📚 Semana 4: Notación para el Orden (Big O)

## 🔍 ¿Qué es la notación Big O?

Es una notación asintótica que describe la eficiencia de un algoritmo en función del tamaño de la entrada **n**.

Se centra en el crecimiento del tiempo o espacio requerido cuando la entrada aumenta.

Representa la cota superior del rendimiento del algoritmo (peor caso).

## 📌 Ejemplos comunes

| Notación   | Nombre        | Descripción breve                                      |
|------------|---------------|-------------------------------------------------------|
| O(1)       | Constante     | No depende del tamaño de la entrada.                  |
| O(n)       | Lineal        | Crece proporcionalmente a **n**.                      |
| O(log n)   | Logarítmica   | Crece lentamente, incluso si **n** aumenta mucho.     |
| O(n log n) | Quasilineal   | Más rápido que cuadrático, común en algoritmos de ordenamiento. |
| O(n²)      | Cuadrática    | Tiempo crece con el cuadrado del tamaño de entrada.    |
| O(2ⁿ)      | Exponencial   | Muy ineficiente; crece rápidamente.                    |
| O(n!)      | Factorial     | Extremadamente ineficiente, típico en algoritmos de fuerza bruta. |

## 🧠 Elementos clave

- Se expresa como **O(g(n))**, donde *g(n)* es una función que representa el crecimiento del algoritmo.
- Proporciona una cota superior, asegurando que no se necesitarán más recursos que *g(n)* para entradas grandes.

---

# 📚 Semana 5: Notaciones Ω (Omega) y Θ (Theta)

## 🔍 ¿Qué es la notación Ω (Omega)?

Describe la **cota inferior** de un algoritmo, es decir, el mejor caso posible.

Asegura que el algoritmo tomará al menos esa cantidad de recursos para entradas grandes.

### 🧠 Ejemplo:

Si un algoritmo tiene **Ω(n)**, en el mejor de los casos requiere al menos **n** pasos para completarse.

## 🔍 ¿Qué es la notación Θ (Theta)?

Describe un límite ajustado (superior e inferior).

El algoritmo siempre tarda un tiempo proporcional a **g(n)** (ni más, ni menos asintóticamente).

### 🎯 Interpretación

- **Cota estricta:** El tiempo de ejecución está acotado por arriba y por abajo.
- **Rendimiento promedio:** Representa bien el caso medio o comportamiento típico.

### Ejemplo:

Un algoritmo con **Θ(n log n)** se comporta así en la mayoría de los casos, no solo en el peor o mejor.

---

## 📌 Notación asintótica condicional

### 🔧 ¿Qué es?

Método para describir cómo un algoritmo escala con el tamaño de la entrada.

Se aplica a tiempo y espacio.

### 🧠 ¿Para qué sirve?

- Comparar algoritmos: Determinar cuál es más eficiente.
- Simplificar análisis: Ignorar detalles menores y centrarse en el crecimiento.
- Predecir comportamiento: Saber cómo reaccionará ante grandes volúmenes de datos.

---
# 📅 SEMANA 6

## ⚙️ Estructuras de Control

Las estructuras de control permiten gestionar el flujo de ejecución en un programa, determinando el orden en que las instrucciones se ejecutan. Gracias a ellas, el código puede tomar decisiones, repetir acciones o simplemente seguir un flujo secuencial.

### 🛠️ Tipos de estructuras

- **Secuenciales:** Las instrucciones se ejecutan una tras otra en el orden que están escritas.

- **Condicionales:** Permiten que el programa tome decisiones basadas en condiciones.

  - **Simples:** Ejecutan un bloque de código solo si una condición es verdadera.

  - **Dobles:** Si la condición es verdadera se ejecuta un bloque, si es falsa, otro diferente.

  - **Múltiples:** Evaluan varias condiciones para manejar casos complejos.

- **Iterativas:** Repetición de instrucciones múltiples veces, útil cuando no se conoce de antemano cuántas repeticiones se requieren.

### 🎯 Objetivos

- Organizar y controlar el flujo de un algoritmo para tomar decisiones y repetir acciones.

- Mejorar la legibilidad, modularidad y eficiencia del código.

- Facilitar la toma de decisiones con condicionales.

- Permitir repeticiones controladas mediante bucles.

---

# 📅 SEMANA 7

## 🔍 Análisis del Caso Medio

El análisis de caso medio mide el rendimiento esperado de un algoritmo considerando todas las posibles entradas y sus probabilidades. Es una medida más realista que el análisis del mejor o peor caso.

### 🧭 Proceso

1. Definir la distribución probabilística de las entradas.

2. Calcular el costo de ejecución para cada tipo de entrada.

3. Promediar los costos ponderados por sus probabilidades.

4. Considerar el tamaño de la entrada para el cálculo.

### ⚖️ Importancia

- Brinda una visión realista del rendimiento en uso típico.

- Facilita la comparación entre algoritmos.

- Ayuda a identificar oportunidades de optimización.

### 🧪 Ejemplo

En una búsqueda lineal, el elemento puede estar en cualquier posición con igual probabilidad. El análisis calcula el promedio de comparaciones necesarias para encontrarlo.

---

## ⚡ Análisis Amortizado

El análisis amortizado evalúa el costo promedio de una secuencia de operaciones, en lugar de enfocarse en el costo individual más alto. Esto es útil cuando operaciones costosas ocurren raramente.

### 🧪 Ejemplo

En una lista dinámica, insertar puede ser O(1) usualmente, pero ocasionalmente O(n) para redimensionar. El análisis amortizado muestra que el costo promedio por inserción sigue siendo O(1).

### 🛠️ Métodos comunes

- Método de agregación

- Método contable

- Método potencial

### 🎯 Importancia

Proporciona una visión más realista del rendimiento en escenarios reales.

---

## 🔄 Recurrencias

Una recurrencia es una ecuación que define una función en términos de valores menores de sí misma. Son clave para analizar algoritmos recursivos y "divide y vencerás".

### 🎯 Importancia

Permiten calcular la complejidad de algoritmos que dividen problemas en subproblemas más pequeños.

### 🧪 Ejemplo

Factorial: T(n) = T(n-1) + 1, con T(1) = 1.

### 🧮 Solución

Se puede resolver con métodos como expansión, maestro o sustitución para obtener la complejidad asintótica.

### 📈 Complejidad

Por ejemplo, resolver una recurrencia puede mostrar que el algoritmo es O(n), es decir, crece linealmente con el tamaño de la entrada.

# 📚 Semana 9: Algoritmos Voraces y Árbol de Recubrimiento Mínimo

## ⚙️ Algoritmos Voraces

Los **algoritmos voraces** son una clase de algoritmos de optimización que construyen soluciones paso a paso, eligiendo en cada etapa la opción que parece ser la mejor **sin considerar efectos futuros**. Aunque su simplicidad es su principal ventaja, **no siempre garantizan una solución óptima global**, pero sí logran soluciones eficientes en muchos problemas prácticos.

### 🧩 Características principales:

- **🔎 Enfoque local:**  
  El algoritmo toma decisiones basadas en la mejor elección disponible en ese instante, sin revisar decisiones pasadas.

- **🚫 No retrospectivo:**  
  Una vez tomada una decisión, no se revierte ni se evalúan caminos alternativos.

- **⚡ Eficiencia:**  
  Suelen tener **baja complejidad computacional**, típicamente lineal o logarítmica, lo cual los hace muy rápidos.

- **🎯 Solución no siempre óptima:**  
  No siempre proporcionan la mejor solución global, pero **pueden acercarse bastante** y ser suficientes en la práctica.

---

## 🌐 Grafos No Dirigidos

Un **grafo no dirigido** es una estructura matemática formada por nodos (**vértices**) conectados por líneas (**aristas**) **sin dirección**. Es decir, si un nodo `A` está conectado a un nodo `B`, entonces también se considera que `B` está conectado a `A`.

### 📌 Ejemplo de aplicación:

- Redes sociales donde la amistad es mutua.  
- Mapas de carreteras donde el tránsito es posible en ambas direcciones.  
- Redes de contactos entre personas donde la conexión es bidireccional.  

---

## 🌲 Árbol de Recubrimiento Mínimo

El **Árbol de Recubrimiento Mínimo (Minimum Spanning Tree, MST)** es un subconjunto de las aristas de un grafo que conecta todos los vértices sin formar ciclos y con el **menor peso total posible**.

Uno de los algoritmos más conocidos para encontrarlo es el **algoritmo de Kruskal**, el cual es un ejemplo clásico de algoritmo voraz.

---

## 💻 Ejemplo en Java: Algoritmo de Kruskal

A continuación, se muestra la implementación del algoritmo de Kruskal en Java, utilizado para encontrar el Árbol de Recubrimiento Mínimo en un grafo no dirigido y ponderado:

```java
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
        if (padre[i] == -1)
            return i;
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
        for (i = 0; i < e; ++i)
            System.out.println(resultado[i].origen + " - " 
                               + resultado[i].destino + ": " + resultado[i].peso);
    }
}

public class Principal {
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
```

# 📚 Semana 10: Grafos Dirigidos y Algoritmo de Dijkstra

## 🔁 Grafos Dirigidos

Los **grafos dirigidos** son estructuras de datos que representan relaciones **unidireccionales** entre elementos. A diferencia de los grafos no dirigidos, donde la conexión entre dos nodos es mutua, en los grafos dirigidos **cada arista tiene una dirección**, indicando un flujo específico desde un nodo hacia otro.

### 🧠 Ventajas de los grafos dirigidos:

- **🎯 Modelado preciso:**  
  Representan relaciones unidireccionales con exactitud, útiles para casos donde no hay reciprocidad.

- **📊 Análisis eficiente:**  
  Permiten estudiar propiedades como el flujo de información, jerarquías y dependencias.

- **🌐 Aplicaciones diversas:**  
  Se utilizan en:
  - Mapas de rutas con sentido único
  - Grafos de dependencias en compiladores
  - Sistemas de recomendación
  - Redes sociales con relaciones de "seguimiento"

---

## 🚀 Algoritmo de Dijkstra

El **algoritmo de Dijkstra** es un algoritmo clásico para encontrar el **camino más corto** desde un nodo origen a todos los demás nodos en un grafo con **pesos no negativos**. Utiliza un enfoque **greedy** (voraz) y es fundamental en muchas aplicaciones como GPS, redes de computadoras y juegos.

### 🧮 Lógica básica del algoritmo:
1. Inicializa todas las distancias como infinitas, excepto el nodo origen (que vale 0).
2. Selecciona el nodo no visitado con menor distancia.
3. Actualiza las distancias de sus nodos vecinos si se encuentra un camino más corto.
4. Repite hasta visitar todos los nodos.

---

## 💻 Implementación en Java

```java
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
```

# 📅 Semana 11: Algoritmos Divide y Vencerás

## 🔪 Estrategia "Divide y Vencerás"

El paradigma **Divide y Vencerás** consiste en resolver problemas grandes dividiéndolos en subproblemas más pequeños y manejables, resolviéndolos recursivamente y combinando sus soluciones para construir la solución general.

Este enfoque es clave en muchos algoritmos eficientes, incluyendo ordenamientos, búsquedas y cálculos numéricos.

---

### 🧩 Componentes de la estrategia:

1. **Dividir**  
   Se parte el problema en subproblemas más pequeños, normalmente en partes iguales.

2. **Conquistar**  
   Se resuelven los subproblemas, generalmente mediante recursión. Si el subproblema es lo suficientemente pequeño, se resuelve directamente (caso base).

3. **Combinar**  
   Se unen las soluciones de los subproblemas para formar la solución del problema original.

---

## 🔍 Mecanismo de Búsqueda Binaria

La **búsqueda binaria** es un claro ejemplo del enfoque Divide y Vencerás. Consiste en reducir el espacio de búsqueda a la mitad en cada paso, eliminando sistemáticamente la mitad que no contiene el elemento buscado.

### 📚 Ejemplo práctico:

Buscar una palabra en un diccionario no implica revisar página por página. En su lugar, uno abre el libro por la mitad, evalúa, y decide si continuar a la izquierda o derecha. Este principio se aplica directamente en la búsqueda binaria.

---

## 💻 Código: Búsqueda Binaria en Java

```java
public class Busqueda {
    public static int encontrar(int[] datos, int objetivo) {
        int inicio = 0;
        int fin = datos.length - 1;
        
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (datos[medio] == objetivo) {
                return medio;
            } else if (datos[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16};
        int buscado = 10;
        int posicion = encontrar(numeros, buscado);

        if (posicion != -1) {
            System.out.println("El número " + buscado + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El número " + buscado + " no fue encontrado.");
        }
    }
}

```

# 📚 Semana 12: Algoritmos Divide y Vencerás (Parte 2)

## 🧠 Consideraciones clave al usar Divide y Vencerás

Cuando se diseña un algoritmo usando este paradigma, es importante tener en cuenta varios factores para garantizar eficiencia y corrección:

- **🧮 Complejidad:**

  Es fundamental analizar la complejidad de cada una de las etapas:
  - Dividir
  - Resolver subproblemas
  - Combinar resultados
  
  Esto permite conocer el costo total del algoritmo y si es viable para conjuntos de datos grandes.

- **🔁 Caso base:**

  Se debe definir correctamente para evitar recursiones infinitas y garantizar que el algoritmo converja a una solución.

- **🧩 Generalización:**

  A menudo es necesario transformar el problema para que pueda ser resuelto recursivamente. Esta reformulación permite una solución más simple y eficiente.

---

## 📌 Merge Sort (Ordenamiento por Fusión)

**Merge Sort** es uno de los algoritmos más representativos del paradigma **Divide y Vencerás**. Se utiliza ampliamente por su rendimiento estable, incluso en el peor de los casos.

### 🔍 ¿Cómo funciona?

1. **Divide:**

   El arreglo original se divide recursivamente por la mitad hasta que se obtienen sub-arreglos con un solo elemento (que están ordenados por definición).

2. **Conquista:**

   Al llegar a los sub-arreglos de un solo elemento, se consideran ordenados. Se inicia el proceso de combinación.

3. **Combina:**

   Los sub-arreglos ordenados se fusionan de manera ordenada para formar un arreglo más grande, también ordenado. Este proceso continúa hasta recomponer el arreglo original, pero ahora en orden ascendente.

### ⚙️ Complejidad temporal

- Mejor caso: O(n log n)
- Promedio: O(n log n)
- Peor caso: O(n log n)

---

## 💻 Código en Java: Merge Sort

```java
public class OrdenamientoFusion {

    public static void ordenar(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;

            ordenar(arreglo, inicio, medio);
            ordenar(arreglo, medio + 1, fin);

            fusionar(arreglo, inicio, medio, fin);
        }
    }

    public static void fusionar(int[] arreglo, int inicio, int medio, int fin) {
        int tamaño1 = medio - inicio + 1;
        int tamaño2 = fin - medio;

        int[] izquierda = new int[tamaño1];
        int[] derecha = new int[tamaño2];

        for (int i = 0; i < tamaño1; ++i) {
            izquierda[i] = arreglo[inicio + i];
        }
        for (int j = 0; j < tamaño2; ++j) {
            derecha[j] = arreglo[medio + 1 + j];
        }

        int i = 0, j = 0;
        int k = inicio;

        while (i < tamaño1 && j < tamaño2) {
            if (izquierda[i] <= derecha[j]) {
                arreglo[k] = izquierda[i];
                i++;
            } else {
                arreglo[k] = derecha[j];
                j++;
            }
            k++;
        }

        while (i < tamaño1) {
            arreglo[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < tamaño2) {
            arreglo[k] = derecha[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] datos = {12, 11, 13, 5, 6, 7};
        int n = datos.length;

        System.out.println("Arreglo original:");
        imprimir(datos);

        ordenar(datos, 0, n - 1);

        System.out.println("\nArreglo ordenado:");
        imprimir(datos);
    }

    public static void imprimir(int[] arreglo) {
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
```

# 📚 Semana 13: Algoritmos Avanzados – Mediana y Exponenciación Rápida

---

## 📏 Cálculo de la Mediana en Dos Arreglos Ordenados

Este problema busca encontrar la **mediana** de dos arreglos ordenados sin fusionarlos completamente. La solución eficiente utiliza una variante de la técnica **Divide y Vencerás**, reduciendo el tiempo de ejecución a **O(log(min(n, m)))**, siendo `n` y `m` los tamaños de los arreglos.

### 🧠 Idea principal:

En lugar de combinar completamente los dos arreglos, se busca una **partición óptima** que divida ambos arreglos en dos mitades tal que:

- Todos los elementos en la mitad izquierda sean menores o iguales que los de la mitad derecha.
- El número total de elementos a la izquierda sea igual al de la derecha (o difiera por uno si la cantidad total es impar).

### 🧮 Pasos del algoritmo:

1. Identificar el arreglo más pequeño para hacer la búsqueda binaria sobre él.
2. Calcular una partición para ambos arreglos.
3. Verificar si la partición es válida.
4. Si lo es, calcular la mediana según el total de elementos (par o impar).
5. Si no lo es, ajustar la búsqueda binaria.

### ✅ Ventajas:

- Alta eficiencia: O(log(min(n, m)))
- No requiere espacio adicional.
- Muy útil en bases de datos o flujos de datos ordenados.

---

## 🔢 Exponenciación Rápida (Exponentiation by Squaring)

La **exponenciación rápida** es una técnica utilizada para calcular potencias de un número de forma eficiente, especialmente cuando el exponente es muy grande. Se basa en la propiedad:

- Si el exponente es par:  
  `a^n = (a^(n/2))^2`
- Si el exponente es impar:  
  `a^n = a * (a^((n-1)/2))^2`

### 🧠 ¿Por qué es útil?

- Reduce la complejidad de O(n) a O(log n)
- Fundamental en aplicaciones de criptografía y teoría de números.
- Evita desbordamientos y mejora el rendimiento en cómputos intensivos.

---

## 💻 Código en Java

### Mediana de dos arreglos ordenados

```java
public class MedianaDosArreglos {

    public static double encontrarMediana(int[] A, int[] B) {
        if (A.length > B.length) return encontrarMediana(B, A);

        int m = A.length;
        int n = B.length;
        int imin = 0, imax = m, mitad = (m + n + 1) / 2;

        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = mitad - i;

            if (i < m && B[j - 1] > A[i]) {
                imin = i + 1;
            } else if (i > 0 && A[i - 1] > B[j]) {
                imax = i - 1;
            } else {
                int maxIzquierda = 0;
                if (i == 0) maxIzquierda = B[j - 1];
                else if (j == 0) maxIzquierda = A[i - 1];
                else maxIzquierda = Math.max(A[i - 1], B[j - 1]);

                if ((m + n) % 2 == 1) return maxIzquierda;

                int minDerecha = 0;
                if (i == m) minDerecha = B[j];
                else if (j == n) minDerecha = A[i];
                else minDerecha = Math.min(A[i], B[j]);

                return (maxIzquierda + minDerecha) / 2.0;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 8};
        int[] nums2 = {7, 9, 10, 11};

        double mediana = encontrarMediana(nums1, nums2);
        System.out.println("Mediana combinada: " + mediana);
    }
}
```

### Exponenciación rápida

```java
public class ExponenciacionRapida {

    public static long potencia(long base, long exponente) {
        long resultado = 1;

        while (exponente > 0) {
            if ((exponente & 1) == 1) {
                resultado *= base;
            }
            base *= base;
            exponente >>= 1; // Equivalente a dividir entre 2
        }

        return resultado;
    }

    public static void main(String[] args) {
        long base = 2;
        long exponente = 10;
        System.out.println("Resultado: " + potencia(base, exponente)); // 1024
    }
}
```

# 📚 Semana 14: Multiplicación de Matrices

---

## ✏️ Introducción

La **multiplicación de matrices** es una operación fundamental en matemáticas, ciencias computacionales, gráficos por computadora, inteligencia artificial y más. A nivel algorítmico, representa una oportunidad para analizar diferentes enfoques con distintas eficiencias computacionales.

---

## 📐 Definición Formal

Dadas dos matrices:

- **A** de dimensión m x n
- **B** de dimensión n x p

La matriz **C = A × B** tendrá dimensión m x p, y cada elemento de **C** se calcula como:

C[i][j] = A[i][0] × B[0][j] + A[i][1] × B[1][j] + ... + A[i][n-1] × B[n-1][j]


---

## 🔍 Complejidad Computacional

- **Algoritmo clásico:** O(n³)
- **Algoritmo de Strassen:** O(n^2.81)
- **Algoritmos más avanzados:** Existen métodos incluso más eficientes (como Coppersmith–Winograd), aunque son complejos y poco prácticos en muchos casos reales.

---

## 🧠 Consideraciones importantes

- Para multiplicar dos matrices, **el número de columnas de la primera debe coincidir con el número de filas de la segunda**.
- La multiplicación **no es conmutativa**: A × B ≠ B × A en general.
- Se puede aplicar en cadenas de transformaciones, rotaciones, cálculos de redes neuronales, entre otros.

---

## 💻 Código Java: Multiplicación Clásica de Matrices

```java
public class StrassenMatrixMultiplication {

    public static int[][] strassen(int[][] A, int[][] B) {
        int n = A.length;
        
        // Caso base: matriz 1x1
        if (n == 1) {
            int[][] C = new int[1][1];
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        // Dividir matrices en 4 submatrices
        int newSize = n / 2;
        int[][] A11 = new int[newSize][newSize];
        int[][] A12 = new int[newSize][newSize];
        int[][] A21 = new int[newSize][newSize];
        int[][] A22 = new int[newSize][newSize];
        int[][] B11 = new int[newSize][newSize];
        int[][] B12 = new int[newSize][newSize];
        int[][] B21 = new int[newSize][newSize];
        int[][] B22 = new int[newSize][newSize];

        // Llenar submatrices
        split(A, A11, 0, 0);
        split(A, A12, 0, newSize);
        split(A, A21, newSize, 0);
        split(A, A22, newSize, newSize);
        split(B, B11, 0, 0);
        split(B, B12, 0, newSize);
        split(B, B21, newSize, 0);
        split(B, B22, newSize, newSize);

        // Calcular M1 a M7
        int[][] M1 = strassen(add(A11, A22), add(B11, B22));
        int[][] M2 = strassen(add(A21, A22), B11);
        int[][] M3 = strassen(A11, subtract(B12, B22));
        int[][] M4 = strassen(A22, subtract(B21, B11));
        int[][] M5 = strassen(add(A11, A12), B22);
        int[][] M6 = strassen(subtract(A21, A11), add(B11, B12));
        int[][] M7 = strassen(subtract(A12, A22), add(B21, B22));

        // Calcular C submatrices
        int[][] C11 = add(subtract(add(M1, M4), M5), M7);
        int[][] C12 = add(M3, M5);
        int[][] C21 = add(M2, M4);
        int[][] C22 = add(subtract(add(M1, M3), M2), M6);

        // Combinar submatrices en matriz resultado
        int[][] C = new int[n][n];
        join(C11, C, 0, 0);
        join(C12, C, 0, newSize);
        join(C21, C, newSize, 0);
        join(C22, C, newSize, newSize);

        return C;
    }

    // Operaciones auxiliares

    public static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static void split(int[][] parent, int[][] child, int iB, int jB) {
        for (int i = 0; i < child.length; i++)
            for (int j = 0; j < child.length; j++)
                child[i][j] = parent[i + iB][j + jB];
    }

    public static void join(int[][] child, int[][] parent, int iB, int jB) {
        for (int i = 0; i < child.length; i++)
            for (int j = 0; j < child.length; j++)
                parent[i + iB][j + jB] = child[i][j];
    }

    // Método de prueba
    public static void main(String[] args) {
        int[][] A = {
            {7, 6, 9, 4},
            {8, 5, 3, 2},
            {7, 7, 9, 9},
            {4, 3, 8, 5}
        };

        int[][] B = {
            {3, 2, 9, 5},
            {7, 5, 6, 4},
            {4, 6, 9, 1},
            {9, 3, 8, 7}
        };

        int[][] C = strassen(A, B);

        System.out.println("Resultado de la multiplicación:");
        for (int[] row : C) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
}
```

# 📚 Semana 15: Algoritmos Probabilistas

---

## 🎲 ¿Qué son los algoritmos probabilistas?

Los **algoritmos probabilistas** son algoritmos que, durante su ejecución, toman decisiones basadas en valores aleatorios. Estos algoritmos no siempre garantizan el mismo resultado o tiempo de ejecución, pero pueden ofrecer soluciones rápidas, aproximadas o altamente eficientes en promedio.

---

## ⚙️ Características

- **Uso del azar:** Incorporan decisiones basadas en números aleatorios.
- **Rendimiento promedio:** Suelen ser más rápidos en la práctica que los algoritmos deterministas.
- **No deterministas:** Pueden producir distintos resultados con la misma entrada, dependiendo del azar.
- **Alta aplicabilidad:** Utilizados en criptografía, simulación, optimización, y machine learning.

---

## 📌 Tipos

- **Monte Carlo:** Devuelven una respuesta probablemente correcta. Pueden errar, pero en un rango de error controlado.
- **Las Vegas:** Siempre devuelven la respuesta correcta, pero su tiempo de ejecución varía debido al azar.
- **Algoritmos de estimación:** Utilizan el azar para aproximar resultados (por ejemplo, estimar π o áreas).

---

## 🎯 Ejemplo: Generación de números aleatorios

Una de las bases de los algoritmos probabilistas es la **generación de números pseudoaleatorios**. Uno de los métodos más clásicos para ello es el **método congruencial lineal (MCL)**.

---

## 🔢 Método Congruencial Lineal (MCL)

Este algoritmo genera una secuencia de números pseudoaleatorios mediante la siguiente fórmula:

Xₙ₊₁ = (a * Xₙ + c) mod m


- **X₀**: semilla (valor inicial)
- **a**: multiplicador
- **c**: incremento
- **m**: módulo
- **Xₙ**: n-ésimo número generado

---

## 💻 Código Java: Método Congruencial Lineal

```java
public class MetodoCongruencialLineal {

    public static int[] generarNumeros(int semilla, int a, int c, int m, int cantidad) {
        int[] numeros = new int[cantidad];
        numeros[0] = semilla;

        for (int i = 1; i < cantidad; i++) {
            numeros[i] = (a * numeros[i - 1] + c) % m;
        }

        return numeros;
    }

    public static void main(String[] args) {
        int semilla = 7;
        int a = 5;
        int c = 3;
        int m = 16;
        int cantidad = 10;

        int[] resultados = generarNumeros(semilla, a, c, m, cantidad);

        System.out.println("Números pseudoaleatorios generados:");
        for (int num : resultados) {
            System.out.print(num + " ");
        }
    }
}
```

# REFERENCIAS BIBLIOGRÁFICAS

- Algoritmos: qué son y qué tipos existen - Ferrovial. (2025, 13 febrero). Ferrovial. https://www.ferrovial.com/es/stem/algoritmos/
- Análisis de algoritmos | Algoritmos y Estructura de Datos. (s. f.). https://www.luchonet.com.ar/aed/?page_id=209
- Chaves, J. (2025, 6 enero). Complejidad computacional. Diccionario Informático | Soporte Técnico. https://jeffrychaves.com/diccionario/complejidad-computacional/
- Learn Asymptotic Notation in Y Minutes. (s. f.). https://learnxinyminutes.com/es/asymptotic-notation/
- Análisis amortizado | Aprende Programación Competitiva. (s. f.). https://aprende.olimpiada-informatica.org/algoritmia-analisis-amortizado
- ¿Cuál es la diferencia entre la notación de la gran O, la gran omega y la gran theta? (2024, 29 febrero). www.linkedin.com. https://es.linkedin.com/advice/3/what-difference-between-big-o-omega-theta-notation-ig29e?lang=es&lang=es
- Building, C. (s. f.). Best, worst, and average case analysis. https://www-complexica-com.translate.goog/narrow-ai-glossary/best-worst-average-case-analysis?_x_tr_sl=en&_x_tr_tl=es&_x_tr_hl=es&_x_tr_pto=tc
