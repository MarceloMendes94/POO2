package strategy.designPartten;

import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;

public class Lookup extends Estrategia{

    @Override
    public void applyFilter( int opIndex) {
            byte lut[] = new byte[256];
            for (int j=0; j<256; j++) {
                lut[j] = (byte)(256-j); 
            }
            ByteLookupTable blut = new ByteLookupTable(0, lut); 
            this.op = new LookupOp(blut, null); 
    }
    
}
