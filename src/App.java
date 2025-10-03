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
        System.out.printf("%n%n");

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
        System.out.println(ut.GREEN_BOLD+"Ejercicio 2"+ut.RESET);
        System.out.printf("""
        Crea la variable nombre, dirección y teléfono y asignale los valores correspondientes.
        Muestra los valores de esas variables por pantalla de tal forma que el resultado del
        programa sea el mismo que en el ejercicio 2 del capítulo 1
        %n""");

        

    }
}
