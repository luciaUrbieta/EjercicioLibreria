import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        1. Realizar un programa Java que realice lo siguiente: declarar una variable
        numN de tipo int, una variable numA de tipo double y una variable numC de
        tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
        El valor de cada variable, la suma de numN + numA, la diferencia de numA -
        numN, el valor numérico correspondiente al carácter que contiene la
        variable numC.
        */
/*
        int numN = 5;
        double numA = 3;
        char numC = '1';
        System.out.println("numN = " + numN + "\n");
        System.out.println("numN + numA = " + (numN+numA) + "\n");
        System.out.println("numA - numN = " + (numA-numN) + "\n");
        System.out.println("numC = " + numC + "\n");
*/
        /*
        2. Realizar un programa Java que realice lo siguiente: declarar dos variables
        numX y numY de tipo int, dos variables numN y numM de tipo double y
        asigna a cada una un valor. A continuación mostrar por pantalla una serie
        de operaciones entre ellas.
        */
/*
        int numX=2;
        int numY=4;
        double numZ=3;
        double numW=5;

        System.out.println("x - y =" + (numX - numY) + "\n");
        System.out.println("z - w = " + (numZ - numW) + "\n");
        System.out.println("x - w = " + (numX - numW) + "\n");
*/
        /*
        3. Realizar un programa Java que declare una variable entera N y se le asigne
        un valor elegido por el usuario. A continuación escribe las instrucciones para
        que el programa realice lo siguiente: incrementar N en 77, reducir su valor a 3,
        duplicar su valor.
        */
/*
        int n;
        System.out.println("Ingrese un valor para n \n");
        n = scanner.nextInt();
        scanner.nextLine();
        int n1 = n+77;
        System.out.println("n + 77 = " + n1);
        int n2 = n-3;
        System.out.println("n - 3 = " + n2);
        int n3 = n*2;
        System.out.println("n * 2 = " + n3);
*/
        /*
        4. Realizar un programa Java que declare cuatro variables enteras A, B, C y D
        y se le asigne un valor a cada una. A continuación realiza las instrucciones
        necesarias para que: B tome el valor de C, C tome el valor de A, A tome el
        valor de D, D tome el valor de B.
        */

        /*
        5. Realizar un programa Java que declare una variable A de tipo entero,
        y le asigne un valor. A continuación mostrar un mensaje indicando si A
        es par o impar.
        6. Realizar un programa Java que declare una variable B de tipo entero y
        asignarle un valor elegido por el usuario. A continuación mostrar un
        mensaje indicando si el valor de B es positivo o negativo.
        7. Realizar un programa Java que encuentre el valor ASCII de un carácter.
        Para ello, vamos a pedir un String al usuario y leer solo el primer carácter,
        esto lo lograremos con: char caracter = scanner.next().charAt(0);
         */

        /*
        8. Realizar un programa Java que declare una variable C de tipo entero y le
        asigne un valor elegido por el usuario. A continuación mostrar un mensaje
        indicando si el valor de C es positivo o negativo, si es par o impar, si es
        múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.
        9. Realizar un programa Java que lea un nombre y muestre por pantalla:
        “Buenos días, {NOMBRE}”.
        10. Realizar un programa que lee por teclado el valor del radio de una
        circunferencia, calcula y muestra por pantalla la longitud y el área de la
        circunferencia. Cálculo de longitud: 2 * PI * radio, cálculo de área: PI *
        radio^2. Para este ejercicio averiguar sobre la clase Math.
        11. Realizar un programa que pase una velocidad en Km/h a m/s. La
        velocidad se lee por teclado. Cálculo: velocidadMS = velocidadKm * 1000 /
        3600;
        12. Realizar un programa que lea la longitud de los catetos de un triángulo
        rectángulo y calcule la longitud de la hipotenusa según el teorema de
        Pitágoras.
        13. Realizar un programa que calcula el volumen de una esfera. El valor de
        radio se debe pedir por teclado. Cálculo: volumen = 4/3 * PI * radio^3
        14. Realizar un programa que lee un número de 3 cifras y muestra sus
        cifras por separado.
        15. Realizar un programa que lea un número entero N de 5 cifras y muestre
        las cifras que ocupan posiciones impares.
        16. Realizar un programa que lea tres números enteros H, M, S que
        contienen hora, minutos y segundos respectivamente, y comprueba si la
        hora que indican es una hora válida.
        17. Realizar un programa Java que pida por teclado el nombre, edad y
        salario de una persona, y muestra el salario dependiendo de:
        ● Si es menor de 16 no tiene edad para trabajar
        ● Entre 19 y 50 años el salario es un 5 por ciento más
        ● Entre 51 y 60 años el salario es un 10 por ciento más
        ● Si es mayor de 60 el salario es un 15 por ciento más
         */


        /*
        18. Crea un programa que pida al usuario su altura y su peso, y muestre por
        pantalla su índice de masa corporal y si se encuentra en un rango
        saludable.
        */
        /*
        System.out.println("Ingrese su altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese su peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        double imc = peso/(altura*altura);

        System.out.println("Su indice de masa corporal es = " + imc);

        if(imc<18.5){
            System.out.println("Su IMC es demasiado bajo para ser saludable :(");
        }else if(imc>24.9){
            System.out.println("Su IMC es demasiado alto para ser saludable:(");
        }else{
            System.out.println("Su IMC indica que se encuentra saludable :)");
        }
        */

        /*
        19. Realizar un programa Java que calcule el promedio de un arreglo de
        números enteros. Realizar variantes con arreglos ya inicializados e ingreso
        por teclado.
        */
        /*
        int arrayNumeros[] = {5, 6, 4};

        int arregloNumeros[] = new int[3];
        for(int i=0; i<3; i++){
            System.out.println("Ingrese un numero");
            arregloNumeros[i]=scanner.nextInt();
            scanner.nextLine();
        }

        double promedio1=0;
        for(int i=0; i<3; i++){
            promedio1=promedio1 + arrayNumeros[i];
        }
        promedio1=promedio1/3;
        System.out.println("Promedio del primer arreglo = " + promedio1);

        double promedio2=0;
        for(int i=0; i<3; i++){
            promedio2=promedio2 + arregloNumeros[i];
        }
        promedio2=promedio2/3;
        System.out.println("\n Promedio del segundo arreglo = " + promedio2);
        */
        /*
        20. Realizar un programa Java que solicite un número al usuario y calcule la
        suma de todos los números naturales, hasta el número recibido inclusive.
        */
        /*
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int x=num;
        int suma=0;
        while(x>0){
            suma = suma + x;
            x=x-1;
        }

        System.out.println("La suma de todos los numeros naturales del numero " + num + " = " + suma);
        */
        /*
        21. Realizar un programa Java que lea 20 temperaturas correspondientes a
        un mes y calcule el maximo, el minimo y el promedio. Utilizar un array
        double.
         */

    }
}