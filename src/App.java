public class App {
    public static void main(String[] args) throws Exception {
        
        // Ejercicio 1
        System.out.println(ut.GREEN_BOLD+"Ejercicio 1"+ut.RESET);
        System.out.printf("""
        Escribe un programa en el que se declarem las variables enteras x e y. 
        Asígnales los valores 144 y 999 respectivamente. A continuación,
        muestra por pantalla el valor de cada variable, la suma, la resta, la división 
        y la multiplicación.
        %n""");

        int x = 144;
        int y = 999;

        System.out.printf("x = %d%n",x);
        System.out.printf("y = %d%n", y);
        System.out.printf("x + y = %d%n",x+y);
        System.out.printf("x - y = %d%n",x-y);
        System.out.printf("x / y = %f%n",(float) x / y);
        System.out.printf("x * y = %d%n",x*y);
        System.out.printf("%n");

        // Ejercicio 2
        System.out.println(ut.GREEN_BOLD+"Ejercicio 2"+ut.RESET);
        System.out.printf("""
        Crea la variable nombre y asígnale tu nombre completo. Muestra su valor por pantalla
        de tal forma que el resultado del programa sea el mismo que en el ejercicio 1 del capítulo 1.
        %n""");
        String nombre = "Samuel Ruiz Martin";
        System.out.printf("%s",nombre);
        System.out.printf("%n%n");

        // Ejercicio 3
        System.out.println(ut.GREEN_BOLD+"Ejercicio 3"+ut.RESET);
        System.out.printf("""
        Crea la variable nombre, dirección y teléfono y asignale los valores correspondientes.
        Muestra los valores de esas variables por pantalla de tal forma que el resultado del
        programa sea el mismo que en el ejercicio 2 del capítulo 1
        %n""");

        String direccón = "Calle Locotta, 165 - Maqueda (Malaga) - España";
        String telefono = "693487596";

        System.out.printf("""
            %s
            %s
            %s
                %n""",nombre,direccón,telefono);
        
        // Ejercicio 4
        System.out.println(ut.GREEN_BOLD+"Ejercicio 4"+ut.RESET);
        System.out.printf("""
        Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
        convertir deberá estar almacenada en una variable
        %n""");

        float euro = 6.0f;
        
        System.out.printf("%.1f euros son %.0f peseta.%n%n",euro, euro*166.386);

        // Ejercicio 5
        System.out.println(ut.GREEN_BOLD+"Ejercicio 5"+ut.RESET);
        System.out.printf("""
        Realiza un conversor de pesetas a euros.
        La cantidad deberá estar almacenada en una variable.
        %n""");

        int pesetas = 10000;
        
        System.out.printf("%d peseta son %.2f euros.%n%n",pesetas, pesetas/166.386);

        // Ejercicio 6
        System.out.println(ut.GREEN_BOLD+"Ejercicio 6"+ut.RESET);
        System.out.printf("""
        Escribe un programa que calcule eñ total de una factura a partir de la base imponible (precios IVA).
        La base imponible estará almacenada en una variable.
        %n""");

        float base = 22.75f;
        float iva = 4.78f ;

        System.out.printf("%-10s %10.2f%n","Base imponible", base);
        System.out.printf("%-10s %14.2f%n","Iva", iva);
        System.out.println("-------------------------");
        System.out.printf("%-10s %14.2f%n%n", "Total", base+iva);

        // Ejercicio 7
        System.out.println(ut.GREEN_BOLD+"Ejercicio 7"+ut.RESET);
        System.out.printf("""
        Escribe un programa que declare variables de tipo char y de tipo String.
        Intenta mostrarlas por pantalla todas juntas en la misma línea y con 
        una sola sentencia de Java (con un ptintln())¿es posible?
        %n""");

        char primeraLetra = 'a';
        char ultimaLetra = 'z';
        System.out.println(primeraLetra+""+ultimaLetra+"abcdario");
        System.out.printf("%n");

        // Ejercicio 8
        System.out.println(ut.GREEN_BOLD+"Ejercicio 8"+ut.RESET);
        System.out.printf("""
        Escribe un programa que declare 5 varables de tipo char. A continuación, 
        crea otra variable como cadena de caracteres y asígnale como valor
        la concatenación de las anteriores 5 variables. 
        Por último, muestra la cadena de caracteres por pantalla.
        %n""");

        char Letra1 = 's';
        char Letra2 = 'a';
        char Letra3 = 'l';
        char Letra4 = 'u';
        char Letra5 = 'd';
        System.out.println(Letra1 + "" + Letra2 + "" + Letra3 + "" + Letra4 + "" + Letra5);
        System.out.printf("%n");


    }
}
