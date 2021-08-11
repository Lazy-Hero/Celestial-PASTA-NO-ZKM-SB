/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.n;

import java.util.List;
import net.minecraft.U.B;
import net.minecraft.a0;
import net.minecraft.a2;
import net.minecraft.aN;
import net.minecraft.client.a.v;
import net.minecraft.client.e.y;
import net.minecraft.client.n.b;
import net.minecraft.client.n.d;
import net.minecraft.client.n.e;
import net.minecraft.client.n.h;
import net.minecraft.u.E;

public class j
implements b {
    private /* synthetic */ boolean d;
    private final /* synthetic */ aN c;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public h a(e e10, long l2) {
        block10: {
            int n2;
            block16: {
                long l3;
                block8: {
                    a2 a22;
                    block17: {
                        String[] arrstring;
                        block13: {
                            long l4;
                            long l5;
                            List<String> list;
                            block14: {
                                block15: {
                                    int n3;
                                    int n4;
                                    block11: {
                                        block12: {
                                            e e11;
                                            block9: {
                                                String[] arrstring2 = net.minecraft.client.n.d.b();
                                                e10.a().aN().b(a);
                                                arrstring = arrstring2;
                                                v.c(1.0f, 1.0f, 1.0f);
                                                a22 = this.c.d();
                                                e11 = e10;
                                                if (arrstring == null) break block9;
                                                e11.a(0, 0, 0, 0, 160, 32);
                                                if (a22 == null) break block10;
                                                e11 = e10;
                                            }
                                            list = e11.a().a6.c(a22.i().a(), 125);
                                            n4 = a22.j() == a0.CHALLENGE ? 0xFF88FF : 0xFFFF00;
                                            n3 = list.size();
                                            if (arrstring == null) break block11;
                                            if (n3 != 1) break block12;
                                            e10.a().a6.b(net.minecraft.client.D.h.a("advancements.toast." + a22.j().c(), new Object[0]), 30.0f, 7.0f, n4 | 0xFF000000);
                                            e10.a().a6.b(a22.i().a(), 30.0f, 18.0f, -1);
                                            if (arrstring != null) break block13;
                                        }
                                        n3 = 1500;
                                    }
                                    int n5 = n3;
                                    float f10 = 300.0f;
                                    long l6 = l2 - 1500L;
                                    l5 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                                    if (arrstring == null) break block14;
                                    if (l5 >= 0) break block15;
                                    l4 = net.minecraft.k.h.d(net.minecraft.k.h.c((float)(1500L - l2) / 300.0f, 0.0f, 1.0f) * 255.0f) << 24 | 0x4000000;
                                    e10.a().a6.b(net.minecraft.client.D.h.a("advancements.toast." + a22.j().c(), new Object[0]), 30.0f, 11.0f, n4 | l4);
                                    if (arrstring != null) break block13;
                                }
                                l5 = net.minecraft.k.h.d(net.minecraft.k.h.c((float)(l2 - 1500L) / 300.0f, 0.0f, 1.0f) * 252.0f) << 24 | 0x4000000;
                            }
                            l4 = l5;
                            int n6 = 16 - list.size() * e10.a().a6.p / 2;
                            for (String string : list) {
                                e10.a().a6.b(string, 30.0f, n6, 0xFFFFFF | l4);
                                n6 += e10.a().a6.p;
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                }
                                break block8;
                            }
                        }
                        n2 = this.d;
                        if (arrstring == null) break block16;
                        if (n2 != 0) break block17;
                        long l7 = l2 - 0L;
                        n2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (arrstring == null) break block16;
                        if (n2 <= 0) break block17;
                        this.d = true;
                        if (arrstring == null) break block8;
                        if (a22.j() == a0.CHALLENGE) {
                            e10.a().p().c(y.a(E.fM, 1.0f, 1.0f));
                        }
                    }
                    net.minecraft.client.a.a0.b();
                    e10.a().Y().a((B)null, a22.f(), 8, 8);
                }
                n2 = (l3 = l2 - 5000L) == 0L ? 0 : (l3 < 0L ? -1 : 1);
            }
            return n2 >= 0 ? h.HIDE : h.SHOW;
        }
        return h.HIDE;
    }

    public j(aN aN2) {
        this.d = false;
        this.c = aN2;
    }
}

