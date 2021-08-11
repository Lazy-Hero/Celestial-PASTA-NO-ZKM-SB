/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.U.x;
import net.minecraft.client.Q;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.v;
import net.minecraft.k.l;
import org.lwjgl.opengl.GL11;

public class eB {
    /* synthetic */ float f;
    private /* synthetic */ l h;
    private /* synthetic */ boolean e;
    private /* synthetic */ boolean l;
    private /* synthetic */ int b;
    private /* synthetic */ double d;
    private /* synthetic */ boolean i;
    private /* synthetic */ double j;
    /* synthetic */ int g;
    private /* synthetic */ l a;
    private /* synthetic */ double m;
    private final /* synthetic */ Q c;
    private /* synthetic */ int k;

    public eB(Q q2) {
        this.i = false;
        this.e = false;
        this.l = false;
        this.b = 0;
        this.h = new l(-1.0, -1.0, -1.0);
        this.m = 0.0;
        this.j = 0.0;
        this.d = 0.0;
        this.k = -1;
        this.c = q2;
        this.k = aZ.c(1);
    }

    public void a() {
        block4: {
            float f10;
            float f11;
            float f12;
            block3: {
                String string;
                block2: {
                    x x2 = this.c.Z();
                    double d10 = x2.N + (x2.a - x2.N) * (double)this.f;
                    double d11 = x2.L + (x2.aF - x2.L) * (double)this.f;
                    string = K.d();
                    double d12 = x2.k + (x2.ax - x2.k) * (double)this.f;
                    double d13 = (float)(this.g - this.b) + this.f;
                    f12 = (float)(d10 - this.m + d13 * 0.03);
                    f11 = (float)(d11 - this.j);
                    f10 = (float)(d12 - this.d);
                    v.M();
                    if (string != null) break block2;
                    if (!this.e) break block3;
                    v.b(-f12 / 12.0f, -f11, -f10 / 12.0f);
                }
                if (string == null) break block4;
            }
            v.b(-f12, -f11, -f10);
        }
        v.s(this.k);
        v.B();
        v.p();
    }

    public void a(boolean bl2, int n2, float f10, l l2) {
        this.e = bl2;
        this.g = n2;
        this.f = f10;
        this.a = l2;
    }

    public boolean b() {
        double d10;
        eB eB2;
        String string;
        block20: {
            int n2;
            block19: {
                block18: {
                    int n3;
                    block17: {
                        string = K.d();
                        n2 = this.i;
                        if (string == null) {
                            if (n2 == 0) {
                                return true;
                            }
                            n2 = this.e;
                        }
                        n3 = this.l;
                        if (string != null) break block17;
                        if (n2 != n3) {
                            return true;
                        }
                        n2 = this.g;
                        if (string != null) break block18;
                        n3 = this.b + 20;
                    }
                    if (n2 >= n3) {
                        return true;
                    }
                    double d11 = Math.abs(this.a.e - this.h.e) - 0.003;
                    n2 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                }
                if (string == null) {
                    if (n2 > 0) {
                        return true;
                    }
                    double d12 = Math.abs(this.a.d - this.h.d) - 0.003;
                    n2 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                }
                if (string != null) break block19;
                if (n2 > 0) {
                    return true;
                }
                eB2 = this;
                if (string != null) break block20;
                double d13 = Math.abs(eB2.a.b - this.h.b) - 0.003;
                n2 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
            }
            if (n2 > 0) {
                return true;
            }
            eB2 = this;
        }
        x x2 = eB2.c.Z();
        double d15 = this.j + (double)x2.l() - (128.0 + (double)(this.c.ac.ak * 128.0f));
        d15 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
        if (string == null) {
            d15 = d15 < 0 ? 1.0 : 0.0;
        }
        double d16 = d15;
        double d18 = x2.L + (double)x2.l() - (128.0 + (double)(this.c.ac.ak * 128.0f));
        d18 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
        if (string == null) {
            d18 = d18 < 0 ? 1.0 : 0.0;
        }
        double d19 = d10 = d18;
        if (string == null) {
            d19 = d19 != d16 ? 1.0 : 0.0;
        }
        return (boolean)d19;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void c() {
        GL11.glNewList((int)this.k, (int)4864);
    }

    public void d() {
        this.i = false;
    }

    public void e() {
        GL11.glEndList();
        this.l = this.e;
        this.b = this.g;
        this.h = this.a;
        this.m = this.c.Z().N;
        this.j = this.c.Z().L;
        this.d = this.c.Z().k;
        this.i = true;
        v.p();
    }
}

