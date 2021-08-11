/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.T.S;
import net.minecraft.T.aR;
import net.minecraft.T.aV;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.u.E;
import net.minecraft.u.c;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.z.f;

public class a2
extends aV {
    public a2(z z2) {
        super(z2);
        this.c(0.7f, 2.4f);
        this.al = true;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.fR;
    }

    @Override
    public float l() {
        return 2.1f;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.aF;
    }

    @Override
    protected f a(float f10) {
        f f11 = super.a(f10);
        f11.h(100);
        return f11;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected void b(net.minecraft.ah.h h2) {
        this.a(net.minecraft.B.X.MAINHAND, new d(h.cj));
    }

    public static void b(b b10) {
        C.a(b10, a2.class);
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(net.minecraft.ah.h h2, @Nullable net.minecraft.U.j j2) {
        net.minecraft.U.j j3 = super.a(h2, j2);
        this.a(net.minecraft.U.M.g).a(4.0);
        this.l();
        return j3;
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.ab;
    }

    @Override
    public boolean j(x x2) {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = super.j(x2);
        if (arrn != null) {
            if (!bl2) {
                return false;
            }
            bl2 = x2 instanceof B;
        }
        if (arrn != null) {
            if (bl2) {
                ((B)x2).b(new net.minecraft.K.j(c.z, 200));
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a(G g10) {
        block3: {
            aR aR2;
            block5: {
                boolean bl2;
                aR aR3;
                block4: {
                    x x2;
                    int[] arrn;
                    block2: {
                        int[] arrn2 = net.minecraft.T.S.f();
                        super.a(g10);
                        arrn = arrn2;
                        x2 = g10.h();
                        if (arrn == null) break block2;
                        if (!(x2 instanceof aR)) break block3;
                        x2 = g10.h();
                    }
                    aR3 = (aR)x2;
                    bl2 = aR3.y();
                    if (arrn == null) break block4;
                    if (!bl2) break block3;
                    aR2 = aR3;
                    if (arrn == null) break block5;
                    bl2 = aR2.z();
                }
                if (!bl2) break block3;
                aR2 = aR3;
            }
            aR2.m();
            this.a(new d(h.cp, 1, 1), 0.0f);
        }
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.dD;
    }

    @Override
    net.minecraft.ar.d m() {
        return net.minecraft.u.E.A;
    }

    @Override
    protected void a(net.minecraft.ah.h h2) {
    }
}

