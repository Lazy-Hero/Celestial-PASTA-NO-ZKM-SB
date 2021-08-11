/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.g;
import net.minecraft.ag.A;
import net.minecraft.ag.D;
import net.minecraft.ah.z;
import net.minecraft.ak.V;
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
public class J
extends D {
    private /* synthetic */ boolean c4;
    private /* synthetic */ int c5;
    private final /* synthetic */ V c3;

    @Override
    protected d e(G g10) {
        super.e(g10);
        return net.minecraft.u.E.b5;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.v;
    }

    @Override
    public void E() {
        block3: {
            J j2;
            block4: {
                int n2;
                block2: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    super.E();
                    String[] arrstring2 = arrstring;
                    n2 = this.F();
                    if (arrstring2 == null) break block2;
                    if (n2 == 0) break block3;
                    j2 = this;
                    if (arrstring2 == null) break block4;
                    int n3 = j2.c5;
                    n2 = n3;
                    j2.c5 = n3 + 1;
                }
                if (n2 < 18000) break block3;
                j2 = this;
            }
            j2.a();
        }
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(15.0);
        this.a(net.minecraft.U.M.d).a(0.2f);
        this.a(cT).a(this.a());
    }

    public void a(boolean bl2) {
        block3: {
            J j2;
            block4: {
                block5: {
                    boolean bl3;
                    String[] arrstring;
                    block2: {
                        arrstring = net.minecraft.ag.A.b();
                        bl3 = bl2;
                        if (arrstring == null) break block2;
                        if (bl3 == this.c4) break block3;
                        j2 = this;
                        if (arrstring == null) break block4;
                        j2.c4 = bl2;
                        bl3 = bl2;
                    }
                    if (!bl3) break block5;
                    this.b5.a(1, this.c3);
                    if (arrstring != null) break block3;
                }
                j2 = this;
            }
            j2.b5.a(this.c3);
        }
    }

    @Override
    public g ag() {
        return net.minecraft.U.g.UNDEAD;
    }

    public static void b(b b10) {
        net.minecraft.ag.D.b(b10, J.class);
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.a("SkeletonTrap", this.F());
        r2.b("SkeletonTrapTime", this.c5);
    }

    @Override
    protected d aI() {
        super.aI();
        return net.minecraft.u.E.bV;
    }

    public J(z z2) {
        super(z2);
        this.c3 = new V(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(j var1_1, a3 var2_2) {
        block16: {
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
            if (!v1) break block16;
            v2 = var4_3;
            if (var3_4 == null) ** GOTO lbl40
            if (v2.w() == h.be) {
                v1 = this.ac();
                if (var3_4 != null) {
                    if (!v1) {
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
lbl40:
                // 2 sources

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

    @Override
    public double o() {
        return super.o() - 0.1875;
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.a(r2.f("SkeletonTrap"));
        this.c5 = r2.m("SkeletonTrapTime");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean F() {
        return this.c4;
    }

    @Override
    protected d q() {
        super.q();
        return net.minecraft.u.E.cW;
    }
}

