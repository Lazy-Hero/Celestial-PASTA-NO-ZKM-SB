/*
 * Decompiled with CFR 0.150.
 */
import java.math.BigDecimal;
import java.util.Random;
import net.minecraft.k.m;

public class aY {
    private static final /* synthetic */ Random a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int b(int n2, int n3) {
        return (int)((double)n3 + (double)(n2 - n3) * a.nextDouble());
    }

    public static BigDecimal a(float f10, int n2) {
        BigDecimal bigDecimal;
        block0: {
            bigDecimal = new BigDecimal(Float.toString(f10));
            m[] arrm = ef.b();
            bigDecimal = bigDecimal.setScale(n2, 4);
            if (!m.c()) break block0;
            ef.b(new m[3]);
        }
        return bigDecimal;
    }

    static {
        a = new Random();
    }

    public static float b(float f10, float f11, float f12) {
        float f13;
        block6: {
            float f14;
            block5: {
                m[] arrm = ef.b();
                f14 = f10 == f11 ? 0 : (f10 < f11 ? -1 : 1);
                if (arrm == null) break block5;
                if (f14 <= 0) {
                    f10 = f11;
                }
                f13 = f10;
                if (arrm == null) break block6;
                float f15 = f13 - f12;
                f14 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            }
            if (f14 >= 0) {
                f10 = f12;
            }
            f13 = f10;
        }
        return f13;
    }

    public static int a(int n2, int n3) {
        return -n3 + (int)(Math.random() * (double)(n2 - -n3 + 1));
    }

    public static float a(float f10, float f11, float f12) {
        return f10 + f12 * (f11 - f10);
    }
}

