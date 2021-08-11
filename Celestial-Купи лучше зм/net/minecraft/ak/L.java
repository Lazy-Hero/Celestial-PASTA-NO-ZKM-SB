/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.N.O;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.bn;
import net.minecraft.W.dV;
import net.minecraft.Z.i;
import net.minecraft.ag.S;
import net.minecraft.ah.z;
import net.minecraft.ak.J;
import net.minecraft.ak.h;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class L
extends J {
    private final /* synthetic */ S k;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.k.U();
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.k.D();
        }
        if (string == null) {
            if (bl2) return false;
            bl2 = super.c();
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public L(S s2, double d10) {
        super(s2, d10, 8);
        this.k = s2;
    }

    @Override
    public void g() {
        super.g();
        this.k.r(false);
    }

    @Override
    public void a() {
        super.a();
        this.k.b().a(false);
    }

    @Override
    public void b() {
        block4: {
            S s2;
            block5: {
                boolean bl2;
                block2: {
                    String string;
                    block3: {
                        String string2 = net.minecraft.ak.h.h();
                        super.b();
                        this.k.b().a(false);
                        string = string2;
                        bl2 = this.b();
                        if (string != null) break block2;
                        if (bl2) break block3;
                        this.k.r(false);
                        if (string == null) break block4;
                    }
                    s2 = this.k;
                    if (string != null) break block5;
                    bl2 = s2.D();
                }
                if (bl2) break block4;
                s2 = this.k;
            }
            s2.r(true);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(z z2, n n2) {
        K k2;
        String string = net.minecraft.ak.h.h();
        z z3 = z2;
        n n3 = n2.a();
        if (string == null) {
            if (!z3.a(n3)) {
                return false;
            }
            z3 = z2;
            n3 = n2;
        }
        i i2 = z3.d(n3);
        K k3 = k2 = i2.b();
        K k4 = g.cd;
        if (string == null) {
            if (k3 == k4) {
                y y2 = z2.b(n2);
                int n4 = y2 instanceof O;
                if (string == null) {
                    if (n4 == 0) return 0 != 0;
                    n4 = ((O)y2).r;
                }
                if (string != null) return n4 != 0;
                if (n4 >= 1) return 0 != 0;
                return 1 != 0;
            }
            k3 = k2;
            k4 = g.bn;
        }
        if (string == null) {
            if (k3 == k4) {
                return true;
            }
            k3 = k2;
            k4 = g.R;
        }
        if (k3 != k4) return false;
        if (i2.b(bn.B) == dV.HEAD) return false;
        return true;
    }
}

