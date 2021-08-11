/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ag.D;
import net.minecraft.ag.E;
import net.minecraft.ag.H;
import net.minecraft.ag.I;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;

public class F
extends E {
    @Override
    public net.minecraft.U.E a(net.minecraft.U.E e10) {
        E e11 = e10 instanceof I ? new H(this.aG) : new F(this.aG);
        this.a(e10, e11);
        return e11;
    }

    @Override
    protected d aI() {
        super.aI();
        return net.minecraft.u.E.bW;
    }

    public static void b(b b10) {
        net.minecraft.ag.E.c(b10, F.class);
    }

    private static gP d(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(C var1_1) {
        var2_2 = net.minecraft.ag.A.b();
        v0 = var1_1;
        if (var2_2 != null) {
            if (v0 == this) {
                return false;
            }
            v0 = var1_1;
        }
        v1 = v0 instanceof F;
        if (var2_2 != null) {
            if (!v1) {
                v1 = var1_1 instanceof I;
                if (var2_2 != null) {
                    if (!v1) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this.Y();
            }
        }
        if (var2_2 != null) {
            if (v1 == false) return false;
            v1 = ((D)var1_1).Y();
        }
        if (var2_2 == null) return v1;
        if (v1 == false) return false;
        return true;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.c;
    }

    @Override
    protected d e(G g10) {
        super.e(g10);
        return net.minecraft.u.E.gZ;
    }

    @Override
    protected d q() {
        super.q();
        return net.minecraft.u.E.fJ;
    }

    public F(z z2) {
        super(z2);
    }
}

