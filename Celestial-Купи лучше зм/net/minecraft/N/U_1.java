/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class U
extends y {
    public /* synthetic */ boolean i;
    public /* synthetic */ byte j;

    @Override
    public r a(r r2) {
        super.a(r2);
        r2.a("note", this.j);
        r2.a("powered", this.i);
        return r2;
    }

    @Override
    public void c(r r2) {
        super.c(r2);
        this.j = r2.r("note");
        this.j = (byte)h.c(this.j, 0, 24);
        this.i = r2.f("powered");
    }

    public void a(z z2, n n2) {
        block20: {
            K k2;
            i i2;
            m[] arrm;
            block19: {
                arrm = net.minecraft.N.j.f();
                i2 = z2.d(n2.a());
                if (arrm != null) break block19;
                if (i2.o() != net.minecraft.ac.c.A) break block20;
                i2 = z2.d(n2.k());
            }
            i i3 = i2;
            c c10 = i3.o();
            int n3 = 0;
            c c11 = c10;
            c c12 = net.minecraft.ac.c.H;
            if (arrm == null) {
                if (c11 == c12) {
                    n3 = 1;
                }
                c11 = c10;
                c12 = net.minecraft.ac.c.o;
            }
            if (arrm == null) {
                if (c11 == c12) {
                    n3 = 2;
                }
                c11 = c10;
                c12 = net.minecraft.ac.c.M;
            }
            if (arrm == null) {
                if (c11 == c12) {
                    n3 = 3;
                }
                c11 = c10;
                c12 = net.minecraft.ac.c.k;
            }
            if (c11 == c12) {
                n3 = 4;
            }
            K k3 = k2 = i3.b();
            K k4 = g.d;
            if (arrm == null) {
                if (k3 == k4) {
                    n3 = 5;
                }
                k3 = k2;
                k4 = g.a7;
            }
            if (arrm == null) {
                if (k3 == k4) {
                    n3 = 6;
                }
                k3 = k2;
                k4 = g.s;
            }
            if (arrm == null) {
                if (k3 == k4) {
                    n3 = 7;
                }
                k3 = k2;
                k4 = g.cq;
            }
            if (arrm == null) {
                if (k3 == k4) {
                    n3 = 8;
                }
                k3 = k2;
                k4 = g.bm;
            }
            if (k3 == k4) {
                n3 = 9;
            }
            z2.a(n2, g.dm, n3, (int)this.j);
        }
    }

    public void a() {
        this.j = (byte)((this.j + 1) % 25);
        this.b();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

