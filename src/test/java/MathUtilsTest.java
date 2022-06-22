import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    //@DisplayName=pour la description du test
    @DisplayName("Should add two numbers")
    void additionner() {
        //assertequals=insertion doit etre comme resultat
        //mathutils.additionner=notre methode + les parametres qu'on lui passe
        assertEquals(6,MathUtils.additionner(3,3));

    }

    @Test
    @DisplayName("Should multiply two numbers")
    void multiplier(){
        assertEquals(16,MathUtils.multiplier(4,4));
        assertEquals(12,MathUtils.multiplier(3,4));
        assertEquals(-6,MathUtils.multiplier(2,-3));
    }
    @Test
    @DisplayName("Should substract two numbers")
    void soustraire(){
        assertEquals(4,MathUtils.soustraire(6,2));
    }
    @Test
    @DisplayName("Should calcul sum table")
    void additionnertable(){
        int [] table = {1,5,6};
        assertEquals(12,MathUtils.additionnertable(table));
       // assertEquals(13,MathsUtils.additionner(new int[]{1,5,6,1}));
    }

}