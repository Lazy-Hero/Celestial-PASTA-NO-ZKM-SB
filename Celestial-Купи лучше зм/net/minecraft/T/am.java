/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.T.S;
import net.minecraft.T.aV;
import net.minecraft.T.aX;
import net.minecraft.T.ae;
import net.minecraft.T.av;
import net.minecraft.T.ay;
import net.minecraft.T.p;
import net.minecraft.T.y;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.g;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.e.i;
import net.minecraft.e.l;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.q.h;
import net.minecraft.q.m;
import net.minecraft.q.r;
import net.minecraft.u.E;
import net.minecraft.u.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class am
extends ae {
    private static final /* synthetic */ r<Byte> cx;

    @Override
    @Nullable
    public net.minecraft.U.j a(net.minecraft.ah.h h2, @Nullable net.minecraft.U.j j2) {
        net.minecraft.U.j j3;
        block10: {
            block11: {
                int n2;
                Object object;
                int[] arrn;
                block9: {
                    block7: {
                        block8: {
                            arrn = net.minecraft.T.S.f();
                            j3 = super.a(h2, j2);
                            if (arrn != null) {
                                j2 = j3;
                                if (this.aG.J.nextInt(100) == 0) {
                                    object = new ay(this.aG);
                                    ((x)object).c(this.a, this.aF, this.ax, this.e, 0.0f);
                                    ((aV)object).a(h2, null);
                                    this.aG.f((x)object);
                                    ((x)object).h(this);
                                }
                                j3 = j2;
                            }
                            if (arrn == null) break block7;
                            if (j3 != null) break block8;
                            j3 = new av();
                            if (arrn == null) break block7;
                            j2 = j3;
                            if (this.aG.g() != net.minecraft.ah.e.HARD) break block8;
                            float f10 = this.aG.J.nextFloat() - 0.1f * h2.b();
                            n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                            if (arrn == null) break block9;
                            if (n2 < 0) {
                                ((av)j2).a(this.aG.J);
                            }
                        }
                        j3 = j2;
                    }
                    if (arrn == null) break block10;
                    n2 = j3 instanceof av;
                }
                if (n2 == 0) break block11;
                j3 = (av)j2;
                if (arrn == null) break block10;
                object = ((av)j3).a;
                if (object != null) {
                    this.b(new net.minecraft.K.j((net.minecraft.K.b)object, Integer.MAX_VALUE));
                }
            }
            j3 = j2;
        }
        return j3;
    }

    public static void b(b b10) {
        C.a(b10, am.class);
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.hZ;
    }

    @Override
    public void ae() {
        block3: {
            am am2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                super.ae();
                int[] arrn2 = arrn;
                am2 = this;
                if (arrn2 == null) break block2;
                if (am2.aG.C) break block3;
                am2 = this;
            }
            am2.a(this.aE);
        }
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.d5, 0.15f, 1.0f);
    }

    @Override
    public void ax() {
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cx, (byte)0);
    }

    public boolean f() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.ap.b(cx) & 1;
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.gb;
    }

    @Override
    public double o() {
        return this.aD * 0.5f;
    }

    @Override
    protected void H() {
        this.b5.a(1, new W(this));
        this.b5.a(3, new net.minecraft.ak.C(this, 0.4f));
        this.b5.a(4, new p(this));
        this.b5.a(5, new aA(this, 0.8));
        this.b5.a(6, new aa(this, j.class, 8.0f));
        this.b5.a(6, new F(this));
        this.ci.a(1, new Z((D)this, false, new Class[0]));
        this.ci.a(2, new y<j>(this, j.class));
        this.ci.a(3, new y<aX>(this, aX.class));
    }

    @Override
    public float l() {
        return 0.65f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c(net.minecraft.K.j j2) {
        int[] arrn = net.minecraft.T.S.f();
        if (j2.g() == c.g) return false;
        boolean bl2 = super.c(j2);
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public g ag() {
        return net.minecraft.U.g.ARTHROPOD;
    }

    static {
        cx = net.minecraft.q.m.a(am.class, h.m);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(16.0);
        this.a(net.minecraft.U.M.d).a(0.3f);
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.hw;
    }

    public am(z z2) {
        super(z2);
        this.c(1.4f, 0.9f);
    }

    @Override
    public boolean s() {
        return this.f();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void a(boolean bl2) {
        byte by2;
        block4: {
            byte by3;
            block2: {
                block3: {
                    by2 = this.ap.b(cx);
                    int[] arrn = net.minecraft.T.S.f();
                    by3 = bl2;
                    if (arrn == null) break block2;
                    if (by3 == false) break block3;
                    by2 = (byte)(by2 | 1);
                    if (arrn != null) break block4;
                }
                by3 = (byte)(by2 & 0xFFFFFFFE);
            }
            by2 = by3;
        }
        this.ap.b(cx, by2);
    }

    @Override
    protected i a(z z2) {
        return new l(this, z2);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.am;
    }
}

