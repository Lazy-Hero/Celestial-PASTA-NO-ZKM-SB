/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ah.p;

class df {
    static final /* synthetic */ int[] a;

    static {
        a = new int[p.values().length];
        try {
            df.a[p.NETHER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            df.a[p.OVERWORLD.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            df.a[p.THE_END.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

