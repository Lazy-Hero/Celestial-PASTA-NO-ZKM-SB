/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.a;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.W.K;
import net.minecraft.W.aB;
import net.minecraft.W.aF;
import net.minecraft.W.aH;
import net.minecraft.W.aT;
import net.minecraft.W.aX;
import net.minecraft.W.aZ;
import net.minecraft.W.ag;
import net.minecraft.W.al;
import net.minecraft.W.b2;
import net.minecraft.W.b6;
import net.minecraft.W.b8;
import net.minecraft.W.bC;
import net.minecraft.W.bG;
import net.minecraft.W.bI;
import net.minecraft.W.bL;
import net.minecraft.W.bM;
import net.minecraft.W.bQ;
import net.minecraft.W.bR;
import net.minecraft.W.bW;
import net.minecraft.W.bZ;
import net.minecraft.W.bc;
import net.minecraft.W.bi;
import net.minecraft.W.bx;
import net.minecraft.W.c2;
import net.minecraft.W.c9;
import net.minecraft.W.cT;
import net.minecraft.W.ch;
import net.minecraft.W.cl;
import net.minecraft.W.co;
import net.minecraft.W.ct;
import net.minecraft.Z.i;
import net.minecraft.client.a.I;
import net.minecraft.client.a.a3;
import net.minecraft.client.a.a4;
import net.minecraft.client.a.a5;
import net.minecraft.client.a.aO;
import net.minecraft.client.a.aS;
import net.minecraft.client.a.ab;
import net.minecraft.client.a.am;
import net.minecraft.client.d.a;
import net.minecraft.client.d.b;
import net.minecraft.client.d.g;
import net.minecraft.client.j.c;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.n;
import net.minecraft.client.x.x;

public class X {
    private final /* synthetic */ b b;
    private final /* synthetic */ x a;
    private final /* synthetic */ Map<i, Y> c;

    public void c() {
        String string = I.j();
        this.c.clear();
        String string2 = string;
        for (Map.Entry<i, n> entry : this.b.a().entrySet()) {
            this.c.put(entry.getKey(), this.a.a(entry.getValue()));
            if (string2 == null) continue;
        }
    }

    public void a(K k2, g g10) {
        this.b.a(k2, g10);
    }

    private void a() {
        this.a(net.minecraft.u.g.bf, net.minecraft.u.g.cL, net.minecraft.u.g.bQ, net.minecraft.u.g.ag, net.minecraft.u.g.bq, net.minecraft.u.g.cS, net.minecraft.u.g.cd, net.minecraft.u.g.ba, net.minecraft.u.g.c4, net.minecraft.u.g.aR, net.minecraft.u.g.bY, net.minecraft.u.g.df, net.minecraft.u.g.ah, net.minecraft.u.g.b0, net.minecraft.u.g.aG, net.minecraft.u.g.a4, net.minecraft.u.g.m, net.minecraft.u.g.Y, net.minecraft.u.g.b1, net.minecraft.u.g.bk, net.minecraft.u.g.X, net.minecraft.u.g.L, net.minecraft.u.g.aE, net.minecraft.u.g.bo, net.minecraft.u.g.bh, net.minecraft.u.g.J, net.minecraft.u.g.ap, net.minecraft.u.g.bg, net.minecraft.u.g.b5, net.minecraft.u.g.N, net.minecraft.u.g.by, net.minecraft.u.g.cx, net.minecraft.u.g.bw, net.minecraft.u.g.a3, net.minecraft.u.g.R);
        this.a(net.minecraft.u.g.bx, new a().a((net.minecraft.ae.a<?>)ct.z).a());
        this.a(net.minecraft.u.g.cz, new a().a((net.minecraft.ae.a<?>)bi.A).a());
        this.a((K)net.minecraft.u.g.bU, new a().a((net.minecraft.ae.a<?>)bR.D).a("_leaves").a(b2.A, b2.C).a());
        this.a((K)net.minecraft.u.g.S, new a().a((net.minecraft.ae.a<?>)bW.D).a("_leaves").a(b2.A, b2.C).a());
        this.a((K)net.minecraft.u.g.aA, new a().a(new net.minecraft.ae.a[]{aF.B}).a());
        this.a((K)net.minecraft.u.g.aZ, new a().a(new net.minecraft.ae.a[]{bI.z}).a());
        this.a(net.minecraft.u.g.ct, new a().a(new net.minecraft.ae.a[]{aZ.z}).a());
        this.a(net.minecraft.u.g.bl, new a().a((net.minecraft.ae.a<?>)ch.E).a("_wall").a());
        this.a((K)net.minecraft.u.g.bW, new a().a((net.minecraft.ae.a<?>)al.B).a(new net.minecraft.ae.a[]{al.C}).a());
        this.a(net.minecraft.u.g.dp, new a().a(new net.minecraft.ae.a[]{bG.I}).a());
        this.a(net.minecraft.u.g.aq, new a().a(new net.minecraft.ae.a[]{bG.I}).a());
        this.a(net.minecraft.u.g.O, new a().a(new net.minecraft.ae.a[]{bG.I}).a());
        this.a(net.minecraft.u.g.cJ, new a().a(new net.minecraft.ae.a[]{bG.I}).a());
        this.a(net.minecraft.u.g.cC, new a().a(new net.minecraft.ae.a[]{bG.I}).a());
        this.a(net.minecraft.u.g.bI, new a().a(new net.minecraft.ae.a[]{bG.I}).a());
        this.a(net.minecraft.u.g.cM, new a().a(c2.B, c2.E).a());
        this.a((K)net.minecraft.u.g.f, new a().a((net.minecraft.ae.a<?>)bZ.z).a("_double_slab").a());
        this.a((K)net.minecraft.u.g.e, new a().a((net.minecraft.ae.a<?>)bZ.z).a("_slab").a());
        this.a(net.minecraft.u.g.cR, new a().a(new net.minecraft.ae.a[]{cT.z}).a());
        this.a((K)net.minecraft.u.g.C, new a().a(new net.minecraft.ae.a[]{bC.G}).a());
        this.a((K)net.minecraft.u.g.bK, new a().a(new net.minecraft.ae.a[]{bQ.z}).a());
        this.a((K)net.minecraft.u.g.aJ, new a().a(new net.minecraft.ae.a[]{aB.B}).a());
        this.a((K)net.minecraft.u.g.bT, new a().a(new net.minecraft.ae.a[]{aB.B}).a());
        this.a((K)net.minecraft.u.g.cV, new a().a(new net.minecraft.ae.a[]{aB.B}).a());
        this.a((K)net.minecraft.u.g.c, new a().a(new net.minecraft.ae.a[]{aB.B}).a());
        this.a((K)net.minecraft.u.g.cl, new a().a(new net.minecraft.ae.a[]{aB.B}).a());
        this.a((K)net.minecraft.u.g.p, new a().a(new net.minecraft.ae.a[]{aB.B}).a());
        this.a((K)net.minecraft.u.g.bL, new a().a(new net.minecraft.ae.a[]{aB.B}).a());
        this.a(net.minecraft.u.g.s, new a().a((net.minecraft.ae.a<?>)aT.z).a("_wool").a());
        this.a(net.minecraft.u.g.D, new a().a((net.minecraft.ae.a<?>)aT.z).a("_carpet").a());
        this.a(net.minecraft.u.g.ck, new a().a((net.minecraft.ae.a<?>)aT.z).a("_stained_hardened_clay").a());
        this.a((K)net.minecraft.u.g.cv, new a().a((net.minecraft.ae.a<?>)aT.z).a("_stained_glass_pane").a());
        this.a((K)net.minecraft.u.g.a5, new a().a((net.minecraft.ae.a<?>)aT.z).a("_stained_glass").a());
        this.a(net.minecraft.u.g.bC, new a().a((net.minecraft.ae.a<?>)bx.z).a());
        this.a(net.minecraft.u.g.aQ, new a().a((net.minecraft.ae.a<?>)bM.z).a());
        this.a((K)net.minecraft.u.g.dc, new a().a((net.minecraft.ae.a<?>)aX.B).a());
        this.a((K)net.minecraft.u.g.cZ, new a().a((net.minecraft.ae.a<?>)net.minecraft.u.g.cZ.a()).a());
        this.a((K)net.minecraft.u.g.cj, new a().a((net.minecraft.ae.a<?>)net.minecraft.u.g.cj.a()).a());
        this.a((K)net.minecraft.u.g.bO, new a().a((net.minecraft.ae.a<?>)cl.C).a("_slab").a());
        this.a((K)net.minecraft.u.g.U, new a().a((net.minecraft.ae.a<?>)c9.C).a("_slab").a());
        this.a(net.minecraft.u.g.be, new a().a((net.minecraft.ae.a<?>)b8.z).a("_monster_egg").a());
        this.a(net.minecraft.u.g.ay, new a().a((net.minecraft.ae.a<?>)co.D).a());
        this.a(net.minecraft.u.g.n, new a().a(new net.minecraft.ae.a[]{net.minecraft.W.a3.z}).a());
        this.a(net.minecraft.u.g.cw, new a().a(new net.minecraft.ae.a[]{net.minecraft.W.am.z}).a());
        this.a(net.minecraft.u.g.bu, new a().a((net.minecraft.ae.a<?>)bc.B).a("_log").a());
        this.a(net.minecraft.u.g.aB, new a().a((net.minecraft.ae.a<?>)bL.B).a("_log").a());
        this.a(net.minecraft.u.g.cB, new a().a((net.minecraft.ae.a<?>)bZ.z).a("_planks").a());
        this.a(net.minecraft.u.g.dj, new a().a((net.minecraft.ae.a<?>)aH.C).a("_sapling").a());
        this.a((K)net.minecraft.u.g.aO, new a().a((net.minecraft.ae.a<?>)b6.A).a());
        this.a((K)net.minecraft.u.g.ac, new a().a(new net.minecraft.ae.a[]{ag.A}).a());
        this.a(net.minecraft.u.g.cA, new a().a(new net.minecraft.ae.a[]{net.minecraft.W.aO.z}).a());
        this.a(net.minecraft.u.g.cK, new a().a((net.minecraft.ae.a<?>)aT.z).a("_concrete").a());
        this.a(net.minecraft.u.g.aw, new a().a((net.minecraft.ae.a<?>)aT.z).a("_concrete_powder").a());
        this.a(net.minecraft.u.g.k, new a3(this));
        this.a((K)net.minecraft.u.g.b9, new am(this));
        this.a(net.minecraft.u.g.Q, new ab(this));
        this.a(net.minecraft.u.g.aM, new aS(this));
        this.a(net.minecraft.u.g.bv, new a5(this));
        this.a((K)net.minecraft.u.g.H, new a4(this));
        this.a((K)net.minecraft.u.g.at, new aO(this));
    }

    public X(x x2) {
        this.c = Maps.newIdentityHashMap();
        this.b = new b();
        this.a = x2;
        this.a();
    }

    public b d() {
        return this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public Y b(i i2) {
        Y y2 = this.c.get(i2);
        String string = I.j();
        Y y3 = y2;
        if (string == null) {
            if (y3 == null) {
                y2 = this.a.c();
            }
            y3 = y2;
        }
        return y3;
    }

    public x b() {
        return this.a;
    }

    public c a(i i2) {
        Y y2;
        Y y3;
        String string;
        block54: {
            block55: {
                K k2;
                K k3;
                block72: {
                    block73: {
                        block71: {
                            block70: {
                                block68: {
                                    block69: {
                                        block67: {
                                            block66: {
                                                block65: {
                                                    K k4;
                                                    block63: {
                                                        block64: {
                                                            block57: {
                                                                block62: {
                                                                    block61: {
                                                                        block60: {
                                                                            block59: {
                                                                                block58: {
                                                                                    K k5;
                                                                                    block56: {
                                                                                        block53: {
                                                                                            block52: {
                                                                                                k3 = i2.b();
                                                                                                string = I.j();
                                                                                                y2 = y3 = this.b(i2);
                                                                                                if (string != null) break block52;
                                                                                                if (y2 == null) break block53;
                                                                                                y2 = y3;
                                                                                            }
                                                                                            if (string != null) break block54;
                                                                                            if (y2 != this.a.c()) break block55;
                                                                                        }
                                                                                        k2 = k3;
                                                                                        k5 = net.minecraft.u.g.b0;
                                                                                        if (string != null) break block56;
                                                                                        if (k2 == k5) break block57;
                                                                                        k2 = k3;
                                                                                        if (string != null) break block58;
                                                                                        k5 = net.minecraft.u.g.aR;
                                                                                    }
                                                                                    if (k2 == k5) break block57;
                                                                                    k2 = k3;
                                                                                }
                                                                                k4 = net.minecraft.u.g.cd;
                                                                                if (string != null) break block59;
                                                                                if (k2 == k4) break block57;
                                                                                k2 = k3;
                                                                                k4 = net.minecraft.u.g.c4;
                                                                            }
                                                                            if (string != null) break block60;
                                                                            if (k2 == k4) break block57;
                                                                            k2 = k3;
                                                                            k4 = net.minecraft.u.g.a4;
                                                                        }
                                                                        if (string != null) break block61;
                                                                        if (k2 == k4) break block57;
                                                                        k2 = k3;
                                                                        k4 = net.minecraft.u.g.aG;
                                                                    }
                                                                    if (string != null) break block62;
                                                                    if (k2 == k4) break block57;
                                                                    k2 = k3;
                                                                    k4 = net.minecraft.u.g.R;
                                                                }
                                                                if (string != null) break block63;
                                                                if (k2 != k4) break block64;
                                                            }
                                                            return this.a.a().b("minecraft:blocks/planks_oak");
                                                        }
                                                        k2 = k3;
                                                        if (string != null) break block65;
                                                        k4 = net.minecraft.u.g.ba;
                                                    }
                                                    if (k2 == k4) {
                                                        return this.a.a().b("minecraft:blocks/obsidian");
                                                    }
                                                    k2 = k3;
                                                }
                                                if (string != null) break block66;
                                                if (k2 == net.minecraft.u.g.ag) break block67;
                                                k2 = k3;
                                            }
                                            if (string != null) break block68;
                                            if (k2 != net.minecraft.u.g.bq) break block69;
                                        }
                                        return this.a.a().b("minecraft:blocks/lava_still");
                                    }
                                    k2 = k3;
                                }
                                if (string != null) break block70;
                                if (k2 == net.minecraft.u.g.cL) break block71;
                                k2 = k3;
                            }
                            if (string != null) break block72;
                            if (k2 != net.minecraft.u.g.bQ) break block73;
                        }
                        return this.a.a().b("minecraft:blocks/water_still");
                    }
                    k2 = k3;
                }
                K k6 = net.minecraft.u.g.bY;
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/soul_sand");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.ah;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:items/barrier");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.Y;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:items/structure_void");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.b1;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_white");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.bk;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_orange");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.X;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_magenta");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.L;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_light_blue");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.aE;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_yellow");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.bo;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_lime");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.bh;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_pink");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.J;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_gray");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.ap;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_silver");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.bg;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_cyan");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.b5;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_purple");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.N;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_blue");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.by;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_brown");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.cx;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_green");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.bw;
                }
                if (string == null) {
                    if (k2 == k6) {
                        return this.a.a().b("minecraft:blocks/shulker_top_red");
                    }
                    k2 = k3;
                    k6 = net.minecraft.u.g.a3;
                }
                if (k2 == k6) {
                    return this.a.a().b("minecraft:blocks/shulker_top_black");
                }
            }
            y2 = y3;
        }
        if (string == null) {
            if (y2 == null) {
                y3 = this.a.c();
            }
            y2 = y3;
        }
        return y2.f();
    }

    public void a(K ... arrk) {
        this.b.a(arrk);
    }
}

