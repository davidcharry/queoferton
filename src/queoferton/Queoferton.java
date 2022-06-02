package queoferton;

import java.util.Scanner;

public class Queoferton {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double descuento,boletos, alimentos, total;
        System.out.println("Digite el valor pagado en boletos:");
        boletos = tc.nextInt();
        System.out.println("Digite el valor pagado en alimentos:");
        alimentos = tc.nextInt();
        total = boletos + alimentos;
        if (total > 40000 && total <= 100000 ) {
            descuento = total * 0.05;
            total = total - descuento;
            System.out.println("Debe pagar un total de $" + total + " y el descuento es de $" + descuento);
        } else if (total > 100000 && total <= 200000) {
            descuento = total * 0.10;
            total = total - descuento;
            System.out.println("Debe pagar un total de $" + total + " y el descuento es de $" + descuento);
        } else if (total > 200000 && total <= 500000) {
            descuento = total * 0.20;
            total = total - descuento;
            System.out.println("Debe pagar un total de $" + total + " y el descuento es de $" + descuento);
        } else if (total > 500000) {
            descuento = total * 0.35;
            total = total - descuento;
            System.out.println("Debe pagar un total de $" + total + " y el descuento es de $" + descuento);
        } else {
            System.out.println("Debe pagar un total de $" + total + " y no hay descuentos");

        }
    }
}
