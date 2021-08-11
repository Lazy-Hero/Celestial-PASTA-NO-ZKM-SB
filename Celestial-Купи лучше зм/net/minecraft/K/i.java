/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  javax.annotation.Nullable
 */
package net.minecraft.K;

import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.K.j;
import net.minecraft.ar.v;
import net.minecraft.b.e;
import net.minecraft.k.m;
import net.minecraft.u.c;

public class i {
    private final /* synthetic */ ImmutableList<j> a;
    private static final /* synthetic */ v c;
    private static /* synthetic */ int e;
    private final /* synthetic */ String b;
    public static final /* synthetic */ e<v, i> d;

    public i(j ... arrj) {
        this((String)null, arrj);
    }

    public static void b() {
        int[] arrn = j.b();
        i.a("empty", new i(new j[0]));
        i.a("water", new i(new j[0]));
        int[] arrn2 = arrn;
        i.a("mundane", new i(new j[0]));
        i.a("thick", new i(new j[0]));
        i.a("awkward", new i(new j[0]));
        i.a("night_vision", new i(new j(net.minecraft.u.c.A, 3600)));
        i.a("long_night_vision", new i("night_vision", new j(net.minecraft.u.c.A, 9600)));
        i.a("invisibility", new i(new j(net.minecraft.u.c.c, 3600)));
        i.a("long_invisibility", new i("invisibility", new j(net.minecraft.u.c.c, 9600)));
        i.a("leaping", new i(new j(net.minecraft.u.c.n, 3600)));
        i.a("long_leaping", new i("leaping", new j(net.minecraft.u.c.n, 9600)));
        i.a("strong_leaping", new i("leaping", new j(net.minecraft.u.c.n, 1800, 1)));
        i.a("fire_resistance", new i(new j(net.minecraft.u.c.h, 3600)));
        i.a("long_fire_resistance", new i("fire_resistance", new j(net.minecraft.u.c.h, 9600)));
        i.a("swiftness", new i(new j(net.minecraft.u.c.l, 3600)));
        i.a("long_swiftness", new i("swiftness", new j(net.minecraft.u.c.l, 9600)));
        i.a("strong_swiftness", new i("swiftness", new j(net.minecraft.u.c.l, 1800, 1)));
        i.a("slowness", new i(new j(net.minecraft.u.c.f, 1800)));
        i.a("long_slowness", new i("slowness", new j(net.minecraft.u.c.f, 4800)));
        i.a("water_breathing", new i(new j(net.minecraft.u.c.p, 3600)));
        i.a("long_water_breathing", new i("water_breathing", new j(net.minecraft.u.c.p, 9600)));
        i.a("healing", new i(new j(net.minecraft.u.c.v, 1)));
        i.a("strong_healing", new i("healing", new j(net.minecraft.u.c.v, 1, 1)));
        i.a("harming", new i(new j(net.minecraft.u.c.o, 1)));
        i.a("strong_harming", new i("harming", new j(net.minecraft.u.c.o, 1, 1)));
        i.a("poison", new i(new j(net.minecraft.u.c.g, 900)));
        i.a("long_poison", new i("poison", new j(net.minecraft.u.c.g, 1800)));
        i.a("strong_poison", new i("poison", new j(net.minecraft.u.c.g, 432, 1)));
        i.a("regeneration", new i(new j(net.minecraft.u.c.t, 900)));
        i.a("long_regeneration", new i("regeneration", new j(net.minecraft.u.c.t, 1800)));
        i.a("strong_regeneration", new i("regeneration", new j(net.minecraft.u.c.t, 450, 1)));
        i.a("strength", new i(new j(net.minecraft.u.c.e, 3600)));
        i.a("long_strength", new i("strength", new j(net.minecraft.u.c.e, 9600)));
        i.a("strong_strength", new i("strength", new j(net.minecraft.u.c.e, 1800, 1)));
        i.a("weakness", new i(new j(net.minecraft.u.c.d, 1800)));
        i.a("long_weakness", new i("weakness", new j(net.minecraft.u.c.d, 4800)));
        i.a("luck", new i("luck", new j(net.minecraft.u.c.j, 6000)));
        d.a();
        if (arrn2 != null) {
            m.b(!m.c());
        }
    }

    public i(@Nullable String string, j ... arrj) {
        this.b = string;
        this.a = ImmutableList.copyOf((Object[])arrj);
    }

    @Nullable
    public static i a(String string) {
        return d.a(new v(string));
    }

    protected static void a(String string, i i2) {
        d.a(e++, new v(string), i2);
    }

    static {
        c = new v("empty");
        d = new e(c);
    }

    public String b(String string) {
        int[] arrn = j.b();
        String string2 = this.b;
        if (arrn == null) {
            string2 = string2 == null ? string + d.b(this).a() : string + this.b;
        }
        return string2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public List<j> a() {
        return this.a;
    }

    public boolean c() {
        boolean bl2;
        block3: {
            block4: {
                int[] arrn = j.b();
                bl2 = this.a.isEmpty();
                if (arrn != null) break block3;
                if (bl2) break block4;
                for (j j2 : this.a) {
                    block6: {
                        boolean bl3;
                        block5: {
                            bl2 = j2.g().g();
                            if (arrn != null) break block3;
                            if (arrn != null) break block5;
                            if (!bl2) break block6;
                            bl3 = true;
                        }
                        return bl3;
                    }
                    if (arrn == null) continue;
                }
            }
            bl2 = false;
        }
        return bl2;
    }
}

