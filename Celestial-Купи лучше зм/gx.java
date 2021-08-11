/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;

public class gx {
    private static gP a(gP gP2) {
        return gP2;
    }

    public static float a(float f10, float f11) {
        float f12;
        block4: {
            block5: {
                float f13;
                block2: {
                    block3: {
                        m[] arrm = ef.b();
                        f13 = f10;
                        if (arrm == null) break block2;
                        if (f13 == f11) break block3;
                        f12 = f11 - f10;
                        if (arrm == null) break block4;
                        if (!(f12 <= 0.0f)) break block5;
                    }
                    f13 = f10;
                }
                return f13;
            }
            f12 = (float)((double)f10 + (double)(f11 - f10) * Math.random());
        }
        return f12;
    }
}

