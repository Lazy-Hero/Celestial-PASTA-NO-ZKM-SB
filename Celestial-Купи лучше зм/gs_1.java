/*
 * Decompiled with CFR 0.150.
 */
public class gs
implements ag {
    public static float a() {
        float f10 = (float)((double)gs.b.ac.bv * 0.6 + 0.2);
        return f10 * f10 * f10 * 8.0f;
    }

    public static float b(float f10) {
        return Math.round(f10 / gs.b());
    }

    public static float b() {
        return (float)((double)gs.a() * 0.15);
    }

    public static float a(float f10) {
        return gs.b(f10) * gs.b();
    }
}

