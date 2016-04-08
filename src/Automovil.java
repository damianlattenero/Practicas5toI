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

        double litrosConsumidos = km * this.consumo;

        double consumido = cantidadLitros - litrosConsumidos;

        if(consumido < 0){
            System.out.println("No podes manejar esa cantidad de kilometros");
        }else{
            this.cantidadLitros = cantidadLitros - litrosConsumidos;
            this.kilometraje = kilometraje + km;
        }


    }

    public void llenarTanqueDeNafta(){
        double carga = this.capacidadTanque - cantidadLitros;
        this.cantidadLitros = carga + this.cantidadLitros;
        System.out.println("Cargaste "+ carga +" litros");
    }
}
