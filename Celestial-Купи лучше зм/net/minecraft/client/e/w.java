/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import net.minecraft.J.u;
import net.minecraft.ar.ay;
import net.minecraft.client.e.s;
import net.minecraft.client.e.t;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.u.E;

public class w
extends t {
    private final /* synthetic */ u p;
    private /* synthetic */ float o;

    @Override
    public void c() {
        block4: {
            block5: {
                block6: {
                    u u2;
                    m[] arrm;
                    block2: {
                        block3: {
                            arrm = s.b();
                            u2 = this.p;
                            if (arrm == null) break block2;
                            if (!u2.P) break block3;
                            this.n = true;
                            if (arrm != null) break block4;
                        }
                        this.b = (float)this.p.a;
                        this.h = (float)this.p.aF;
                        this.i = (float)this.p.ax;
                        u2 = this.p;
                    }
                    float f10 = net.minecraft.k.h.e(u2.aq * this.p.aq + this.p.d * this.p.d);
                    if (arrm == null) break block5;
                    if (!((double)f10 >= 0.01)) break block6;
                    this.o = net.minecraft.k.h.c(this.o + 0.0025f, 0.0f, 1.0f);
                    this.e = 0.0f + net.minecraft.k.h.c(f10, 0.0f, 0.5f) * 0.7f;
                    if (arrm != null) break block4;
                }
                this.o = 0.0f;
            }
            this.e = 0.0f;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public w(u u2) {
        super(E.c7, ay.NEUTRAL);
        this.o = 0.0f;
        this.p = u2;
        this.c = true;
        this.g = 0;
    }
}

