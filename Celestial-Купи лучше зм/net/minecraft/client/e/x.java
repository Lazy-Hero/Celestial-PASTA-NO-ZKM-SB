/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import net.minecraft.J.u;
import net.minecraft.ar.ay;
import net.minecraft.client.e.n;
import net.minecraft.client.e.s;
import net.minecraft.client.e.t;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.u.E;

public class x
extends t {
    private final /* synthetic */ u p;
    private final /* synthetic */ j o;

    @Override
    public void c() {
        block9: {
            block4: {
                x x2;
                block5: {
                    m[] arrm;
                    block8: {
                        block7: {
                            block6: {
                                arrm = s.b();
                                x2 = this;
                                if (arrm == null) break block4;
                                if (x2.p.P) break block5;
                                x2 = this;
                                if (arrm == null) break block4;
                                if (!x2.o.N()) break block5;
                                x2 = this;
                                if (arrm == null) break block4;
                                if (x2.o.as() != this.p) break block5;
                                float f10 = net.minecraft.k.h.e(this.p.aq * this.p.aq + this.p.d * this.p.d);
                                if (arrm == null) break block6;
                                if (!((double)f10 >= 0.01)) break block7;
                                this.e = 0.0f + net.minecraft.k.h.c(f10, 0.0f, 1.0f) * 0.75f;
                            }
                            if (arrm != null) break block8;
                        }
                        this.e = 0.0f;
                    }
                    if (arrm != null) break block9;
                }
                x2 = this;
            }
            x2.n = true;
        }
    }

    public x(j j2, u u2) {
        super(E.bg, ay.NEUTRAL);
        this.o = j2;
        this.p = u2;
        this.a = net.minecraft.client.e.n.NONE;
        this.c = true;
        this.g = 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

