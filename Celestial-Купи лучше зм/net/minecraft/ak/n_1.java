/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.x;
import net.minecraft.ag.V;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.ar.a3;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class n
extends h {
    private final /* synthetic */ float e;
    private final /* synthetic */ V g;
    private final /* synthetic */ z f;
    private /* synthetic */ j c;
    private /* synthetic */ int d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.c.aL();
        if (string == null) {
            if (!bl2) {
                return false;
            }
            double d10 = this.g.s(this.c) - (double)(this.e * this.e);
            bl2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            if (bl2 > false) {
                return false;
            }
            bl2 = this.d;
        }
        if (string == null) {
            if (bl2 <= false) return false;
            bl2 = this.a(this.c);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public n(V v2, float f10) {
        this.g = v2;
        this.f = v2.aG;
        this.e = f10;
        this.a(2);
    }

    @Override
    public void a() {
        this.g.t(true);
        this.d = 40 + this.g.f().nextInt(40);
    }

    private boolean a(j j2) {
        boolean bl2;
        block5: {
            a3[] arra3 = a3.values();
            int n2 = arra3.length;
            String string = h.h();
            for (int i2 = 0; i2 < n2; ++i2) {
                a3 a32 = arra3[i2];
                d d10 = j2.c(a32);
                bl2 = this.g.U();
                if (string == null) {
                    boolean bl3;
                    if (string == null) {
                        if (bl2 && d10.w() == net.minecraft.u.h.bh) {
                            return true;
                        }
                        bl3 = this.g.a(d10);
                    }
                    if (string == null) {
                        if (!bl3) continue;
                        bl3 = true;
                    }
                    return bl3;
                }
                break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void b() {
        this.g.I().a(this.c.a, this.c.aF + (double)this.c.l(), this.c.ax, 10.0f, this.g.j());
        --this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        this.c = this.f.a((x)this.g, (double)this.e);
        String string = h.h();
        n n2 = this;
        if (string == null) {
            if (n2.c == null) return false;
            n2 = this;
        }
        boolean bl2 = n2.a(this.c);
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void g() {
        this.g.t(false);
        this.c = null;
    }
}

