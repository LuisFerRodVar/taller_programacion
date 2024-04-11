# Taller de programación
### *09/04/2024*
## Recursividad de pila
### Ejercicio 1
Hacer una función que se llame factorial, debe recibir un número entero, la función debe de retornar el resultado del factorial de ese número.

**Ejemplo:**
factorial(5)  => 120
factorial(4) => 24

***
### Ejercicio 2
Hacer una función que se llame contarDigitos la función debe de recibir un número entero positivo y debe retornar la cantidad de dígitos de ese número.

**Ejemplo:**
contarDigitos(123) => 3
contarDigitos(1024) => 4

***
### Ejercicio 3
Hacer una función que se llame fibonacci la función debe recibir un número entero y debe de retornar un entero con el número de la secuencia de fibonacci en la posición del número indicado.

**Ejemplo:**
fibonacci(5) => 5
fibonacci(7) => 13

***
### Ejercicio 4
Hacer una función que se llame calcularPotencia, debe recibir dos enteros, el primer parámetro debe ser la base de la potencia y el segundo debe ser el exponente.

**Ejemplo:**
calcularPotencia(2,4) => 16
calcularPotencia(5,2) => 25

***
### Ejercicio 5
Hacer una función que se llame sumarDigitos, debe recibir un número entero y retornar la suma de los dígitos de ese número.

**Ejemplo:**
sumarDigitos(124) => 7
sumarDigitos(572) => 14

***
### Ejercicio 6
Hacer una función que se llame invertirNumero, debe recibir un número entero y retornarlo al revés.

**Ejemplo:**

invertirNumero(123) => 321
invertirNumero(1024) => 4201
## Recursividad de cola
### Ejercicio 1
Hacer una función que se llame esPrimo, debe recibir un número entero y retornar verdadero si es primo y falso si no lo es
**Ejemplo:**
esPrimo(7) => true
esPrimo(21) => false

***
## Ejercicio 2
Hacer una función que se llame mcd, debe recibir dos números enteros y retorna el máximo común divisor de estos, puede utilizar el algoritmo de Euclides.
**Ejemplo:**
mcd(110,105) => 5
mcd(60,180) => 60

***
## Ejercicio 3
Hacer una función que se llame capicua, debe recibir un número y determinar si es un número capicua.
**Ejemplo:**
capicua(333) => true
capicua(467) => false

***
## Ejercicio 4
Hacer una funcion que se llame mcm, debe recibir dos números enteros y retornar el mínimo común múltiplo.
**Ejemplo:**
mcm(45,10) => 90
mcm(7,3) => 21

***
## Ejercicio 5
Hacer una función que se llame encontrarPrimos, debe recibir un número entero y la función debe imprimir en consola todos los números primos entre 0 y el número ingresado.
**Ejemplo:**
encontrarPrimos(20) => 2, 3, 5, 7, 11, 13, 17, 19
encontrarPrimos(10) => 2, 3, 5, 7

***
## Ejercicio 6
Crear una función llamada sumaPares, que reciba un número entero positivo n y devuelva la suma de los primeros n números pares.
**Ejemplo:**
sumaPares(5) => 30 (2 + 4 + 6 + 8 + 10)
sumaPares(3) => 6 (2 + 4 + 6)

***
## Ejercicio 7
Crear una función llamada sumaImparesHasta, que reciba un número entero positivo n y devuelva la suma de todos los números impares hasta n.
**Ejemplo:**
sumaImparesHasta(10) => 25 (1 + 3 + 5 + 7 + 9)
sumaImparesHasta(7) => 16 (1 + 3 + 5 + 7)
***

## Ejercicio 8
Crear una función llamada sumaDivisores, que reciba un número entero positivo n y devuelva la suma de todos sus divisores utilizando recursividad de cola.
**Ejemplo:**
sumaDivisores(10) => 18 (1 + 2 + 5 + 10)
sumaDivisores(6) => 12 (1 + 2 + 3 + 6)

***
## Ejercicio 9
Crear una función llamada esPerfecto, que reciba un número entero positivo n y devuelva verdadero si n es un número perfecto y falso en caso contrario. Un número perfecto es aquel que es igual a la suma de sus divisores excepto él mismo.

**Ejemplo:**
esPerfecto(28) => true (28 = 1 + 2 + 4 + 7 + 14)
esPerfecto(12) => false (12 ≠ 1 + 2 + 3 + 4 + 6)

***
### Ejercicio 10
Crear una función llamada esAmigo, que reciba dos números enteros positivos a y b y devuelva verdadero si a y b son números amigos, es decir, si la suma de los divisores de a es igual a b y la suma de los divisores de b es igual a a.
**Ejemplo:**
esAmigo(220, 284) => true (220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110, 284 = 1 + 2 + 4 + 71 + 142)
esAmigo(1184, 1210) => true (1184 = 1 + 2 + 4 + 8 + 16 + 74 + 148 + 296 + 592, 1210 = 1 + 2 + 5 + 10 + 11 + 22 + 55 + 110 + 121 + 242 + 605)
***
