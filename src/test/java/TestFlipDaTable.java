import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frc.robot.FlipaDaTable;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class TestFlipDaTable {
    @BeforeEach
    void prepare(){
        FlipaDaTable.reset();
    }

    @Test
    void testInitialState() {
        assertEquals(FlipaDaTable.flip(), "┬─┬ノ( º _ ºノ)");
    }

    @Test
    void testFlipping() throws DecoderException{
        String encoded = "28e295afc2b0e296a1c2b0efbc89e295afefb8b520e294bbe2943fe294bb";

        FlipaDaTable.getInstance().nextState();
        String flipped = new String(Hex.encodeHex(FlipaDaTable.flip().getBytes())).trim();
        
        System.out.println("Expected value:\t" + encoded);
        System.out.println("Actual value:\t" + flipped);

        final boolean test = flipped.substring(0,49).equals(encoded.substring(0,49));
        System.out.println("Test successful:\t" + test);

        assertTrue(test);
    }
}