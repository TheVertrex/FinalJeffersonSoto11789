import java.util.Scanner;

public class ExamenFinalVarianteBJefferson {

    private Scanner scanner;

    public ExamenFinalVarianteBJefferson() {
        scanner = new Scanner(System.in);
    }

    public void Mayorde3() {
        System.out.println("Ingrese 3 numeros");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor del numero es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El mayor del numero es: " + numero2);
        } else {
            System.out.println("El mayor del numero es: " + numero3);
        }
    }

    public void TablaDeMultiplicar() {
        System.out.println("Ingrese el numero con el cual desea multiplicar");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public void SumaRestaDivisionMultiplicacion() {
        System.out.println("Ingrese el primer numero");
        int primernumero = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int segundonumero = scanner.nextInt();
        System.out.println("Ingrese 1 si desea sumar");
        System.out.println("Ingrese 2 si desea restar");
        System.out.println("Ingrese 3 si desea multiplicar");
        System.out.println("Ingrese 4 si desea dividir");
        int operadores = scanner.nextInt();

        switch (operadores) {
            case 1:
                int suma = primernumero + segundonumero;
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case 2:
                int resta = primernumero - segundonumero;
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 3:
                int multiplicacion = primernumero * segundonumero;
                System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
                break;
            case 4:
                if (segundonumero != 0) {
                    int division = primernumero / segundonumero;
                    System.out.println("El resultado de la division es: " + division);
                } else {
                    System.out.println("Error: No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Error: Opcion no valida");
        }
    }

    public void PrimoONoPrimo() {
        System.out.println("Determine si el numero es primo o no primo");
        System.out.println("Ingrese el numero");
        int numero = scanner.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }
    }

    public static void main(String[] args) {
        ExamenFinalVarianteBJefferson ejercicios = new ExamenFinalVarianteBJefferson();
        ejercicios.Mayorde3();
        ejercicios.TablaDeMultiplicar();
        ejercicios.SumaRestaDivisionMultiplicacion();
        ejercicios.PrimoONoPrimo();
    }
}
