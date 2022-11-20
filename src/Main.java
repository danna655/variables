import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String nombres;
        int pago;

        String nombreA;
        int pagoA;
        String nombreE;
        int pagoB;
        String nombreI;
        int pagoC;
        String nombreO;
        int pagoD;
        pago = 900000;
        pagoA = 800000;
        pagoB = 500000;
        pagoC = 900000;
        pagoD = 400000;
        double horas;
        double horas1;
        double horas2;
        double horas3;
        double horas4;
        System.out.println("buenas tardes señor usuario le pedimos que ingrese suy nombre");
        nombres = Sc.nextLine();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        horas = Sc.nextInt();
        System.out.println("su nombre es " +nombres+   " y sus horas son "  +horas+ "");
        System.out.println("y su pago es " +pago+ " gracias por consultar " +
                "nuestro servicio de sueldo esperamos que vuelva pronto ");
        System.out.println("hola buenas  digita tu nombre");
        nombreA = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");
        horas1 = Sc.nextInt();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        pagoA = Sc.nextByte();
        System.out.println("su nombre es " +nombreA+ " y sus horas son "  +horas1+ "" );
        System.out.println("y su pago es " +pagoA+ " gracias por consultar nuestro servicio" +
                " de sueldo esperamos que vuelva pronto ");
        System.out.println("hola buenas digita tu nombre");
        nombreB = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");
        horas2 = Sc.nextInt();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        pagoB = Sc.nextByte();
        System.out.println("su nombre es " +nombreE+  " y sus horas son "  +horas2+ "" );
        System.out.println("y su pago es " +pagoB+ " gracias por consultar nuestro servicio de" +
                " sueldo esperamos que vuelva pronto ");
        System.out.println("hola buenas digita tu nombre");
        nombreC = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");
        horas3 = Sc.nextInt();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        pagoC = Sc.nextByte();
        System.out.println("su nombre es " +nombreI+ " y sus horas son "  +horas3+ "");
        System.out.println("y su pago es " +pagoC+ " gracias por consultar nuestro servicio de" +
                " sueldo esperamos que vuelva pronto ");
        System.out.println("hola buenas digita tu nombre");
        nombreD = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");
        horas4 = Sc.nextInt();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        pagoD = Sc.nextByte();
        System.out.println("su nombre es " +nombreO+ " y sus horas son "  +horas4+ "" );
                System.out.println("y su sueldo es " +pagoD+ "gracias por consultar nuestro servicio de sueldo esperamos que vuelva pronto ");
        System.out.println("GRACIAS POR INGRESAR EN NUESTRO SERVICIOS DE SUELDO");


    }

}