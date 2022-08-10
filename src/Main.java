public class Main {
    public static void main(String[] args) {
        //conditional
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("Positive");
        } else if (numeroIf < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero.");
        }

        //while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //dowhile
        int dowhile = 3;
        do {
            System.out.println(dowhile);
            dowhile++;
        } while(dowhile < 4);

        //for
        for (int numeroFor = 0; numeroFor<=3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //switch
        String estacion = "verano";

        switch(estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            default:
                System.out.println(estacion);
        }

    }

}