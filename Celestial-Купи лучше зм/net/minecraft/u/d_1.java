/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.A.h;
import net.minecraft.ar.v;
import net.minecraft.u.f;

public abstract class d {
    public static final /* synthetic */ h J;
    public static final /* synthetic */ h Y;
    public static final /* synthetic */ h h;
    public static final /* synthetic */ h ak;
    public static final /* synthetic */ h V;
    public static final /* synthetic */ h M;
    public static final /* synthetic */ h g;
    public static final /* synthetic */ h v;
    public static final /* synthetic */ h Z;
    public static final /* synthetic */ h R;
    public static final /* synthetic */ h f;
    public static final /* synthetic */ h af;
    public static final /* synthetic */ h o;
    public static final /* synthetic */ h A;
    public static final /* synthetic */ h L;
    public static final /* synthetic */ h s;
    public static final /* synthetic */ h w;
    public static final /* synthetic */ h G;
    public static final /* synthetic */ h j;
    public static final /* synthetic */ h ab;
    public static final /* synthetic */ h y;
    public static final /* synthetic */ h u;
    public static final /* synthetic */ h N;
    public static final /* synthetic */ h E;
    public static final /* synthetic */ h C;
    public static final /* synthetic */ h l;
    public static final /* synthetic */ h O;
    public static final /* synthetic */ h Q;
    public static final /* synthetic */ h d;
    public static final /* synthetic */ h c;
    public static final /* synthetic */ h F;
    public static final /* synthetic */ h S;
    public static final /* synthetic */ h a;
    public static final /* synthetic */ h ag;
    public static final /* synthetic */ h W;
    public static final /* synthetic */ h q;
    public static final /* synthetic */ h K;
    public static final /* synthetic */ h i;
    public static final /* synthetic */ h r;
    public static final /* synthetic */ h U;
    public static final /* synthetic */ h ac;
    public static final /* synthetic */ h b;
    public static final /* synthetic */ h m;
    public static final /* synthetic */ h t;
    public static final /* synthetic */ h p;
    public static final /* synthetic */ h T;
    public static final /* synthetic */ h ai;
    public static final /* synthetic */ h ae;
    public static final /* synthetic */ h z;
    public static final /* synthetic */ h H;
    public static final /* synthetic */ h e;
    public static final /* synthetic */ h P;
    public static final /* synthetic */ h X;
    public static final /* synthetic */ h I;
    public static final /* synthetic */ h n;
    public static final /* synthetic */ h aj;
    public static final /* synthetic */ h B;
    public static final /* synthetic */ h ah;
    public static final /* synthetic */ h k;
    public static final /* synthetic */ h ad;
    public static final /* synthetic */ h x;
    public static final /* synthetic */ h aa;
    public static final /* synthetic */ h D;

    private static h a(String string) {
        h h2 = net.minecraft.A.h.x.a(new v(string));
        if (h2 == null) {
            throw new IllegalStateException("Invalid Biome requested: " + string);
        }
        return h2;
    }

    static {
        if (!net.minecraft.u.f.b()) {
            throw new RuntimeException("Accessed Biomes before Bootstrap!");
        }
        ai = e = net.minecraft.u.d.a("ocean");
        s = net.minecraft.u.d.a("plains");
        ab = net.minecraft.u.d.a("desert");
        W = net.minecraft.u.d.a("extreme_hills");
        L = net.minecraft.u.d.a("forest");
        Z = net.minecraft.u.d.a("taiga");
        n = net.minecraft.u.d.a("swampland");
        d = net.minecraft.u.d.a("river");
        R = net.minecraft.u.d.a("hell");
        ah = net.minecraft.u.d.a("sky");
        ak = net.minecraft.u.d.a("frozen_ocean");
        g = net.minecraft.u.d.a("frozen_river");
        S = net.minecraft.u.d.a("ice_flats");
        ag = net.minecraft.u.d.a("ice_mountains");
        v = net.minecraft.u.d.a("mushroom_island");
        i = net.minecraft.u.d.a("mushroom_island_shore");
        af = net.minecraft.u.d.a("beaches");
        X = net.minecraft.u.d.a("desert_hills");
        N = net.minecraft.u.d.a("forest_hills");
        ad = net.minecraft.u.d.a("taiga_hills");
        F = net.minecraft.u.d.a("smaller_extreme_hills");
        l = net.minecraft.u.d.a("jungle");
        r = net.minecraft.u.d.a("jungle_hills");
        j = net.minecraft.u.d.a("jungle_edge");
        J = net.minecraft.u.d.a("deep_ocean");
        a = net.minecraft.u.d.a("stone_beach");
        K = net.minecraft.u.d.a("cold_beach");
        k = net.minecraft.u.d.a("birch_forest");
        f = net.minecraft.u.d.a("birch_forest_hills");
        Y = net.minecraft.u.d.a("roofed_forest");
        aa = net.minecraft.u.d.a("taiga_cold");
        w = net.minecraft.u.d.a("taiga_cold_hills");
        B = net.minecraft.u.d.a("redwood_taiga");
        p = net.minecraft.u.d.a("redwood_taiga_hills");
        U = net.minecraft.u.d.a("extreme_hills_with_trees");
        q = net.minecraft.u.d.a("savanna");
        V = net.minecraft.u.d.a("savanna_rock");
        C = net.minecraft.u.d.a("mesa");
        t = net.minecraft.u.d.a("mesa_rock");
        b = net.minecraft.u.d.a("mesa_clear_rock");
        o = net.minecraft.u.d.a("void");
        ac = net.minecraft.u.d.a("mutated_plains");
        A = net.minecraft.u.d.a("mutated_desert");
        x = net.minecraft.u.d.a("mutated_extreme_hills");
        M = net.minecraft.u.d.a("mutated_forest");
        P = net.minecraft.u.d.a("mutated_taiga");
        G = net.minecraft.u.d.a("mutated_swampland");
        ae = net.minecraft.u.d.a("mutated_ice_flats");
        m = net.minecraft.u.d.a("mutated_jungle");
        y = net.minecraft.u.d.a("mutated_jungle_edge");
        I = net.minecraft.u.d.a("mutated_birch_forest");
        aj = net.minecraft.u.d.a("mutated_birch_forest_hills");
        H = net.minecraft.u.d.a("mutated_roofed_forest");
        u = net.minecraft.u.d.a("mutated_taiga_cold");
        D = net.minecraft.u.d.a("mutated_redwood_taiga");
        Q = net.minecraft.u.d.a("mutated_redwood_taiga_hills");
        E = net.minecraft.u.d.a("mutated_extreme_hills_with_trees");
        O = net.minecraft.u.d.a("mutated_savanna");
        T = net.minecraft.u.d.a("mutated_savanna_rock");
        z = net.minecraft.u.d.a("mutated_mesa");
        c = net.minecraft.u.d.a("mutated_mesa_rock");
        h = net.minecraft.u.d.a("mutated_mesa_clear_rock");
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}

