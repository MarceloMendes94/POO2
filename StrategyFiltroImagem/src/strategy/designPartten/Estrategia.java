package strategy.designPartten;

import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;

public abstract class  Estrategia {
    public BufferedImageOp op;
    
    public abstract void applyFilter( int opIndex);
    
}
