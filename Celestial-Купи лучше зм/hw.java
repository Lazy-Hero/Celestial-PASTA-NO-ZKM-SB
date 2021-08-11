/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;
import net.minecraft.ar.v;
import net.minecraft.client.a.aI;
import net.minecraft.client.q.a;

public class hw
extends aI {
    private final /* synthetic */ v d;
    private /* synthetic */ a e;

    public hw(a a10, v v2) {
        this.e = a10;
        this.d = v2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        return d1.a(bufferedImage);
    }

    public void b() {
        this.e = null;
    }

    @Override
    public void a() {
        block3: {
            a a10;
            block2: {
                String string = K.d();
                a10 = this.e;
                if (string != null) break block2;
                if (a10 == null) break block3;
                a10 = this.e;
            }
            a10.a(this.d);
        }
    }
}

