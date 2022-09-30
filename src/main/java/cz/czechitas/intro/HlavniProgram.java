package cz.czechitas.intro;

import cz.czechitas.intro.api.*;
import net.sevecek.util.*;

public class HlavniProgram {

    public void main(String[] args) {

        Fish fish = new Fish(50, 50);

        new Stone (100, 100);

        for (int j = 0; j<8; j++) {
            for (int i = 0; i<15; i++) {
                fish.moveForward();
            }
        fish.turnRight();
        }
    }

}
