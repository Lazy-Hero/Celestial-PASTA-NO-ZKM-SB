/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.Q.az;
import net.minecraft.T.S;
import net.minecraft.T.a0;
import net.minecraft.T.aA;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.a9;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.k;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a_
extends a0 {
    @Override
    protected d q() {
        return this.aj() ? net.minecraft.u.E.gP : net.minecraft.u.E.ch;
    }

    @Override
    public int a() {
        return 60;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.I;
    }

    public static void c(b b10) {
        C.a(b10, a_.class);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a_(z z2) {
        block3: {
            a9 a92;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                super(z2);
                int[] arrn2 = arrn;
                this.c(this.ad * 2.35f, this.aD * 2.35f);
                this.A();
                a92 = this.cB;
                if (arrn2 == null) break block2;
                if (a92 == null) break block3;
                a92 = this.cB;
            }
            a92.b(400);
        }
    }

    public void b() {
        this.cx = this.cC = 1.0f;
    }

    @Override
    protected d aI() {
        return this.aj() ? net.minecraft.u.E.C : net.minecraft.u.E.cA;
    }

    @Override
    protected void h() {
        block11: {
            a_ a_2;
            block10: {
                int n2;
                block5: {
                    int[] arrn;
                    block6: {
                        int[] arrn2 = net.minecraft.T.S.f();
                        super.h();
                        int n3 = 1200;
                        arrn = arrn2;
                        n2 = (this.H + this.W()) % 1200;
                        if (arrn == null) break block5;
                        if (n2 != 0) break block6;
                        net.minecraft.K.b b10 = c.q;
                        List<k> list = this.aG.b(k.class, new aA(this));
                        int n4 = 2;
                        int n5 = 6000;
                        int n6 = 1200;
                        Iterator<k> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            block9: {
                                k k2;
                                block7: {
                                    k k3;
                                    block8: {
                                        k2 = k3 = iterator.next();
                                        if (arrn == null) break block7;
                                        n2 = k2.c(b10) ? 1 : 0;
                                        if (arrn == null) break block5;
                                        if (n2 == 0) break block8;
                                        k2 = k3;
                                        if (arrn == null) break block7;
                                        if (k2.a(b10).h() < 2) break block8;
                                        k2 = k3;
                                        if (arrn == null) break block7;
                                        if (k2.a(b10).e() >= 1200) break block9;
                                    }
                                    k3.cD.a(new az(10, 0.0f));
                                    k2 = k3;
                                }
                                k2.b(new net.minecraft.K.j(b10, 6000, 2));
                            }
                            if (arrn != null) continue;
                        }
                    }
                    a_2 = this;
                    if (arrn == null) break block10;
                    n2 = a_2.m() ? 1 : 0;
                }
                if (n2 != 0) break block11;
                a_2 = this;
            }
            a_2.a(new n(this), 16);
        }
    }

    @Override
    protected d b() {
        return net.minecraft.u.E.fN;
    }

    @Override
    protected d e(G g10) {
        return this.aj() ? net.minecraft.u.E.hr : net.minecraft.u.E.dr;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.d).a(0.3f);
        this.a(net.minecraft.U.M.g).a(8.0);
        this.a(net.minecraft.U.M.f).a(80.0);
    }
}

