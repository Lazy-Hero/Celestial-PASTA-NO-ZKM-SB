/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.l;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.U.q;
import net.minecraft.W.K;
import net.minecraft.ar.v;
import net.minecraft.az.t;
import net.minecraft.l.d;
import net.minecraft.l.e;
import net.minecraft.l.f;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.k;
import net.minecraft.w.s;

public class m {
    public static final /* synthetic */ d F;
    public static final /* synthetic */ d l;
    private static final /* synthetic */ d[] g;
    public static final /* synthetic */ d H;
    public static final /* synthetic */ List<d> ai;
    public static final /* synthetic */ d a;
    public static final /* synthetic */ d E;
    private static final /* synthetic */ d[] k;
    private static final /* synthetic */ d[] c;
    public static final /* synthetic */ d w;
    public static final /* synthetic */ d q;
    public static final /* synthetic */ d e;
    protected static final /* synthetic */ Map<String, d> Y;
    public static final /* synthetic */ d Q;
    private static final /* synthetic */ d[] y;
    public static final /* synthetic */ d P;
    public static final /* synthetic */ d t;
    public static final /* synthetic */ d b;
    public static final /* synthetic */ d R;
    public static final /* synthetic */ List<d> X;
    public static final /* synthetic */ d z;
    public static final /* synthetic */ d r;
    private static final /* synthetic */ d[] af;
    public static final /* synthetic */ d Z;
    public static final /* synthetic */ d o;
    public static final /* synthetic */ d U;
    public static final /* synthetic */ d G;
    public static final /* synthetic */ d ab;
    public static final /* synthetic */ d j;
    public static final /* synthetic */ d I;
    public static final /* synthetic */ List<f> T;
    public static final /* synthetic */ d A;
    private static final /* synthetic */ d[] m;
    public static final /* synthetic */ d N;
    public static final /* synthetic */ d v;
    public static final /* synthetic */ d J;
    public static final /* synthetic */ d i;
    public static final /* synthetic */ d S;
    public static final /* synthetic */ d u;
    public static final /* synthetic */ d s;
    public static final /* synthetic */ d ae;
    public static final /* synthetic */ d p;
    public static final /* synthetic */ d ah;
    public static final /* synthetic */ d h;
    public static final /* synthetic */ d V;
    public static final /* synthetic */ d M;
    public static final /* synthetic */ d L;
    public static final /* synthetic */ d ag;
    public static final /* synthetic */ d d;
    public static final /* synthetic */ List<f> x;
    public static final /* synthetic */ d f;
    public static final /* synthetic */ d K;
    public static final /* synthetic */ d ad;
    public static final /* synthetic */ d D;
    public static final /* synthetic */ d C;
    public static final /* synthetic */ d B;
    public static final /* synthetic */ d ac;
    public static final /* synthetic */ d O;
    public static final /* synthetic */ d aa;
    public static final /* synthetic */ d n;
    public static final /* synthetic */ d W;

    private static void a(d[] arrd, K k2, K k3) {
        block4: {
            int n2;
            block2: {
                int n3;
                d[] arrd2;
                int n4;
                block3: {
                    n4 = net.minecraft.W.K.b(k2);
                    n2 = net.minecraft.W.K.b(k3);
                    int n5 = net.minecraft.l.d.h();
                    arrd2 = arrd;
                    n3 = n4;
                    if (n5 != 0) break block2;
                    if (arrd2[n3] == null) break block3;
                    arrd2 = arrd;
                    n3 = n2;
                    if (n5 != 0) break block2;
                    if (arrd2[n3] != null) break block3;
                    arrd[n2] = arrd[n4];
                    if (n5 == 0) break block4;
                }
                ai.remove(arrd[n4]);
                x.remove(arrd[n4]);
                X.remove(arrd[n4]);
                arrd2 = arrd;
                n3 = n4;
            }
            arrd2[n3] = arrd[n2];
        }
    }

    @Nullable
    public static d a(k k2) {
        return af[net.minecraft.w.k.a(k2)];
    }

    @Nullable
    public static d a(K k2) {
        return y[net.minecraft.W.K.b(k2)];
    }

    private static void a(d[] arrd) {
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.bQ, net.minecraft.u.g.cL);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.bq, net.minecraft.u.g.ag);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.y, net.minecraft.u.g.G);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.bn, net.minecraft.u.g.bJ);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.cy, net.minecraft.u.g.cu);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.ar, net.minecraft.u.g.bB);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.aV, net.minecraft.u.g.cP);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.c5, net.minecraft.u.g.ai);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.bp, net.minecraft.u.g.as);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.H, net.minecraft.u.g.bO);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.f, net.minecraft.u.g.e);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.at, net.minecraft.u.g.U);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.aU, net.minecraft.u.g.bv);
        net.minecraft.l.m.a(arrd, net.minecraft.u.g.cU, net.minecraft.u.g.bv);
    }

    public static void c() {
        net.minecraft.l.m.e();
        net.minecraft.l.m.f();
        net.minecraft.l.m.a();
        net.minecraft.l.m.b();
        net.minecraft.l.m.d();
    }

    public static d a(q q2) {
        String string = net.minecraft.U.h.a(q2.e);
        return string == null ? null : new d("stat.entityKilledBy." + string, new net.minecraft.at.h("stat.entityKilledBy", new net.minecraft.at.h("entity." + string + ".name", new Object[0]))).g();
    }

    private static void f() {
        block5: {
            Iterator<k> iterator = net.minecraft.w.k.q.iterator();
            int n2 = net.minecraft.l.d.e();
            while (iterator.hasNext()) {
                block7: {
                    int n3;
                    k k2;
                    block8: {
                        k k3;
                        block6: {
                            k2 = iterator.next();
                            if (n2 == 0) break block5;
                            k3 = k2;
                            if (n2 == 0) break block6;
                            if (k3 == null) break block7;
                            k3 = k2;
                        }
                        n3 = net.minecraft.w.k.a(k3);
                        String string = net.minecraft.l.m.d(k2);
                        if (n2 == 0) break block8;
                        if (string == null) break block7;
                        net.minecraft.l.m.g[n3] = new f("stat.useItem.", string, new net.minecraft.at.h("stat.useItem", new net.minecraft.w.d(k2).F()), k2).g();
                    }
                    boolean bl2 = k2 instanceof s;
                    if (n2 != 0 && !bl2) {
                        bl2 = T.add((f)g[n3]);
                    }
                }
                if (n2 != 0) continue;
            }
            net.minecraft.l.m.a(g);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static void a() {
        block5: {
            Iterator<k> iterator = net.minecraft.w.k.q.iterator();
            int n2 = net.minecraft.l.d.e();
            while (iterator.hasNext()) {
                block7: {
                    k k2;
                    k k3;
                    block6: {
                        k3 = iterator.next();
                        if (n2 == 0) break block5;
                        k2 = k3;
                        if (n2 == 0) break block6;
                        if (k2 == null) break block7;
                        k2 = k3;
                    }
                    int n3 = net.minecraft.w.k.a(k2);
                    String string = net.minecraft.l.m.d(k3);
                    if (string != null && k3.i()) {
                        net.minecraft.l.m.af[n3] = new f("stat.breakItem.", string, new net.minecraft.at.h("stat.breakItem", new net.minecraft.w.d(k3).F()), k3).g();
                    }
                }
                if (n2 != 0) continue;
            }
            net.minecraft.l.m.a(af);
        }
    }

    static {
        Y = Maps.newHashMap();
        ai = Lists.newArrayList();
        X = Lists.newArrayList();
        T = Lists.newArrayList();
        x = Lists.newArrayList();
        M = new e("stat.leaveGame", new net.minecraft.at.h("stat.leaveGame", new Object[0])).c().g();
        P = new e("stat.playOneMinute", new net.minecraft.at.h("stat.playOneMinute", new Object[0]), net.minecraft.l.d.g).c().g();
        V = new e("stat.timeSinceDeath", new net.minecraft.at.h("stat.timeSinceDeath", new Object[0]), net.minecraft.l.d.g).c().g();
        I = new e("stat.sneakTime", new net.minecraft.at.h("stat.sneakTime", new Object[0]), net.minecraft.l.d.g).c().g();
        ae = new e("stat.walkOneCm", new net.minecraft.at.h("stat.walkOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        b = new e("stat.crouchOneCm", new net.minecraft.at.h("stat.crouchOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        w = new e("stat.sprintOneCm", new net.minecraft.at.h("stat.sprintOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        v = new e("stat.swimOneCm", new net.minecraft.at.h("stat.swimOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        q = new e("stat.fallOneCm", new net.minecraft.at.h("stat.fallOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        ah = new e("stat.climbOneCm", new net.minecraft.at.h("stat.climbOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        G = new e("stat.flyOneCm", new net.minecraft.at.h("stat.flyOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        Q = new e("stat.diveOneCm", new net.minecraft.at.h("stat.diveOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        U = new e("stat.minecartOneCm", new net.minecraft.at.h("stat.minecartOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        o = new e("stat.boatOneCm", new net.minecraft.at.h("stat.boatOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        Z = new e("stat.pigOneCm", new net.minecraft.at.h("stat.pigOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        ad = new e("stat.horseOneCm", new net.minecraft.at.h("stat.horseOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        l = new e("stat.aviateOneCm", new net.minecraft.at.h("stat.aviateOneCm", new Object[0]), net.minecraft.l.d.f).c().g();
        S = new e("stat.jump", new net.minecraft.at.h("stat.jump", new Object[0])).c().g();
        s = new e("stat.drop", new net.minecraft.at.h("stat.drop", new Object[0])).c().g();
        h = new e("stat.damageDealt", new net.minecraft.at.h("stat.damageDealt", new Object[0]), net.minecraft.l.d.b).g();
        C = new e("stat.damageTaken", new net.minecraft.at.h("stat.damageTaken", new Object[0]), net.minecraft.l.d.b).g();
        L = new e("stat.deaths", new net.minecraft.at.h("stat.deaths", new Object[0])).g();
        D = new e("stat.mobKills", new net.minecraft.at.h("stat.mobKills", new Object[0])).g();
        O = new e("stat.animalsBred", new net.minecraft.at.h("stat.animalsBred", new Object[0])).g();
        H = new e("stat.playerKills", new net.minecraft.at.h("stat.playerKills", new Object[0])).g();
        n = new e("stat.fishCaught", new net.minecraft.at.h("stat.fishCaught", new Object[0])).g();
        u = new e("stat.talkedToVillager", new net.minecraft.at.h("stat.talkedToVillager", new Object[0])).g();
        z = new e("stat.tradedWithVillager", new net.minecraft.at.h("stat.tradedWithVillager", new Object[0])).g();
        t = new e("stat.cakeSlicesEaten", new net.minecraft.at.h("stat.cakeSlicesEaten", new Object[0])).g();
        F = new e("stat.cauldronFilled", new net.minecraft.at.h("stat.cauldronFilled", new Object[0])).g();
        ac = new e("stat.cauldronUsed", new net.minecraft.at.h("stat.cauldronUsed", new Object[0])).g();
        R = new e("stat.armorCleaned", new net.minecraft.at.h("stat.armorCleaned", new Object[0])).g();
        ab = new e("stat.bannerCleaned", new net.minecraft.at.h("stat.bannerCleaned", new Object[0])).g();
        p = new e("stat.brewingstandInteraction", new net.minecraft.at.h("stat.brewingstandInteraction", new Object[0])).g();
        K = new e("stat.beaconInteraction", new net.minecraft.at.h("stat.beaconInteraction", new Object[0])).g();
        J = new e("stat.dropperInspected", new net.minecraft.at.h("stat.dropperInspected", new Object[0])).g();
        d = new e("stat.hopperInspected", new net.minecraft.at.h("stat.hopperInspected", new Object[0])).g();
        j = new e("stat.dispenserInspected", new net.minecraft.at.h("stat.dispenserInspected", new Object[0])).g();
        ag = new e("stat.noteblockPlayed", new net.minecraft.at.h("stat.noteblockPlayed", new Object[0])).g();
        B = new e("stat.noteblockTuned", new net.minecraft.at.h("stat.noteblockTuned", new Object[0])).g();
        N = new e("stat.flowerPotted", new net.minecraft.at.h("stat.flowerPotted", new Object[0])).g();
        E = new e("stat.trappedChestTriggered", new net.minecraft.at.h("stat.trappedChestTriggered", new Object[0])).g();
        i = new e("stat.enderchestOpened", new net.minecraft.at.h("stat.enderchestOpened", new Object[0])).g();
        a = new e("stat.itemEnchanted", new net.minecraft.at.h("stat.itemEnchanted", new Object[0])).g();
        A = new e("stat.recordPlayed", new net.minecraft.at.h("stat.recordPlayed", new Object[0])).g();
        f = new e("stat.furnaceInteraction", new net.minecraft.at.h("stat.furnaceInteraction", new Object[0])).g();
        aa = new e("stat.craftingTableInteraction", new net.minecraft.at.h("stat.workbenchInteraction", new Object[0])).g();
        W = new e("stat.chestOpened", new net.minecraft.at.h("stat.chestOpened", new Object[0])).g();
        e = new e("stat.sleepInBed", new net.minecraft.at.h("stat.sleepInBed", new Object[0])).g();
        r = new e("stat.shulkerBoxOpened", new net.minecraft.at.h("stat.shulkerBoxOpened", new Object[0])).g();
        y = new d[4096];
        k = new d[32000];
        g = new d[32000];
        af = new d[32000];
        c = new d[32000];
        m = new d[32000];
    }

    public static d b(q q2) {
        String string = net.minecraft.U.h.a(q2.e);
        return string == null ? null : new d("stat.killEntity." + string, new net.minecraft.at.h("stat.entityKill", new net.minecraft.at.h("entity." + string + ".name", new Object[0]))).g();
    }

    private static void d() {
        block3: {
            Iterator<k> iterator = net.minecraft.w.k.q.iterator();
            int n2 = net.minecraft.l.d.e();
            while (iterator.hasNext()) {
                block5: {
                    String string;
                    k k2;
                    block6: {
                        k k3;
                        block4: {
                            k2 = iterator.next();
                            if (n2 == 0) break block3;
                            k3 = k2;
                            if (n2 == 0) break block4;
                            if (k3 == null) break block5;
                            k3 = k2;
                        }
                        int n3 = net.minecraft.w.k.a(k3);
                        string = net.minecraft.l.m.d(k2);
                        if (n2 == 0) break block6;
                        if (string == null) break block5;
                        net.minecraft.l.m.c[n3] = new f("stat.pickup.", string, new net.minecraft.at.h("stat.pickup", new net.minecraft.w.d(k2).F()), k2).g();
                    }
                    net.minecraft.l.m.m[n3] = new f("stat.drop.", string, new net.minecraft.at.h("stat.drop", new net.minecraft.w.d(k2).F()), k2).g();
                }
                if (n2 != 0) continue;
            }
            net.minecraft.l.m.a(af);
        }
    }

    @Nullable
    public static d c(k k2) {
        return k[net.minecraft.w.k.a(k2)];
    }

    @Nullable
    public static d a(String string) {
        return Y.get(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String d(k k2) {
        v v2 = net.minecraft.w.k.q.b(k2);
        int n2 = net.minecraft.l.d.h();
        v v3 = v2;
        if (n2 == 0) {
            if (v3 == null) return null;
            v3 = v2;
        }
        String string = v3.toString().replace(':', '.');
        return string;
    }

    @Nullable
    public static d b(k k2) {
        return g[net.minecraft.w.k.a(k2)];
    }

    private static void e() {
        block5: {
            Iterator iterator = net.minecraft.W.K.h.iterator();
            int n2 = net.minecraft.l.d.e();
            while (iterator.hasNext()) {
                K k2 = (K)iterator.next();
                k k3 = net.minecraft.w.k.b(k2);
                if (n2 != 0) {
                    if (k3 != net.minecraft.u.h.v) {
                        int n3 = net.minecraft.W.K.b(k2);
                        String string = net.minecraft.l.m.d(k3);
                        if (string != null) {
                            boolean bl2 = k2.g();
                            if (n2 != 0 && bl2) {
                                net.minecraft.l.m.y[n3] = new f("stat.mineBlock.", string, new net.minecraft.at.h("stat.mineBlock", new net.minecraft.w.d(k2).F()), k3).g();
                                bl2 = x.add((f)y[n3]);
                            }
                        }
                    }
                    if (n2 != 0) continue;
                }
                break block5;
            }
            net.minecraft.l.m.a(y);
        }
    }

    @Nullable
    public static d e(k k2) {
        return m[net.minecraft.w.k.a(k2)];
    }

    @Nullable
    public static d f(k k2) {
        return c[net.minecraft.w.k.a(k2)];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static void b() {
        block10: {
            var1 = Sets.newHashSet();
            var2_1 = net.minecraft.az.t.a.iterator();
            var0_2 = net.minecraft.l.d.h();
            while (var2_1.hasNext()) {
                var3_3 = var2_1.next();
                var4_4 = var3_3.d();
                v0 = var4_4.G();
                if (var0_2 == 0) {
                    if (var0_2 == 0 && !v0) {
                        var1.add(var3_3.d().w());
                    }
                    if (var0_2 == 0) continue;
                }
                ** GOTO lbl17
            }
            var2_1 = net.minecraft.az.g.a().b().values().iterator();
            do {
                v0 = var2_1.hasNext();
lbl17:
                // 2 sources

                if (!v0) break;
                var3_3 = (net.minecraft.w.d)var2_1.next();
                var1.add(var3_3.w());
                if (var0_2 != 0) break block10;
            } while (var0_2 == 0);
            var2_1 = var1.iterator();
        }
        while (var2_1.hasNext()) {
            block12: {
                block11: {
                    var3_3 = (k)var2_1.next();
                    if (var0_2 != 0) return;
                    v1 = var3_3;
                    if (var0_2 != 0) break block11;
                    if (v1 == null) break block12;
                    v1 = var3_3;
                }
                var4_5 = net.minecraft.w.k.a((k)v1);
                var5_6 = net.minecraft.l.m.d((k)var3_3);
                if (var5_6 != null) {
                    net.minecraft.l.m.k[var4_5] = new f("stat.craftItem.", var5_6, new net.minecraft.at.h("stat.craftItem", new Object[]{new net.minecraft.w.d((k)var3_3).F()}), (k)var3_3).g();
                }
            }
            if (var0_2 == 0) continue;
        }
        net.minecraft.l.m.a(net.minecraft.l.m.k);
    }
}

