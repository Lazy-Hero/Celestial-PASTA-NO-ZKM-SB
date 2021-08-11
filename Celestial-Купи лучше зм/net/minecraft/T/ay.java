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
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.u.E;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.z.f;
import net.minecraft.z.g;

public class ay
extends aV {
    public static void b(b b10) {
        C.a(b10, ay.class);
    }

    private static gP b(gP gP2) {
        return gP2;
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
            this.a(new d(h.cp, 1, 0), 0.0f);
        }
    }

    @Override
    protected f a(float f10) {
        f f11;
        block6: {
            f f12;
            block5: {
                d d10 = this.b(net.minecraft.B.X.OFFHAND);
                int[] arrn = net.minecraft.T.S.f();
                if (d10.w() == h.aA) {
                    g g10 = new g(this.aG, this);
                    g10.a((B)this, f10);
                    return g10;
                }
                f12 = super.a(f10);
                if (d10.w() != h.aI) break block5;
                f11 = f12;
                if (arrn == null) break block6;
                if (f11 instanceof net.minecraft.z.h) {
                    ((net.minecraft.z.h)f12).b(d10);
                }
            }
            f11 = f12;
        }
        return f11;
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.fr;
    }

    public ay(z z2) {
        super(z2);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.W;
    }

    @Override
    net.minecraft.ar.d m() {
        return net.minecraft.u.E.dh;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.b4;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.e7;
    }
}

