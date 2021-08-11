/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.u;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.K.i;
import net.minecraft.ar.v;
import net.minecraft.u.f;

public class a {
    public static final /* synthetic */ i J;
    public static final /* synthetic */ i q;
    public static final /* synthetic */ i p;
    public static final /* synthetic */ i u;
    public static final /* synthetic */ i s;
    public static final /* synthetic */ i h;
    public static final /* synthetic */ i B;
    public static final /* synthetic */ i z;
    public static final /* synthetic */ i K;
    private static final /* synthetic */ Set<i> E;
    public static final /* synthetic */ i d;
    public static final /* synthetic */ i n;
    public static final /* synthetic */ i A;
    public static final /* synthetic */ i m;
    public static final /* synthetic */ i e;
    public static final /* synthetic */ i a;
    public static final /* synthetic */ i y;
    public static final /* synthetic */ i k;
    public static final /* synthetic */ i f;
    public static final /* synthetic */ i I;
    public static final /* synthetic */ i b;
    public static final /* synthetic */ i i;
    public static final /* synthetic */ i t;
    public static final /* synthetic */ i x;
    public static final /* synthetic */ i r;
    public static final /* synthetic */ i w;
    public static final /* synthetic */ i G;
    public static final /* synthetic */ i H;
    public static final /* synthetic */ i F;
    public static final /* synthetic */ i j;
    public static final /* synthetic */ i C;
    public static final /* synthetic */ i o;
    public static final /* synthetic */ i g;
    public static final /* synthetic */ i l;
    public static final /* synthetic */ i v;
    public static final /* synthetic */ i c;
    public static final /* synthetic */ i D;

    private static i a(String string) {
        i i2 = net.minecraft.K.i.d.a(new v(string));
        if (!E.add(i2)) {
            throw new IllegalStateException("Invalid Potion requested: " + string);
        }
        return i2;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    static {
        if (!net.minecraft.u.f.b()) {
            throw new RuntimeException("Accessed Potions before Bootstrap!");
        }
        E = Sets.newHashSet();
        l = net.minecraft.u.a.a("empty");
        u = net.minecraft.u.a.a("water");
        f = net.minecraft.u.a.a("mundane");
        r = net.minecraft.u.a.a("thick");
        t = net.minecraft.u.a.a("awkward");
        k = net.minecraft.u.a.a("night_vision");
        G = net.minecraft.u.a.a("long_night_vision");
        q = net.minecraft.u.a.a("invisibility");
        n = net.minecraft.u.a.a("long_invisibility");
        g = net.minecraft.u.a.a("leaping");
        K = net.minecraft.u.a.a("long_leaping");
        o = net.minecraft.u.a.a("strong_leaping");
        z = net.minecraft.u.a.a("fire_resistance");
        i = net.minecraft.u.a.a("long_fire_resistance");
        C = net.minecraft.u.a.a("swiftness");
        I = net.minecraft.u.a.a("long_swiftness");
        A = net.minecraft.u.a.a("strong_swiftness");
        j = net.minecraft.u.a.a("slowness");
        H = net.minecraft.u.a.a("long_slowness");
        e = net.minecraft.u.a.a("water_breathing");
        v = net.minecraft.u.a.a("long_water_breathing");
        B = net.minecraft.u.a.a("healing");
        m = net.minecraft.u.a.a("strong_healing");
        p = net.minecraft.u.a.a("harming");
        a = net.minecraft.u.a.a("strong_harming");
        c = net.minecraft.u.a.a("poison");
        h = net.minecraft.u.a.a("long_poison");
        d = net.minecraft.u.a.a("strong_poison");
        D = net.minecraft.u.a.a("regeneration");
        s = net.minecraft.u.a.a("long_regeneration");
        J = net.minecraft.u.a.a("strong_regeneration");
        F = net.minecraft.u.a.a("strength");
        b = net.minecraft.u.a.a("long_strength");
        x = net.minecraft.u.a.a("strong_strength");
        y = net.minecraft.u.a.a("weakness");
        w = net.minecraft.u.a.a("long_weakness");
        E.clear();
    }
}

