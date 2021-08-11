/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.N.T;
import net.minecraft.N.p;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.q;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bq;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.ar.v;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class aG
extends k {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(d var0, v var1_1) {
        var2_2 = bl.g();
        v0 = var0;
        if (var2_2 == 0) ** GOTO lbl6
        if (v0.x()) {
            v0 = var0;
lbl6:
            // 2 sources

            v1 = v0.v();
        } else {
            v1 = new r();
        }
        var3_3 = v1;
        var4_4 = new r();
        var4_4.a("id", var1_1.toString());
        var3_3.a("EntityTag", var4_4);
        var0.b(var3_3);
    }

    public static void a(z z2, @Nullable net.minecraft.i.j j2, d d10, @Nullable x x2) {
        block3: {
            x x3;
            r r2;
            block8: {
                block7: {
                    boolean bl2;
                    b b10;
                    block6: {
                        int n2;
                        block5: {
                            r r3;
                            block4: {
                                b10 = z2.H();
                                n2 = bl.g();
                                if (b10 == null || x2 == null) break block3;
                                r3 = r2 = d10.v();
                                if (n2 == 0) break block4;
                                if (r3 == null) break block3;
                                r3 = r2;
                            }
                            bl2 = r3.a("EntityTag", 10);
                            if (n2 == 0) break block5;
                            if (!bl2) break block3;
                            bl2 = z2.C;
                        }
                        if (n2 == 0) break block6;
                        if (bl2) break block7;
                        x3 = x2;
                        if (n2 == 0) break block8;
                        bl2 = x3.aa();
                    }
                    if (bl2 && (j2 == null || !b10.O().e(j2.m()))) {
                        return;
                    }
                }
                x3 = x2;
            }
            r r4 = x3.b(new r());
            UUID uUID = x2.u();
            r4.a(r2.h("EntityTag"));
            x2.a(uUID);
            x2.d(r4);
        }
    }

    @Override
    public String h(d d10) {
        String string;
        String string2 = ("" + net.minecraft.ab.a.a(this.h() + ".name")).trim();
        int n2 = bl.c();
        String string3 = string = net.minecraft.U.h.a(aG.a(d10));
        if (n2 == 0) {
            if (string3 != null) {
                string2 = string2 + " " + net.minecraft.ab.a.a("entity." + string + ".name");
            }
            string3 = string2;
        }
        return string3;
    }

    public aG() {
        this.a(net.minecraft.ad.a.n);
    }

    @Override
    public aX a(net.minecraft.i.j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block14: {
            boolean bl2;
            d d10;
            block15: {
                x x2;
                block16: {
                    x x3;
                    int n3;
                    block13: {
                        Object object;
                        block11: {
                            Object object2;
                            net.minecraft.Z.i i2;
                            block12: {
                                d10 = j2.c(a32);
                                n3 = bl.c();
                                boolean bl3 = z2.C;
                                if (n3 == 0) {
                                    if (bl3) {
                                        return aX.SUCCESS;
                                    }
                                    bl3 = j2.a(n2.a(aA2), aA2, d10);
                                }
                                if (!bl3) {
                                    return aX.FAIL;
                                }
                                i2 = z2.d(n2);
                                K k2 = i2.b();
                                if (k2 != g.i) break block11;
                                object2 = object = z2.b(n2);
                                if (n3 != 0) break block12;
                                if (!(object2 instanceof T)) break block11;
                                object2 = object;
                            }
                            p p2 = ((T)object2).a();
                            p2.a(aG.a(d10));
                            ((y)object).b();
                            z2.a(n2, i2, i2, 3);
                            if (!j2.cw.g) {
                                d10.b(1);
                            }
                            return aX.SUCCESS;
                        }
                        object = n2.a(aA2);
                        double d11 = this.a(z2, (n)object);
                        x3 = x2 = aG.a(z2, aG.a(d10), (double)((m)object).e() + 0.5, (double)((m)object).b() + d11, (double)((m)object).a() + 0.5);
                        if (n3 != 0) break block13;
                        if (x3 == null) break block14;
                        x3 = x2;
                    }
                    bl2 = x3 instanceof B;
                    if (n3 != 0) break block15;
                    if (!bl2) break block16;
                    bl2 = d10.c();
                    if (n3 != 0) break block15;
                    if (bl2) {
                        x2.a(d10.g());
                    }
                }
                aG.a(z2, j2, d10, x2);
                bl2 = j2.cw.g;
            }
            if (bl2) break block14;
            d10.b(1);
        }
        return aX.SUCCESS;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Nullable
    public static x a(z z2, @Nullable v v2, double d10, double d11, double d12) {
        int n2 = bl.c();
        if (v2 != null && net.minecraft.U.h.g.containsKey(v2)) {
            x x2;
            block5: {
                x x3 = null;
                int n3 = 0;
                while (n3 < 1) {
                    x3 = net.minecraft.U.h.a(v2, z2);
                    if (n2 == 0) {
                        x2 = x3;
                        if (n2 != 0) break block5;
                        if (x2 instanceof C) {
                            C c10 = (C)x3;
                            x3.c(d10, d11, d12, net.minecraft.k.h.b(z2.J.nextFloat() * 360.0f), 0.0f);
                            c10.a1 = c10.e;
                            c10.bf = c10.e;
                            c10.a(z2.h(new n(c10)), null);
                            z2.f(x3);
                            c10.i();
                        }
                        ++n3;
                    }
                    if (n2 == 0) continue;
                }
                x2 = x3;
            }
            return x2;
        }
        return null;
    }

    @Nullable
    public static v a(d d10) {
        v v2;
        block6: {
            r r2;
            r r3 = d10.v();
            int n2 = bl.c();
            r r4 = r3;
            if (n2 == 0) {
                if (r4 == null) {
                    return null;
                }
                r4 = r3;
            }
            String string = "EntityTag";
            if (n2 == 0) {
                if (!r4.a(string, 10)) {
                    return null;
                }
                r4 = r3;
                string = "EntityTag";
            }
            r r5 = r2 = r4.h(string);
            String string2 = "id";
            if (n2 == 0) {
                if (!r5.a(string2, 8)) {
                    return null;
                }
                r5 = r2;
                string2 = "id";
            }
            String string3 = r5.j(string2);
            v2 = new v(string3);
            if (string3.contains(":")) break block6;
            r2.a("id", v2.toString());
        }
        return v2;
    }

    @Override
    public void a(a a10, a2<d> a22) {
        int n2 = bl.g();
        if (this.b(a10)) {
            for (q q2 : net.minecraft.U.h.g.values()) {
                d d10 = new d(this, 1);
                aG.a(d10, q2.e);
                a22.add(d10);
                if (n2 != 0) continue;
            }
        }
    }

    @Override
    public t<d> a(z z2, net.minecraft.i.j j2, a3 a32) {
        d d10;
        block11: {
            block14: {
                net.minecraft.i.j j3;
                block18: {
                    boolean bl2;
                    block16: {
                        net.minecraft.i.j j4;
                        int n2;
                        block17: {
                            x x2;
                            block15: {
                                boolean bl3;
                                n n3;
                                block13: {
                                    i i2;
                                    i i3;
                                    block12: {
                                        block10: {
                                            d10 = j2.c(a32);
                                            n2 = bl.g();
                                            if (z2.C) {
                                                return new t<d>(aX.PASS, d10);
                                            }
                                            i2 = i3 = this.a(z2, j2, true);
                                            if (n2 == 0) break block10;
                                            if (i2 == null) break block11;
                                            i2 = i3;
                                        }
                                        if (n2 == 0) break block12;
                                        if (i2.d != j.BLOCK) break block11;
                                        i2 = i3;
                                    }
                                    n3 = i2.a();
                                    bl3 = z2.d(n3).b() instanceof bq;
                                    if (n2 != 0) {
                                        if (!bl3) {
                                            return new t<d>(aX.PASS, d10);
                                        }
                                        bl3 = z2.a(j2, n3);
                                    }
                                    if (n2 == 0) break block13;
                                    if (!bl3) break block14;
                                    x2 = j2;
                                    if (n2 == 0) break block15;
                                    bl3 = x2.a(n3, i3.b, d10);
                                }
                                if (!bl3) break block14;
                                x2 = aG.a(z2, aG.a(d10), (double)n3.e() + 0.5, (double)n3.b() + 0.5, (double)n3.a() + 0.5);
                            }
                            net.minecraft.i.j j5 = j4 = x2;
                            if (n2 != 0) {
                                if (j5 == null) {
                                    return new t<d>(aX.PASS, d10);
                                }
                                j5 = j4;
                            }
                            bl2 = j5 instanceof B;
                            if (n2 == 0) break block16;
                            if (!bl2) break block17;
                            bl2 = d10.c();
                            if (n2 == 0) break block16;
                            if (bl2) {
                                j4.a(d10.g());
                            }
                        }
                        aG.a(z2, j2, d10, j4);
                        j3 = j2;
                        if (n2 == 0) break block18;
                        bl2 = j3.cw.g;
                    }
                    if (!bl2) {
                        d10.b(1);
                    }
                    j3 = j2;
                }
                j3.b(net.minecraft.l.m.b(this));
                return new t<d>(aX.SUCCESS, d10);
            }
            return new t<d>(aX.FAIL, d10);
        }
        return new t<d>(aX.PASS, d10);
    }

    protected double a(z z2, n n2) {
        double d10;
        block3: {
            net.minecraft.k.k k2 = new net.minecraft.k.k(n2).d(0.0, -1.0, 0.0);
            List<net.minecraft.k.k> list = z2.a((x)null, k2);
            int n3 = bl.c();
            if (list.isEmpty()) {
                return 0.0;
            }
            double d11 = k2.b;
            for (net.minecraft.k.k k3 : list) {
                d10 = Math.max(k3.a, d11);
                if (n3 == 0) {
                    d11 = d10;
                    if (n3 == 0) continue;
                }
                break block3;
            }
            d10 = d11 - (double)n2.b();
        }
        return d10;
    }
}

