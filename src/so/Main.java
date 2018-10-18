package so;
import java.lang.*;

import bo.Combat;
import bo.CriPokemon;
import bo.Pokemon;
import bo.Tournoi;

public class Main {


    public static void main(String[] args){


        Tournoi tour = new Tournoi();
        tour.addPokemon();
        tour.goBattel();


    }
}
