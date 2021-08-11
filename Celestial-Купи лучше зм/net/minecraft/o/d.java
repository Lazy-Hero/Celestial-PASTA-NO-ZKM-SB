/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.o;

import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.ar.aF;
import net.minecraft.k.h;
import net.minecraft.o.a;
import net.minecraft.o.c;
import net.minecraft.o.e;
import net.minecraft.o.f;
import net.minecraft.o.g;
import net.minecraft.o.i;
import net.minecraft.o.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class d
implements i {
    protected static final /* synthetic */ net.minecraft.Z.i d;
    protected /* synthetic */ e e;
    private /* synthetic */ int c;
    protected /* synthetic */ aF b;
    private static final /* synthetic */ e a;

    public int a() {
        return 1 + this.e.a() + net.minecraft.C.m.a(this.b.a()) + this.b.b().length * 8;
    }

    public d() {
        this.b(4);
    }

    public void b(net.minecraft.C.m m2) {
        m2.writeByte(this.c);
        this.e.a(m2);
        m2.a(this.b.b());
    }

    @Override
    public int a(int n2, net.minecraft.Z.i i2) {
        e e10;
        block4: {
            aF aF2 = this.b;
            int[] arrn = net.minecraft.o.a.k();
            e e11 = this.e;
            this.b(n2);
            int n3 = 0;
            int[] arrn2 = arrn;
            while (n3 < aF2.a()) {
                e10 = e11;
                if (arrn2 != null) {
                    net.minecraft.Z.i i3 = e10.a(aF2.a(n3));
                    if (arrn2 != null) {
                        if (i3 != null) {
                            this.a(n3, i3);
                        }
                        ++n3;
                    }
                    if (arrn2 != null) continue;
                }
                break block4;
            }
            e10 = this.e;
        }
        return e10.a(i2);
    }

    public net.minecraft.Z.i b(int n2, int n3, int n4) {
        return this.a(net.minecraft.o.d.a(n2, n3, n4));
    }

    protected void a(int n2, net.minecraft.Z.i i2) {
        int n3 = this.e.a(i2);
        this.b.a(n2, n3);
    }

    protected net.minecraft.Z.i a(int n2) {
        net.minecraft.Z.i i2 = this.e.a(this.b.a(n2));
        int[] arrn = net.minecraft.o.a.k();
        net.minecraft.Z.i i3 = i2;
        if (arrn != null) {
            i3 = i3 == null ? d : i2;
        }
        return i3;
    }

    @Nullable
    public m a(byte[] arrby, m m2) {
        m m3 = null;
        int[] arrn = net.minecraft.o.a.k();
        int n2 = 0;
        while (n2 < 4096) {
            int n3 = K.i.a(this.a(n2));
            int n4 = n2 & 0xF;
            int n5 = n2 >> 8 & 0xF;
            int n6 = n2 >> 4 & 0xF;
            if (arrn != null) {
                if ((n3 >> 12 & 0xF) != 0) {
                    m m4 = m3;
                    if (arrn != null) {
                        if (m4 == null) {
                            m3 = new m();
                        }
                        m4 = m3;
                    }
                    m4.a(n4, n5, n6, n3 >> 12 & 0xF);
                }
                arrby[n2] = (byte)(n3 >> 4 & 0xFF);
                m2.a(n4, n5, n6, n3 & 0xF);
                ++n2;
            }
            if (arrn != null) continue;
        }
        return m3;
    }

    public void a(int n2, int n3, int n4, net.minecraft.Z.i i2) {
        this.a(net.minecraft.o.d.a(n2, n3, n4), i2);
    }

    private void b(int n2) {
        block3: {
            block6: {
                block7: {
                    d d10;
                    block8: {
                        int n3;
                        int n4;
                        int[] arrn;
                        block4: {
                            block5: {
                                block2: {
                                    arrn = net.minecraft.o.a.k();
                                    n4 = n2;
                                    n3 = this.c;
                                    if (arrn == null) break block2;
                                    if (n4 == n3) break block3;
                                    n4 = this.c = n2;
                                    n3 = 4;
                                }
                                if (arrn == null) break block4;
                                if (n4 > n3) break block5;
                                this.c = 4;
                                this.e = new c(this.c, this);
                                if (arrn != null) break block6;
                            }
                            d10 = this;
                            if (arrn == null) break block7;
                            n4 = d10.c;
                            n3 = 8;
                        }
                        if (n4 > n3) break block8;
                        this.e = new g(this.c, this);
                        if (arrn != null) break block6;
                    }
                    this.e = a;
                    d10 = this;
                }
                d10.c = h.f(K.i.a());
            }
            this.e.a(d);
            this.b = new aF(this.c, 4096);
        }
    }

    public void a(net.minecraft.C.m m2) {
        byte by2 = m2.readByte();
        int[] arrn = net.minecraft.o.a.k();
        d d10 = this;
        if (arrn != null) {
            if (d10.c != by2) {
                this.b(by2);
            }
            d10 = this;
        }
        d10.e.b(m2);
        m2.b(this.b.b());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = new f();
        d = net.minecraft.u.g.bf.d();
    }

    private static int a(int n2, int n3, int n4) {
        return n3 << 8 | n4 << 4 | n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(byte[] var1_1, m var2_2, @Nullable m var3_3) {
        var5_4 = 0;
        var4_5 = net.minecraft.o.a.k();
        do {
            if (var5_4 >= 4096) return;
            var6_6 = var5_4 & 15;
            var7_7 = var5_4 >> 8 & 15;
            var8_8 = var5_4 >> 4 & 15;
            v0 = var3_3;
            if (var4_5 == null) ** GOTO lbl14
            if (v0 == null) {
                v1 = 0;
            } else {
                v0 = var3_3;
lbl14:
                // 2 sources

                v1 = v0.b(var6_6, var7_7, var8_8);
            }
            var9_9 = v1;
            var10_10 = var9_9 << 12 | (var1_1[var5_4] & 255) << 4 | var2_2.b(var6_6, var7_7, var8_8);
            this.a(var5_4, K.i.a(var10_10));
            ++var5_4;
        } while (var4_5 != null);
    }
}

