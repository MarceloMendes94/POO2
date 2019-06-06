package strategy.designPartten;

import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import static strategy.SaveImage.BLUR3x3;
import static strategy.SaveImage.SHARPEN3x3;

public class Sharpen extends Estrategia{
    
    @Override
    public void applyFilter(int opIndex) {
        float[] data = (opIndex == 1) ? BLUR3x3 : SHARPEN3x3;
        op=new ConvolveOp(new Kernel(3, 3, data), ConvolveOp.EDGE_NO_OP,  null);
    }
    
}
