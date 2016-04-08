public class Main {

    public static void main(String[] args) {
       Automovil focus = new Automovil("POG 059", 12000, 50, 45, 5);
        focus.manejar(50);
        System.out.println(focus.cantidadLitros);

        focus.llenarTanqueDeNafta();
        System.out.println(focus.cantidadLitros);
        System.out.println(focus.kilometraje);
    }
}
