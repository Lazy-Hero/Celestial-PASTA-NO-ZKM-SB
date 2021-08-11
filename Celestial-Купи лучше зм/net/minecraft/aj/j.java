/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.aj;

import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;
import net.minecraft.aj.h;
import net.minecraft.aj.i;
import net.minecraft.ar.v;
import net.minecraft.k.m;

public class j {
    public static final /* synthetic */ v p;
    public static final /* synthetic */ v c;
    public static final /* synthetic */ v ac;
    public static final /* synthetic */ v M;
    public static final /* synthetic */ v J;
    public static final /* synthetic */ v A;
    public static final /* synthetic */ v v;
    public static final /* synthetic */ v o;
    public static final /* synthetic */ v aG;
    public static final /* synthetic */ v aw;
    public static final /* synthetic */ v E;
    public static final /* synthetic */ v ai;
    public static final /* synthetic */ v aa;
    public static final /* synthetic */ v ap;
    public static final /* synthetic */ v T;
    public static final /* synthetic */ v an;
    public static final /* synthetic */ v al;
    public static final /* synthetic */ v t;
    public static final /* synthetic */ v k;
    public static final /* synthetic */ v n;
    public static final /* synthetic */ v r;
    public static final /* synthetic */ v af;
    public static final /* synthetic */ v ad;
    public static final /* synthetic */ v ar;
    public static final /* synthetic */ v s;
    public static final /* synthetic */ v ax;
    public static final /* synthetic */ v j;
    private static /* synthetic */ m[] B;
    public static final /* synthetic */ v W;
    public static final /* synthetic */ v w;
    public static final /* synthetic */ v R;
    public static final /* synthetic */ v Y;
    public static final /* synthetic */ v L;
    public static final /* synthetic */ v F;
    public static final /* synthetic */ v am;
    public static final /* synthetic */ v K;
    public static final /* synthetic */ v b;
    public static final /* synthetic */ v O;
    public static final /* synthetic */ v N;
    public static final /* synthetic */ v ag;
    public static final /* synthetic */ v aC;
    public static final /* synthetic */ v Q;
    public static final /* synthetic */ v as;
    private static final /* synthetic */ Set<v> aq;
    public static final /* synthetic */ v a;
    public static final /* synthetic */ v i;
    public static final /* synthetic */ v q;
    public static final /* synthetic */ v ao;
    public static final /* synthetic */ v z;
    public static final /* synthetic */ v ab;
    public static final /* synthetic */ v D;
    public static final /* synthetic */ v aF;
    public static final /* synthetic */ v U;
    public static final /* synthetic */ v h;
    public static final /* synthetic */ v av;
    public static final /* synthetic */ v X;
    public static final /* synthetic */ v ay;
    public static final /* synthetic */ v ak;
    public static final /* synthetic */ v I;
    public static final /* synthetic */ v S;
    public static final /* synthetic */ v ae;
    public static final /* synthetic */ v H;
    public static final /* synthetic */ v au;
    public static final /* synthetic */ v P;
    public static final /* synthetic */ v e;
    private static final /* synthetic */ Set<v> aA;
    public static final /* synthetic */ v G;
    public static final /* synthetic */ v m;
    public static final /* synthetic */ v aE;
    public static final /* synthetic */ v f;
    public static final /* synthetic */ v aj;
    public static final /* synthetic */ v l;
    public static final /* synthetic */ v Z;
    public static final /* synthetic */ v u;
    public static final /* synthetic */ v aB;
    public static final /* synthetic */ v C;
    public static final /* synthetic */ v V;
    public static final /* synthetic */ v az;
    public static final /* synthetic */ v aD;
    public static final /* synthetic */ v x;
    public static final /* synthetic */ v at;
    public static final /* synthetic */ v g;
    public static final /* synthetic */ v ah;
    public static final /* synthetic */ v y;
    public static final /* synthetic */ v d;

    public static boolean a() {
        h h2 = new h(null);
        m[] arrm = net.minecraft.aj.j.b();
        for (v v2 : aA) {
            if (h2.a(v2) == net.minecraft.aj.i.b) {
                return false;
            }
            if (arrm != null) continue;
        }
        return true;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static void b(m[] arrm) {
        B = arrm;
    }

    private static v a(String string) {
        return net.minecraft.aj.j.a(new v("minecraft", string));
    }

    public static v a(v v2) {
        if (aq.add(v2)) {
            return v2;
        }
        throw new IllegalArgumentException(v2 + " is already a registered built-in loot table");
    }

    public static m[] b() {
        return B;
    }

    public static Set<v> c() {
        return aA;
    }

    static {
        aq = Sets.newHashSet();
        aA = Collections.unmodifiableSet(aq);
        av = net.minecraft.aj.j.a("empty");
        e = net.minecraft.aj.j.a("chests/spawn_bonus_chest");
        L = net.minecraft.aj.j.a("chests/end_city_treasure");
        az = net.minecraft.aj.j.a("chests/simple_dungeon");
        G = net.minecraft.aj.j.a("chests/village_blacksmith");
        ax = net.minecraft.aj.j.a("chests/abandoned_mineshaft");
        an = net.minecraft.aj.j.a("chests/nether_bridge");
        aw = net.minecraft.aj.j.a("chests/stronghold_library");
        R = net.minecraft.aj.j.a("chests/stronghold_crossing");
        J = net.minecraft.aj.j.a("chests/stronghold_corridor");
        af = net.minecraft.aj.j.a("chests/desert_pyramid");
        ap = net.minecraft.aj.j.a("chests/jungle_temple");
        ae = net.minecraft.aj.j.a("chests/jungle_temple_dispenser");
        as = net.minecraft.aj.j.a("chests/igloo_chest");
        d = net.minecraft.aj.j.a("chests/woodland_mansion");
        O = net.minecraft.aj.j.a("entities/witch");
        aG = net.minecraft.aj.j.a("entities/blaze");
        aa = net.minecraft.aj.j.a("entities/creeper");
        am = net.minecraft.aj.j.a("entities/spider");
        g = net.minecraft.aj.j.a("entities/cave_spider");
        s = net.minecraft.aj.j.a("entities/giant");
        ao = net.minecraft.aj.j.a("entities/silverfish");
        ak = net.minecraft.aj.j.a("entities/enderman");
        M = net.minecraft.aj.j.a("entities/guardian");
        I = net.minecraft.aj.j.a("entities/elder_guardian");
        P = net.minecraft.aj.j.a("entities/shulker");
        x = net.minecraft.aj.j.a("entities/iron_golem");
        ac = net.minecraft.aj.j.a("entities/snowman");
        l = net.minecraft.aj.j.a("entities/rabbit");
        Z = net.minecraft.aj.j.a("entities/chicken");
        aD = net.minecraft.aj.j.a("entities/pig");
        ai = net.minecraft.aj.j.a("entities/polar_bear");
        i = net.minecraft.aj.j.a("entities/horse");
        c = net.minecraft.aj.j.a("entities/donkey");
        D = net.minecraft.aj.j.a("entities/mule");
        net.minecraft.aj.j.b(new m[1]);
        w = net.minecraft.aj.j.a("entities/zombie_horse");
        v = net.minecraft.aj.j.a("entities/skeleton_horse");
        E = net.minecraft.aj.j.a("entities/cow");
        au = net.minecraft.aj.j.a("entities/mushroom_cow");
        A = net.minecraft.aj.j.a("entities/wolf");
        b = net.minecraft.aj.j.a("entities/ocelot");
        z = net.minecraft.aj.j.a("entities/sheep");
        Q = net.minecraft.aj.j.a("entities/sheep/white");
        ay = net.minecraft.aj.j.a("entities/sheep/orange");
        Y = net.minecraft.aj.j.a("entities/sheep/magenta");
        V = net.minecraft.aj.j.a("entities/sheep/light_blue");
        m = net.minecraft.aj.j.a("entities/sheep/yellow");
        ag = net.minecraft.aj.j.a("entities/sheep/lime");
        K = net.minecraft.aj.j.a("entities/sheep/pink");
        f = net.minecraft.aj.j.a("entities/sheep/gray");
        q = net.minecraft.aj.j.a("entities/sheep/silver");
        aB = net.minecraft.aj.j.a("entities/sheep/cyan");
        aE = net.minecraft.aj.j.a("entities/sheep/purple");
        N = net.minecraft.aj.j.a("entities/sheep/blue");
        ar = net.minecraft.aj.j.a("entities/sheep/brown");
        o = net.minecraft.aj.j.a("entities/sheep/green");
        a = net.minecraft.aj.j.a("entities/sheep/red");
        C = net.minecraft.aj.j.a("entities/sheep/black");
        ab = net.minecraft.aj.j.a("entities/bat");
        S = net.minecraft.aj.j.a("entities/slime");
        T = net.minecraft.aj.j.a("entities/magma_cube");
        y = net.minecraft.aj.j.a("entities/ghast");
        ah = net.minecraft.aj.j.a("entities/squid");
        n = net.minecraft.aj.j.a("entities/endermite");
        U = net.minecraft.aj.j.a("entities/zombie");
        H = net.minecraft.aj.j.a("entities/zombie_pigman");
        W = net.minecraft.aj.j.a("entities/skeleton");
        aF = net.minecraft.aj.j.a("entities/wither_skeleton");
        p = net.minecraft.aj.j.a("entities/stray");
        aj = net.minecraft.aj.j.a("entities/husk");
        aC = net.minecraft.aj.j.a("entities/zombie_villager");
        t = net.minecraft.aj.j.a("entities/villager");
        al = net.minecraft.aj.j.a("entities/evocation_illager");
        j = net.minecraft.aj.j.a("entities/vindication_illager");
        k = net.minecraft.aj.j.a("entities/llama");
        X = net.minecraft.aj.j.a("entities/parrot");
        ad = net.minecraft.aj.j.a("entities/vex");
        at = net.minecraft.aj.j.a("entities/ender_dragon");
        h = net.minecraft.aj.j.a("gameplay/fishing");
        u = net.minecraft.aj.j.a("gameplay/fishing/junk");
        F = net.minecraft.aj.j.a("gameplay/fishing/treasure");
        r = net.minecraft.aj.j.a("gameplay/fishing/fish");
    }
}

