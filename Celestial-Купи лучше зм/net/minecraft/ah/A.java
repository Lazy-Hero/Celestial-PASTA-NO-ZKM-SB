/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.util.concurrent.ListenableFuture
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ah;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.A.d;
import net.minecraft.D.c;
import net.minecraft.D.g;
import net.minecraft.Q.a5;
import net.minecraft.Q.ab;
import net.minecraft.Q.ae;
import net.minecraft.Q.az;
import net.minecraft.U.B;
import net.minecraft.U.I;
import net.minecraft.U.x;
import net.minecraft.W.cN;
import net.minecraft.Z.i;
import net.minecraft.a7;
import net.minecraft.aA.r;
import net.minecraft.aZ;
import net.minecraft.ag.J;
import net.minecraft.ag.Z;
import net.minecraft.ah.C;
import net.minecraft.ah.E;
import net.minecraft.ah.F;
import net.minecraft.ah.K;
import net.minecraft.ah.L;
import net.minecraft.ah.N;
import net.minecraft.ah.U;
import net.minecraft.ah.e;
import net.minecraft.ah.h;
import net.minecraft.ah.p;
import net.minecraft.ah.s;
import net.minecraft.ah.u;
import net.minecraft.ah.v;
import net.minecraft.ah.w;
import net.minecraft.ah.z;
import net.minecraft.ap.j;
import net.minecraft.ar.aH;
import net.minecraft.ar.al;
import net.minecraft.ar.aw;
import net.minecraft.aw.b;
import net.minecraft.aw.y;
import net.minecraft.c.l;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.p.T;
import net.minecraft.t.f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class A
extends z
implements aw {
    protected final /* synthetic */ net.minecraft.y.e af;
    private final /* synthetic */ u T;
    private final /* synthetic */ Set<F> U;
    private final /* synthetic */ Map<UUID, x> ab;
    private /* synthetic */ boolean X;
    private final /* synthetic */ v[] ag;
    private final /* synthetic */ net.minecraft.U.N aa;
    private static final /* synthetic */ Logger Z;
    public /* synthetic */ boolean Y;
    private final /* synthetic */ net.minecraft.R.b W;
    private /* synthetic */ int ae;
    private final /* synthetic */ TreeSet<F> ad;
    private final /* synthetic */ net.minecraft.a.s V;
    private final /* synthetic */ List<F> S;
    private /* synthetic */ int R;
    private final /* synthetic */ E ac;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public d a(net.minecraft.U.k k2, n n2) {
        List<d> list = this.a().a(k2, n2);
        String string = z.I();
        List<d> list2 = list;
        if (string != null) {
            if (list2 == null) return null;
            list2 = list;
        }
        if (list2.isEmpty()) return null;
        d d10 = al.a(this.J, list);
        return d10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.i.j j2, n n2) {
        String string = z.I();
        boolean bl2 = this.W.a(this, n2, j2);
        if (string != null) {
            if (bl2) return false;
            bl2 = this.O().a(n2);
        }
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public a7 r() {
        return this.b;
    }

    @Override
    @Nullable
    public net.minecraft.R.b H() {
        return this.W;
    }

    @Override
    public void a(x x2, boolean bl2) {
        A a10;
        block8: {
            block9: {
                x x3;
                block10: {
                    boolean bl3;
                    String string;
                    block4: {
                        block5: {
                            x x4;
                            block6: {
                                block7: {
                                    string = z.I();
                                    bl3 = this.k();
                                    if (string == null) break block4;
                                    if (bl3) break block5;
                                    x4 = x2;
                                    if (string == null) break block6;
                                    if (x4 instanceof net.minecraft.ag.C) break block7;
                                    bl3 = x2 instanceof Z;
                                    if (string == null) break block4;
                                    if (!bl3) break block5;
                                }
                                x4 = x2;
                            }
                            x4.a();
                        }
                        a10 = this;
                        if (string == null) break block8;
                        bl3 = a10.e();
                    }
                    if (bl3) break block9;
                    x3 = x2;
                    if (string == null) break block10;
                    if (!(x3 instanceof I)) break block9;
                    x3 = x2;
                }
                x3.a();
            }
            a10 = this;
        }
        super.a(x2, bl2);
    }

    @Nullable
    public x a(UUID uUID) {
        return this.ab.get(uUID);
    }

    @Override
    @Nullable
    public List<F> a(net.minecraft.ao.b b10, boolean bl2) {
        List list = null;
        int n2 = 0;
        String string = z.I();
        block0: while (true) {
            int n3 = n2;
            int n4 = 2;
            block1: while (n3 < n4) {
                Iterator<F> iterator;
                block13: {
                    block12: {
                        if (n2 != 0) break block12;
                        iterator = this.ad.iterator();
                        if (string != null) break block13;
                    }
                    iterator = this.S.iterator();
                }
                while (iterator.hasNext()) {
                    block15: {
                        F f10;
                        block20: {
                            int n5;
                            block19: {
                                block18: {
                                    int n6;
                                    block17: {
                                        n n7;
                                        block16: {
                                            block14: {
                                                f10 = iterator.next();
                                                n7 = f10.f;
                                                n3 = n7.e();
                                                n4 = b10.c;
                                                if (string == null) continue block1;
                                                if (string == null) break block14;
                                                if (n3 < n4) break block15;
                                                n5 = n7.e();
                                                n6 = b10.a;
                                            }
                                            if (string == null) break block16;
                                            if (n5 >= n6) break block15;
                                            n5 = n7.a();
                                            n6 = b10.f;
                                        }
                                        if (string == null) break block17;
                                        if (n5 < n6) break block15;
                                        n5 = n7.a();
                                        if (string == null) break block18;
                                        n6 = b10.d;
                                    }
                                    if (n5 >= n6) break block15;
                                    n5 = bl2 ? 1 : 0;
                                }
                                if (string == null) break block19;
                                if (n5 == 0) break block20;
                                n5 = n2;
                            }
                            if (string != null && n5 == 0) {
                                n5 = this.U.remove(f10) ? 1 : 0;
                            }
                            iterator.remove();
                        }
                        List list2 = list;
                        if (string != null) {
                            if (list2 == null) {
                                list = Lists.newArrayList();
                            }
                            list2 = list;
                        }
                        list2.add(f10);
                    }
                    if (string != null) continue;
                }
                ++n2;
                if (string != null) continue block0;
            }
            break;
        }
        return list;
    }

    public void a(aH aH2, double d10, double d11, double d12, int n2, double d13, double d14, double d15, double d16, int ... arrn) {
        this.a(aH2, false, d10, d11, d12, n2, d13, d14, d15, d16, arrn);
    }

    public net.minecraft.U.N x() {
        return this.aa;
    }

    private boolean k() {
        return this.W.ai();
    }

    public net.minecraft.a.s g() {
        return this.V;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(cN cN2) {
        i i2 = this.d(cN2.d());
        String string = z.I();
        i i3 = i2;
        if (string != null) {
            if (i3.b() != cN2.b()) return false;
            i3 = i2;
        }
        boolean bl2 = i3.a((z)this, cN2.d(), cN2.a(), cN2.c());
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    @Nullable
    public List<F> a(a a10, boolean bl2) {
        net.minecraft.k.f f10 = a10.A();
        int n2 = (f10.c << 4) - 2;
        int n3 = n2 + 16 + 2;
        int n4 = (f10.b << 4) - 2;
        int n5 = n4 + 16 + 2;
        return this.a(new net.minecraft.ao.b(n2, 0, n4, n3, 256, n5), bl2);
    }

    protected void v() {
        String string = z.I();
        this.H.b("playerCheckLight");
        String string2 = string;
        A a10 = this;
        if (string2 != null) {
            if (!a10.k.isEmpty()) {
                int n2 = this.J.nextInt(this.k.size());
                net.minecraft.i.j j2 = (net.minecraft.i.j)this.k.get(n2);
                int n3 = net.minecraft.k.h.f(j2.a) + this.J.nextInt(11) - 5;
                int n4 = net.minecraft.k.h.f(j2.aF) + this.J.nextInt(11) - 5;
                int n5 = net.minecraft.k.h.f(j2.ax) + this.J.nextInt(11) - 5;
                this.i(new n(n3, n4, n5));
            }
            a10 = this;
        }
        a10.H.c();
    }

    @Override
    protected void S() {
        block8: {
            block10: {
                block9: {
                    float f10;
                    String string;
                    block7: {
                        boolean bl2 = this.J();
                        string = z.I();
                        super.S();
                        float f11 = this.p - this.y;
                        f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        if (string != null) {
                            float f12;
                            if (f10 != false) {
                                this.W.O().a(new az(7, this.y), this.D.r().a());
                            }
                            f10 = (f12 = this.I - this.d) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                        }
                        if (string != null) {
                            if (f10 != false) {
                                this.W.O().a(new az(8, this.d), this.D.r().a());
                            }
                            f10 = (float)bl2;
                        }
                        if (string == null) break block7;
                        if (f10 == this.J()) break block8;
                        f10 = (float)bl2;
                    }
                    if (f10 == false) break block9;
                    this.W.O().a(new az(2, 0.0f));
                    if (string != null) break block10;
                }
                this.W.O().a(new az(1, 0.0f));
            }
            this.W.O().a(new az(7, this.y));
            this.W.O().a(new az(8, this.d));
        }
    }

    public boolean l() {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3;
                block3: {
                    String string = z.I();
                    bl2 = this.X;
                    if (string == null) break block4;
                    if (!bl2) break block5;
                    bl2 = this.C;
                    if (string == null) break block4;
                    if (bl2) break block5;
                    for (net.minecraft.i.j j2 : this.k) {
                        block7: {
                            boolean bl4;
                            block8: {
                                block6: {
                                    bl3 = j2.ae();
                                    if (string == null) break block3;
                                    if (string == null) break block6;
                                    if (bl3) break block7;
                                    bl4 = j2.I();
                                }
                                if (string == null) break block8;
                                if (bl4) break block7;
                                bl4 = false;
                            }
                            return bl4;
                        }
                        if (string != null) continue;
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    protected net.minecraft.o.k A() {
        net.minecraft.t.e e10 = this.q.a(this.D);
        return new r(this, e10, this.D.o());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(boolean var1_1) {
        block29: {
            block28: {
                block31: {
                    block30: {
                        var2_2 = z.I();
                        v0 = this;
                        if (var2_2 != null) {
                            if (v0.u.w() == net.minecraft.ah.L.e) {
                                return false;
                            }
                            v0 = this;
                        }
                        v1 = var3_3 = v0.ad.size();
                        v2 = this.U.size();
                        if (var2_2 == null) break block30;
                        if (v1 != v2) {
                            throw new IllegalStateException("TickNextTick list out of synch");
                        }
                        v1 = var3_3;
                        if (var2_2 == null) break block31;
                        v2 = 65536;
                    }
                    if (v1 > v2) {
                        var3_3 = 65536;
                    }
                    this.H.b("cleaning");
                    v1 = var4_4 = 0;
                }
                while (var4_4 < var3_3) {
                    var5_6 = this.ad.first();
                    if (var2_2 != null) {
                        v3 = var1_1;
                        if (var2_2 != null) {
                            if (v3 == 0) {
                                cfr_temp_0 = var5_6.b - this.u.x();
                                v3 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                if (var2_2 != null) {
                                    if (v3 > 0 && var2_2 != null) break;
                                }
                            } else {
                                this.ad.remove(var5_6);
                                this.U.remove(var5_6);
                                v3 = this.S.add(var5_6) ? 1 : 0;
                            }
                        }
                        ++var4_4;
                        if (var2_2 != null) continue;
                    }
                    break block28;
                }
                this.H.c();
                this.H.b("ticking");
            }
            var4_5 = this.S.iterator();
            while (var4_5.hasNext()) {
                block36: {
                    block32: {
                        block33: {
                            block35: {
                                block34: {
                                    var5_6 = var4_5.next();
                                    var4_5.remove();
                                    var6_7 = false;
                                    v4 = this;
                                    v5 = var5_6.f.a(0, 0, 0);
                                    v6 = var5_6;
                                    if (var2_2 == null) break block32;
                                    v7 = v4.a(v5, v6.f.a(0, 0, 0));
                                    if (var2_2 == null) break block29;
                                    if (!v7) break block33;
                                    v8 = var7_8 = this.d(var5_6.f);
                                    if (var2_2 == null) break block34;
                                    if (v8.o() == net.minecraft.ac.c.A) break block35;
                                    v8 = var7_8;
                                }
                                v9 = v8.b();
                                if (var2_2 == null) ** GOTO lbl65
                                if (!net.minecraft.W.K.a(v9, var5_6.a())) break block35;
                                try {
                                    v9 = var7_8.b();
lbl65:
                                    // 2 sources

                                    v9.a((z)this, var5_6.f, var7_8, this.J);
                                }
                                catch (Throwable var8_9) {
                                    var9_10 = net.minecraft.c.f.a(var8_9, "Exception while ticking a block");
                                    var10_11 = var9_10.a("Block being ticked");
                                    net.minecraft.c.l.a(var10_11, var5_6.f, var7_8);
                                    throw new net.minecraft.ar.Z(var9_10);
                                }
                            }
                            if (var2_2 != null) break block36;
                        }
                        v4 = this;
                        v5 = var5_6.f;
                        v6 = var5_6;
                    }
                    v4.a(v5, v6.a(), 0);
                }
                if (var2_2 != null) continue;
            }
            this.H.c();
            this.S.clear();
            v7 = this.ad.isEmpty();
        }
        if (var2_2 == null) return v7;
        if (v7 != false) return false;
        return true;
    }

    protected void q() {
        T t2 = new T();
        int n2 = 0;
        String string = z.I();
        while (n2 < 10) {
            int n3 = this.u.M() + this.J.nextInt(6) - this.J.nextInt(6);
            int n4 = this.u.h() + this.J.nextInt(6) - this.J.nextInt(6);
            n n5 = this.c(new n(n3, 0, n4)).a();
            if (string != null) {
                if (t2.a((z)this, this.J, n5) && string != null) break;
                ++n2;
            }
            if (string != null) continue;
        }
    }

    public void a(aH aH2, boolean bl2, double d10, double d11, double d12, int n2, double d13, double d14, double d15, double d16, int ... arrn) {
        ab ab2 = new ab(aH2, bl2, (float)d10, (float)d11, (float)d12, (float)d13, (float)d14, (float)d15, (float)d16, n2, arrn);
        String string = z.I();
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            net.minecraft.i.k k2 = (net.minecraft.i.k)this.k.get(i2);
            this.a(k2, bl2, d10, d11, d12, ab2);
            if (string != null) continue;
        }
    }

    private void i() {
        this.u.f(false);
        this.u.g(true);
        this.u.c(false);
        this.u.a(false);
        this.u.h(1000000000);
        this.u.a(6000L);
        this.u.a(net.minecraft.ah.s.SPECTATOR);
        this.u.b(false);
        this.u.a(net.minecraft.ah.e.PEACEFUL);
        this.u.d(true);
        this.M().a("doDaylightCycle", "false");
    }

    @Override
    public void L() {
        int n2;
        int n3;
        String string;
        block20: {
            A a10;
            block22: {
                block21: {
                    block17: {
                        A a11;
                        block19: {
                            block18: {
                                String string2 = z.I();
                                super.L();
                                string = string2;
                                n3 = this.b().a();
                                if (string == null) break block17;
                                if (n3 == 0) break block18;
                                a11 = this;
                                if (string == null) break block19;
                                if (a11.g() != net.minecraft.ah.e.HARD) {
                                    this.b().a(net.minecraft.ah.e.HARD);
                                }
                            }
                            this.D.p().d();
                            a11 = this;
                        }
                        n3 = a11.l();
                    }
                    if (string != null) {
                        if (n3 != 0) {
                            A a12 = this;
                            if (string != null) {
                                if (a12.M().c("doDaylightCycle")) {
                                    long l2 = this.u.m() + 24000L;
                                    this.u.a(l2 - l2 % 24000L);
                                }
                                a12 = this;
                            }
                            a12.n();
                        }
                        this.H.b("mobSpawner");
                        n3 = this.M().c("doMobSpawning");
                    }
                    if (string == null) break block20;
                    if (n3 == 0) break block21;
                    a10 = this;
                    if (string == null) break block22;
                    if (a10.u.w() != net.minecraft.ah.L.e) {
                        long l3 = this.u.x() % 400L - 0L;
                        l3 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                        if (string != null) {
                            l3 = l3 == false ? (long)1 : (long)0;
                        }
                        this.ac.a(this, this.f, this.i, (boolean)l3);
                    }
                }
                this.H.a("chunkSource");
                this.Q.b();
                a10 = this;
            }
            n3 = a10.k(1.0f);
        }
        int n4 = n2 = n3;
        if (string != null) {
            if (n4 != this.Q()) {
                this.d(n2);
            }
            this.u.b(this.u.x() + 1L);
            n4 = this.M().c("doDaylightCycle") ? 1 : 0;
        }
        if (string != null) {
            if (n4 != 0) {
                this.u.a(this.u.m() + 1L);
            }
            this.H.a("tickPending");
            n4 = this.a(false) ? 1 : 0;
        }
        this.H.a("tickBlocks");
        this.h();
        this.H.a("chunkMap");
        this.V.a();
        this.H.a("village");
        this.g.c();
        this.af.c();
        this.H.a("portalForcer");
        this.T.a(this.r());
        this.H.c();
        this.b();
    }

    @Override
    public void t() {
        String string = z.I();
        int n2 = this.u.j();
        if (string != null) {
            if (n2 <= 0) {
                this.u.f(this.y() + 1);
            }
            n2 = this.u.M();
        }
        int n3 = n2;
        int n4 = this.u.h();
        int n5 = 0;
        while (this.A(new n(n3, 0, n4)).o() == net.minecraft.ac.c.A) {
            n3 += this.J.nextInt(8) - this.J.nextInt(8);
            n4 += this.J.nextInt(8) - this.J.nextInt(8);
            while (++n5 == 10000) {
                if (string == null) continue;
            }
        }
        this.u.e(n3);
        this.u.d(n4);
    }

    public u m() {
        return this.T;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(K var1_1) {
        var2_2 = z.I();
        v0 = this.u;
        if (var2_2 == null) ** GOTO lbl10
        if (v0.t() != false) return;
        try {
            block10: {
                this.b(var1_1);
                v1 = this;
                if (var2_2 == null) break block10;
                v0 = v1.u;
lbl10:
                // 2 sources

                if (v0.w() == net.minecraft.ah.L.e) {
                    this.i();
                }
                v1 = this;
            }
            super.a(var1_1);
        }
        catch (Throwable var3_3) {
            var4_4 = net.minecraft.c.f.a(var3_3, "Exception initializing level");
            try {
                this.a(var4_4);
                throw new net.minecraft.ar.Z(var4_4);
            }
            catch (Throwable var5_5) {
                // empty catch block
            }
            throw new net.minecraft.ar.Z(var4_4);
        }
        this.u.e(true);
    }

    @Override
    public void a(x x2, byte by2) {
        this.x().b(x2, new a5(x2, by2));
    }

    @Override
    public void b(Collection<x> collection) {
        Iterator iterator = Lists.newArrayList(collection).iterator();
        String string = z.I();
        while (iterator.hasNext()) {
            block4: {
                x x2;
                block3: {
                    x2 = (x)iterator.next();
                    boolean bl2 = this.a(x2);
                    if (string == null) break block3;
                    if (!bl2) break block4;
                    bl2 = this.O.add(x2);
                }
                this.g(x2);
            }
            if (string != null) continue;
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    protected n a(n n2) {
        n n3;
        block6: {
            int n4;
            n n5;
            block5: {
                n5 = this.d(n2);
                k k2 = new k(n5, new n(n5.e(), this.i(), n5.a())).a(3.0);
                List<B> list = this.a(B.class, k2, new N(this));
                String string = z.I();
                n4 = list.isEmpty();
                if (string == null) break block5;
                if (n4 == 0) {
                    return list.get(this.J.nextInt(list.size())).f();
                }
                n3 = n5;
                if (string == null) break block6;
                n4 = n3.b();
            }
            if (n4 == -1) {
                n5 = n5.c(2);
            }
            n3 = n5;
        }
        return n3;
    }

    public void f() {
        block3: {
            r r2;
            block2: {
                r r3 = this.a();
                String string = z.I();
                r2 = r3;
                if (string == null) break block2;
                if (!r2.a()) break block3;
                r2 = r3;
            }
            r2.e();
        }
    }

    @Override
    protected void k() {
        String string = z.I();
        super.k();
        this.H.a("players");
        String string2 = string;
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            net.minecraft.aq.b b10;
            block16: {
                block17: {
                    x x2;
                    block18: {
                        boolean bl2;
                        block19: {
                            boolean bl3;
                            block15: {
                                x x3;
                                x2 = (x)this.k.get(i2);
                                x x4 = x3 = x2.as();
                                if (string2 != null) {
                                    if (x4 != null) {
                                        x x5 = x3;
                                        if (string2 != null) {
                                            if (!x5.P) {
                                                x5 = x3;
                                                if (string2 != null) {
                                                    if (x5.l(x2) && string2 != null) continue;
                                                }
                                            } else {
                                                x5 = x2;
                                            }
                                        }
                                        x5.aO();
                                    }
                                    this.H.b("tick");
                                    x4 = x2;
                                }
                                bl3 = x4.P;
                                if (string2 == null) break block15;
                                if (!bl3) {
                                    try {
                                        this.i(x2);
                                    }
                                    catch (Throwable throwable) {
                                        net.minecraft.c.f f10 = net.minecraft.c.f.a(throwable, "Ticking player");
                                        l l2 = f10.a("Player being ticked");
                                        x2.a(l2);
                                        throw new net.minecraft.ar.Z(f10);
                                    }
                                }
                                this.H.c();
                                b10 = this.H;
                                if (string2 == null) break block16;
                                b10.b("remove");
                                bl3 = x2.P;
                            }
                            if (!bl3) break block17;
                            int n2 = x2.v;
                            int n3 = x2.y;
                            bl2 = x2.D;
                            if (string2 == null) break block18;
                            if (!bl2) break block19;
                            bl2 = this.a(n2, n3, true);
                            if (string2 == null) break block18;
                            if (bl2) {
                                this.b(n2, n3).b(x2);
                            }
                        }
                        bl2 = this.O.remove(x2);
                    }
                    this.b(x2);
                }
                b10 = this.H;
            }
            b10.c();
            if (string2 != null) continue;
        }
    }

    public void u() {
        this.ae = 0;
    }

    private void j() {
        this.u.g(0);
        this.u.c(false);
        this.u.a(0);
        this.u.a(false);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void l() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private void a(net.minecraft.i.k k2, boolean bl2, double d10, double d11, double d12, net.minecraft.C.K<?> k3) {
        block5: {
            block3: {
                double d13;
                block4: {
                    double d14;
                    String string;
                    block2: {
                        n n2 = k2.f();
                        string = z.I();
                        d14 = n2.b(d10, d11, d12);
                        double d15 = d14 - 1024.0;
                        d13 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                        if (string == null) break block2;
                        if (d13 <= 0) break block3;
                        d13 = (double)bl2;
                    }
                    if (string == null) break block4;
                    if (d13 == false) break block5;
                    double d16 = d14 - 262144.0;
                    d13 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                }
                if (d13 > 0) break block5;
            }
            k2.cD.a(k3);
        }
    }

    public void a(net.minecraft.i.k k2, aH aH2, boolean bl2, double d10, double d11, double d12, int n2, double d13, double d14, double d15, double d16, int ... arrn) {
        ab ab2 = new ab(aH2, bl2, (float)d10, (float)d11, (float)d12, (float)d13, (float)d14, (float)d15, (float)d16, n2, arrn);
        this.a(k2, bl2, d10, d11, d12, ab2);
    }

    public j s() {
        return this.q.d();
    }

    public A(net.minecraft.R.b b10, b b11, net.minecraft.aw.w w2, int n2, net.minecraft.aq.b b12) {
        super(b11, w2, net.minecraft.ah.p.a(n2).c(), b12, false);
        this.U = Sets.newHashSet();
        this.ad = new TreeSet();
        this.ab = Maps.newHashMap();
        this.ac = new E();
        this.af = new net.minecraft.y.e(this);
        this.ag = new v[]{new v(null), new v(null)};
        this.S = Lists.newArrayList();
        this.W = b10;
        this.aa = new net.minecraft.U.N(this);
        this.V = new net.minecraft.a.s(this);
        this.D.a(this);
        this.Q = this.A();
        this.T = new u(this);
        this.p();
        this.o();
        this.O().b(b10.v());
    }

    public r a() {
        return (r)super.f();
    }

    @Override
    public void a(n n2, net.minecraft.W.K k2, int n3, int n4) {
        block3: {
            boolean bl2;
            cN cN2 = new cN(n2, k2, n3, n4);
            String string = z.I();
            for (cN cN3 : this.ag[this.R]) {
                bl2 = cN3.equals(cN2);
                if (string != null) {
                    if (bl2) {
                        return;
                    }
                    if (string != null) continue;
                }
                break block3;
            }
            bl2 = this.ag[this.R].add(cN2);
        }
    }

    @Override
    public boolean d(x x2) {
        String string = z.I();
        boolean bl2 = super.d(x2);
        if (string != null) {
            if (bl2) {
                this.W.O().a(null, x2.a, x2.aF, x2.ax, 512.0, this.D.r().a(), new ae(x2));
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(net.minecraft.U.k k2, d d10, n n2) {
        List<d> list = this.a().a(k2, n2);
        String string = z.I();
        List<d> list2 = list;
        if (string != null) {
            if (list2 == null) return false;
            list2 = list;
        }
        boolean bl2 = list2.isEmpty();
        if (string != null) {
            if (bl2) return false;
            bl2 = list.contains(d10);
        }
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    static {
        Z = LogManager.getLogger();
    }

    protected void c() throws w {
        A a10;
        block4: {
            String string = z.I();
            this.w();
            String string2 = string;
            A[] arra = this.W.S;
            int n2 = arra.length;
            int n3 = 0;
            while (n3 < n2) {
                A a11 = arra[n3];
                if (string2 != null) {
                    a10 = a11;
                    if (string2 == null) break block4;
                    if (a10 instanceof C) {
                        ((C)a11).a();
                    }
                    ++n3;
                }
                if (string2 != null) continue;
            }
            this.u.b(this.O().c());
            this.u.a(this.O().n());
            this.u.c(this.O().l());
            this.u.e(this.O().p());
            this.u.d(this.O().j());
            this.u.b(this.O().s());
            this.u.i(this.O().q());
            this.u.f(this.O().e());
            this.u.c(this.O().i());
            this.q.a(this.u, this.W.O().f());
            a10 = this;
        }
        a10.E.b();
    }

    @Override
    protected boolean a(int n2, int n3, boolean bl2) {
        return this.a().c(n2, n3);
    }

    @Override
    public U a(@Nullable x x2, double d10, double d11, double d12, float f10, boolean bl2, boolean bl3) {
        String string;
        U u2;
        block6: {
            U u3;
            block5: {
                u2 = new U(this, x2, d10, d11, d12, f10, bl2, bl3);
                string = z.I();
                u2.e();
                u3 = u2;
                if (string == null) break block5;
                u3.a(false);
                if (bl3) break block6;
                u3 = u2;
            }
            u3.b();
        }
        Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            block8: {
                net.minecraft.i.j j2;
                net.minecraft.i.j j3;
                block7: {
                    j2 = j3 = (net.minecraft.i.j)iterator.next();
                    if (string == null) break block7;
                    if (!(j2.a(d10, d11, d12) < 4096.0)) break block8;
                    j2 = j3;
                }
                ((net.minecraft.i.k)j2).cD.a(new net.minecraft.Q.p(d10, d11, d12, f10, u2.c(), u2.a().get(j3)));
            }
            if (string != null) continue;
        }
        return u2;
    }

    @Override
    public void b(n n2, net.minecraft.W.K k2, int n3, int n4) {
        String string;
        net.minecraft.ac.c c10;
        block6: {
            boolean bl2;
            block7: {
                block8: {
                    block10: {
                        net.minecraft.W.K k3;
                        i i2;
                        block12: {
                            i i3;
                            block11: {
                                n n5;
                                A a10;
                                block9: {
                                    c10 = k2.d().o();
                                    string = z.I();
                                    if (!this.F || c10 == net.minecraft.ac.c.A) break block6;
                                    bl2 = k2.j();
                                    if (string == null) break block7;
                                    if (!bl2) break block8;
                                    a10 = this;
                                    n5 = n2.a(-8, -8, -8);
                                    if (string == null) break block9;
                                    if (!a10.a(n5, n2.a(8, 8, 8))) break block10;
                                    a10 = this;
                                    n5 = n2;
                                }
                                i3 = i2 = a10.d(n5);
                                if (string == null) break block11;
                                if (i3.o() == net.minecraft.ac.c.A) break block10;
                                i3 = i2;
                            }
                            k3 = i3.b();
                            if (string == null) break block12;
                            if (k3 != k2) break block10;
                            k3 = i2.b();
                        }
                        k3.a((z)this, n2, i2, this.J);
                    }
                    return;
                }
                bl2 = true;
            }
            n3 = bl2 ? 1 : 0;
        }
        F f10 = new F(n2, k2);
        if (this.n(n2)) {
            if (c10 != net.minecraft.ac.c.A) {
                f10.a((long)n3 + this.u.x());
                f10.a(n4);
            }
            boolean bl3 = this.U.contains(f10);
            if (string != null && !bl3) {
                this.U.add(f10);
                bl3 = this.ad.add(f10);
            }
        }
    }

    @Override
    public void c(n n2, net.minecraft.W.K k2, int n3, int n4) {
        F f10 = new F(n2, k2);
        f10.a(n4);
        net.minecraft.ac.c c10 = k2.d().o();
        String string = z.I();
        if (c10 != net.minecraft.ac.c.A) {
            f10.a((long)n3 + this.u.x());
        }
        boolean bl2 = this.U.contains(f10);
        if (string != null && !bl2) {
            this.U.add(f10);
            bl2 = this.ad.add(f10);
        }
    }

    @Override
    public boolean a(n n2, net.minecraft.W.K k2) {
        F f10 = new F(n2, k2);
        return this.U.contains(f10);
    }

    @Override
    public void a(n n2, net.minecraft.W.K k2, int n3) {
        this.b(n2, k2, n3, 0);
    }

    private boolean a(x x2) {
        boolean bl2;
        block5: {
            block6: {
                x x3;
                block9: {
                    UUID uUID;
                    block11: {
                        boolean bl3;
                        block10: {
                            String string;
                            block7: {
                                block8: {
                                    string = z.I();
                                    x x4 = x2;
                                    if (string != null) {
                                        if (x4.P) {
                                            Z.warn("Tried to add entity {} but it was marked as removed already", (Object)net.minecraft.U.h.a(x2));
                                            return false;
                                        }
                                        x4 = x2;
                                    }
                                    uUID = x4.u();
                                    bl2 = this.ab.containsKey(uUID);
                                    if (string == null) break block5;
                                    if (!bl2) break block6;
                                    x3 = this.ab.get(uUID);
                                    bl3 = this.t.contains(x3);
                                    if (string == null) break block7;
                                    if (!bl3) break block8;
                                    this.t.remove(x3);
                                    if (string != null) break block9;
                                }
                                bl3 = x2 instanceof net.minecraft.i.j;
                            }
                            if (string == null) break block10;
                            if (bl3) break block11;
                            Z.warn("Keeping entity {} that already exists with UUID {}", (Object)net.minecraft.U.h.a(x3), (Object)uUID.toString());
                            bl3 = false;
                        }
                        return bl3;
                    }
                    Z.warn("Force-added player with duplicate UUID {}", (Object)uUID.toString());
                }
                this.a(x3);
            }
            bl2 = true;
        }
        return bl2;
    }

    protected void n() {
        block6: {
            A a10;
            block7: {
                this.X = false;
                Iterator iterator = this.k.stream().filter(net.minecraft.i.j::as).collect(Collectors.toList()).iterator();
                String string = z.I();
                while (iterator.hasNext()) {
                    net.minecraft.i.j j2 = (net.minecraft.i.j)iterator.next();
                    j2.a(false, false, true);
                    if (string != null) {
                        if (string != null) continue;
                    }
                    break block6;
                }
                a10 = this;
                if (string == null) break block7;
                if (!a10.M().c("doWeatherCycle")) break block6;
                a10 = this;
            }
            a10.j();
        }
    }

    @Override
    protected void h() {
        block26: {
            A a10;
            String string;
            block28: {
                block29: {
                    String string2 = z.I();
                    this.v();
                    string = string2;
                    a10 = this;
                    if (string == null) break block28;
                    if (a10.u.w() != net.minecraft.ah.L.e) break block29;
                    Iterator<a> iterator = this.V.b();
                    while (iterator.hasNext()) {
                        iterator.next().e(false);
                        if (string != null) {
                            if (string != null) continue;
                        }
                        break block26;
                    }
                    if (string != null) break block26;
                }
                a10 = this;
            }
            int n2 = a10.M().b("randomTickSpeed");
            int n3 = this.J();
            int n4 = this.u();
            this.H.b("pollingChunks");
            Iterator<a> iterator = this.V.b();
            while (iterator.hasNext()) {
                block27: {
                    this.H.b("getChunk");
                    Object object = iterator.next();
                    block2: while (true) {
                        Object object2;
                        int n5;
                        int n6;
                        int n7;
                        a a11;
                        block33: {
                            block34: {
                                Object object3;
                                block35: {
                                    block36: {
                                        n n8;
                                        int n9;
                                        block30: {
                                            block31: {
                                                int n10;
                                                block32: {
                                                    a11 = object;
                                                    n7 = a11.t * 16;
                                                    n6 = a11.i * 16;
                                                    this.H.a("checkNextLight");
                                                    a11.s();
                                                    this.H.a("tickChunk");
                                                    a11.e(false);
                                                    this.H.a("thunder");
                                                    if (string == null) break block26;
                                                    n5 = n3;
                                                    if (string == null) break block30;
                                                    if (n5 == 0) break block31;
                                                    n5 = n4;
                                                    if (string == null) break block30;
                                                    if (n5 == 0) break block31;
                                                    n5 = this.J.nextInt(100000);
                                                    if (string == null) break block30;
                                                    if (n5 != 0) break block31;
                                                    this.r = this.r * 3 + 1013904223;
                                                    n9 = this.r >> 2;
                                                    n8 = this.a(new n(n7 + (n9 & 0xF), 0, n6 + (n9 >> 8 & 0xF)));
                                                    n5 = this.t(n8) ? 1 : 0;
                                                    if (string == null) break block30;
                                                    if (n5 == 0) break block31;
                                                    object3 = this.h(n8);
                                                    n10 = this.M().c("doMobSpawning");
                                                    if (string == null) break block31;
                                                    if (n10 == 0) break block32;
                                                    double d10 = this.J.nextDouble() - (double)((h)object3).a() * 0.01;
                                                    n10 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                                    if (string == null) break block31;
                                                    if (n10 >= 0) break block32;
                                                    object2 = new J(this);
                                                    ((J)object2).a(true);
                                                    ((net.minecraft.U.E)object2).l(0);
                                                    ((x)object2).g(n8.e(), n8.b(), n8.a());
                                                    this.f((x)object2);
                                                    this.d(new net.minecraft.an.b(this, n8.e(), n8.b(), n8.a(), true));
                                                    if (string != null) break block31;
                                                }
                                                n10 = this.d(new net.minecraft.an.b(this, n8.e(), n8.b(), n8.a(), false)) ? 1 : 0;
                                            }
                                            this.H.a("iceandsnow");
                                            n5 = this.J.nextInt(16);
                                        }
                                        if (string == null) break block33;
                                        if (n5 != 0) break block34;
                                        this.r = this.r * 3 + 1013904223;
                                        n9 = this.r >> 2;
                                        n8 = this.d(new n(n7 + (n9 & 0xF), 0, n6 + (n9 >> 8 & 0xF)));
                                        object3 = n8.k();
                                        n5 = this.p((n)object3) ? 1 : 0;
                                        if (string != null) {
                                            if (n5 != 0) {
                                                this.a((n)object3, net.minecraft.u.g.cF.d());
                                            }
                                            n5 = n3;
                                        }
                                        if (string == null) break block35;
                                        if (n5 == 0) break block36;
                                        n5 = this.b(n8, true) ? 1 : 0;
                                        if (string == null) break block35;
                                        if (n5 != 0) {
                                            this.a(n8, net.minecraft.u.g.o.d());
                                        }
                                    }
                                    n5 = n3;
                                }
                                if (string == null) break block33;
                                if (n5 == 0) break block34;
                                n5 = this.c((n)object3).p() ? 1 : 0;
                                if (string == null) break block33;
                                if (n5 != 0) {
                                    this.d((n)object3).b().b(this, (n)object3);
                                }
                            }
                            this.H.a("tickBlocks");
                            if (string == null) break block27;
                            n5 = n2;
                        }
                        if (n5 <= 0) break;
                        f[] arrf = a11.n();
                        int n11 = arrf.length;
                        int n12 = 0;
                        block3: while (true) {
                            int n13 = n12;
                            block4: while (n13 < n11) {
                                block37: {
                                    int n14;
                                    block38: {
                                        object2 = arrf[n12];
                                        if (string == null) continue block3;
                                        object = object2;
                                        if (string == null) continue block2;
                                        if (object == a.u) break block37;
                                        int n15 = ((f)object2).h();
                                        if (string == null) break block38;
                                        if (n15 == 0) break block37;
                                        n15 = n14 = 0;
                                    }
                                    while (n14 < n2) {
                                        this.r = this.r * 3 + 1013904223;
                                        int n16 = this.r >> 2;
                                        int n17 = n16 & 0xF;
                                        int n18 = n16 >> 8 & 0xF;
                                        int n19 = n16 >> 16 & 0xF;
                                        i i2 = ((f)object2).c(n17, n19, n18);
                                        net.minecraft.W.K k2 = i2.b();
                                        this.H.b("randomTick");
                                        if (string != null) {
                                            n13 = k2.t() ? 1 : 0;
                                            if (string == null) continue block4;
                                            if (n13 != 0) {
                                                k2.b(this, new n(n17 + n7, n19 + ((f)object2).b(), n18 + n6), i2, this.J);
                                            }
                                            this.H.c();
                                            ++n14;
                                        }
                                        if (string != null) continue;
                                    }
                                }
                                ++n12;
                                if (string != null) continue block3;
                            }
                            break block2;
                            break;
                        }
                        break;
                    }
                    this.H.c();
                }
                if (string != null) continue;
            }
            this.H.c();
        }
    }

    public void a(boolean bl2, @Nullable net.minecraft.ar.u u2) throws w {
        block7: {
            String string;
            r r2;
            block9: {
                net.minecraft.ar.u u3;
                block8: {
                    r2 = this.a();
                    string = z.I();
                    if (!r2.a()) break block7;
                    u3 = u2;
                    if (string == null) break block8;
                    if (u3 != null) {
                        u2.b("Saving level");
                    }
                    this.c();
                    if (string == null) break block9;
                    u3 = u2;
                }
                if (u3 != null) {
                    u2.a("Saving chunks");
                }
                r2.a(bl2);
            }
            for (a a10 : Lists.newArrayList(r2.b())) {
                if (a10 != null && !this.V.b(a10.t, a10.i)) {
                    r2.c(a10);
                }
                if (string != null) continue;
            }
        }
    }

    @Override
    public void K() {
        A a10;
        block3: {
            block4: {
                A a11;
                block1: {
                    block2: {
                        String string = z.I();
                        a11 = this;
                        if (string == null) break block1;
                        if (!a11.k.isEmpty()) break block2;
                        a10 = this;
                        if (string == null) break block3;
                        if (a10.ae++ >= 300) {
                            return;
                        }
                        break block4;
                    }
                    a11 = this;
                }
                a11.u();
            }
            this.D.n();
            a10 = this;
        }
        super.K();
    }

    public void d() {
        this.q.e();
    }

    @Override
    public z x() {
        block13: {
            A a10;
            block11: {
                block12: {
                    g g10;
                    String string;
                    block10: {
                        net.minecraft.y.c c10;
                        block8: {
                            net.minecraft.y.c c11;
                            block9: {
                                this.E = new net.minecraft.aw.k(this.q);
                                String string2 = net.minecraft.y.c.a(this.D);
                                c11 = (net.minecraft.y.c)this.E.a(net.minecraft.y.c.class, string2);
                                string = z.I();
                                c10 = c11;
                                if (string == null) break block8;
                                if (c10 != null) break block9;
                                this.g = new net.minecraft.y.c(this);
                                this.E.a(string2, this.g);
                                if (string != null) break block10;
                                m.b(!m.c());
                            }
                            c10 = this.g = c11;
                        }
                        c10.a(this);
                    }
                    this.A = new c(this.W);
                    g g11 = g10 = (g)this.E.a(g.class, "scoreboard");
                    if (string != null) {
                        if (g11 == null) {
                            g10 = new g();
                            this.E.a("scoreboard", g10);
                        }
                        g11 = g10;
                    }
                    g11.a(this.A);
                    ((c)this.A).a(new y(g10));
                    this.M = new net.minecraft.aj.h(new File(new File(this.q.f(), "data"), "loot_tables"));
                    this.b = new a7(new File(new File(this.q.f(), "data"), "advancements"));
                    this.B = new aZ(new File(new File(this.q.f(), "data"), "functions"), this.W);
                    this.O().b(this.u.H(), this.u.s());
                    this.O().a(this.u.G());
                    this.O().b(this.u.i());
                    this.O().c(this.u.y());
                    this.O().a(this.u.u());
                    a10 = this;
                    if (string == null) break block11;
                    if (a10.u.K() <= 0L) break block12;
                    this.O().a(this.u.n(), this.u.l(), this.u.K());
                    if (string != null) break block13;
                }
                a10 = this;
            }
            a10.O().c(this.u.n());
        }
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean f(x x2) {
        String string = z.I();
        boolean bl2 = this.a(x2);
        if (string != null) {
            if (!bl2) return false;
            bl2 = super.f(x2);
        }
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    @Nullable
    public n a(String string, n n2, boolean bl2) {
        return this.a().a(this, string, n2, bl2);
    }

    @Override
    protected void b(x x2) {
        block4: {
            x[] arrx;
            String string;
            block3: {
                x[] arrx2;
                super.b(x2);
                String string2 = z.I();
                this.w.e(x2.W());
                string = string2;
                this.ab.remove(x2.u());
                arrx = arrx2 = x2.aE();
                if (string == null) break block3;
                if (arrx == null) break block4;
                arrx = arrx2;
            }
            for (x x3 : arrx) {
                this.w.e(x3.W());
                if (string != null) continue;
            }
        }
    }

    @Override
    public ListenableFuture<Object> a(Runnable runnable) {
        return this.W.a(runnable);
    }

    @Override
    public boolean d() {
        return this.W.d();
    }

    @Override
    protected void g(x x2) {
        block4: {
            x[] arrx;
            String string;
            block3: {
                x[] arrx2;
                super.g(x2);
                this.w.a(x2.W(), x2);
                String string2 = z.I();
                this.ab.put(x2.u(), x2);
                string = string2;
                arrx = arrx2 = x2.aE();
                if (string == null) break block3;
                if (arrx == null) break block4;
                arrx = arrx2;
            }
            for (x x3 : arrx) {
                this.w.a(x3.W(), x3);
                if (string != null) continue;
            }
        }
    }

    private void b() {
        String string = z.I();
        block0: while (true) {
            boolean bl2 = this.ag[this.R].isEmpty();
            block1: while (!bl2) {
                int n2 = this.R;
                this.R ^= 1;
                for (cN cN2 : this.ag[n2]) {
                    block6: {
                        A a10;
                        block5: {
                            a10 = this;
                            if (string == null) break block5;
                            bl2 = a10.a(cN2);
                            if (string == null) continue block1;
                            if (!bl2) break block6;
                            a10 = this;
                        }
                        a10.W.O().a(null, cN2.d().e(), cN2.d().b(), cN2.d().a(), 64.0, this.D.r().a(), new net.minecraft.Q.m(cN2.d(), cN2.b(), cN2.a(), cN2.c()));
                    }
                    if (string != null) continue;
                }
                this.ag[n2].clear();
                if (string != null) continue block0;
            }
            break;
        }
    }

    private boolean e() {
        return this.W.z();
    }

    @Nullable
    public n t() {
        return this.D.k();
    }

    public aZ w() {
        return this.B;
    }

    @Override
    public boolean c(n n2, net.minecraft.W.K k2) {
        F f10 = new F(n2, k2);
        return this.S.contains(f10);
    }

    private void b(K k2) {
        block8: {
            A a10;
            block14: {
                int n2;
                int n3;
                int n4;
                Random random;
                String string;
                block13: {
                    block12: {
                        n n5;
                        block11: {
                            A a11;
                            block9: {
                                block10: {
                                    block6: {
                                        block7: {
                                            string = z.I();
                                            a11 = this;
                                            if (string == null) break block6;
                                            if (a11.D.l()) break block7;
                                            this.u.a(n.o.c(this.D.c()));
                                            if (string != null) break block8;
                                        }
                                        a11 = this;
                                    }
                                    if (string == null) break block9;
                                    if (a11.u.w() != net.minecraft.ah.L.e) break block10;
                                    this.u.a(n.o.a());
                                    if (string != null) break block8;
                                }
                                this.s = true;
                                a11 = this;
                            }
                            net.minecraft.A.b b10 = a11.D.p();
                            List<net.minecraft.A.h> list = b10.b();
                            random = new Random(this.C());
                            n n6 = b10.a(0, 0, 256, list, random);
                            n4 = 8;
                            n3 = this.D.c();
                            n2 = 8;
                            n5 = n6;
                            if (string == null) break block11;
                            if (n5 == null) break block12;
                            n4 = n6.e();
                            n5 = n6;
                        }
                        n2 = n5.a();
                        if (string != null) break block13;
                    }
                    Z.warn("Unable to find spawn biome");
                }
                int n7 = 0;
                while (!this.D.a(n4, n2)) {
                    n4 += random.nextInt(64) - random.nextInt(64);
                    n2 += random.nextInt(64) - random.nextInt(64);
                    while (++n7 == 1000) {
                        if (string == null) continue;
                    }
                }
                this.u.a(new n(n4, n3, n2));
                a10 = this;
                if (string == null) break block14;
                a10.s = false;
                if (!k2.h()) break block8;
                a10 = this;
            }
            a10.q();
        }
    }
}

