/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.A;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.A.A;
import net.minecraft.A.B;
import net.minecraft.A.C;
import net.minecraft.A.F;
import net.minecraft.A.M;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.f;
import net.minecraft.A.g;
import net.minecraft.A.i;
import net.minecraft.A.j;
import net.minecraft.A.k;
import net.minecraft.A.l;
import net.minecraft.A.m;
import net.minecraft.A.n;
import net.minecraft.A.o;
import net.minecraft.A.p;
import net.minecraft.A.q;
import net.minecraft.A.r;
import net.minecraft.A.s;
import net.minecraft.A.t;
import net.minecraft.A.u;
import net.minecraft.A.v;
import net.minecraft.A.w;
import net.minecraft.A.x;
import net.minecraft.A.y;
import net.minecraft.A.z;
import net.minecraft.T.a4;
import net.minecraft.T.a5;
import net.minecraft.T.aR;
import net.minecraft.T.ag;
import net.minecraft.T.ah;
import net.minecraft.T.ai;
import net.minecraft.T.am;
import net.minecraft.T.ay;
import net.minecraft.W.b6;
import net.minecraft.W.dq;
import net.minecraft.ag.L;
import net.minecraft.ag.O;
import net.minecraft.ag.Y;
import net.minecraft.ag.au;
import net.minecraft.p.Q;
import net.minecraft.p.a;
import net.minecraft.p.c;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class h {
    protected /* synthetic */ List<d> D;
    protected static final /* synthetic */ net.minecraft.Z.i m;
    protected /* synthetic */ List<d> c;
    @Nullable
    private final /* synthetic */ String s;
    protected static final /* synthetic */ net.minecraft.p.v h;
    protected static final /* synthetic */ net.minecraft.Z.i f;
    private final /* synthetic */ int g;
    public /* synthetic */ M a;
    private final /* synthetic */ float E;
    protected static final /* synthetic */ net.minecraft.aA.e b;
    public static final /* synthetic */ net.minecraft.ar.m<h> t;
    private final /* synthetic */ boolean e;
    protected static final /* synthetic */ net.minecraft.Z.i p;
    protected static final /* synthetic */ net.minecraft.Z.i l;
    protected static final /* synthetic */ net.minecraft.p.m C;
    protected static final /* synthetic */ c r;
    public /* synthetic */ net.minecraft.Z.i z;
    protected static final /* synthetic */ net.minecraft.Z.i G;
    protected static final /* synthetic */ net.minecraft.aA.e k;
    protected static final /* synthetic */ net.minecraft.p.j A;
    protected static final /* synthetic */ net.minecraft.Z.i d;
    private final /* synthetic */ float q;
    private static final /* synthetic */ Logger n;
    protected /* synthetic */ List<d> i;
    private final /* synthetic */ float u;
    protected static final /* synthetic */ net.minecraft.Z.i v;
    public /* synthetic */ net.minecraft.Z.i B;
    private final /* synthetic */ String w;
    private final /* synthetic */ float F;
    protected /* synthetic */ List<d> j;
    public static final /* synthetic */ net.minecraft.b.d<net.minecraft.ar.v, h> x;
    protected static final /* synthetic */ net.minecraft.Z.i o;
    private final /* synthetic */ boolean y;

    @Nullable
    public static h a(int n2) {
        return x.a((net.minecraft.ar.v)n2);
    }

    public int a(float f10) {
        f10 /= 3.0f;
        f10 = net.minecraft.k.h.c(f10, -1.0f, 1.0f);
        return net.minecraft.k.h.b(0.62222224f - f10 * 0.05f, 0.5f + f10 * 0.1f, 1.0f);
    }

    public void b(net.minecraft.ah.z z2, Random random, net.minecraft.o.l l2, int n2, int n3, double d10) {
        this.a(z2, random, l2, n2, n3, d10);
    }

    public final float k() {
        return this.F;
    }

    public final int h() {
        return this.g;
    }

    public boolean l() {
        return false;
    }

    public Class<? extends h> i() {
        return this.getClass();
    }

    public boolean o() {
        boolean bl2 = net.minecraft.A.b.c();
        float f10 = this.q() - 0.85f;
        float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        if (bl2) {
            f11 = f11 > 0 ? 1.0f : 0.0f;
        }
        return (boolean)f11;
    }

    public boolean g() {
        return this.d();
    }

    public final float e() {
        return this.E;
    }

    @Nullable
    public static h a(h h2) {
        return t.a(net.minecraft.A.h.b(h2));
    }

    public final float c() {
        return this.u;
    }

    public float j() {
        return 0.1f;
    }

    public final float a(net.minecraft.k.n n2) {
        if (n2.b() > 64) {
            float f10 = (float)(b.a((float)n2.e() / 8.0f, (float)n2.a() / 8.0f) * 4.0);
            return this.c() - (f10 + (float)n2.b() - 64.0f) * 0.05f / 30.0f;
        }
        return this.c();
    }

    public final String n() {
        return this.w;
    }

    public int b(net.minecraft.k.n n2) {
        double d10 = net.minecraft.k.h.c(this.a(n2), 0.0f, 1.0f);
        double d11 = net.minecraft.k.h.c(this.q(), 0.0f, 1.0f);
        return net.minecraft.ah.m.a(d10, d11);
    }

    public final boolean d() {
        return this.e;
    }

    public void a(net.minecraft.ah.z z2, Random random, net.minecraft.k.n n2) {
        this.a.a(z2, random, this, n2);
    }

    public static int b(h h2) {
        return x.c(h2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public final float q() {
        return this.q;
    }

    public C b() {
        boolean bl2 = net.minecraft.A.b.f();
        double d10 = (double)this.c() - 0.2;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (!bl2) {
            if (d11 < 0) {
                return net.minecraft.A.C.COLD;
            }
            double d12 = (double)this.c() - 1.0;
            d11 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        }
        return d11 < 0 ? net.minecraft.A.C.MEDIUM : net.minecraft.A.C.WARM;
    }

    public net.minecraft.W.C a(Random random, net.minecraft.k.n n2) {
        return random.nextInt(3) > 0 ? net.minecraft.W.C.DANDELION : net.minecraft.W.C.POPPY;
    }

    public final void a(net.minecraft.ah.z z2, Random random, net.minecraft.o.l l2, int n2, int n3, double d10) {
        int n4 = z2.y();
        net.minecraft.Z.i i2 = this.B;
        boolean bl2 = net.minecraft.A.b.f();
        net.minecraft.Z.i i3 = this.z;
        int n5 = -1;
        int n6 = (int)(d10 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n7 = n2 & 0xF;
        int n8 = n3 & 0xF;
        net.minecraft.k.o o2 = new net.minecraft.k.o();
        int n9 = 255;
        while (n9 >= 0) {
            block31: {
                block13: {
                    int n10;
                    int n11;
                    block32: {
                        int n12;
                        block30: {
                            block16: {
                                block17: {
                                    block29: {
                                        int n13;
                                        int n14;
                                        block27: {
                                            block28: {
                                                block22: {
                                                    block23: {
                                                        block26: {
                                                            block25: {
                                                                net.minecraft.Z.i i4;
                                                                block24: {
                                                                    block21: {
                                                                        block20: {
                                                                            block18: {
                                                                                block19: {
                                                                                    net.minecraft.Z.i i5;
                                                                                    block14: {
                                                                                        net.minecraft.Z.i i6;
                                                                                        block15: {
                                                                                            block12: {
                                                                                                if (n9 > random.nextInt(5)) break block12;
                                                                                                l2.a(n8, n9, n7, d);
                                                                                                if (!bl2) break block13;
                                                                                            }
                                                                                            i5 = i6 = l2.b(n8, n9, n7);
                                                                                            if (bl2) break block14;
                                                                                            if (i5.o() != net.minecraft.ac.c.A) break block15;
                                                                                            n5 = -1;
                                                                                            if (!bl2) break block13;
                                                                                        }
                                                                                        i5 = i6;
                                                                                    }
                                                                                    if (i5.b() != net.minecraft.u.g.bx) break block13;
                                                                                    n12 = n5;
                                                                                    if (bl2) break block16;
                                                                                    if (n12 != -1) break block17;
                                                                                    n14 = n6;
                                                                                    if (bl2) break block18;
                                                                                    if (n14 > 0) break block19;
                                                                                    i2 = p;
                                                                                    i3 = v;
                                                                                    if (!bl2) break block20;
                                                                                }
                                                                                n14 = n9;
                                                                            }
                                                                            n13 = n4 - 4;
                                                                            if (bl2) break block21;
                                                                            if (n14 < n13) break block20;
                                                                            n14 = n9;
                                                                            n13 = n4 + 1;
                                                                            if (bl2) break block21;
                                                                            if (n14 <= n13) {
                                                                                i2 = this.B;
                                                                                i3 = this.z;
                                                                            }
                                                                        }
                                                                        n14 = n9;
                                                                        n13 = n4;
                                                                    }
                                                                    if (bl2) break block22;
                                                                    if (n14 >= n13) break block23;
                                                                    i4 = i2;
                                                                    if (bl2) break block24;
                                                                    if (i4 == null) break block25;
                                                                    i4 = i2;
                                                                }
                                                                if (i4.o() != net.minecraft.ac.c.A) break block23;
                                                            }
                                                            if (!(this.a(o2.a(n2, n9, n3)) < 0.15f)) break block26;
                                                            i2 = G;
                                                            if (!bl2) break block23;
                                                        }
                                                        i2 = o;
                                                    }
                                                    n5 = n6;
                                                    n14 = n9;
                                                    n13 = n4 - 1;
                                                }
                                                if (bl2) break block27;
                                                if (n14 < n13) break block28;
                                                l2.a(n8, n9, n7, i2);
                                                if (!bl2) break block13;
                                            }
                                            n14 = n9;
                                            n13 = n4 - 7 - n6;
                                        }
                                        if (n14 >= n13) break block29;
                                        i2 = p;
                                        i3 = v;
                                        l2.a(n8, n9, n7, l);
                                        if (!bl2) break block13;
                                    }
                                    l2.a(n8, n9, n7, i3);
                                    if (!bl2) break block13;
                                }
                                n12 = n5;
                            }
                            if (bl2) break block30;
                            if (n12 <= 0) break block13;
                            --n5;
                            l2.a(n8, n9, n7, i3);
                            if (bl2) break block31;
                            n12 = n5;
                        }
                        if (n12 != 0 || i3.b() != net.minecraft.u.g.aO) break block13;
                        n11 = n6;
                        n10 = 1;
                        if (bl2) break block32;
                        if (n11 <= n10) break block13;
                        n11 = random.nextInt(4);
                        n10 = Math.max(0, n9 - 63);
                    }
                    n5 = n11 + n10;
                    net.minecraft.Z.i i7 = i3;
                    if (!bl2) {
                        i7 = i7.b(b6.A) == dq.RED_SAND ? m : f;
                    }
                    i3 = i7;
                }
                --n9;
            }
            if (!bl2) continue;
        }
    }

    public net.minecraft.p.b b(Random random) {
        return random.nextInt(10) == 0 ? r : C;
    }

    public List<d> a(net.minecraft.U.k k2) {
        switch (k2) {
            case MONSTER: {
                return this.D;
            }
            case CREATURE: {
                return this.j;
            }
            case WATER_CREATURE: {
                return this.c;
            }
            case AMBIENT: {
                return this.i;
            }
        }
        return Collections.emptyList();
    }

    static {
        n = LogManager.getLogger();
        v = net.minecraft.u.g.bx.d();
        p = net.minecraft.u.g.bf.d();
        d = net.minecraft.u.g.g.d();
        l = net.minecraft.u.g.di.d();
        m = net.minecraft.u.g.aQ.d();
        f = net.minecraft.u.g.bC.d();
        G = net.minecraft.u.g.cF.d();
        o = net.minecraft.u.g.bQ.d();
        t = new net.minecraft.ar.m();
        b = new net.minecraft.aA.e(new Random(1234L), 1);
        k = new net.minecraft.aA.e(new Random(2345L), 1);
        h = new net.minecraft.p.v();
        C = new net.minecraft.p.m(false);
        r = new c(false);
        A = new net.minecraft.p.j();
        x = new net.minecraft.b.d();
    }

    private static void a(int n2, String string, h h2) {
        block0: {
            x.a(n2, new net.minecraft.ar.v(string), h2);
            if (!h2.m()) break block0;
            t.a(h2, net.minecraft.A.h.b(x.a(new net.minecraft.ar.v(h2.s))));
        }
    }

    protected M f() {
        return new M();
    }

    public int c(net.minecraft.k.n n2) {
        double d10 = net.minecraft.k.h.c(this.a(n2), 0.0f, 1.0f);
        double d11 = net.minecraft.k.h.c(this.q(), 0.0f, 1.0f);
        return net.minecraft.ah.q.a(d10, d11);
    }

    public static void a() {
        net.minecraft.A.h.a(0, "ocean", new s(new e("Ocean").c(-1.0f).b(0.1f)));
        net.minecraft.A.h.a(1, "plains", new t(false, new e("Plains").c(0.125f).b(0.05f).d(0.8f).a(0.4f)));
        net.minecraft.A.h.a(2, "desert", new j(new e("Desert").c(0.125f).b(0.05f).d(2.0f).a(0.0f).a()));
        net.minecraft.A.h.a(3, "extreme_hills", new o(net.minecraft.A.f.NORMAL, new e("Extreme Hills").c(1.0f).b(0.5f).d(0.2f).a(0.3f)));
        net.minecraft.A.h.a(4, "forest", new l(net.minecraft.A.F.NORMAL, new e("Forest").d(0.7f).a(0.8f)));
        net.minecraft.A.h.a(5, "taiga", new A(net.minecraft.A.g.NORMAL, new e("Taiga").c(0.2f).b(0.2f).d(0.25f).a(0.8f)));
        net.minecraft.A.h.a(6, "swampland", new z(new e("Swampland").c(-0.2f).b(0.1f).d(0.8f).a(0.9f).a(14745518)));
        net.minecraft.A.h.a(7, "river", new u(new e("River").c(-0.5f).b(0.0f)));
        net.minecraft.A.h.a(8, "hell", new n(new e("Hell").d(2.0f).a(0.0f).a()));
        net.minecraft.A.h.a(9, "sky", new k(new e("The End").a()));
        net.minecraft.A.h.a(10, "frozen_ocean", new s(new e("FrozenOcean").c(-1.0f).b(0.1f).d(0.0f).a(0.5f).b()));
        net.minecraft.A.h.a(11, "frozen_river", new u(new e("FrozenRiver").c(-0.5f).b(0.0f).d(0.0f).a(0.5f).b()));
        net.minecraft.A.h.a(12, "ice_flats", new x(false, new e("Ice Plains").c(0.125f).b(0.05f).d(0.0f).a(0.5f).b()));
        net.minecraft.A.h.a(13, "ice_mountains", new x(false, new e("Ice Mountains").c(0.45f).b(0.3f).d(0.0f).a(0.5f).b()));
        boolean bl2 = net.minecraft.A.b.f();
        net.minecraft.A.h.a(14, "mushroom_island", new r(new e("MushroomIsland").c(0.2f).b(0.3f).d(0.9f).a(1.0f)));
        net.minecraft.A.h.a(15, "mushroom_island_shore", new r(new e("MushroomIslandShore").c(0.0f).b(0.025f).d(0.9f).a(1.0f)));
        net.minecraft.A.h.a(16, "beaches", new i(new e("Beach").c(0.0f).b(0.025f).d(0.8f).a(0.4f)));
        net.minecraft.A.h.a(17, "desert_hills", new j(new e("DesertHills").c(0.45f).b(0.3f).d(2.0f).a(0.0f).a()));
        net.minecraft.A.h.a(18, "forest_hills", new l(net.minecraft.A.F.NORMAL, new e("ForestHills").c(0.45f).b(0.3f).d(0.7f).a(0.8f)));
        net.minecraft.A.h.a(19, "taiga_hills", new A(net.minecraft.A.g.NORMAL, new e("TaigaHills").d(0.25f).a(0.8f).c(0.45f).b(0.3f)));
        net.minecraft.A.h.a(20, "smaller_extreme_hills", new o(net.minecraft.A.f.EXTRA_TREES, new e("Extreme Hills Edge").c(0.8f).b(0.3f).d(0.2f).a(0.3f)));
        net.minecraft.A.h.a(21, "jungle", new p(false, new e("Jungle").d(0.95f).a(0.9f)));
        net.minecraft.A.h.a(22, "jungle_hills", new p(false, new e("JungleHills").c(0.45f).b(0.3f).d(0.95f).a(0.9f)));
        net.minecraft.A.h.a(23, "jungle_edge", new p(true, new e("JungleEdge").d(0.95f).a(0.8f)));
        net.minecraft.A.h.a(24, "deep_ocean", new s(new e("Deep Ocean").c(-1.8f).b(0.1f)));
        net.minecraft.A.h.a(25, "stone_beach", new y(new e("Stone Beach").c(0.1f).b(0.8f).d(0.2f).a(0.3f)));
        net.minecraft.A.h.a(26, "cold_beach", new i(new e("Cold Beach").c(0.0f).b(0.025f).d(0.05f).a(0.3f).b()));
        net.minecraft.A.h.a(27, "birch_forest", new l(net.minecraft.A.F.BIRCH, new e("Birch Forest").d(0.6f).a(0.6f)));
        net.minecraft.A.h.a(28, "birch_forest_hills", new l(net.minecraft.A.F.BIRCH, new e("Birch Forest Hills").c(0.45f).b(0.3f).d(0.6f).a(0.6f)));
        net.minecraft.A.h.a(29, "roofed_forest", new l(net.minecraft.A.F.ROOFED, new e("Roofed Forest").d(0.7f).a(0.8f)));
        net.minecraft.A.h.a(30, "taiga_cold", new A(net.minecraft.A.g.NORMAL, new e("Cold Taiga").c(0.2f).b(0.2f).d(-0.5f).a(0.4f).b()));
        net.minecraft.A.h.a(31, "taiga_cold_hills", new A(net.minecraft.A.g.NORMAL, new e("Cold Taiga Hills").c(0.45f).b(0.3f).d(-0.5f).a(0.4f).b()));
        net.minecraft.A.h.a(32, "redwood_taiga", new A(net.minecraft.A.g.MEGA, new e("Mega Taiga").d(0.3f).a(0.8f).c(0.2f).b(0.2f)));
        net.minecraft.A.h.a(33, "redwood_taiga_hills", new A(net.minecraft.A.g.MEGA, new e("Mega Taiga Hills").c(0.45f).b(0.3f).d(0.3f).a(0.8f)));
        net.minecraft.A.h.a(34, "extreme_hills_with_trees", new o(net.minecraft.A.f.EXTRA_TREES, new e("Extreme Hills+").c(1.0f).b(0.5f).d(0.2f).a(0.3f)));
        net.minecraft.A.h.a(35, "savanna", new v(new e("Savanna").c(0.125f).b(0.05f).d(1.2f).a(0.0f).a()));
        net.minecraft.A.h.a(36, "savanna_rock", new v(new e("Savanna Plateau").c(1.5f).b(0.025f).d(1.0f).a(0.0f).a()));
        net.minecraft.A.h.a(37, "mesa", new q(false, false, new e("Mesa").d(2.0f).a(0.0f).a()));
        net.minecraft.A.h.a(38, "mesa_rock", new q(false, true, new e("Mesa Plateau F").c(1.5f).b(0.025f).d(2.0f).a(0.0f).a()));
        net.minecraft.A.h.a(39, "mesa_clear_rock", new q(false, false, new e("Mesa Plateau").c(1.5f).b(0.025f).d(2.0f).a(0.0f).a()));
        boolean bl3 = bl2;
        net.minecraft.A.h.a(127, "void", new B(new e("The Void").a()));
        net.minecraft.A.h.a(129, "mutated_plains", new t(true, new e("Sunflower Plains").a("plains").c(0.125f).b(0.05f).d(0.8f).a(0.4f)));
        net.minecraft.A.h.a(130, "mutated_desert", new j(new e("Desert M").a("desert").c(0.225f).b(0.25f).d(2.0f).a(0.0f).a()));
        net.minecraft.A.h.a(131, "mutated_extreme_hills", new o(net.minecraft.A.f.MUTATED, new e("Extreme Hills M").a("extreme_hills").c(1.0f).b(0.5f).d(0.2f).a(0.3f)));
        net.minecraft.A.h.a(132, "mutated_forest", new l(net.minecraft.A.F.FLOWER, new e("Flower Forest").a("forest").b(0.4f).d(0.7f).a(0.8f)));
        net.minecraft.A.h.a(133, "mutated_taiga", new A(net.minecraft.A.g.NORMAL, new e("Taiga M").a("taiga").c(0.3f).b(0.4f).d(0.25f).a(0.8f)));
        net.minecraft.A.h.a(134, "mutated_swampland", new z(new e("Swampland M").a("swampland").c(-0.1f).b(0.3f).d(0.8f).a(0.9f).a(14745518)));
        net.minecraft.A.h.a(140, "mutated_ice_flats", new x(true, new e("Ice Plains Spikes").a("ice_flats").c(0.425f).b(0.45000002f).d(0.0f).a(0.5f).b()));
        net.minecraft.A.h.a(149, "mutated_jungle", new p(false, new e("Jungle M").a("jungle").c(0.2f).b(0.4f).d(0.95f).a(0.9f)));
        net.minecraft.A.h.a(151, "mutated_jungle_edge", new p(true, new e("JungleEdge M").a("jungle_edge").c(0.2f).b(0.4f).d(0.95f).a(0.8f)));
        net.minecraft.A.h.a(155, "mutated_birch_forest", new m(new e("Birch Forest M").a("birch_forest").c(0.2f).b(0.4f).d(0.6f).a(0.6f)));
        net.minecraft.A.h.a(156, "mutated_birch_forest_hills", new m(new e("Birch Forest Hills M").a("birch_forest_hills").c(0.55f).b(0.5f).d(0.6f).a(0.6f)));
        net.minecraft.A.h.a(157, "mutated_roofed_forest", new l(net.minecraft.A.F.ROOFED, new e("Roofed Forest M").a("roofed_forest").c(0.2f).b(0.4f).d(0.7f).a(0.8f)));
        net.minecraft.A.h.a(158, "mutated_taiga_cold", new A(net.minecraft.A.g.NORMAL, new e("Cold Taiga M").a("taiga_cold").c(0.3f).b(0.4f).d(-0.5f).a(0.4f).b()));
        net.minecraft.A.h.a(160, "mutated_redwood_taiga", new A(net.minecraft.A.g.MEGA_SPRUCE, new e("Mega Spruce Taiga").a("redwood_taiga").c(0.2f).b(0.2f).d(0.25f).a(0.8f)));
        net.minecraft.A.h.a(161, "mutated_redwood_taiga_hills", new A(net.minecraft.A.g.MEGA_SPRUCE, new e("Redwood Taiga Hills M").a("redwood_taiga_hills").c(0.2f).b(0.2f).d(0.25f).a(0.8f)));
        net.minecraft.A.h.a(162, "mutated_extreme_hills_with_trees", new o(net.minecraft.A.f.MUTATED, new e("Extreme Hills+ M").a("extreme_hills_with_trees").c(1.0f).b(0.5f).d(0.2f).a(0.3f)));
        net.minecraft.A.h.a(163, "mutated_savanna", new w(new e("Savanna M").a("savanna").c(0.3625f).b(1.225f).d(1.1f).a(0.0f).a()));
        net.minecraft.A.h.a(164, "mutated_savanna_rock", new w(new e("Savanna Plateau M").a("savanna_rock").c(1.05f).b(1.2125001f).d(1.0f).a(0.0f).a()));
        net.minecraft.A.h.a(165, "mutated_mesa", new q(true, false, new e("Mesa (Bryce)").a("mesa").d(2.0f).a(0.0f).a()));
        net.minecraft.A.h.a(166, "mutated_mesa_rock", new q(false, true, new e("Mesa Plateau F M").a("mesa_rock").c(0.45f).b(0.3f).d(2.0f).a(0.0f).a()));
        net.minecraft.A.h.a(167, "mutated_mesa_clear_rock", new q(false, false, new e("Mesa Plateau M").a("mesa_clear_rock").c(0.45f).b(0.3f).d(2.0f).a(0.0f).a()));
        if (bl3) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }

    public a a(Random random) {
        return new Q(net.minecraft.W.e.GRASS);
    }

    public boolean m() {
        return this.s != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean p() {
        boolean bl2 = net.minecraft.A.b.c();
        boolean bl3 = this.d();
        if (bl2) {
            if (bl3) return false;
            bl3 = this.y;
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Nullable
    public static h b(int n2) {
        return net.minecraft.A.h.a(n2, null);
    }

    protected h(e e10) {
        this.B = net.minecraft.u.g.aU.d();
        this.z = net.minecraft.u.g.bv.d();
        this.D = Lists.newArrayList();
        this.j = Lists.newArrayList();
        boolean bl2 = net.minecraft.A.b.f();
        this.c = Lists.newArrayList();
        this.i = Lists.newArrayList();
        this.w = net.minecraft.A.e.h(e10);
        this.E = net.minecraft.A.e.i(e10);
        this.F = net.minecraft.A.e.a(e10);
        this.u = net.minecraft.A.e.g(e10);
        this.q = net.minecraft.A.e.b(e10);
        this.g = net.minecraft.A.e.c(e10);
        this.e = net.minecraft.A.e.e(e10);
        this.y = net.minecraft.A.e.f(e10);
        this.s = net.minecraft.A.e.d(e10);
        this.a = this.f();
        this.j.add(new d(net.minecraft.ag.Q.class, 12, 4, 4));
        this.j.add(new d(O.class, 10, 4, 4));
        this.j.add(new d(L.class, 10, 4, 4));
        this.j.add(new d(net.minecraft.ag.M.class, 8, 4, 4));
        this.D.add(new d(am.class, 100, 4, 4));
        this.D.add(new d(a4.class, 95, 4, 4));
        this.D.add(new d(ag.class, 5, 1, 1));
        this.D.add(new d(ay.class, 100, 4, 4));
        this.D.add(new d(aR.class, 100, 4, 4));
        boolean bl3 = bl2;
        this.D.add(new d(ai.class, 100, 4, 4));
        this.D.add(new d(ah.class, 10, 1, 4));
        this.D.add(new d(a5.class, 5, 1, 1));
        this.c.add(new d(au.class, 10, 4, 4));
        this.i.add(new d(Y.class, 10, 8, 8));
        if (!net.minecraft.k.m.d()) {
            net.minecraft.A.b.b(!bl3);
        }
    }

    public static h a(int n2, h h2) {
        h h3 = net.minecraft.A.h.a(n2);
        boolean bl2 = net.minecraft.A.b.f();
        h h4 = h3;
        if (!bl2) {
            h4 = h4 == null ? h2 : h3;
        }
        return h4;
    }
}

