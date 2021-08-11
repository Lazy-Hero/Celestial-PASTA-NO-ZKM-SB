/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Map;
import java.util.Random;
import net.minecraft.N.O;
import net.minecraft.N.y;
import net.minecraft.ah.z;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ao.v;
import net.minecraft.ap.j;
import net.minecraft.ap.k;
import net.minecraft.ar.ae;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class x
extends v {
    private static final /* synthetic */ net.minecraft.ar.v l;
    private static final /* synthetic */ net.minecraft.ar.v k;
    private static final /* synthetic */ net.minecraft.ar.v m;

    public x(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 7, 5, 8);
    }

    public x() {
    }

    static {
        l = new net.minecraft.ar.v("igloo/igloo_top");
        k = new net.minecraft.ar.v("igloo/igloo_middle");
        m = new net.minecraft.ar.v("igloo/igloo_bottom");
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        boolean bl2;
        block14: {
            block13: {
                Object object;
                k k2;
                n n2;
                block16: {
                    Object object2;
                    net.minecraft.ap.g g10;
                    net.minecraft.ap.g g11;
                    j j2;
                    net.minecraft.R.b b11;
                    String[] arrstring;
                    block15: {
                        arrstring = u.b();
                        x x2 = this;
                        if (arrstring != null) {
                            if (!x2.a(z2, b10, -1)) {
                                return false;
                            }
                            x2 = this;
                        }
                        b b12 = x2.a();
                        n2 = new n(b12.c, b12.e, b12.f);
                        ae[] arrae = ae.values();
                        b11 = z2.H();
                        j2 = z2.v().d();
                        k2 = new k().a(arrae[random.nextInt(arrae.length)]).a(net.minecraft.u.g.Y).a(b12);
                        g10 = g11 = j2.a(b11, l);
                        if (arrstring == null) break block15;
                        g10.a(z2, n2, k2);
                        if (!(random.nextDouble() < 0.5)) break block16;
                        g10 = j2.a(b11, k);
                    }
                    object = g10;
                    net.minecraft.ap.g g12 = j2.a(b11, m);
                    int n3 = random.nextInt(8) + 4;
                    for (int i2 = 0; i2 < n3; ++i2) {
                        object2 = g11.a(k2, new n(3, -1 - i2 * 3, 5), k2, new n(1, 2, 1));
                        ((net.minecraft.ap.g)object).a(z2, n2.b((m)object2), k2);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block13;
                    }
                    n n4 = n2.b(g11.a(k2, new n(3, -1 - n3 * 3, 5), k2, new n(3, 5, 7)));
                    g12.a(z2, n4, k2);
                    object2 = g12.a(n4, k2);
                    for (Map.Entry entry : object2.entrySet()) {
                        block18: {
                            y y2;
                            block19: {
                                y y3;
                                String string;
                                block17: {
                                    string = "chest";
                                    if (arrstring == null) break block17;
                                    bl2 = string.equals(entry.getValue());
                                    if (arrstring == null) break block14;
                                    if (!bl2) break block18;
                                    string = entry.getKey();
                                }
                                n n5 = (n)((Object)string);
                                z2.a(n5, net.minecraft.u.g.bf.d(), 3);
                                y2 = y3 = z2.b(n5.k());
                                if (arrstring == null) break block19;
                                if (!(y2 instanceof O)) break block18;
                                y2 = y3;
                            }
                            ((O)y2).a(net.minecraft.aj.j.as, random.nextLong());
                        }
                        if (arrstring != null) continue;
                    }
                    if (arrstring != null) break block13;
                }
                object = net.minecraft.ap.g.a(k2, new n(3, 0, 5));
                z2.a(n2.b((m)object), net.minecraft.u.g.da.d(), 3);
            }
            bl2 = true;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

