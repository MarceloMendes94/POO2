package strategy.designPartten;

import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import static strategy.SaveImage.BLUR3x3;


public class LowPass extends Estrategia{
    
    @Override
    public void applyFilter( int opIndex) {
        float[] data =  BLUR3x3;
        op=new ConvolveOp(new Kernel(3, 3, data), ConvolveOp.EDGE_NO_OP, null);
    }
    
}
