/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.glu.GLU
 */
package net.minecraft.client.a;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.U.x;
import net.minecraft.W.bq;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.v;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import org.lwjgl.util.glu.GLU;

public class an {
    private static /* synthetic */ float a;
    private static final /* synthetic */ IntBuffer f;
    private static final /* synthetic */ FloatBuffer d;
    private static /* synthetic */ l g;
    private static final /* synthetic */ FloatBuffer h;
    private static /* synthetic */ float i;
    private static /* synthetic */ float e;
    private static final /* synthetic */ FloatBuffer j;
    private static /* synthetic */ float b;
    private static /* synthetic */ float c;

    public static float c() {
        return a;
    }

    public static float e() {
        return c;
    }

    public static l a(x x2, double d10) {
        double d11 = x2.N + (x2.a - x2.N) * d10;
        double d12 = x2.L + (x2.aF - x2.L) * d10;
        double d13 = x2.k + (x2.ax - x2.k) * d10;
        double d14 = d11 + an.g.e;
        double d15 = d12 + an.g.d;
        double d16 = d13 + an.g.b;
        return new l(d14, d15, d16);
    }

    public static void a(j j2, boolean bl2) {
        String string = I.j();
        v.a(2982, d);
        String string2 = string;
        v.a(2983, h);
        v.a(2978, f);
        float f10 = (f.get(0) + f.get(2)) / 2;
        float f11 = (f.get(1) + f.get(3)) / 2;
        GLU.gluUnProject((float)f10, (float)f11, (float)0.0f, (FloatBuffer)d, (FloatBuffer)h, (IntBuffer)f, (FloatBuffer)j);
        g = new l(j.get(0), j.get(1), j.get(2));
        int n2 = bl2;
        if (string2 == null) {
            n2 = n2 != 0 ? 1 : 0;
        }
        int n3 = n2;
        float f12 = j2.at;
        float f13 = j2.e;
        b = net.minecraft.k.h.c(f13 * ((float)Math.PI / 180)) * (float)(1 - n3 * 2);
        e = net.minecraft.k.h.g(f13 * ((float)Math.PI / 180)) * (float)(1 - n3 * 2);
        i = -e * net.minecraft.k.h.g(f12 * ((float)Math.PI / 180)) * (float)(1 - n3 * 2);
        c = b * net.minecraft.k.h.g(f12 * ((float)Math.PI / 180)) * (float)(1 - n3 * 2);
        a = net.minecraft.k.h.c(f12 * ((float)Math.PI / 180));
    }

    public static float a() {
        return i;
    }

    public static i a(z z2, x x2, float f10) {
        i i2;
        l l2 = an.a(x2, f10);
        String string = I.j();
        n n2 = new n(l2);
        i i3 = i2 = z2.d(n2);
        if (string == null) {
            if (i3.o().b()) {
                float f11;
                float f12 = 0.0f;
                int n3 = i2.b() instanceof bq;
                if (string == null) {
                    if (n3 != 0) {
                        f12 = bq.a(i2.b(bq.z)) - 0.11111111f;
                    }
                    n3 = n2.b() + 1;
                }
                if (l2.d >= (double)(f11 = (float)n3 - f12)) {
                    i2 = z2.d(n2.a());
                }
            }
            i3 = i2;
        }
        return i3;
    }

    static {
        f = aZ.b(16);
        d = aZ.e(16);
        h = aZ.e(16);
        j = aZ.e(3);
        g = new l(0.0, 0.0, 0.0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static float b() {
        return e;
    }

    public static float d() {
        return b;
    }
}

