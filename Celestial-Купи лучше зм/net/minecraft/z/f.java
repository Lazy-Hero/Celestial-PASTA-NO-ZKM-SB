/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  javax.annotation.Nullable
 */
package net.minecraft.z;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.Q.az;
import net.minecraft.T.ah;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ax.T;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.b;
import net.minecraft.z.d;
import net.minecraft.z.e;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class f
extends x
implements net.minecraft.U.b {
    private /* synthetic */ int aS;
    private static final /* synthetic */ net.minecraft.q.r<Byte> aL;
    private /* synthetic */ int aK;
    private /* synthetic */ K aW;
    private /* synthetic */ int aN;
    public /* synthetic */ x aY;
    private /* synthetic */ int aM;
    private static final /* synthetic */ Predicate<x> aT;
    public /* synthetic */ int aU;
    private /* synthetic */ int aX;
    public /* synthetic */ d aQ;
    private /* synthetic */ int aO;
    protected /* synthetic */ int aP;
    private /* synthetic */ double aZ;
    protected /* synthetic */ boolean aV;
    private /* synthetic */ int aR;

    @Override
    public boolean aN() {
        return false;
    }

    protected void b(B b10) {
    }

    protected abstract net.minecraft.w.d c();

    protected void a(i i2) {
        block43: {
            f f10;
            net.minecraft.Z.i i3;
            n n2;
            block44: {
                m[] arrm;
                block24: {
                    block40: {
                        f f11;
                        block42: {
                            int n3;
                            block41: {
                                block31: {
                                    block32: {
                                        block39: {
                                            boolean bl2;
                                            block33: {
                                                x x2;
                                                block38: {
                                                    x x3;
                                                    block34: {
                                                        B b10;
                                                        block37: {
                                                            int n4;
                                                            block35: {
                                                                block36: {
                                                                    block29: {
                                                                        G g10;
                                                                        int n5;
                                                                        block30: {
                                                                            block28: {
                                                                                f f12;
                                                                                block26: {
                                                                                    block27: {
                                                                                        x x4;
                                                                                        block25: {
                                                                                            x3 = i2.e;
                                                                                            arrm = net.minecraft.z.d.b();
                                                                                            if (x3 == null) break block24;
                                                                                            float f13 = h.e(this.aq * this.aq + this.G * this.G + this.d * this.d);
                                                                                            n5 = h.i((double)f13 * this.aZ);
                                                                                            x4 = this;
                                                                                            if (arrm != null) break block25;
                                                                                            if (x4.b()) {
                                                                                                n5 += this.g.nextInt(n5 / 2 + 2);
                                                                                            }
                                                                                            f12 = this;
                                                                                            if (arrm != null) break block26;
                                                                                            x4 = f12.aY;
                                                                                        }
                                                                                        if (x4 != null) break block27;
                                                                                        g10 = net.minecraft.ar.G.a(this, (x)this);
                                                                                        if (arrm == null) break block28;
                                                                                    }
                                                                                    f12 = this;
                                                                                }
                                                                                g10 = net.minecraft.ar.G.a(f12, this.aY);
                                                                            }
                                                                            n3 = this.p();
                                                                            if (arrm != null) break block29;
                                                                            if (n3 == 0) break block30;
                                                                            n3 = x3 instanceof ah;
                                                                            if (arrm != null) break block29;
                                                                            if (n3 == 0) {
                                                                                x3.h(5);
                                                                            }
                                                                        }
                                                                        n3 = x3.a(g10, (float)n5) ? 1 : 0;
                                                                    }
                                                                    if (arrm != null) break block31;
                                                                    if (n3 == 0) break block32;
                                                                    bl2 = x3 instanceof B;
                                                                    if (arrm != null) break block33;
                                                                    if (!bl2) break block34;
                                                                    b10 = (B)x3;
                                                                    n4 = this.aG.C;
                                                                    if (arrm == null) {
                                                                        if (n4 == 0) {
                                                                            b10.j(b10.I() + 1);
                                                                        }
                                                                        n4 = this.aS;
                                                                    }
                                                                    if (arrm != null) break block35;
                                                                    if (n4 <= 0) break block36;
                                                                    float f14 = h.e(this.aq * this.aq + this.d * this.d);
                                                                    float f15 = f14 - 0.0f;
                                                                    n4 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                    if (arrm != null) break block35;
                                                                    if (n4 > 0) {
                                                                        b10.h(this.aq * (double)this.aS * (double)0.6f / (double)f14, 0.1, this.d * (double)this.aS * (double)0.6f / (double)f14);
                                                                    }
                                                                }
                                                                x2 = this.aY;
                                                                if (arrm != null) break block37;
                                                                n4 = x2 instanceof B;
                                                            }
                                                            if (n4 != 0) {
                                                                net.minecraft.ax.T.a(b10, this.aY);
                                                                net.minecraft.ax.T.b((B)this.aY, (x)b10);
                                                            }
                                                            this.b(b10);
                                                            x2 = this.aY;
                                                        }
                                                        if (arrm != null) break block38;
                                                        if (x2 == null) break block34;
                                                        x2 = b10;
                                                        if (arrm != null) break block38;
                                                        if (x2 == this.aY) break block34;
                                                        bl2 = b10 instanceof j;
                                                        if (arrm != null) break block33;
                                                        if (!bl2) break block34;
                                                        bl2 = this.aY instanceof net.minecraft.i.k;
                                                        if (arrm != null) break block33;
                                                        if (bl2) {
                                                            ((net.minecraft.i.k)this.aY).cD.a(new az(6, 0.0f));
                                                        }
                                                    }
                                                    this.a(net.minecraft.u.E.e_, 1.0f, 1.2f / (this.g.nextFloat() * 0.2f + 0.9f));
                                                    if (arrm != null) break block39;
                                                    x2 = x3;
                                                }
                                                bl2 = x2 instanceof ah;
                                            }
                                            if (bl2) break block40;
                                            this.a();
                                        }
                                        if (arrm == null) break block40;
                                    }
                                    this.aq *= (double)-0.1f;
                                    this.G *= (double)-0.1f;
                                    this.d *= (double)-0.1f;
                                    this.e += 180.0f;
                                    this.ak += 180.0f;
                                    this.aR = 0;
                                    n3 = this.aG.C ? 1 : 0;
                                }
                                if (arrm != null) break block41;
                                if (n3 != 0) break block40;
                                f11 = this;
                                if (arrm != null) break block42;
                                double d10 = f11.aq * this.aq + this.G * this.G + this.d * this.d - (double)0.001f;
                                n3 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                            }
                            if (n3 >= 0) break block40;
                            f11 = this;
                        }
                        if (arrm == null) {
                            if (f11.aQ == net.minecraft.z.d.ALLOWED) {
                                this.a(this.c(), 0.1f);
                            }
                            f11 = this;
                        }
                        f11.a();
                    }
                    if (arrm == null) break block43;
                }
                n2 = i2.a();
                this.aX = n2.e();
                this.aO = n2.b();
                this.aM = n2.a();
                i3 = this.aG.d(n2);
                this.aW = i3.b();
                this.aN = this.aW.d(i3);
                this.aq = (float)(i2.c.e - this.a);
                this.G = (float)(i2.c.d - this.aF);
                this.d = (float)(i2.c.b - this.ax);
                float f16 = h.e(this.aq * this.aq + this.G * this.G + this.d * this.d);
                this.a -= this.aq / (double)f16 * (double)0.05f;
                this.aF -= this.G / (double)f16 * (double)0.05f;
                this.ax -= this.d / (double)f16 * (double)0.05f;
                this.a(net.minecraft.u.E.e_, 1.0f, 1.2f / (this.g.nextFloat() * 0.2f + 0.9f));
                this.aV = true;
                this.aU = 7;
                f10 = this;
                if (arrm != null) break block44;
                f10.a(false);
                if (i3.o() == c.A) break block43;
                f10 = this;
            }
            f10.aW.a(this.aG, n2, i3, this);
        }
    }

    @Override
    public float l() {
        return 0.0f;
    }

    public static void b(net.minecraft.av.b b10) {
        net.minecraft.z.f.a(b10, "Arrow");
    }

    public f(z z2, B b10) {
        block3: {
            block2: {
                this(z2, b10.a, b10.aF + (double)b10.l() - (double)0.1f, b10.ax);
                m[] arrm = net.minecraft.z.d.b();
                f f10 = this;
                if (arrm != null) break block2;
                f10.aY = b10;
                if (!(b10 instanceof j)) break block3;
                f10 = this;
            }
            f10.aQ = net.minecraft.z.d.ALLOWED;
        }
    }

    public f(z z2) {
        super(z2);
        this.aX = -1;
        this.aO = -1;
        this.aM = -1;
        this.aQ = net.minecraft.z.d.DISALLOWED;
        this.aZ = 2.0;
        this.c(0.5f, 0.5f);
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11) {
        float f12 = h.e(d10 * d10 + d11 * d11 + d12 * d12);
        d10 /= (double)f12;
        d11 /= (double)f12;
        d12 /= (double)f12;
        d10 += this.g.nextGaussian() * (double)0.0075f * (double)f11;
        d11 += this.g.nextGaussian() * (double)0.0075f * (double)f11;
        d12 += this.g.nextGaussian() * (double)0.0075f * (double)f11;
        this.aq = d10 *= (double)f10;
        this.G = d11 *= (double)f10;
        this.d = d12 *= (double)f10;
        float f13 = h.e(d10 * d10 + d12 * d12);
        this.e = (float)(h.a(d10, d12) * 57.29577951308232);
        this.at = (float)(h.a(d11, (double)f13) * 57.29577951308232);
        this.ak = this.e;
        this.E = this.at;
        this.aK = 0;
    }

    @Override
    public void a(net.minecraft.U.c c10, double d10, double d11, double d12) {
        block3: {
            block2: {
                m[] arrm = net.minecraft.z.d.b();
                super.a(c10, d10, d11, d12);
                m[] arrm2 = arrm;
                f f10 = this;
                if (arrm2 != null) break block2;
                if (!f10.aV) break block3;
                this.aX = h.f(this.a);
                this.aO = h.f(this.aF);
                f10 = this;
            }
            f10.aM = h.f(this.ax);
        }
    }

    public void a(boolean bl2) {
        block2: {
            byte by2;
            block1: {
                m[] arrm;
                block0: {
                    by2 = this.ap.b(aL);
                    arrm = net.minecraft.z.d.b();
                    if (arrm != null) break block0;
                    if (!bl2) break block1;
                    this.ap.b(aL, (byte)(by2 | 1));
                }
                if (arrm == null) break block2;
            }
            this.ap.b(aL, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public void ae() {
        block72: {
            f f10;
            block76: {
                boolean bl2;
                block75: {
                    m[] arrm;
                    block54: {
                        block53: {
                            block52: {
                                i i2;
                                i i3;
                                block73: {
                                    block74: {
                                        x x2;
                                        f f11;
                                        Object object;
                                        block64: {
                                            block65: {
                                                f f12;
                                                block71: {
                                                    block70: {
                                                        int n2;
                                                        int n3;
                                                        block67: {
                                                            block69: {
                                                                block68: {
                                                                    block66: {
                                                                        int n4;
                                                                        K k2;
                                                                        net.minecraft.Z.i i4;
                                                                        block63: {
                                                                            block62: {
                                                                                block60: {
                                                                                    k k3;
                                                                                    block61: {
                                                                                        net.minecraft.Z.i i5;
                                                                                        n n5;
                                                                                        block59: {
                                                                                            block57: {
                                                                                                float f13;
                                                                                                block58: {
                                                                                                    float f14;
                                                                                                    block56: {
                                                                                                        m[] arrm2 = net.minecraft.z.d.b();
                                                                                                        super.ae();
                                                                                                        arrm = arrm2;
                                                                                                        float f15 = this.E - 0.0f;
                                                                                                        f14 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                                                        if (arrm != null) break block56;
                                                                                                        if (f14 != false) break block57;
                                                                                                        f13 = this.ak;
                                                                                                        if (arrm != null) break block58;
                                                                                                        float f16 = f13 - 0.0f;
                                                                                                        f14 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                                                                                    }
                                                                                                    if (f14 != false) break block57;
                                                                                                    f13 = h.e(this.aq * this.aq + this.d * this.d);
                                                                                                }
                                                                                                float f17 = f13;
                                                                                                this.e = (float)(h.a(this.aq, this.d) * 57.29577951308232);
                                                                                                this.at = (float)(h.a(this.G, (double)f17) * 57.29577951308232);
                                                                                                this.ak = this.e;
                                                                                                this.E = this.at;
                                                                                            }
                                                                                            n5 = new n(this.aX, this.aO, this.aM);
                                                                                            i4 = this.aG.d(n5);
                                                                                            k2 = i4.b();
                                                                                            i5 = i4;
                                                                                            if (arrm != null) break block59;
                                                                                            if (i5.o() == c.A) break block60;
                                                                                            i5 = i4;
                                                                                        }
                                                                                        object = i5.d(this.aG, n5);
                                                                                        k3 = object;
                                                                                        if (arrm != null) break block61;
                                                                                        if (k3 == net.minecraft.W.K.a) break block60;
                                                                                        k3 = ((k)object).a(n5);
                                                                                    }
                                                                                    n4 = k3.b(new l(this.a, this.aF, this.ax)) ? 1 : 0;
                                                                                    if (arrm != null) break block62;
                                                                                    if (n4 != 0) {
                                                                                        this.aV = true;
                                                                                    }
                                                                                }
                                                                                n4 = this.aU;
                                                                            }
                                                                            if (arrm != null) break block63;
                                                                            if (n4 > 0) {
                                                                                --this.aU;
                                                                            }
                                                                            f11 = this;
                                                                            if (arrm != null) break block64;
                                                                            n4 = f11.aV ? 1 : 0;
                                                                        }
                                                                        if (n4 == 0) break block65;
                                                                        int n6 = k2.d(i4);
                                                                        if (k2 != this.aW) break block66;
                                                                        n3 = n6;
                                                                        n2 = this.aN;
                                                                        if (arrm != null) break block67;
                                                                        if (n3 == n2) break block68;
                                                                    }
                                                                    n3 = this.aG.d(this.m().a(0.05)) ? 1 : 0;
                                                                    if (arrm != null) break block69;
                                                                    if (n3 != 0) break block68;
                                                                    this.aV = false;
                                                                    this.aq *= (double)(this.g.nextFloat() * 0.2f);
                                                                    this.G *= (double)(this.g.nextFloat() * 0.2f);
                                                                    this.d *= (double)(this.g.nextFloat() * 0.2f);
                                                                    this.aK = 0;
                                                                    this.aR = 0;
                                                                    if (arrm == null) break block70;
                                                                }
                                                                ++this.aK;
                                                                f12 = this;
                                                                if (arrm != null) break block71;
                                                                n3 = f12.aK;
                                                            }
                                                            n2 = 1200;
                                                        }
                                                        if (n3 >= n2) {
                                                            this.a();
                                                        }
                                                    }
                                                    f12 = this;
                                                }
                                                ++f12.aP;
                                                if (arrm == null) break block72;
                                            }
                                            this.aP = 0;
                                            f11 = this;
                                        }
                                        ++f11.aR;
                                        object = new l(this.a, this.aF, this.ax);
                                        l l2 = new l(this.a + this.aq, this.aF + this.G, this.ax + this.d);
                                        i3 = this.aG.a((l)object, l2, false, true, false);
                                        object = new l(this.a, this.aF, this.ax);
                                        l l3 = new l(this.a + this.aq, this.aF + this.G, this.ax + this.d);
                                        if (arrm == null) {
                                            l2 = l3;
                                            if (i3 != null) {
                                                l3 = l2 = new l(i3.c.e, i3.c.d, i3.c.b);
                                            }
                                        }
                                        if ((x2 = this.a((l)object, l2)) != null) {
                                            i3 = new i(x2);
                                        }
                                        i2 = i3;
                                        if (arrm != null) break block73;
                                        if (i2 == null) break block74;
                                        i2 = i3;
                                        if (arrm != null) break block73;
                                        if (!(i2.e instanceof j)) break block74;
                                        i2 = i3;
                                        if (arrm != null) break block73;
                                        j j2 = (j)i2.e;
                                        if (this.aY instanceof j && !((j)this.aY).a(j2)) {
                                            i3 = null;
                                        }
                                    }
                                    i2 = i3;
                                }
                                if (i2 != null) {
                                    this.a(i3);
                                }
                                f f18 = this;
                                if (arrm == null) {
                                    if (f18.b()) {
                                        for (int i6 = 0; i6 < 4; ++i6) {
                                            this.aG.a(net.minecraft.ar.aH.CRIT, this.a + this.aq * (double)i6 / 4.0, this.aF + this.G * (double)i6 / 4.0, this.ax + this.d * (double)i6 / 4.0, -this.aq, -this.G + 0.2, -this.d, new int[0]);
                                            if (arrm == null) {
                                                if (arrm == null) continue;
                                            }
                                            break;
                                        }
                                    } else {
                                        this.a += this.aq;
                                        this.aF += this.G;
                                        this.ax += this.d;
                                    }
                                    f18 = this;
                                }
                                float f19 = h.e(f18.aq * this.aq + this.d * this.d);
                                this.e = (float)(h.a(this.aq, this.d) * 57.29577951308232);
                                this.at = (float)(h.a(this.G, (double)f19) * 57.29577951308232);
                                while (this.at - this.E < -180.0f) {
                                    this.E -= 360.0f;
                                    if (arrm == null) {
                                        if (arrm == null) continue;
                                    }
                                    break block52;
                                }
                                while (this.at - this.E >= 180.0f) {
                                    this.E += 360.0f;
                                    if (arrm == null) {
                                        if (arrm == null) continue;
                                    }
                                    break block53;
                                }
                            }
                            while (this.e - this.ak < -180.0f) {
                                this.ak -= 360.0f;
                                if (arrm == null) {
                                    if (arrm == null) continue;
                                }
                                break block54;
                            }
                        }
                        while (this.e - this.ak >= 180.0f) {
                            this.ak += 360.0f;
                            if (arrm == null) {
                                if (arrm == null) continue;
                            }
                            break block54;
                        }
                        this.at = this.E + (this.at - this.E) * 0.2f;
                        this.e = this.ak + (this.e - this.ak) * 0.2f;
                    }
                    float f20 = 0.99f;
                    float f21 = 0.05f;
                    bl2 = this.aj();
                    if (arrm == null) {
                        block55: {
                            if (bl2) {
                                for (int i7 = 0; i7 < 4; ++i7) {
                                    float f22 = 0.25f;
                                    this.aG.a(net.minecraft.ar.aH.WATER_BUBBLE, this.a - this.aq * 0.25, this.aF - this.G * 0.25, this.ax - this.d * 0.25, this.aq, this.G, this.d, new int[0]);
                                    if (arrm == null) {
                                        if (arrm == null) continue;
                                    }
                                    break block55;
                                }
                                f20 = 0.6f;
                            }
                        }
                        bl2 = this.ar();
                    }
                    if (arrm != null) break block75;
                    if (bl2) {
                        this.T();
                    }
                    this.aq *= (double)f20;
                    this.G *= (double)f20;
                    this.d *= (double)f20;
                    f10 = this;
                    if (arrm != null) break block76;
                    bl2 = f10.aI();
                }
                if (!bl2) {
                    this.G -= (double)0.05f;
                }
                this.g(this.a, this.aF, this.ax);
                f10 = this;
            }
            f10.C();
        }
    }

    public void b(double d10) {
        this.aZ = d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void f(r var1_1) {
        v0 = net.minecraft.z.d.b();
        var1_1.b("xTile", this.aX);
        var2_2 = v0;
        var1_1.b("yTile", this.aO);
        var1_1.b("zTile", this.aM);
        var1_1.a("life", (short)this.aK);
        v1 = var3_3 = net.minecraft.W.K.h.b(this.aW);
        if (var2_2 != null) ** GOTO lbl13
        if (v1 == null) {
            v2 = "";
        } else {
            v1 = var3_3;
lbl13:
            // 2 sources

            v2 = v1.toString();
        }
        var1_1.a("inTile", v2);
        var1_1.a("inData", (byte)this.aN);
        var1_1.a("shake", (byte)this.aU);
        v3 = this.aV;
        if (var2_2 == null) {
            v3 = v3 != false;
        }
        var1_1.a("inGround", (byte)(v3 ? 1 : 0));
        var1_1.a("pickup", (byte)this.aQ.ordinal());
        var1_1.a("damage", this.aZ);
        var1_1.a("crit", this.b());
    }

    @Override
    public boolean b(double d10) {
        double d11 = this.m().d() * 10.0;
        m[] arrm = net.minecraft.z.d.b();
        boolean bl2 = Double.isNaN(d11);
        if (arrm == null) {
            if (bl2) {
                d11 = 1.0;
            }
            d11 = d11 * 64.0 * net.minecraft.z.f.al();
            double d12 = d10 - d11 * d11;
            bl2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        }
        if (arrm == null) {
            bl2 = bl2 < false;
        }
        return bl2;
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11, int n2, boolean bl2) {
        this.g(d10, d11, d12);
        this.e(f10, f11);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void e(j var1_1) {
        block20: {
            block19: {
                block18: {
                    block17: {
                        block16: {
                            block15: {
                                var2_2 = net.minecraft.z.d.b();
                                v0 = this.aG.C;
                                if (var2_2 == null) {
                                    if (v0 != 0) return;
                                    v0 = this.aV ? 1 : 0;
                                }
                                if (var2_2 != null) break block15;
                                if (v0 == 0) return;
                                v1 = this;
                                if (var2_2 != null) break block16;
                                v0 = v1.aU;
                            }
                            if (v0 > 0) return;
                            v1 = this;
                        }
                        v2 = v1.aQ;
                        v3 = net.minecraft.z.d.ALLOWED;
                        if (var2_2 != null) break block17;
                        if (v2 == v3) ** GOTO lbl-1000
                        v2 = this.aQ;
                        v3 = net.minecraft.z.d.CREATIVE_ONLY;
                    }
                    if (v2 != v3) ** GOTO lbl-1000
                    v4 = var1_1.cw.g;
                    if (var2_2 == null) {
                        ** if (!v4) goto lbl-1000
                    }
                    break block18;
lbl-1000:
                    // 2 sources

                    {
                        v4 = true;
                        ** GOTO lbl30
                    }
lbl-1000:
                    // 2 sources

                    {
                        v4 = var3_3 = false;
                    }
                }
                if (this.aQ != net.minecraft.z.d.ALLOWED) break block19;
                v5 = var1_1.cB.b(this.c());
                if (var2_2 != null) break block20;
                if (!v5) {
                    var3_3 = false;
                }
            }
            v5 = var3_3;
        }
        if (v5 == false) return;
        var1_1.a((x)this, 1);
        this.a();
    }

    static {
        aT = Predicates.and((Predicate[])new Predicate[]{net.minecraft.ar.e.e, net.minecraft.ar.e.b, new e()});
        aL = net.minecraft.q.m.a(f.class, net.minecraft.q.h.m);
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    protected void ab() {
        this.ap.c(aL, (byte)0);
    }

    @Override
    public void a(r r2) {
        block15: {
            boolean bl2;
            block13: {
                block14: {
                    m[] arrm;
                    block12: {
                        int n2;
                        block10: {
                            f f10;
                            block11: {
                                this.aX = r2.m("xTile");
                                this.aO = r2.m("yTile");
                                arrm = net.minecraft.z.d.b();
                                this.aM = r2.m("zTile");
                                f10 = this;
                                n2 = r2.q("life");
                                if (arrm != null) break block10;
                                f10.aK = n2;
                                if (!r2.a("inTile", 8)) break block11;
                                this.aW = net.minecraft.W.K.d(r2.j("inTile"));
                                if (arrm == null) break block12;
                            }
                            f10 = this;
                            n2 = r2.r("inTile") & 0xFF;
                        }
                        f10.aW = net.minecraft.W.K.b(n2);
                    }
                    this.aN = r2.r("inData") & 0xFF;
                    this.aU = r2.r("shake") & 0xFF;
                    byte by2 = r2.r("inGround");
                    if (arrm == null) {
                        by2 = by2 == 1 ? (byte)1 : 0;
                    }
                    this.aV = by2;
                    bl2 = r2.a("damage", 99);
                    if (arrm == null) {
                        if (bl2) {
                            this.aZ = r2.e("damage");
                        }
                        bl2 = r2.a("pickup", 99);
                    }
                    if (arrm != null) break block13;
                    if (!bl2) break block14;
                    this.aQ = net.minecraft.z.d.a(r2.r("pickup"));
                    if (arrm == null) break block15;
                }
                bl2 = r2.a("player", 99);
            }
            if (bl2) {
                this.aQ = r2.f("player") ? net.minecraft.z.d.ALLOWED : net.minecraft.z.d.DISALLOWED;
            }
        }
        this.a(r2.f("crit"));
    }

    public void a(x x2, float f10, float f11, float f12, float f13, float f14) {
        block3: {
            double d10;
            block2: {
                float f15 = -h.g(f11 * ((float)Math.PI / 180)) * h.c(f10 * ((float)Math.PI / 180));
                float f16 = -h.g(f10 * ((float)Math.PI / 180));
                float f17 = h.c(f11 * ((float)Math.PI / 180)) * h.c(f10 * ((float)Math.PI / 180));
                this.a((double)f15, (double)f16, (double)f17, f13, f14);
                this.aq += x2.aq;
                m[] arrm = net.minecraft.z.d.b();
                f f18 = this;
                f f19 = f18;
                d10 = f18.d + x2.d;
                if (arrm != null) break block2;
                f19.d = d10;
                if (x2.A) break block3;
                f f20 = this;
                f19 = f20;
                d10 = f20.G + x2.G;
            }
            f19.G = d10;
        }
    }

    @Override
    public void b(double d10, double d11, double d12) {
        block3: {
            float f10;
            block4: {
                float f11;
                block2: {
                    this.aq = d10;
                    m[] arrm = net.minecraft.z.d.b();
                    this.G = d11;
                    this.d = d12;
                    float f12 = this.E - 0.0f;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (arrm != null) break block2;
                    if (f11 != false) break block3;
                    f10 = this.ak;
                    if (arrm != null) break block4;
                    float f13 = f10 - 0.0f;
                    f11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                if (f11 != false) break block3;
                f10 = h.e(d10 * d10 + d12 * d12);
            }
            float f14 = f10;
            this.at = (float)(h.a(d11, (double)f14) * 57.29577951308232);
            this.e = (float)(h.a(d10, d12) * 57.29577951308232);
            this.E = this.at;
            this.ak = this.e;
            this.c(this.a, this.aF, this.ax, this.e, this.at);
            this.aK = 0;
        }
    }

    public f(z z2, double d10, double d11, double d12) {
        this(z2);
        this.g(d10, d11, d12);
    }

    @Nullable
    protected x a(l l2, l l3) {
        x x2;
        block3: {
            x x3 = null;
            List<x> list = this.aG.a((x)this, this.m().d(this.aq, this.G, this.d).a(1.0), aT);
            double d10 = 0.0;
            int n2 = 0;
            m[] arrm = net.minecraft.z.d.b();
            while (n2 < list.size()) {
                block7: {
                    block6: {
                        double d11;
                        block8: {
                            double d12;
                            x x4;
                            block9: {
                                x x5;
                                block4: {
                                    block5: {
                                        x2 = x4 = list.get(n2);
                                        if (arrm != null) break block3;
                                        if (arrm != null) break block4;
                                        if (x2 != this.aY) break block5;
                                        x5 = this;
                                        if (arrm != null) break block4;
                                        if (((f)x5).aR < 5) break block6;
                                    }
                                    x5 = x4;
                                }
                                k k2 = x5.m().a(0.3f);
                                i i2 = k2.b(l2, l3);
                                if (arrm != null) break block7;
                                if (i2 == null) break block6;
                                d11 = d12 = l2.f(i2.c);
                                if (arrm != null) break block8;
                                if (d11 < d10) break block9;
                                d11 = d10;
                                if (arrm != null) break block8;
                                if (d11 != 0.0) break block6;
                            }
                            x3 = x4;
                            d11 = d12;
                        }
                        d10 = d11;
                    }
                    ++n2;
                }
                if (arrm == null) continue;
            }
            x2 = x3;
        }
        return x2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public double d() {
        return this.aZ;
    }

    public void a(B b10, float f10) {
        block4: {
            int n2 = net.minecraft.ax.T.a(b.t, b10);
            m[] arrm = net.minecraft.z.d.b();
            int n3 = net.minecraft.ax.T.a(b.z, b10);
            this.b((double)(f10 * 2.0f) + this.g.nextGaussian() * 0.25 + (double)((float)this.aG.g().a() * 0.11f));
            int n4 = n2;
            if (arrm == null) {
                if (n4 > 0) {
                    this.b(this.d() + (double)n2 * 0.5 + 0.5);
                }
                n4 = n3;
            }
            if (arrm == null) {
                if (n4 > 0) {
                    this.a(n3);
                }
                n4 = net.minecraft.ax.T.a(b.y, b10);
            }
            if (n4 <= 0) break block4;
            this.h(100);
        }
    }

    public static void a(net.minecraft.av.b b10, String string) {
    }

    public boolean b() {
        byte by2 = this.ap.b(aL);
        m[] arrm = net.minecraft.z.d.b();
        boolean bl2 = by2 & 1;
        if (arrm == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public void a(int n2) {
        this.aS = n2;
    }
}

