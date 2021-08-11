/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.B.U;
import net.minecraft.B.W;
import net.minecraft.B.a;
import net.minecraft.B.q;
import net.minecraft.N.N;
import net.minecraft.N.j;
import net.minecraft.N.w;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.W.K;
import net.minecraft.W.az;
import net.minecraft.W.cd;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.ar.ao;
import net.minecraft.ar.ay;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.i.h;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O
extends N
implements ao {
    public /* synthetic */ float m;
    public /* synthetic */ boolean n;
    public /* synthetic */ O v;
    public /* synthetic */ O u;
    public /* synthetic */ O p;
    public /* synthetic */ O s;
    public /* synthetic */ int r;
    private /* synthetic */ cd w;
    private /* synthetic */ int q;
    private /* synthetic */ a2<d> t;
    public /* synthetic */ float o;

    @Override
    public void c() {
        block44: {
            block51: {
                O o2;
                float f10;
                block48: {
                    m[] arrm;
                    block50: {
                        block49: {
                            float f11;
                            int n2;
                            int n3;
                            int n4;
                            block47: {
                                block45: {
                                    O o3;
                                    block46: {
                                        float f12;
                                        block41: {
                                            block42: {
                                                int n5;
                                                block43: {
                                                    block39: {
                                                        block40: {
                                                            block36: {
                                                                O o4;
                                                                block38: {
                                                                    block37: {
                                                                        block28: {
                                                                            float f13;
                                                                            block29: {
                                                                                O o5;
                                                                                block30: {
                                                                                    m[] arrm2 = net.minecraft.N.j.f();
                                                                                    this.e();
                                                                                    n4 = this.d.e();
                                                                                    n3 = this.d.b();
                                                                                    n2 = this.d.a();
                                                                                    ++this.q;
                                                                                    arrm = arrm2;
                                                                                    o5 = this;
                                                                                    if (arrm != null) break block29;
                                                                                    if (o5.a.C) break block30;
                                                                                    o5 = this;
                                                                                    if (arrm != null) break block29;
                                                                                    if (o5.r == 0) break block30;
                                                                                    o5 = this;
                                                                                    if (arrm != null) break block29;
                                                                                    if ((o5.q + n4 + n3 + n2) % 200 != 0) break block30;
                                                                                    this.r = 0;
                                                                                    f13 = 5.0f;
                                                                                    for (net.minecraft.i.j j2 : this.a.a(net.minecraft.i.j.class, new k((float)n4 - 5.0f, (float)n3 - 5.0f, (float)n2 - 5.0f, (float)(n4 + 1) + 5.0f, (float)(n3 + 1) + 5.0f, (float)(n2 + 1) + 5.0f))) {
                                                                                        block32: {
                                                                                            block34: {
                                                                                                boolean bl2;
                                                                                                block35: {
                                                                                                    a a10;
                                                                                                    a a11;
                                                                                                    block33: {
                                                                                                        net.minecraft.B.n n6;
                                                                                                        block31: {
                                                                                                            n6 = j2.cm;
                                                                                                            if (arrm != null) break block31;
                                                                                                            n5 = n6 instanceof q;
                                                                                                            if (arrm != null) break block28;
                                                                                                            if (n5 == 0) break block32;
                                                                                                            n6 = j2.cm;
                                                                                                        }
                                                                                                        a10 = a11 = ((q)n6).a();
                                                                                                        if (arrm != null) break block33;
                                                                                                        if (a10 == this) break block34;
                                                                                                        a10 = a11;
                                                                                                    }
                                                                                                    bl2 = a10 instanceof U;
                                                                                                    if (arrm != null) break block35;
                                                                                                    if (!bl2) break block32;
                                                                                                    bl2 = ((U)a11).a(this);
                                                                                                }
                                                                                                if (!bl2) break block32;
                                                                                            }
                                                                                            ++this.r;
                                                                                        }
                                                                                        if (arrm == null) continue;
                                                                                    }
                                                                                }
                                                                                o5 = this;
                                                                            }
                                                                            o5.m = this.o;
                                                                            f13 = 0.1f;
                                                                            n5 = this.r;
                                                                        }
                                                                        if (arrm != null) break block36;
                                                                        if (n5 <= 0) break block37;
                                                                        float f14 = this.o - 0.0f;
                                                                        n5 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                                                        if (arrm != null) break block36;
                                                                        if (n5 != 0) break block37;
                                                                        o4 = this.p;
                                                                        if (arrm != null) break block38;
                                                                        if (o4 != null) break block37;
                                                                        o4 = this.u;
                                                                        if (arrm != null) break block38;
                                                                        if (o4 == null) {
                                                                            double d10 = (double)n4 + 0.5;
                                                                            double d11 = (double)n2 + 0.5;
                                                                            O o6 = this.v;
                                                                            if (arrm == null) {
                                                                                if (o6 != null) {
                                                                                    d11 += 0.5;
                                                                                }
                                                                                o6 = this.s;
                                                                            }
                                                                            if (arrm == null) {
                                                                                if (o6 != null) {
                                                                                    d10 += 0.5;
                                                                                }
                                                                                o6 = this;
                                                                            }
                                                                            o6.a.a(null, d10, (double)n3 + 0.5, d11, E.b_, ay.BLOCKS, 0.5f, this.a.J.nextFloat() * 0.1f + 0.9f);
                                                                        }
                                                                    }
                                                                    o4 = this;
                                                                }
                                                                n5 = o4.r;
                                                            }
                                                            if (arrm != null) break block39;
                                                            if (n5 != 0) break block40;
                                                            f12 = this.o;
                                                            if (arrm != null) break block41;
                                                            if (f12 > 0.0f) break block42;
                                                        }
                                                        n5 = this.r;
                                                    }
                                                    if (arrm != null) break block43;
                                                    if (n5 <= 0) break block44;
                                                    f12 = this.o;
                                                    if (arrm != null) break block41;
                                                    float f15 = f12 - 1.0f;
                                                    n5 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                                }
                                                if (n5 >= 0) break block44;
                                            }
                                            f12 = this.o;
                                        }
                                        f11 = f12;
                                        o3 = this;
                                        if (arrm != null) break block45;
                                        if (o3.r <= 0) break block46;
                                        this.o += 0.1f;
                                        if (arrm == null) break block47;
                                    }
                                    o3 = this;
                                }
                                o3.o -= 0.1f;
                            }
                            float f16 = this.o;
                            if (arrm == null) {
                                if (f16 > 1.0f) {
                                    this.o = 1.0f;
                                }
                                f16 = 0.5f;
                            }
                            float f17 = f16;
                            float f18 = this.o - 0.5f;
                            f10 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                            if (arrm != null) break block48;
                            if (f10 >= 0) break block49;
                            float f19 = f11 - 0.5f;
                            f10 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                            if (arrm != null) break block48;
                            if (f10 < 0) break block49;
                            o2 = this.p;
                            if (arrm != null) break block50;
                            if (o2 != null) break block49;
                            o2 = this.u;
                            if (arrm != null) break block50;
                            if (o2 == null) {
                                double d12 = (double)n4 + 0.5;
                                double d13 = (double)n2 + 0.5;
                                O o7 = this.v;
                                if (arrm == null) {
                                    if (o7 != null) {
                                        d13 += 0.5;
                                    }
                                    o7 = this.s;
                                }
                                if (arrm == null) {
                                    if (o7 != null) {
                                        d12 += 0.5;
                                    }
                                    o7 = this;
                                }
                                o7.a.a(null, d12, (double)n3 + 0.5, d13, E.g0, ay.BLOCKS, 0.5f, this.a.J.nextFloat() * 0.1f + 0.9f);
                            }
                        }
                        o2 = this;
                    }
                    if (arrm != null) break block51;
                    float f20 = o2.o - 0.0f;
                    f10 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                }
                if (f10 >= 0) break block44;
                o2 = this;
            }
            o2.o = 0.0f;
        }
    }

    public O(cd cd2) {
        this.t = a2.a(27, net.minecraft.w.d.m);
        this.w = cd2;
    }

    @Override
    public r a(r r2) {
        block2: {
            m[] arrm = net.minecraft.N.j.f();
            super.a(r2);
            m[] arrm2 = arrm;
            boolean bl2 = this.b(r2);
            if (arrm2 == null) {
                if (!bl2) {
                    W.b(r2, this.t);
                }
                bl2 = this.g();
            }
            if (!bl2) break block2;
            r2.a("CustomName", this.j);
        }
        return r2;
    }

    public cd a() {
        cd cd2;
        block2: {
            block3: {
                block6: {
                    O o2;
                    block7: {
                        block5: {
                            m[] arrm;
                            block4: {
                                arrm = net.minecraft.N.j.f();
                                cd2 = this.w;
                                if (arrm != null) break block2;
                                if (cd2 != null) break block3;
                                o2 = this;
                                if (arrm != null) break block4;
                                if (o2.a == null) break block5;
                                o2 = this;
                            }
                            if (arrm != null) break block6;
                            if (o2.l() instanceof az) break block7;
                        }
                        return cd.BASIC;
                    }
                    o2 = this;
                }
                o2.w = ((az)this.l()).D;
            }
            cd2 = this.w;
        }
        return cd2;
    }

    @Override
    public net.minecraft.B.n a(h h2, net.minecraft.i.j j2) {
        this.a(j2);
        return new q(h2, this, j2);
    }

    @Override
    public int e() {
        return 27;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void e() {
        block3: {
            block2: {
                m[] arrm = net.minecraft.N.j.f();
                O o2 = this;
                if (arrm != null) break block2;
                if (o2.n) break block3;
                this.n = true;
                this.u = this.a(aA.WEST);
                this.s = this.a(aA.EAST);
                this.p = this.a(aA.NORTH);
                o2 = this;
            }
            o2.v = this.a(aA.SOUTH);
        }
    }

    public static void a(b b10) {
        b10.a(net.minecraft.av.f.BLOCK_ENTITY, (g)new net.minecraft.x.d(O.class, "Items"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        O o2 = this;
        if (arrm == null) {
            if (!o2.g()) return "container.chest";
            o2 = this;
        }
        String string = o2.j;
        return string;
    }

    @Override
    public int c() {
        return 64;
    }

    @Override
    public void t() {
        super.t();
        this.n = false;
    }

    @Override
    public void i() {
        super.i();
        this.t();
        this.e();
    }

    @Override
    public String a() {
        return "minecraft:chest";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(n n2) {
        K k2;
        m[] arrm = net.minecraft.N.j.f();
        z z2 = this.a;
        if (arrm == null) {
            if (z2 == null) {
                return false;
            }
            z2 = this.a;
        }
        K k3 = k2 = z2.d(n2).b();
        if (arrm == null) {
            if (!(k3 instanceof az)) return false;
            k3 = k2;
        }
        if (((az)k3).D != this.a()) return false;
        return true;
    }

    @Override
    public void c(net.minecraft.i.j j2) {
        block8: {
            O o2;
            block10: {
                m[] arrm;
                block9: {
                    int n2;
                    block7: {
                        arrm = net.minecraft.N.j.f();
                        n2 = j2.ae();
                        if (arrm != null) break block7;
                        if (n2 != 0) break block8;
                        o2 = this;
                        if (arrm != null) break block9;
                        n2 = o2.r;
                    }
                    if (n2 < 0) {
                        this.r = 0;
                    }
                    ++this.r;
                    this.a.a(this.d, this.l(), 1, this.r);
                    this.a.a(this.d, this.l(), false);
                    o2 = this;
                }
                if (arrm != null) break block10;
                if (o2.a() != cd.TRAP) break block8;
                o2 = this;
            }
            o2.a.a(this.d.k(), this.l(), false);
        }
    }

    public O() {
        this.t = a2.a(27, net.minecraft.w.d.m);
    }

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.t.iterator();
            m[] arrm = net.minecraft.N.j.f();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        d d10 = (d)iterator.next();
                        bl2 = d10.G();
                        if (arrm != null) break block3;
                        if (arrm != null) break block4;
                        if (bl2) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (arrm == null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void d(net.minecraft.i.j j2) {
        block3: {
            O o2;
            block5: {
                m[] arrm;
                block4: {
                    boolean bl2;
                    block2: {
                        arrm = net.minecraft.N.j.f();
                        bl2 = j2.ae();
                        if (arrm != null) break block2;
                        if (bl2) break block3;
                        o2 = this;
                        if (arrm != null) break block4;
                        bl2 = o2.l() instanceof az;
                    }
                    if (!bl2) break block3;
                    --this.r;
                    this.a.a(this.d, this.l(), 1, this.r);
                    this.a.a(this.d, this.l(), false);
                    o2 = this;
                }
                if (arrm != null) break block5;
                if (o2.a() != cd.TRAP) break block3;
                o2 = this;
            }
            o2.a.a(this.d.k(), this.l(), false);
        }
    }

    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = n2;
        if (arrm == null) {
            if (bl2) {
                this.r = n3;
                return true;
            }
            bl2 = super.a(n2, n3);
        }
        return bl2;
    }

    @Override
    protected a2<d> a() {
        return this.t;
    }

    @Override
    public void c(r r2) {
        block2: {
            m[] arrm = net.minecraft.N.j.f();
            super.c(r2);
            this.t = a2.a(this.e(), net.minecraft.w.d.m);
            m[] arrm2 = arrm;
            boolean bl2 = this.a(r2);
            if (arrm2 == null) {
                if (!bl2) {
                    W.a(r2, this.t);
                }
                bl2 = r2.a("CustomName", 8);
            }
            if (!bl2) break block2;
            this.j = r2.j("CustomName");
        }
    }

    @Nullable
    protected O a(aA aA2) {
        block3: {
            O o2;
            block4: {
                O o3;
                y y2;
                m[] arrm;
                block2: {
                    n n2 = this.d.a(aA2);
                    arrm = net.minecraft.N.j.f();
                    y2 = this;
                    if (arrm != null) break block2;
                    if (!y2.a(n2)) break block3;
                    y2 = this.a.b(n2);
                }
                o2 = o3 = y2;
                if (arrm != null) break block4;
                if (!(o2 instanceof O)) break block3;
                o2 = o3;
            }
            O o4 = o2;
            o4.a(this, aA2.h());
            return o4;
        }
        return null;
    }

    private void a(O o2, aA aA2) {
        block15: {
            int n2;
            m[] arrm;
            block16: {
                block13: {
                    block14: {
                        arrm = net.minecraft.N.j.f();
                        n2 = o2.a();
                        if (arrm != null) break block13;
                        if (n2 == 0) break block14;
                        this.n = false;
                        if (arrm == null) break block15;
                    }
                    n2 = this.n;
                }
                if (arrm != null) break block16;
                if (n2 == 0) break block15;
                n2 = net.minecraft.N.w.a[aA2.ordinal()];
            }
            switch (n2) {
                case 1: {
                    O o3 = this.p;
                    if (arrm == null) {
                        if (o3 == o2) break;
                        o3 = this;
                    }
                    o3.n = false;
                    if (arrm == null) break;
                }
                case 2: {
                    O o4 = this.v;
                    if (arrm == null) {
                        if (o4 == o2) break;
                        o4 = this;
                    }
                    o4.n = false;
                    if (arrm == null) break;
                }
                case 3: {
                    O o5 = this.s;
                    if (arrm == null) {
                        if (o5 == o2) break;
                        o5 = this;
                    }
                    o5.n = false;
                    if (arrm == null) break;
                }
                case 4: {
                    O o6 = this.u;
                    if (arrm == null) {
                        if (o6 == o2) break;
                        o6 = this;
                    }
                    o6.n = false;
                }
            }
        }
    }
}

