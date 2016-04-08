class Automovil {

    String patente;
    int kilometraje;
    int capacidadTanque;
    double cantidadLitros;
    int capacidadPersonas;
    double consumo;

    public Automovil(String patente, int kilometraje, int capacidadTanque, double cantidadLitros, int capacidadPersonas) {
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.capacidadTanque = capacidadTanque;
        this.cantidadLitros = cantidadLitros;
        this.capacidadPersonas = capacidadPersonas;
        this.consumo = 0.8;
    }

    public void manejar(int km){
        this.kilometraje = kilometraje + km;
        double ltCons = km * this.consumo;
        this.cantidadLitros = cantidadLitros - ltCons;
    }

    public void llenarTanqueDeNafta(){
        double carga = this.capacidadTanque - cantidadLitros;
        this.cantidadLitros = carga + this.cantidadLitros;
        System.out.println("Cargaste "+ carga +" litros");
    }
}
