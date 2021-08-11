/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ah;

import javax.annotation.Nullable;
import net.minecraft.A.b;
import net.minecraft.A.c;
import net.minecraft.V.a;
import net.minecraft.aA.q;
import net.minecraft.aA.u;
import net.minecraft.aA.v;
import net.minecraft.ah.L;
import net.minecraft.ah.p;
import net.minecraft.ah.z;
import net.minecraft.i.k;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.u.d;
import net.minecraft.u.g;

public abstract class G {
    private /* synthetic */ String b;
    protected /* synthetic */ z e;
    protected final /* synthetic */ float[] f;
    protected /* synthetic */ boolean a;
    protected /* synthetic */ boolean d;
    public static final /* synthetic */ float[] j;
    private /* synthetic */ L g;
    private final /* synthetic */ float[] c;
    protected /* synthetic */ boolean i;
    protected /* synthetic */ b h;

    public v o() {
        String string = z.I();
        L l2 = this.g;
        L l3 = L.g;
        if (string != null) {
            if (l2 == l3) {
                return new q(this.e, this.e.C(), this.e.b().D(), this.b);
            }
            l2 = this.g;
            l3 = L.e;
        }
        if (string != null) {
            if (l2 == l3) {
                return new net.minecraft.aA.a(this.e);
            }
            l2 = this.g;
            l3 = L.i;
        }
        return l2 == l3 ? new u(this.e, this.e.C(), this.e.b().D(), this.b) : new u(this.e, this.e.C(), this.e.b().D(), this.b);
    }

    public boolean a(int n2, int n3) {
        n n4 = new n(n2, 0, n3);
        String string = z.I();
        z z2 = this.e;
        n n5 = n4;
        if (string != null) {
            if (z2.c(n5).l()) {
                return true;
            }
            z2 = this.e;
            n5 = n4;
        }
        return z2.A(n5).b() == net.minecraft.u.g.aU;
    }

    public boolean b(int n2, int n3) {
        return false;
    }

    public int a(long l2) {
        return (int)(l2 / 24000L % 8L + 8L) % 8;
    }

    public G() {
        this.f = new float[16];
        this.c = new float[4];
    }

    public boolean l() {
        return true;
    }

    public float f() {
        return 128.0f;
    }

    public void n() {
    }

    public abstract p r();

    public final void a(z z2) {
        this.e = z2;
        this.g = z2.b().w();
        this.b = z2.b().r();
        this.d();
        this.g();
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        return this.d;
    }

    public b p() {
        return this.h;
    }

    public void b(k k2) {
    }

    public l a(float f10, float f11) {
        float f12 = net.minecraft.k.h.c(f10 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f12 = net.minecraft.k.h.c(f12, 0.0f, 1.0f);
        float f13 = 0.7529412f;
        float f14 = 0.84705883f;
        float f15 = 1.0f;
        return new l(f13 *= f12 * 0.94f + 0.06f, f14 *= f12 * 0.94f + 0.06f, f15 *= f12 * 0.91f + 0.09f);
    }

    public double i() {
        return this.g == L.g ? 1.0 : 0.03125;
    }

    public float a(long l2, float f10) {
        float f11;
        float f12;
        float f13;
        block6: {
            float f14;
            block5: {
                int n2 = (int)(l2 % 24000L);
                String string = z.I();
                f13 = ((float)n2 + f10) / 24000.0f - 0.25f;
                float f15 = f13 - 0.0f;
                f14 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                if (string == null) break block5;
                if (f14 < 0) {
                    f13 += 1.0f;
                }
                f12 = f13;
                f11 = 1.0f;
                if (string == null) break block6;
                float f16 = f12 - f11;
                f14 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
            }
            if (f14 > 0) {
                f13 -= 1.0f;
            }
            f12 = 1.0f;
            f11 = (float)((Math.cos((double)f13 * Math.PI) + 1.0) / 2.0);
        }
        float f17 = f12 - f11;
        f13 += (f17 - f13) / 3.0f;
        return f13;
    }

    @Nullable
    public n k() {
        return null;
    }

    public void q() {
    }

    @Nullable
    public float[] b(float f10, float f11) {
        block3: {
            float f12;
            float f13;
            block4: {
                float f14;
                float f15;
                block2: {
                    float f16 = 0.4f;
                    f15 = net.minecraft.k.h.c(f10 * ((float)Math.PI * 2)) - 0.0f;
                    float f17 = -0.0f;
                    String string = z.I();
                    float f18 = f15 - -0.4f;
                    f14 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                    if (string == null) break block2;
                    if (f14 < 0) break block3;
                    f13 = f15;
                    f12 = 0.4f;
                    if (string == null) break block4;
                    float f19 = f13 - f12;
                    f14 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                }
                if (f14 > 0) break block3;
                f13 = (f15 - -0.0f) / 0.4f * 0.5f;
                f12 = 0.5f;
            }
            float f20 = f13 + f12;
            float f21 = 1.0f - (1.0f - net.minecraft.k.h.g(f20 * (float)Math.PI)) * 0.99f;
            f21 *= f21;
            this.c[0] = f20 * 0.3f + 0.7f;
            this.c[1] = f20 * f20 * 0.7f + 0.2f;
            this.c[2] = f20 * f20 * 0.0f + 0.2f;
            this.c[3] = f21;
            return this.c;
        }
        return null;
    }

    public boolean c(int n2, int n3) {
        return true;
    }

    public boolean s() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int c() {
        String string = z.I();
        G g10 = this;
        if (string != null) {
            if (g10.g == L.g) {
                return 4;
            }
            g10 = this;
        }
        int n2 = g10.e.y() + 1;
        return n2;
    }

    public boolean h() {
        return this.i;
    }

    static {
        j = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    }

    public boolean e() {
        return this.a;
    }

    protected void g() {
        float f10 = 0.0f;
        String string = z.I();
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f11 = 1.0f - (float)i2 / 15.0f;
            this.f[i2] = (1.0f - f11) / (f11 * 3.0f + 1.0f) * 1.0f + 0.0f;
            if (string != null) continue;
        }
    }

    protected void d() {
        block2: {
            block3: {
                L l2;
                L l3;
                String string;
                block0: {
                    L l4;
                    block1: {
                        this.i = true;
                        l4 = this.e.b().w();
                        string = z.I();
                        l3 = l4;
                        l2 = L.g;
                        if (string == null) break block0;
                        if (l3 != l2) break block1;
                        net.minecraft.aA.p p2 = net.minecraft.aA.p.a(this.e.b().r());
                        this.h = new c(net.minecraft.A.h.a(p2.d(), net.minecraft.u.d.ai));
                        if (string != null) break block2;
                    }
                    l3 = l4;
                    l2 = L.e;
                }
                if (l3 != l2) break block3;
                this.h = new c(net.minecraft.u.d.s);
                if (string != null) break block2;
            }
            this.h = new b(this.e.b());
        }
    }

    public a m() {
        return new a();
    }

    public void a(k k2) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public float[] j() {
        return this.f;
    }
}

