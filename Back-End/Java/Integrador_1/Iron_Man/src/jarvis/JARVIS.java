/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jarvis;

import armor.Armadura;
import armor.Dispositivo;
import armor.ObjetoX;
import enums.EstadoDispositivo;
import static integrador.IntegradorArmadura.scan;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ing_j
 */
public class JARVIS {
Random rand = new Random();

    private void consumirEnergia(Armadura arm, int consumo) {
        Integer energia = arm.getGenerador().getEnergia();
        energia -= consumo;
        arm.getGenerador().setEnergia(energia);
    }

//Al caminar la armadura hará un uso básico de las botas y se consumirá la energía 
//establecida como consumo en la bota por el tiempo en el que se camine.
    public int caminar(Armadura arm, int tiempo) {

        if (arm.getBotaDer().usarDispositivo() && arm.getBotaIzq().usarDispositivo()) {
            int consumo = (arm.getBotaDer().getConsumo()) * tiempo;
            consumo += arm.getBotaIzq().getConsumo() * tiempo;
            System.out.println("Caminando...            Energia consumida " + consumo);
            consumirEnergia(arm, consumo);
            return consumo;
        }
        System.out.println("No se puede Caminar. hay un dispositivo averiado");
        return 0;
    }

//      Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la 
//      energía establecida como consumo en la bota por el tiempo en el que se corra.
    public int correr(Armadura arm, int tiempo) {

        if (arm.getBotaDer().usarDispositivo() && arm.getBotaIzq().usarDispositivo()) {
            int consumo = (arm.getBotaDer().getConsumo() * 2) * tiempo;
            consumo += arm.getBotaIzq().getConsumo() * 2 * tiempo;
            System.out.println("Corriendo...            Energia consumida " + consumo);
            consumirEnergia(arm, consumo);
            return consumo;
        }
        System.out.println("No se puede Correr. hay un dispositivo averiado");
        return 0;
    }
//      Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la 
//      energía por el tiempo que dure la propulsión.

    public int propulsarse(Armadura arm, int tiempo) {
        if (arm.getBotaDer().usarDispositivo() && arm.getBotaIzq().usarDispositivo()) {
        int consumo = (arm.getBotaDer().getConsumo() * 3) * tiempo;
        System.out.println("Propulsor activado...        Energia consumida " + consumo);
        consumirEnergia(arm, consumo);
        return consumo;
        }
        System.out.println("No se puede propulsar. hay un dispositivo averiado");
        return 0;
    }


//    Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal 
//    consumiendo el triple de la energía establecida para las botas y el doble para los guantes.
    public int volar(Armadura arm, int tiempo) {
        if(arm.getBotaDer().usarDispositivo() && arm.getBotaIzq().usarDispositivo() && arm.getGuanteDer().usarDispositivo()&&arm.getGuanteIzq().usarDispositivo()){
        int consumo = ((arm.getBotaDer().getConsumo() * 3) + (arm.getGuanteDer().getConsumo() * 2)) * tiempo;
        System.out.println("Volando...          Energia consumida " + consumo);
        consumirEnergia(arm, consumo);
        return consumo;
    }
        System.out.println("No se puede Volar. hay un dispositivo averiado");
        return 0;        
    }

//    Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
    public int disparar(Armadura arm, int tiempo) {
        if( arm.getGuanteDer().usarDispositivo()&&arm.getGuanteIzq().usarDispositivo()){
        int consumo = (arm.getGuanteDer().getConsumo() * 3) * tiempo;
        System.out.println("Disparando...       Energia consumida " + consumo);
        consumo = consumo * 2; //dispara con los dos guantes.
        consumirEnergia(arm, consumo);
        return consumo;
    }
       System.out.println("No se puede Disparar. hay un dispositivo averiado");
        return 0; 
    }

    public void pintarArmadura(Armadura arm) {
        System.out.println("Sr. Elige el color principal para tu armadura");
        String colorP = scan.next();
        System.out.println("Sr. elige el color secundario para tu armadura");
        String colorS = scan.next();

        arm.setColorP(colorP);
        arm.setColorS(colorS);
        System.out.println("Ha sido una excelente elecion Sr.");
    }

    public Armadura fabricarArmadura() {
        return new Armadura();
    }

    public void mostrarInformacionArmadura(Armadura arm) {
        System.out.println(
                "\n Armadura " + "color Principal =" + arm.getColorP() + ", color Secundario=" + arm.getColorS() + ""
                + "\n resistencia=" + arm.getResistencia() + ", salud=" + arm.getSalud() + ""
                + "\n guanteIzq=" + arm.getGuanteIzq() + ", guanteDer=" + arm.getGuanteDer() + ""
                + "\n botaIzq=" + arm.getBotaIzq() + ", botaDer=" + arm.getBotaDer() + ""
                + "\n casco=" + arm.getCasco() + ""
                + "\n generador= " + arm.getGenerador() + '\n');
    }

    public void estadoBateria(Armadura arm) {
        double bateria = ((double) arm.getGenerador().getEnergia() / Integer.MAX_VALUE) * 100;
        System.out.println("Nivel de bateria: " + bateria + " %.");

    }
    
    
    public void escanearArmadura(Armadura arm){
        
        System.out.println("Escaneando la integridad de la armadura...");
        ArrayList<Dispositivo> dispositivos = new ArrayList();
        dispositivos.add(arm.getBotaDer());
        dispositivos.add(arm.getBotaIzq());
        dispositivos.add(arm.getGuanteDer());
        dispositivos.add(arm.getGuanteIzq());
        dispositivos.add(arm.getCasco().getConsola());
        dispositivos.add(arm.getCasco().getSintetizador());
        
        for (Dispositivo dis : dispositivos) {
            if (dis.getEstado().equals(EstadoDispositivo.AVERIADO)) {
                System.out.println("Reparacion en proceso.."+dis.getNombre());
                
                revisarDispositivos(dis);
            }
        }
        
        
        
        
    }
    
    
    
    // probabilidad de reparar el dispositivo
    // destruido o llama el metodo reparar
    public void revisarDispositivos(Dispositivo dispo){
//        
//        Los dispositivos son revisados por JARVIS para ver si se encuentran dañados. En caso de 
//encontrar un dispositivo dañado se debe intentar arreglarlo de manera insistente. Para esos 
//intentos hay un 30% de posibilidades de que el dispositivo quede destruido, pero se deberá 
//intentar arreglarlo hasta que lo repare, o bien hasta que quede destruido.
        do {            
            int numRand = rand.nextInt(100) + 1;
            if (numRand > 30) {
                dispo.repararDisposivo(); // disposito operativo                   
            }else{
                System.out.println("La reparacion fallo. el dispositivo ha sido anulado");
                dispo.setEstado(EstadoDispositivo.DESTRUIDO);  
            }            
        } while (dispo.getEstado().equals(EstadoDispositivo.AVERIADO));

    }
    
    
    public void radar(){
        
        ObjetoX[][][] radar = new ObjetoX[100][100][100];
        ArrayList<ObjetoX> listaObjetos = new ArrayList();
        for (int i = 0; i < 15; i++) {
            ObjetoX x = new ObjetoX();
            listaObjetos.add(x);
        }
        for (int y = -50; y < 50; y++) {
            for (int x = -50; x < 50; x++) {
                for (int z = -50; z < 50; z++) {
                    
                }
            }
        }
        
        
        
        
    }
}
