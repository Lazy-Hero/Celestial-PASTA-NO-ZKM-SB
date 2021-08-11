/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;

public class ef {
    private /* synthetic */ long c;
    private static /* synthetic */ m[] b;

    private long c() {
        return System.currentTimeMillis();
    }

    public boolean a(double d10) {
        m[] arrm = ef.b();
        double d11 = (double)(this.c() - this.c) - d10;
        double d12 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (arrm != null) {
            d12 = d12 > 0 ? 1.0 : 0.0;
        }
        return (boolean)d12;
    }

    public static m[] b() {
        return b;
    }

    public long a() {
        return this.c() - this.c;
    }

    public ef() {
        this.c = this.c();
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    public void d() {
        this.c = this.c();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        if (ef.b() == null) {
            ef.b(new m[5]);
        }
    }
}

