/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.K.j;
import net.minecraft.T.S;
import net.minecraft.T.am;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ah.e;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.u.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ab
extends am {
    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(12.0);
    }

    @Override
    public float l() {
        return 0.45f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void c(b b10) {
        C.a(b10, ab.class);
    }

    public ab(z z2) {
        super(z2);
        this.c(0.7f, 0.5f);
    }

    @Override
    public boolean j(x x2) {
        boolean bl2;
        block8: {
            block9: {
                int n2;
                block10: {
                    block11: {
                        int n3;
                        int[] arrn;
                        block14: {
                            e e10;
                            e e11;
                            block12: {
                                block13: {
                                    arrn = net.minecraft.T.S.f();
                                    bl2 = super.j(x2);
                                    if (arrn == null) break block8;
                                    if (!bl2) break block9;
                                    n2 = x2 instanceof B;
                                    if (arrn == null) break block10;
                                    if (n2 == 0) break block11;
                                    n3 = 0;
                                    e11 = this.aG.g();
                                    e10 = net.minecraft.ah.e.NORMAL;
                                    if (arrn == null) break block12;
                                    if (e11 != e10) break block13;
                                    n3 = 7;
                                    if (arrn != null) break block14;
                                }
                                e11 = this.aG.g();
                                e10 = net.minecraft.ah.e.HARD;
                            }
                            if (e11 == e10) {
                                n3 = 15;
                            }
                        }
                        n2 = n3;
                        if (arrn == null) break block10;
                        if (n2 > 0) {
                            ((B)x2).b(new j(c.g, n3 * 20, 0));
                        }
                    }
                    n2 = 1;
                }
                return n2 != 0;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.g;
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        return j2;
    }
}

