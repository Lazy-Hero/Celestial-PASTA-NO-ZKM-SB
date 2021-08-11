/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.b;

public class z
implements K<b> {
    public /* synthetic */ float b;
    private static /* synthetic */ int[] f;
    protected /* synthetic */ boolean g;
    protected /* synthetic */ boolean e;
    public /* synthetic */ double i;
    public /* synthetic */ boolean h;
    public /* synthetic */ double d;
    public /* synthetic */ double c;
    public /* synthetic */ float a;

    static {
        if (z.b() == null) {
            z.b(new int[5]);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public z(boolean bl2) {
        this.g = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public double a(double d10) {
        double d11;
        int[] arrn = z.b();
        z z2 = this;
        if (arrn != null) {
            if (!z2.e) {
                d11 = d10;
                return d11;
            }
            z2 = this;
        }
        d11 = z2.i;
        return d11;
    }

    public static int[] b() {
        return f;
    }

    @Override
    public void a(m m2) throws IOException {
        int[] arrn = z.b();
        short s2 = m2.readUnsignedByte();
        if (arrn != null) {
            s2 = s2 != 0 ? (short)1 : 0;
        }
        this.g = s2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public double b(double d10) {
        double d11;
        int[] arrn = z.b();
        z z2 = this;
        if (arrn != null) {
            if (!z2.e) {
                d11 = d10;
                return d11;
            }
            z2 = this;
        }
        d11 = z2.d;
        return d11;
    }

    public static void b(int[] arrn) {
        f = arrn;
    }

    public z() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public double c(double d10) {
        double d11;
        int[] arrn = z.b();
        z z2 = this;
        if (arrn != null) {
            if (!z2.e) {
                d11 = d10;
                return d11;
            }
            z2 = this;
        }
        d11 = z2.c;
        return d11;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public boolean c() {
        return this.g;
    }

    @Override
    public void b(m m2) throws IOException {
        int[] arrn = z.b();
        int n2 = this.g;
        if (arrn != null) {
            n2 = n2 != 0 ? 1 : 0;
        }
        m2.writeByte(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public float b(float f10) {
        float f11;
        int[] arrn = z.b();
        z z2 = this;
        if (arrn != null) {
            if (!z2.h) {
                f11 = f10;
                return f11;
            }
            z2 = this;
        }
        f11 = z2.a;
        return f11;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float a(float f10) {
        float f11;
        int[] arrn = z.b();
        z z2 = this;
        if (arrn != null) {
            if (!z2.h) {
                f11 = f10;
                return f11;
            }
            z2 = this;
        }
        f11 = z2.b;
        return f11;
    }
}

