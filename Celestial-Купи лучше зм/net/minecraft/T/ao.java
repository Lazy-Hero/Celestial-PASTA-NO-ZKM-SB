/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.D.l;
import net.minecraft.P.r;
import net.minecraft.T.R;
import net.minecraft.T.S;
import net.minecraft.T.T;
import net.minecraft.T.U;
import net.minecraft.T.V;
import net.minecraft.T.aS;
import net.minecraft.T.aX;
import net.minecraft.T.at;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.g;
import net.minecraft.U.x;
import net.minecraft.ag.Q;
import net.minecraft.ag.W;
import net.minecraft.ah.z;
import net.minecraft.ak.Z;
import net.minecraft.ak.a9;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.k.m;
import net.minecraft.u.E;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ao
extends at {
    private /* synthetic */ Q cB;

    @Override
    protected void H() {
        super.H();
        int[] arrn = net.minecraft.T.S.f();
        this.b5.a(0, new net.minecraft.ak.W(this));
        int[] arrn2 = arrn;
        this.b5.a(1, new R(this, null));
        this.b5.a(2, new net.minecraft.ak.m<j>(this, j.class, 8.0f, 0.6, 1.0));
        this.b5.a(4, new U(this, null));
        this.b5.a(5, new T(this, null));
        this.b5.a(6, new V(this));
        this.b5.a(8, new a9(this, 0.6));
        this.b5.a(9, new aa(this, j.class, 3.0f, 1.0f));
        this.b5.a(10, new aa(this, C.class, 8.0f));
        this.ci.a(1, new Z((D)this, true, ao.class));
        this.ci.a(2, new au<j>((D)this, j.class, true).a(300));
        this.ci.a(3, new au<W>((D)this, W.class, false).a(300));
        this.ci.a(3, new au<aX>((D)this, aX.class, false));
        if (arrn2 == null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }

    static Random f(ao ao2) {
        return ao2.g;
    }

    static Random b(ao ao2) {
        return ao2.g;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.d).a(0.5);
        this.a(net.minecraft.U.M.b).a(12.0);
        this.a(net.minecraft.U.M.f).a(24.0);
    }

    @Nullable
    private Q a() {
        return this.cB;
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.gA;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.a6;
    }

    static Random a(ao ao2) {
        return ao2.g;
    }

    @Override
    public void ae() {
        super.ae();
    }

    public static void b(b b10) {
        C.a(b10, ao.class);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.gY;
    }

    static Random c(ao ao2) {
        return ao2.g;
    }

    @Override
    protected d g() {
        return net.minecraft.u.E.Y;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e(x x2) {
        int[] arrn = net.minecraft.T.S.f();
        x x3 = x2;
        if (arrn != null) {
            if (x3 == null) {
                return false;
            }
            x3 = x2;
        }
        if (x3 == this) {
            return true;
        }
        boolean bl2 = super.e(x2);
        if (arrn != null) {
            if (bl2) {
                return true;
            }
            bl2 = x2 instanceof aS;
        }
        if (arrn != null) {
            if (bl2) {
                return this.e(((aS)x2).h());
            }
            bl2 = x2 instanceof B;
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        if (((B)x2).ag() != net.minecraft.U.g.ILLAGER) return false;
        l l2 = this.aM();
        if (arrn != null) {
            if (l2 != null) return false;
            l2 = x2.aM();
        }
        if (l2 != null) return false;
        return true;
    }

    @Override
    protected void h() {
        super.h();
    }

    @Override
    protected void ab() {
        super.ab();
    }

    private void a(@Nullable Q q2) {
        this.cB = q2;
    }

    @Override
    public void a(r r2) {
        super.a(r2);
    }

    static Random e(ao ao2) {
        return ao2.g;
    }

    @Override
    protected v D() {
        return net.minecraft.aj.j.al;
    }

    static void a(ao ao2, Q q2) {
        ao2.a(q2);
    }

    static Q d(ao ao2) {
        return ao2.a();
    }

    public ao(z z2) {
        super(z2);
        this.c(0.6f, 1.95f);
        this.ch = 10;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
    }
}

