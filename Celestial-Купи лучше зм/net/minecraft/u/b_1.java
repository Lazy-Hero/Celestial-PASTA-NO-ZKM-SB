/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.u;

import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.ax.u;
import net.minecraft.u.f;

public class b {
    public static final /* synthetic */ u A;
    public static final /* synthetic */ u m;
    public static final /* synthetic */ u z;
    public static final /* synthetic */ u C;
    public static final /* synthetic */ u c;
    public static final /* synthetic */ u b;
    public static final /* synthetic */ u p;
    public static final /* synthetic */ u j;
    public static final /* synthetic */ u i;
    public static final /* synthetic */ u f;
    public static final /* synthetic */ u k;
    public static final /* synthetic */ u w;
    public static final /* synthetic */ u t;
    public static final /* synthetic */ u y;
    public static final /* synthetic */ u u;
    public static final /* synthetic */ u v;
    public static final /* synthetic */ u n;
    public static final /* synthetic */ u D;
    public static final /* synthetic */ u x;
    public static final /* synthetic */ u e;
    public static final /* synthetic */ u d;
    public static final /* synthetic */ u s;
    public static final /* synthetic */ u h;
    public static final /* synthetic */ u g;
    public static final /* synthetic */ u q;
    public static final /* synthetic */ u a;
    public static final /* synthetic */ u B;
    public static final /* synthetic */ u r;
    public static final /* synthetic */ u o;
    public static final /* synthetic */ u l;

    static {
        g = net.minecraft.u.b.a("protection");
        u = net.minecraft.u.b.a("fire_protection");
        q = net.minecraft.u.b.a("feather_falling");
        m = net.minecraft.u.b.a("blast_protection");
        r = net.minecraft.u.b.a("projectile_protection");
        D = net.minecraft.u.b.a("respiration");
        e = net.minecraft.u.b.a("aqua_affinity");
        a = net.minecraft.u.b.a("thorns");
        w = net.minecraft.u.b.a("depth_strider");
        h = net.minecraft.u.b.a("frost_walker");
        n = net.minecraft.u.b.a("binding_curse");
        o = net.minecraft.u.b.a("sharpness");
        p = net.minecraft.u.b.a("smite");
        s = net.minecraft.u.b.a("bane_of_arthropods");
        l = net.minecraft.u.b.a("knockback");
        j = net.minecraft.u.b.a("fire_aspect");
        c = net.minecraft.u.b.a("looting");
        f = net.minecraft.u.b.a("sweeping");
        b = net.minecraft.u.b.a("efficiency");
        v = net.minecraft.u.b.a("silk_touch");
        A = net.minecraft.u.b.a("unbreaking");
        B = net.minecraft.u.b.a("fortune");
        t = net.minecraft.u.b.a("power");
        z = net.minecraft.u.b.a("punch");
        y = net.minecraft.u.b.a("flame");
        C = net.minecraft.u.b.a("infinity");
        d = net.minecraft.u.b.a("luck_of_the_sea");
        x = net.minecraft.u.b.a("lure");
        i = net.minecraft.u.b.a("mending");
        k = net.minecraft.u.b.a("vanishing_curse");
        if (!net.minecraft.u.f.b()) {
            throw new RuntimeException("Accessed Enchantments before Bootstrap!");
        }
    }

    @Nullable
    private static u a(String string) {
        u u2 = net.minecraft.ax.u.e.a(new v(string));
        if (u2 == null) {
            throw new IllegalStateException("Invalid Enchantment requested: " + string);
        }
        return u2;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}

