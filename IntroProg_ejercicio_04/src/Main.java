public class Main {
    public static void main(String[] args) {
        // if, else if y else
        int numeroIf = 0;

        if (numeroIf<0) {
            System.out.println("El número " + numeroIf + " es negativo");
        }
        else if (numeroIf>0) {
            System.out.println("El número " + numeroIf + " es positivo");
        }
        else {
            System.out.println("El número es 0");
        }

        // while

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile vale " + numeroWhile);
        }

        //do while

        int numeroDoWhile = 2;

        do {
            numeroDoWhile++;
            System.out.println("numeroDoWhile vale " + numeroDoWhile);
        }
        while (numeroDoWhile < 3);

        //for

        for (int numeroFor = 0; numeroFor <= 5; numeroFor++) {
            System.out.println("numeroFor vale " + numeroFor);
        }

        // switch case

        String estacion = "Verano";

        switch(estacion) {
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación del año");
        }
    }
}