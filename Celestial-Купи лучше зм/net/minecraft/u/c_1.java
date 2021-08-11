/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.u;

import javax.annotation.Nullable;
import net.minecraft.K.b;
import net.minecraft.ar.v;
import net.minecraft.u.f;

public class c {
    public static final /* synthetic */ b h;
    public static final /* synthetic */ b b;
    public static final /* synthetic */ b k;
    public static final /* synthetic */ b f;
    public static final /* synthetic */ b A;
    public static final /* synthetic */ b e;
    public static final /* synthetic */ b j;
    public static final /* synthetic */ b p;
    public static final /* synthetic */ b d;
    public static final /* synthetic */ b r;
    public static final /* synthetic */ b u;
    public static final /* synthetic */ b c;
    public static final /* synthetic */ b l;
    public static final /* synthetic */ b n;
    public static final /* synthetic */ b y;
    public static final /* synthetic */ b o;
    public static final /* synthetic */ b z;
    public static final /* synthetic */ b x;
    public static final /* synthetic */ b s;
    public static final /* synthetic */ b a;
    public static final /* synthetic */ b w;
    public static final /* synthetic */ b g;
    public static final /* synthetic */ b v;
    public static final /* synthetic */ b t;
    public static final /* synthetic */ b q;
    public static final /* synthetic */ b i;
    public static final /* synthetic */ b m;

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    static {
        if (!net.minecraft.u.f.b()) {
            throw new RuntimeException("Accessed MobEffects before Bootstrap!");
        }
        l = net.minecraft.u.c.a("speed");
        f = net.minecraft.u.c.a("slowness");
        u = net.minecraft.u.c.a("haste");
        q = net.minecraft.u.c.a("mining_fatigue");
        e = net.minecraft.u.c.a("strength");
        v = net.minecraft.u.c.a("instant_health");
        o = net.minecraft.u.c.a("instant_damage");
        n = net.minecraft.u.c.a("jump_boost");
        s = net.minecraft.u.c.a("nausea");
        t = net.minecraft.u.c.a("regeneration");
        b = net.minecraft.u.c.a("resistance");
        h = net.minecraft.u.c.a("fire_resistance");
        p = net.minecraft.u.c.a("water_breathing");
        c = net.minecraft.u.c.a("invisibility");
        k = net.minecraft.u.c.a("blindness");
        A = net.minecraft.u.c.a("night_vision");
        r = net.minecraft.u.c.a("hunger");
        d = net.minecraft.u.c.a("weakness");
        g = net.minecraft.u.c.a("poison");
        z = net.minecraft.u.c.a("wither");
        w = net.minecraft.u.c.a("health_boost");
        a = net.minecraft.u.c.a("absorption");
        y = net.minecraft.u.c.a("saturation");
        i = net.minecraft.u.c.a("glowing");
        m = net.minecraft.u.c.a("levitation");
        j = net.minecraft.u.c.a("luck");
        x = net.minecraft.u.c.a("unluck");
    }

    @Nullable
    private static b a(String string) {
        b b10 = net.minecraft.K.b.e.a(new v(string));
        if (b10 == null) {
            throw new IllegalStateException("Invalid MobEffect requested: " + string);
        }
        return b10;
    }
}

