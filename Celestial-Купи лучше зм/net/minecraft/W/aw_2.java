/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.K.j;
import net.minecraft.U.B;
import net.minecraft.a6;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.ar.t;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.w.bE;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aw
extends k {
    private final /* synthetic */ int u;
    private final /* synthetic */ float t;
    public final /* synthetic */ int s;
    private /* synthetic */ float x;
    private /* synthetic */ j v;
    private /* synthetic */ boolean w;
    private final /* synthetic */ boolean y;

    public aw a(j j2, float f10) {
        this.v = j2;
        this.x = f10;
        return this;
    }

    protected void b(d d10, z z2, net.minecraft.i.j j2) {
        block0: {
            if (z2.C || this.v == null || !(z2.J.nextFloat() < this.x)) break block0;
            j2.b(new j(this.v));
        }
    }

    public aw(int n2, boolean bl2) {
        this(n2, 0.6f, bl2);
    }

    public aw(int n2, float f10, boolean bl2) {
        this.s = 32;
        this.u = n2;
        this.y = bl2;
        this.t = f10;
        this.a(net.minecraft.ad.a.k);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public int b(d d10) {
        return this.u;
    }

    @Override
    public d a(d d10, z z2, B b10) {
        block4: {
            block5: {
                int n2 = bl.c();
                if (n2 != 0) break block4;
                if (!(b10 instanceof net.minecraft.i.j)) break block5;
                net.minecraft.i.j j2 = (net.minecraft.i.j)b10;
                j2.S().a(this, d10);
                z2.a(null, j2.a, j2.aF, j2.ax, E.fF, ay.PLAYERS, 0.5f, z2.J.nextFloat() * 0.1f + 0.9f);
                this.b(d10, z2, j2);
                j2.b(m.b(this));
                if (n2 != 0) break block4;
                if (j2 instanceof net.minecraft.i.k) {
                    a6.C.a((net.minecraft.i.k)j2, d10);
                }
            }
            d10.b(1);
        }
        return d10;
    }

    public aw b() {
        this.w = true;
        return this;
    }

    public float a(d d10) {
        return this.t;
    }

    @Override
    public bE b(d d10) {
        return bE.EAT;
    }

    public boolean a() {
        return this.y;
    }

    @Override
    public t<d> a(z z2, net.minecraft.i.j j2, a3 a32) {
        d d10;
        block3: {
            net.minecraft.i.j j3;
            block2: {
                d10 = j2.c(a32);
                int n2 = bl.g();
                j3 = j2;
                if (n2 == 0) break block2;
                if (!j3.b(this.w)) break block3;
                j3 = j2;
            }
            j3.a(a32);
            return new t<d>(aX.SUCCESS, d10);
        }
        return new t<d>(aX.FAIL, d10);
    }

    @Override
    public int g(d d10) {
        return 32;
    }
}

