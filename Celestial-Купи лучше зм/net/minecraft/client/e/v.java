/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import net.minecraft.T.a0;
import net.minecraft.ar.ay;
import net.minecraft.client.e.n;
import net.minecraft.client.e.s;
import net.minecraft.client.e.t;
import net.minecraft.k.m;
import net.minecraft.u.E;

public class v
extends t {
    private final /* synthetic */ a0 o;

    @Override
    public void c() {
        block4: {
            block2: {
                v v2;
                block3: {
                    m[] arrm = s.b();
                    v2 = this;
                    if (arrm == null) break block2;
                    if (v2.o.P) break block3;
                    v2 = this;
                    if (arrm == null) break block2;
                    if (!v2.o.f()) break block3;
                    this.b = (float)this.o.a;
                    this.h = (float)this.o.aF;
                    this.i = (float)this.o.ax;
                    float f10 = this.o.b(0.0f);
                    this.e = 0.0f + 1.0f * f10 * f10;
                    this.f = 0.7f + 0.5f * f10;
                    if (arrm != null) break block4;
                }
                v2 = this;
            }
            v2.n = true;
        }
    }

    public v(a0 a02) {
        super(E.g5, ay.HOSTILE);
        this.o = a02;
        this.a = net.minecraft.client.e.n.NONE;
        this.c = true;
        this.g = 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

