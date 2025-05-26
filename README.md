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


# REFERENCIAS BIBLIOGRÁFICAS

- Algoritmos: qué son y qué tipos existen - Ferrovial. (2025, 13 febrero). Ferrovial. https://www.ferrovial.com/es/stem/algoritmos/
- Análisis de algoritmos | Algoritmos y Estructura de Datos. (s. f.). https://www.luchonet.com.ar/aed/?page_id=209
- Chaves, J. (2025, 6 enero). Complejidad computacional. Diccionario Informático | Soporte Técnico. https://jeffrychaves.com/diccionario/complejidad-computacional/
