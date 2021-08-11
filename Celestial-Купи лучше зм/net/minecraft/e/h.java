/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.e;

import javax.annotation.Nullable;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.e.f;
import net.minecraft.e.i;
import net.minecraft.k.l;

public class h {
    private /* synthetic */ f a;
    private /* synthetic */ int f;
    private /* synthetic */ f[] b;
    private /* synthetic */ f[] d;
    private /* synthetic */ int e;
    private final /* synthetic */ f[] c;

    public int f() {
        return this.e;
    }

    public static h a(m m2) {
        f[] arrf;
        f[] arrf2;
        int n2;
        f[] arrf3;
        f f10;
        int n3;
        block6: {
            f[] arrf4;
            block5: {
                n3 = m2.readInt();
                f10 = net.minecraft.e.f.a(m2);
                arrf3 = new f[m2.readInt()];
                n2 = i.g();
                for (int i2 = 0; i2 < arrf3.length; ++i2) {
                    arrf4 = arrf3;
                    if (n2 == 0) {
                        arrf4[i2] = net.minecraft.e.f.a(m2);
                        if (n2 == 0) continue;
                    }
                    break block5;
                }
                arrf4 = new f[m2.readInt()];
            }
            arrf2 = arrf4;
            for (int i3 = 0; i3 < arrf2.length; ++i3) {
                arrf = arrf2;
                if (n2 == 0) {
                    arrf[i3] = net.minecraft.e.f.a(m2);
                    if (n2 == 0) continue;
                }
                break block6;
            }
            arrf = new f[m2.readInt()];
        }
        f[] arrf5 = arrf;
        for (int i4 = 0; i4 < arrf5.length; ++i4) {
            arrf5[i4] = net.minecraft.e.f.a(m2);
            if (n2 == 0) continue;
        }
        h h2 = new h(arrf3);
        h2.d = arrf2;
        h2.b = arrf5;
        h2.a = f10;
        h2.f = n3;
        return h2;
    }

    public l i() {
        f f10 = this.c[this.f];
        return new l(f10.g, f10.m, f10.f);
    }

    public void c() {
        ++this.f;
    }

    public l a(x x2) {
        return this.a(x2, this.f);
    }

    public int a() {
        return this.f;
    }

    public f[] b() {
        return this.b;
    }

    public void a(int n2, f f10) {
        this.c[n2] = f10;
    }

    public void a(int n2) {
        this.f = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public f d() {
        int n2 = i.g();
        h h2 = this;
        if (n2 == 0) {
            if (h2.e <= 0) return null;
            h2 = this;
        }
        f f10 = h2.c[this.e - 1];
        return f10;
    }

    public f b(int n2) {
        return this.c[n2];
    }

    public boolean h() {
        int n2 = i.g();
        int n3 = this.f;
        if (n2 == 0) {
            n3 = n3 >= this.e ? 1 : 0;
        }
        return n3 != 0;
    }

    public void c(int n2) {
        this.e = n2;
    }

    public h(f[] arrf) {
        this.d = new f[0];
        this.b = new f[0];
        this.c = arrf;
        this.e = arrf.length;
    }

    public f g() {
        return this.a;
    }

    public f[] e() {
        return this.d;
    }

    public l a(x x2, int n2) {
        double d10 = (double)this.c[n2].g + (double)((int)(x2.ad + 1.0f)) * 0.5;
        double d11 = this.c[n2].m;
        double d12 = (double)this.c[n2].f + (double)((int)(x2.ad + 1.0f)) * 0.5;
        return new l(d10, d11, d12);
    }

    public boolean a(h h2) {
        int n2;
        block8: {
            int n3;
            int n4 = i.g();
            h h3 = h2;
            if (n4 == 0) {
                if (h3 == null) {
                    return false;
                }
                h3 = h2;
            }
            int n5 = h3.c.length;
            if (n4 == 0) {
                if (n5 != this.c.length) {
                    return false;
                }
                n5 = n3 = 0;
            }
            while (n3 < this.c.length) {
                block11: {
                    int n6;
                    block9: {
                        block10: {
                            n2 = this.c[n3].g;
                            if (n4 != 0) break block8;
                            if (n4 != 0) break block9;
                            if (n2 != h2.c[n3].g) break block10;
                            n6 = this.c[n3].m;
                            if (n4 != 0) break block9;
                            if (n6 != h2.c[n3].m) break block10;
                            n6 = this.c[n3].f;
                            if (n4 != 0) break block9;
                            if (n6 == h2.c[n3].f) break block11;
                        }
                        n6 = 0;
                    }
                    return n6 != 0;
                }
                ++n3;
                if (n4 == 0) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

