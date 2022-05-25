package com.pokemon;

public class Main {

        public static void main(String[] args) {
            // TODO code application logic here
            /*
            Pokemon chikorita = new Pokemon(152, "Chikorita", 10, 20, false);
            chikorita.atacar();
            chikorita.dormir();
            chikorita.comer();

            TipoPlanta chikorita2 = new TipoPlanta(152, "Chikorita 2", 10, 20, false, 1);
            chikorita2.atacar();
            chikorita2.dormir();
            chikorita2.comer();
            chikorita2.envenenar();
            chikorita2.paralizar();
            */
            Chikorita chikorita3 = new Chikorita(152, "Chikorita 3", 10, 20, false, 1, 8);
            chikorita3.atacar();
            chikorita3.dormir();
            chikorita3.comer();
            chikorita3.latigo();

            Charmander charmander = new Charmander(1, "Charmander", 10, 20, false);
            charmander.atacar();
            charmander.dormir();
            charmander.comer();
            charmander.lanzaLlamas();
            charmander.araniar();
            charmander.volar();
            charmander.saludar("Hola");

        }

}
