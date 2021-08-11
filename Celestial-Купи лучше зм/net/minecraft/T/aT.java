/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.D.l;
import net.minecraft.P.r;
import net.minecraft.T.S;
import net.minecraft.T.a9;
import net.minecraft.T.aG;
import net.minecraft.T.aX;
import net.minecraft.T.al;
import net.minecraft.T.z;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.g;
import net.minecraft.U.x;
import net.minecraft.ag.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ak.i;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.u.E;
import net.minecraft.u.h;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aT
extends aG {
    private /* synthetic */ boolean cy;
    private static final /* synthetic */ Predicate<x> cz;

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.eJ;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.d).a(0.35f);
        this.a(net.minecraft.U.M.b).a(12.0);
        this.a(net.minecraft.U.M.f).a(24.0);
        this.a(net.minecraft.U.M.g).a(5.0);
    }

    @Override
    public void a(r r2) {
        block3: {
            r r3;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                aT aT2 = this;
                r3 = r2;
                if (arrn == null) break block2;
                super.a(r3);
                if (!r2.a("Johnny", 99)) break block3;
                aT2 = this;
                r3 = r2;
            }
            aT2.cy = r3.f("Johnny");
        }
    }

    public static void b(b b10) {
        C.a(b10, aT.class);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e(x x2) {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = super.e(x2);
        if (arrn != null) {
            if (bl2) {
                return true;
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
    protected v D() {
        return net.minecraft.aj.j.j;
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(net.minecraft.ah.h h2, @Nullable net.minecraft.U.j j2) {
        net.minecraft.U.j j3 = super.a(h2, j2);
        this.b(h2);
        this.a(h2);
        return j3;
    }

    public void a(boolean bl2) {
        this.b(1, bl2);
    }

    @Override
    public a9 a() {
        return this.f() ? net.minecraft.T.a9.ATTACKING : net.minecraft.T.a9.CROSSED;
    }

    public boolean f() {
        return this.a(1);
    }

    static {
        cz = new al();
    }

    @Override
    public void a(String string) {
        block2: {
            boolean bl2;
            block1: {
                int[] arrn = net.minecraft.T.S.f();
                super.a(string);
                int[] arrn2 = arrn;
                bl2 = this.cy;
                if (arrn2 == null) break block1;
                if (bl2) break block2;
                bl2 = "Johnny".equals(string);
            }
            if (bl2) {
                this.cy = true;
            }
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.aI;
    }

    @Override
    protected void h() {
        super.h();
        this.a(this.J() != null);
    }

    @Override
    protected void ab() {
        super.ab();
    }

    @Override
    public void f(r r2) {
        block0: {
            super.f(r2);
            if (!this.cy) break block0;
            r2.a("Johnny", true);
        }
    }

    @Override
    protected void b(net.minecraft.ah.h h2) {
        this.a(net.minecraft.B.X.MAINHAND, new d(h.cv));
    }

    static Predicate g() {
        return cz;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.he;
    }

    public aT(net.minecraft.ah.z z2) {
        super(z2);
        this.c(0.6f, 1.95f);
    }

    @Override
    protected void H() {
        super.H();
        this.b5.a(0, new net.minecraft.ak.W(this));
        this.b5.a(4, new i(this, 1.0, false));
        this.b5.a(8, new net.minecraft.ak.a9(this, 0.6));
        this.b5.a(9, new aa(this, j.class, 3.0f, 1.0f));
        this.b5.a(10, new aa(this, C.class, 8.0f));
        this.ci.a(1, new Z((D)this, true, aT.class));
        this.ci.a(2, new au<j>((D)this, j.class, true));
        this.ci.a(3, new au<W>((D)this, W.class, true));
        this.ci.a(3, new au<aX>((D)this, aX.class, true));
        this.ci.a(4, new z(this));
    }

    static boolean a(aT aT2) {
        return aT2.cy;
    }
}

