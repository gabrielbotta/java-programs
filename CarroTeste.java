public class CarroTeste {
    
    public static void main (String[] args){

    

        Carro c1 = new Carro();

        c1.acelerar(40);
        System.out.println("o carro "+c1.modelo+", ano: "+c1.ano+ " acelerou e atingiu a velocidade de: "+c1.vel+"km/h");

        c1.freiar(70);
        System.out.println("o carro: "+c1.modelo+", ano: "+c1.ano+" freiou e atingiu a velocidade de: "+c1.vel);
    }

}
