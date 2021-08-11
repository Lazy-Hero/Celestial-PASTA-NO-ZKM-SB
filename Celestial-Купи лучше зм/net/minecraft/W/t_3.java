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
import net.minecraft.N.z;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.W.aM;
import net.minecraft.W.ar;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ad.a;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.client.B.o;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.s;

public class t
extends s {
    @Override
    public String h(d d10) {
        String string = "item.banner.";
        bl bl2 = t.a(d10);
        string = string + bl2.d() + ".name";
        return net.minecraft.ab.a.a(string);
    }

    @Override
    public void a(d d10, @Nullable net.minecraft.ah.z z2, List<String> list, o o2) {
        t.a(d10, list);
    }

    public static bl a(d d10) {
        return bl.d(d10.d() & 0xF);
    }

    @Override
    public void a(a a10, a2<d> a22) {
        int n2 = bl.c();
        if (this.b(a10)) {
            for (bl bl2 : bl.values()) {
                a22.add(t.a(bl2, null));
                if (n2 == 0) continue;
            }
        }
    }

    @Override
    public aX a(j j2, net.minecraft.ah.z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block8: {
            block12: {
                d d10;
                int n3;
                block15: {
                    block14: {
                        boolean bl2;
                        boolean bl3;
                        block13: {
                            block11: {
                                boolean bl4;
                                block9: {
                                    block10: {
                                        i i2 = z2.d(n2);
                                        bl3 = i2.b().b((net.minecraft.ah.t)z2, n2);
                                        n3 = bl.g();
                                        if (aA2 == aA.DOWN) break block8;
                                        bl4 = i2.o().d();
                                        if (n3 == 0) break block9;
                                        if (bl4) break block10;
                                        bl4 = bl3;
                                        if (n3 == 0) break block9;
                                        if (!bl4) break block8;
                                    }
                                    bl4 = bl3;
                                }
                                if (bl4 && aA2 != aA.UP) break block8;
                                n2 = n2.a(aA2);
                                d10 = j2.c(a32);
                                bl2 = j2.a(n2, aA2, d10);
                                if (n3 == 0) break block11;
                                if (!bl2) break block12;
                                bl2 = g.a4.a(z2, n2);
                            }
                            if (n3 == 0) break block13;
                            if (!bl2) break block12;
                            bl2 = z2.C;
                        }
                        if (n3 != 0) {
                            if (bl2) {
                                return aX.SUCCESS;
                            }
                            bl2 = bl3;
                        }
                        n n4 = n2 = bl2 ? n2.k() : n2;
                        if (aA2 != aA.UP) break block14;
                        int n5 = net.minecraft.k.h.f((double)((j2.e + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
                        z2.a(n2, g.a4.d().a(ar.A, n5), 3);
                        if (n3 != 0) break block15;
                    }
                    z2.a(n2, g.aG.d().a(aM.D, aA2), 3);
                }
                y y2 = z2.b(n2);
                boolean bl5 = y2 instanceof z;
                if (n3 != 0) {
                    if (bl5) {
                        ((z)y2).a(d10, false);
                    }
                    bl5 = j2 instanceof k;
                }
                if (bl5) {
                    a6.s.a((k)j2, n2, d10);
                }
                d10.b(1);
                return aX.SUCCESS;
            }
            return aX.FAIL;
        }
        return aX.FAIL;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public t() {
        super(g.a4);
        this.f = 16;
        this.a(net.minecraft.ad.a.j);
        this.a(true);
        this.d(0);
    }

    public static void a(d d10, List<String> list) {
        block7: {
            String string;
            r r2;
            int n2;
            block8: {
                r r3;
                block6: {
                    r3 = d10.c("BlockEntityTag");
                    n2 = bl.g();
                    r2 = r3;
                    if (n2 == 0) break block6;
                    if (r2 == null) break block7;
                    r2 = r3;
                }
                string = "Patterns";
                if (n2 == 0) break block8;
                if (!r2.b(string)) break block7;
                r2 = r3;
                string = "Patterns";
            }
            u u2 = r2.c(string, 10);
            int n3 = 0;
            while (n3 < u2.b() && n3 < 6) {
                r r4 = u2.d(n3);
                bl bl2 = bl.d(r4.m("Color"));
                net.minecraft.N.h h2 = net.minecraft.N.h.a(r4.j("Pattern"));
                if (n2 != 0) {
                    if (h2 != null) {
                        list.add(net.minecraft.ab.a.a("item.banner." + h2.c() + "." + bl2.d()));
                    }
                    ++n3;
                }
                if (n2 != 0) continue;
            }
        }
    }

    @Override
    public a j() {
        return net.minecraft.ad.a.j;
    }

    public static d a(bl bl2, @Nullable u u2) {
        d d10;
        block2: {
            u u3;
            block1: {
                d10 = new d(net.minecraft.u.h.aU, 1, bl2.a());
                int n2 = bl.c();
                u3 = u2;
                if (n2 != 0) break block1;
                if (u3 == null) break block2;
                u3 = u2;
            }
            if (!u3.c()) {
                d10.a("BlockEntityTag").a("Patterns", u2.a());
            }
        }
        return d10;
    }
}

