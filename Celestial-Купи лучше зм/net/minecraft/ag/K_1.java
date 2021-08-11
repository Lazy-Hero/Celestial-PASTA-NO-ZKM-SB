/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.g;
import net.minecraft.ag.A;
import net.minecraft.ag.D;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.u.E;
import net.minecraft.u.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class K
extends D {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected d q() {
        super.q();
        return net.minecraft.u.E.ca;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.w;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(15.0);
        this.a(net.minecraft.U.M.d).a(0.2f);
        this.a(cT).a(this.a());
    }

    @Override
    protected d e(G g10) {
        super.e(g10);
        return net.minecraft.u.E.o;
    }

    public static void b(b b10) {
        net.minecraft.ag.D.b(b10, K.class);
    }

    @Override
    public g ag() {
        return net.minecraft.U.g.UNDEAD;
    }

    @Override
    protected d aI() {
        super.aI();
        return net.minecraft.u.E.fK;
    }

    public K(z z2) {
        super(z2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(j var1_1, a3 var2_2) {
        var4_3 = var1_1.c(var2_2);
        var3_4 = net.minecraft.ag.A.b();
        v0 = var4_3.G();
        if (var3_4 != null) {
            v0 = v0 == false;
        }
        v1 = var5_5 = v0;
        if (var3_4 != null) {
            if (v1 && var4_3.w() == h.bn) {
                return super.b(var1_1, var2_2);
            }
            v1 = this.aD();
        }
        if (var3_4 != null) {
            if (!v1) {
                return false;
            }
            v1 = this.Q();
        }
        if (var3_4 != null) {
            if (v1) {
                return super.b(var1_1, var2_2);
            }
            v1 = var1_1.a4();
        }
        if (var3_4 != null) {
            if (v1) {
                this.f(var1_1);
                return true;
            }
            v1 = this.aU();
        }
        if (var3_4 != null) {
            if (v1) {
                return super.b(var1_1, var2_2);
            }
            v1 = var5_5;
        }
        if (var3_4 == null) return v1;
        if (v1) {
            v1 = this.ac();
            if (var3_4 != null) {
                if (!v1) {
                    v2 = var4_3;
                    if (var3_4 != null) {
                        if (v2.w() == h.be) {
                            this.f(var1_1);
                            return true;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v2 = var4_3;
                }
                v1 = v2.a(var1_1, (B)this, var2_2);
            }
            if (var3_4 == null) return v1;
            if (v1) {
                return true;
            }
        }
        this.d(var1_1);
        return true;
    }
}

