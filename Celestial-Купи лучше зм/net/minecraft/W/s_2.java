/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.W.K;
import net.minecraft.W.d_;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.client.B.o;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class s
extends k {
    protected final /* synthetic */ K s;

    public boolean a(z z2, n n2, aA aA2, j j2, d d10) {
        boolean bl2;
        block7: {
            block6: {
                K k2;
                int n3;
                block4: {
                    K k3;
                    block5: {
                        k3 = z2.d(n2).b();
                        n3 = bl.g();
                        k2 = k3;
                        if (n3 == 0) break block4;
                        if (k2 != g.o) break block5;
                        aA2 = aA.UP;
                        if (n3 != 0) break block6;
                    }
                    k2 = k3;
                }
                bl2 = k2.b((t)z2, n2);
                if (n3 == 0) break block7;
                if (!bl2) {
                    n2 = n2.a(aA2);
                }
            }
            bl2 = z2.a(this.s, n2, false, aA2, null);
        }
        return bl2;
    }

    @Override
    public String d(d d10) {
        return this.s.k();
    }

    public s(K k2) {
        this.s = k2;
    }

    @Override
    public a j() {
        return this.s.u();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a(a a10, a2<d> a22) {
        block3: {
            s s2;
            block2: {
                int n2 = bl.c();
                s2 = this;
                if (n2 != 0) break block2;
                if (!s2.b(a10)) break block3;
                s2 = this;
            }
            s2.s.a(a10, a22);
        }
    }

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, o o2) {
        super.a(d10, z2, list, o2);
        this.s.a(d10, z2, list, o2);
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block6: {
            block10: {
                K k2;
                d d10;
                block11: {
                    block12: {
                        n n3;
                        z z3;
                        i i2;
                        int n4;
                        block9: {
                            int n5;
                            block8: {
                                block7: {
                                    block5: {
                                        i i3 = z2.d(n2);
                                        n4 = bl.c();
                                        K k3 = i3.b();
                                        if (!k3.b((t)z2, n2)) {
                                            n2 = n2.a(aA2);
                                        }
                                        d10 = j2.c(a32);
                                        n5 = d10.G();
                                        if (n4 != 0) break block5;
                                        if (n5 != 0) break block6;
                                        n5 = j2.a(n2, aA2, d10);
                                    }
                                    if (n4 != 0) break block7;
                                    if (n5 == 0) break block6;
                                    n5 = z2.a(this.s, n2, false, aA2, null) ? 1 : 0;
                                }
                                if (n4 != 0) break block8;
                                if (n5 == 0) break block6;
                                n5 = this.c(d10.d());
                            }
                            int n6 = n5;
                            i2 = this.s.a(z2, n2, aA2, f10, f11, f12, n6, j2);
                            z3 = z2;
                            n3 = n2;
                            if (n4 != 0) break block9;
                            if (!z3.a(n3, i2, 11)) break block10;
                            z3 = z2;
                            n3 = n2;
                        }
                        i2 = z3.d(n3);
                        k2 = i2.b();
                        if (n4 != 0) break block11;
                        if (k2 != this.s) break block12;
                        net.minecraft.w.s.a(z2, j2, n2, d10);
                        k2 = this.s;
                        if (n4 != 0) break block11;
                        k2.a(z2, n2, i2, j2, d10);
                        if (j2 instanceof net.minecraft.i.k) {
                            a6.s.a((net.minecraft.i.k)j2, n2, d10);
                        }
                    }
                    k2 = this.s;
                }
                d_ d_2 = k2.l();
                z2.a(j2, n2, d_2.a(), ay.BLOCKS, (d_2.c() + 1.0f) / 2.0f, d_2.e() * 0.8f);
                d10.b(1);
            }
            return aX.SUCCESS;
        }
        return aX.FAIL;
    }

    public K a() {
        return this.s;
    }

    @Override
    public String h() {
        return this.s.k();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(z z2, @Nullable j j2, n n2, d d10) {
        y y2;
        y y3;
        r r2;
        int n3;
        block8: {
            block7: {
                boolean bl2;
                block6: {
                    b b10 = z2.H();
                    n3 = bl.c();
                    if (b10 == null) {
                        return false;
                    }
                    r2 = d10.c("BlockEntityTag");
                    if (r2 == null) return false;
                    y3 = z2.b(n2);
                    if (y3 == null) return false;
                    bl2 = z2.C;
                    if (n3 != 0) break block6;
                    if (bl2) break block7;
                    y2 = y3;
                    if (n3 != 0) break block8;
                    bl2 = y2.n();
                }
                if (bl2) {
                    j j3 = j2;
                    if (n3 == 0) {
                        if (j3 == null) return false;
                        j3 = j2;
                    }
                    boolean bl3 = j3.b();
                    if (n3 != 0) return bl3;
                    if (!bl3) {
                        return false;
                    }
                }
            }
            y2 = y3;
        }
        r r3 = y2.a(new r());
        r r4 = r3.c();
        r3.a(r2);
        r3.b("x", n2.e());
        r3.b("y", n2.b());
        r3.b("z", n2.a());
        boolean bl4 = r3.equals(r4);
        if (n3 != 0) return bl4;
        if (bl4) return false;
        y3.c(r3);
        y3.b();
        return true;
    }
}

