/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.h;

public class c5 {
    public static float a(float f10) {
        return f10 * 180.0f / (float)Math.PI;
    }

    public static float b(float f10) {
        return f10 / 180.0f * (float)Math.PI;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int b(int[] arrn) {
        String string = K.d();
        int n2 = arrn.length;
        if (string == null) {
            if (n2 <= 0) {
                return 0;
            }
            n2 = c5.a(arrn);
        }
        int n3 = n2;
        int n4 = n3 / arrn.length;
        return n4;
    }

    public static int a(int[] arrn) {
        int n2;
        block4: {
            String string = K.d();
            int n3 = arrn.length;
            if (string == null) {
                if (n3 <= 0) {
                    return 0;
                }
                n3 = 0;
            }
            int n4 = n3;
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                int n5 = arrn[i2];
                n2 = n4 + n5;
                if (string == null) {
                    n4 = n2;
                    if (string == null) continue;
                }
                break block4;
            }
            n2 = n4;
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(int n2) {
        int n3;
        int n4 = h.e(n2);
        String string = K.d();
        int n5 = n2;
        int n6 = n4;
        if (string == null) {
            if (n5 == n6) {
                n3 = n4;
                return n3;
            }
            n5 = n4;
            n6 = 2;
        }
        n3 = n5 / n6;
        return n3;
    }

    public static boolean a(float f10, float f11, float f12) {
        String string = K.d();
        float f13 = Math.abs(f10 - f11) - f12;
        float f14 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
        if (string == null) {
            f14 = f14 <= 0 ? 1.0f : 0.0f;
        }
        return (boolean)f14;
    }
}

