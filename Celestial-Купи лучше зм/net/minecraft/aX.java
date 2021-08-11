/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft;

import java.util.Arrays;
import net.minecraft.E.g;
import net.minecraft.E.h;
import net.minecraft.J.t;
import net.minecraft.U.x;
import net.minecraft.a5;
import net.minecraft.aG;
import net.minecraft.aj.b;
import net.minecraft.ar.ay;
import net.minecraft.ar.v;
import net.minecraft.i.k;
import net.minecraft.u.E;
import net.minecraft.w.d;

public class aX {
    private final /* synthetic */ v[] b;
    private final /* synthetic */ int c;
    private final /* synthetic */ h d;
    public static final /* synthetic */ aX e;
    private final /* synthetic */ v[] a;

    static {
        e = new aX(0, new v[0], new v[0], h.b);
    }

    public String toString() {
        return "AdvancementRewards{experience=" + this.c + ", loot=" + Arrays.toString(this.a) + ", recipes=" + Arrays.toString(this.b) + ", function=" + this.d + '}';
    }

    public void a(k k2) {
        g g10;
        k k3;
        Object object;
        block10: {
            boolean bl2 = aG.b();
            k2.b(this.c);
            net.minecraft.aj.k k4 = new b(k2.n()).a((x)k2).a();
            int n2 = 0;
            object = this.a;
            int n3 = ((v[])object).length;
            boolean bl3 = bl2;
            int n4 = 0;
            block0: while (true) {
                int n5 = n4;
                block1: while (n5 < n3) {
                    v v2 = object[n4];
                    k3 = k2;
                    if (!bl3) break block10;
                    for (d d10 : k3.aG.D().a(v2).a(k2.f(), k4)) {
                        block13: {
                            t t2;
                            block14: {
                                t t3;
                                d d11;
                                k k5;
                                block11: {
                                    block12: {
                                        k5 = k2;
                                        d11 = d10;
                                        if (!bl3) break block11;
                                        n5 = k5.a(d11) ? (byte)1 : 0;
                                        if (!bl3) continue block1;
                                        if (n5 == 0) break block12;
                                        k2.aG.a(null, k2.a, k2.aF, k2.ax, E.ak, ay.PLAYERS, 0.2f, ((k2.f().nextFloat() - k2.f().nextFloat()) * 0.7f + 1.0f) * 2.0f);
                                        n2 = 1;
                                        if (bl3) break block13;
                                    }
                                    k5 = k2;
                                    d11 = d10;
                                }
                                t2 = t3 = k5.a(d11, false);
                                if (!bl3) break block14;
                                if (t2 == null) break block13;
                                t3.d();
                                t2 = t3;
                            }
                            t2.b(k2.g());
                        }
                        if (bl3) continue;
                    }
                    ++n4;
                    if (bl3) continue block0;
                }
                break;
            }
            int n6 = n2;
            if (bl3) {
                if (n6 != 0) {
                    k2.cu.a();
                }
                n6 = this.b.length;
            }
            if (n6 > 0) {
                k2.a(this.b);
            }
            k3 = k2;
        }
        if ((g10 = this.d.a(((net.minecraft.R.b)(object = k3.c3)).s())) != null) {
            a5 a52 = new a5(this, k2, (net.minecraft.R.b)object);
            ((net.minecraft.R.b)object).s().a(g10, a52);
        }
    }

    public aX(int n2, v[] arrv, v[] arrv2, h h2) {
        this.c = n2;
        this.a = arrv;
        this.b = arrv2;
        this.d = h2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

