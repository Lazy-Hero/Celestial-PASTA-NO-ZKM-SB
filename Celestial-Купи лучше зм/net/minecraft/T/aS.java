/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.P.r;
import net.minecraft.T.A;
import net.minecraft.T.S;
import net.minecraft.T.Y;
import net.minecraft.T.Z;
import net.minecraft.T.ae;
import net.minecraft.T.g;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.c;
import net.minecraft.ah.z;
import net.minecraft.ak.W;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.h;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aS
extends ae {
    private /* synthetic */ C cx;
    protected static final /* synthetic */ net.minecraft.q.r<Byte> cA;
    private /* synthetic */ int cz;
    @Nullable
    private /* synthetic */ n cB;
    private /* synthetic */ boolean cy;

    @Nullable
    public n g() {
        return this.cB;
    }

    @Override
    public int aS() {
        return 0xF000F0;
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.aG;
    }

    static net.minecraft.ak.d b(aS aS2) {
        return aS2.b9;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cA, (byte)0);
    }

    static Random c(aS aS2) {
        return aS2.g;
    }

    static C d(aS aS2) {
        return aS2.cx;
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(net.minecraft.ah.h h2, @Nullable net.minecraft.U.j j2) {
        this.b(h2);
        this.a(h2);
        return super.a(h2, j2);
    }

    static Random f(aS aS2) {
        return aS2.g;
    }

    @Override
    public void ae() {
        block5: {
            int n2;
            int[] arrn;
            block4: {
                this.K = true;
                int[] arrn2 = net.minecraft.T.S.f();
                super.ae();
                this.K = false;
                arrn = arrn2;
                this.i(true);
                n2 = this.cy;
                if (arrn == null) break block4;
                if (n2 == 0) break block5;
                n2 = this.cz = this.cz - 1;
            }
            if (arrn != null && n2 <= 0) {
                this.cz = 20;
                n2 = this.a(net.minecraft.ar.G.j, 1.0f) ? 1 : 0;
            }
        }
    }

    public aS(z z2) {
        super(z2);
        this.al = true;
        this.b9 = new g(this, this);
        this.c(0.4f, 0.8f);
        this.ch = 3;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.ad;
    }

    static net.minecraft.ak.d h(aS aS2) {
        return aS2.b9;
    }

    public void a(C c10) {
        this.cx = c10;
    }

    @Override
    protected void b(net.minecraft.ah.h h2) {
        this.a(net.minecraft.B.X.MAINHAND, new d(h.bs));
        this.a(net.minecraft.B.X.MAINHAND, 0.0f);
    }

    static Random g(aS aS2) {
        return aS2.g;
    }

    static net.minecraft.ak.d e(aS aS2) {
        return aS2.b9;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.bD;
    }

    @Override
    public float S() {
        return 1.0f;
    }

    @Override
    protected void H() {
        super.H();
        this.b5.a(0, new W(this));
        this.b5.a(4, new Y(this));
        this.b5.a(8, new Z(this));
        this.b5.a(9, new aa(this, j.class, 3.0f, 1.0f));
        this.b5.a(10, new aa(this, C.class, 8.0f));
        this.ci.a(1, new net.minecraft.ak.Z((D)this, true, aS.class));
        this.ci.a(2, new A(this, this));
        this.ci.a(3, new au<j>((D)this, j.class, true));
    }

    @Override
    public void f(r r2) {
        block2: {
            int[] arrn = net.minecraft.T.S.f();
            super.f(r2);
            int[] arrn2 = arrn;
            aS aS2 = this;
            if (arrn2 != null) {
                if (aS2.cB != null) {
                    r2.b("BoundX", this.cB.e());
                    r2.b("BoundY", this.cB.b());
                    r2.b("BoundZ", this.cB.a());
                }
                aS2 = this;
            }
            if (!aS2.cy) break block2;
            r2.b("LifeTicks", this.cz);
        }
    }

    @Override
    public void a(r r2) {
        block2: {
            int[] arrn = net.minecraft.T.S.f();
            super.a(r2);
            int[] arrn2 = arrn;
            boolean bl2 = r2.b("BoundX");
            if (arrn2 != null) {
                if (bl2) {
                    this.cB = new n(r2.m("BoundX"), r2.m("BoundY"), r2.m("BoundZ"));
                }
                bl2 = r2.b("LifeTicks");
            }
            if (!bl2) break block2;
            this.a(r2.m("LifeTicks"));
        }
    }

    public void c(@Nullable n n2) {
        this.cB = n2;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.G;
    }

    public void a(int n2) {
        this.cy = true;
        this.cz = n2;
    }

    private void b(int n2, boolean n3) {
        int n4;
        block4: {
            int n5;
            block2: {
                block3: {
                    n4 = this.ap.b(cA).byteValue();
                    int[] arrn = net.minecraft.T.S.f();
                    n5 = n3;
                    if (arrn == null) break block2;
                    if (n5 == 0) break block3;
                    n4 |= n2;
                    if (arrn != null) break block4;
                }
                n5 = n4 & ~n2;
            }
            n4 = n5;
        }
        this.ap.b(cA, (byte)(n4 & 0xFF));
    }

    static Random i(aS aS2) {
        return aS2.g;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(14.0);
        this.a(net.minecraft.U.M.g).a(4.0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(b b10) {
        C.a(b10, aS.class);
    }

    public C h() {
        return this.cx;
    }

    public boolean f() {
        return this.b(1);
    }

    public void a(boolean bl2) {
        this.b(1, bl2);
    }

    static Random a(aS aS2) {
        return aS2.g;
    }

    @Override
    public void a(c c10, double d10, double d11, double d12) {
        super.a(c10, d10, d11, d12);
        this.C();
    }

    static {
        cA = net.minecraft.q.m.a(aS.class, net.minecraft.q.h.m);
    }

    private boolean b(int n2) {
        byte by2 = this.ap.b(cA);
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = by2 & n2;
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }
}

