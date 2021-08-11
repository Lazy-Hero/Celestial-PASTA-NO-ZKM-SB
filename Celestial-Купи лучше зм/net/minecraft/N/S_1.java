/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.B.W;
import net.minecraft.B.n;
import net.minecraft.B.z;
import net.minecraft.N.N;
import net.minecraft.N.b;
import net.minecraft.N.f;
import net.minecraft.N.j;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.U.c;
import net.minecraft.W.K;
import net.minecraft.W.as;
import net.minecraft.Z.i;
import net.minecraft.ar.R;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.ar.ao;
import net.minecraft.ar.ay;
import net.minecraft.av.g;
import net.minecraft.i.h;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.u.E;
import net.minecraft.w.bl;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class S
extends N
implements net.minecraft.B.k,
ao {
    private /* synthetic */ boolean s;
    private static final /* synthetic */ int[] n;
    public /* synthetic */ bl t;
    private /* synthetic */ a2<d> o;
    private /* synthetic */ float u;
    private /* synthetic */ boolean q;
    private /* synthetic */ float r;
    private /* synthetic */ f m;
    private /* synthetic */ int p;

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.o.iterator();
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
    public boolean b(int n2, d d10, aA aA2) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = K.a(d10.w()) instanceof as;
        if (arrm == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public boolean m() {
        return this.q;
    }

    @Override
    public boolean a(int n2, d d10, aA aA2) {
        return true;
    }

    @Override
    public int c() {
        return 64;
    }

    @Override
    public void c(net.minecraft.i.j j2) {
        block5: {
            S s2;
            block7: {
                int n2;
                block6: {
                    m[] arrm;
                    block4: {
                        arrm = net.minecraft.N.j.f();
                        n2 = j2.ae();
                        if (arrm != null) break block4;
                        if (n2 != 0) break block5;
                        n2 = this.p;
                    }
                    if (arrm != null) break block6;
                    if (n2 < 0) {
                        this.p = 0;
                    }
                    ++this.p;
                    this.a.a(this.d, this.l(), 1, this.p);
                    s2 = this;
                    if (arrm != null) break block7;
                    n2 = s2.p;
                }
                if (n2 != 1) break block5;
                s2 = this;
            }
            s2.a.a(null, this.d, E.gK, ay.BLOCKS, 0.5f, this.a.J.nextFloat() * 0.1f + 0.9f);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void d(r r2) {
        block6: {
            boolean bl2;
            block4: {
                block5: {
                    this.o = a2.a(this.e(), net.minecraft.w.d.m);
                    m[] arrm = net.minecraft.N.j.f();
                    bl2 = this.a(r2);
                    if (arrm != null) break block4;
                    if (bl2) break block5;
                    bl2 = r2.a("Items", 9);
                    if (arrm != null) break block4;
                    if (bl2) {
                        W.a(r2, this.o);
                    }
                }
                bl2 = r2.a("CustomName", 8);
            }
            if (!bl2) break block6;
            this.j = r2.j("CustomName");
        }
    }

    public f k() {
        return this.m;
    }

    public k a(i i2) {
        return this.a(i2.b(as.z));
    }

    public r c(r r2) {
        r r3;
        block7: {
            block8: {
                S s2;
                block9: {
                    boolean bl2;
                    m[] arrm;
                    block6: {
                        arrm = net.minecraft.N.j.f();
                        bl2 = this.b(r2);
                        if (arrm == null) {
                            if (!bl2) {
                                W.a(r2, this.o, false);
                            }
                            bl2 = this.g();
                        }
                        if (arrm != null) break block6;
                        if (bl2) {
                            r2.a("CustomName", this.j);
                        }
                        r3 = r2;
                        if (arrm != null) break block7;
                        bl2 = r3.b("Lock");
                    }
                    if (bl2) break block8;
                    s2 = this;
                    if (arrm != null) break block9;
                    if (!s2.e()) break block8;
                    s2 = this;
                }
                s2.a().b(r2);
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public String a() {
        return "minecraft:shulker_box";
    }

    public float a(float f10) {
        return this.r + (this.u - this.r) * f10;
    }

    private k b(aA aA2) {
        aA aA3 = aA2.h();
        return this.a(aA2).b((double)aA3.r(), aA3.p(), aA3.i());
    }

    static {
        n = new int[27];
        int n2 = 0;
        while (n2 < n.length) {
            S.n[n2] = n2++;
        }
    }

    @Override
    public void d(net.minecraft.i.j j2) {
        block3: {
            S s2;
            block4: {
                int n2;
                block2: {
                    m[] arrm = net.minecraft.N.j.f();
                    n2 = j2.ae();
                    if (arrm != null) break block2;
                    if (n2 != 0) break block3;
                    --this.p;
                    this.a.a(this.d, this.l(), 1, this.p);
                    s2 = this;
                    if (arrm != null) break block4;
                    n2 = s2.p;
                }
                if (n2 > 0) break block3;
                s2 = this;
            }
            s2.a.a(null, this.d, E.di, ay.BLOCKS, 0.5f, this.a.J.nextFloat() * 0.1f + 0.9f);
        }
    }

    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = n2;
        if (arrm == null) {
            if (bl2) {
                this.p = n3;
                boolean bl3 = n3;
                if (arrm == null) {
                    if (!bl3) {
                        this.m = net.minecraft.N.f.CLOSING;
                    }
                    bl3 = n3;
                }
                if (arrm == null) {
                    if (bl3) {
                        this.m = net.minecraft.N.f.OPENING;
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = super.a(n2, n3);
        }
        return bl2;
    }

    public void a(boolean bl2) {
        this.q = bl2;
    }

    @Override
    public int e() {
        return this.o.size();
    }

    @Override
    public n a(h h2, net.minecraft.i.j j2) {
        return new z(h2, this, j2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void j() {
        this.r = this.u;
        var1_1 = net.minecraft.N.j.f();
        if (var1_1 != null) ** GOTO lbl7
        switch (b.b[this.m.ordinal()]) {
            case 1: {
                this.u = 0.0f;
lbl7:
                // 2 sources

                if (var1_1 == null) return;
            }
            case 2: {
                this.u += 0.1f;
                v0 = this;
                if (var1_1 == null) {
                    if (!(v0.u >= 1.0f)) return;
                    this.n();
                    this.m = net.minecraft.N.f.OPENED;
                    v0 = this;
                }
                v0.u = 1.0f;
                if (var1_1 == null) return;
            }
            case 3: {
                this.u -= 0.1f;
                v1 = this;
                if (var1_1 == null) {
                    if (!(v1.u <= 0.0f)) return;
                    this.m = net.minecraft.N.f.CLOSED;
                    v1 = this;
                }
                v1.u = 0.0f;
                if (var1_1 == null) return;
            }
            case 4: {
                this.u = 1.0f;
                return;
            }
        }
    }

    public boolean o() {
        return this.s;
    }

    public S(@Nullable bl bl2) {
        this.o = a2.a(27, net.minecraft.w.d.m);
        this.m = net.minecraft.N.f.CLOSED;
        this.t = bl2;
    }

    public static void a(net.minecraft.av.b b10) {
        b10.a(net.minecraft.av.f.BLOCK_ENTITY, (g)new net.minecraft.x.d(S.class, "Items"));
    }

    @Override
    public int[] a(aA aA2) {
        return n;
    }

    @Override
    public r a(r r2) {
        super.a(r2);
        return this.c(r2);
    }

    @Override
    @Nullable
    public ag k() {
        return new ag(this.d, 10, this.r());
    }

    public bl l() {
        m[] arrm = net.minecraft.N.j.f();
        bl bl2 = this.t;
        if (arrm == null) {
            if (bl2 == null) {
                this.t = as.a(this.l());
            }
            bl2 = this.t;
        }
        return bl2;
    }

    public S() {
        this(null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean i() {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = this.m();
        if (arrm != null) return bl2;
        if (!bl2) return true;
        bl2 = this.f();
        if (arrm != null) return bl2;
        if (!bl2) return true;
        bl2 = this.g();
        if (arrm != null) return bl2;
        if (bl2) return true;
        if (this.l == null) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        S s2 = this;
        if (arrm == null) {
            if (!s2.g()) return "container.shulkerBox";
            s2 = this;
        }
        String string = s2.j;
        return string;
    }

    @Override
    public void d() {
        this.s = true;
        super.d();
    }

    public k a(aA aA2) {
        return K.k.d(0.5f * this.a(1.0f) * (float)aA2.r(), 0.5f * this.a(1.0f) * (float)aA2.p(), 0.5f * this.a(1.0f) * (float)aA2.i());
    }

    @Override
    protected a2<d> a() {
        return this.o;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void n() {
        var2_1 = this.a.d(this.j());
        var1_2 = net.minecraft.N.j.f();
        v0 = var2_1;
        if (var1_2 == null) {
            if (v0.b() instanceof as == false) return;
            v0 = var2_1;
        }
        var3_3 = v0.b(as.z);
        var4_4 = this.b(var3_3).a(this.d);
        var5_5 = this.a.b(null, var4_4);
        v1 = var5_5.isEmpty();
        if (var1_2 == null) {
            if (v1 != 0) return;
            v1 = 0;
        }
        var6_6 = v1;
        do {
            block17: {
                if (var6_6 >= var5_5.size()) return;
                var7_7 = var5_5.get(var6_6);
                if (var1_2 != null) continue;
                if (var7_7.z() == net.minecraft.ac.b.IGNORE) break block17;
                var8_8 = 0.0;
                var10_9 = 0.0;
                var12_10 = 0.0;
                var14_11 = var7_7.m();
                switch (b.a[var3_3.g().ordinal()]) {
                    case 1: {
                        if (var3_3.o() != R.POSITIVE) ** GOTO lbl29
                        var8_8 = var4_4.f - var14_11.e;
                        if (var1_2 == null) ** GOTO lbl30
lbl29:
                        // 2 sources

                        var8_8 = var14_11.f - var4_4.e;
lbl30:
                        // 2 sources

                        var8_8 += 0.01;
                        if (var1_2 == null) break;
                    }
                    case 2: {
                        if (var3_3.o() != R.POSITIVE) ** GOTO lbl36
                        var10_9 = var4_4.a - var14_11.b;
                        if (var1_2 == null) ** GOTO lbl37
lbl36:
                        // 2 sources

                        var10_9 = var14_11.a - var4_4.b;
lbl37:
                        // 2 sources

                        var10_9 += 0.01;
                        if (var1_2 == null) break;
                    }
                    case 3: {
                        if (var3_3.o() != R.POSITIVE) ** GOTO lbl43
                        var12_10 = var4_4.g - var14_11.d;
                        if (var1_2 == null) ** GOTO lbl44
lbl43:
                        // 2 sources

                        var12_10 = var14_11.g - var4_4.d;
lbl44:
                        // 2 sources

                        var12_10 += 0.01;
                        break;
                    }
                }
                var7_7.a(net.minecraft.U.c.SHULKER_BOX, var8_8 * (double)var3_3.r(), var10_9 * (double)var3_3.p(), var12_10 * (double)var3_3.i());
            }
            ++var6_6;
        } while (var1_2 == null);
    }

    @Override
    public void c(r r2) {
        super.c(r2);
        this.d(r2);
    }

    @Override
    public void c() {
        block4: {
            S s2;
            block2: {
                block3: {
                    m[] arrm = net.minecraft.N.j.f();
                    this.j();
                    m[] arrm2 = arrm;
                    s2 = this;
                    if (arrm2 != null) break block2;
                    if (s2.m == net.minecraft.N.f.OPENING) break block3;
                    s2 = this;
                    if (arrm2 != null) break block2;
                    if (s2.m != net.minecraft.N.f.CLOSING) break block4;
                }
                s2 = this;
            }
            s2.n();
        }
    }
}

