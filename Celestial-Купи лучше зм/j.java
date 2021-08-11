/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ar.K;

class j {
    static final /* synthetic */ int[] a;

    static {
        a = new int[K.values().length];
        try {
            j.a[K.WINDOWS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            j.a[K.OSX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            j.a[K.LINUX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

