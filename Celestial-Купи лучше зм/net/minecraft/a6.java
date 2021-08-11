/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.M.W;
import net.minecraft.M.Y;
import net.minecraft.M.a;
import net.minecraft.M.aD;
import net.minecraft.M.aG;
import net.minecraft.M.aS;
import net.minecraft.M.aV;
import net.minecraft.M.aW;
import net.minecraft.M.a_;
import net.minecraft.M.aa;
import net.minecraft.M.ae;
import net.minecraft.M.ah;
import net.minecraft.M.ak;
import net.minecraft.M.am;
import net.minecraft.M.an;
import net.minecraft.M.ao;
import net.minecraft.M.aq;
import net.minecraft.M.at;
import net.minecraft.M.ay;
import net.minecraft.M.f;
import net.minecraft.M.j;
import net.minecraft.M.n;
import net.minecraft.M.p;
import net.minecraft.M.r;
import net.minecraft.M.s;
import net.minecraft.aO;
import net.minecraft.aR;
import net.minecraft.ar.v;

public class a6 {
    public static final /* synthetic */ aS g;
    public static final /* synthetic */ am t;
    public static final /* synthetic */ s j;
    public static final /* synthetic */ aq s;
    public static final /* synthetic */ r z;
    public static final /* synthetic */ aG y;
    public static final /* synthetic */ W q;
    public static final /* synthetic */ at p;
    public static final /* synthetic */ aW d;
    public static final /* synthetic */ p w;
    public static final /* synthetic */ ao r;
    public static final /* synthetic */ a_ e;
    public static final /* synthetic */ n h;
    public static final /* synthetic */ f n;
    public static final /* synthetic */ net.minecraft.M.a6 c;
    public static final /* synthetic */ ae f;
    public static final /* synthetic */ a m;
    public static final /* synthetic */ ay a;
    public static final /* synthetic */ Y C;
    public static final /* synthetic */ aa B;
    public static final /* synthetic */ aD l;
    public static final /* synthetic */ an b;
    public static final /* synthetic */ aV u;
    public static final /* synthetic */ ak k;
    public static final /* synthetic */ f o;
    public static final /* synthetic */ j x;
    private static final /* synthetic */ Map<v, aO<?>> v;
    public static final /* synthetic */ W A;
    public static final /* synthetic */ ah i;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static Iterable<? extends aO<?>> a() {
        return v.values();
    }

    @Nullable
    public static <T extends aR> aO<T> a(v v2) {
        return v.get(v2);
    }

    static {
        v = Maps.newHashMap();
        t = a6.a(new am());
        q = a6.a(new W(new v("player_killed_entity")));
        A = a6.a(new W(new v("entity_killed_player")));
        d = a6.a(new aW());
        e = a6.a(new a_());
        u = a6.a(new aV());
        w = a6.a(new p());
        i = a6.a(new ah());
        r = a6.a(new ao());
        p = a6.a(new at());
        y = a6.a(new aG());
        k = a6.a(new ak());
        z = a6.a(new r());
        f = a6.a(new ae());
        n = a6.a(new f(new v("location")));
        o = a6.a(new f(new v("slept_in_bed")));
        a = a6.a(new ay());
        x = a6.a(new j());
        l = a6.a(new aD());
        h = a6.a(new n());
        b = a6.a(new an());
        c = a6.a(new net.minecraft.M.a6());
        g = a6.a(new aS());
        s = a6.a(new aq());
        C = a6.a(new Y());
        j = a6.a(new s());
        m = a6.a(new a());
        B = a6.a(new aa());
    }

    private static <T extends aO> T a(T t2) {
        if (v.containsKey(t2.a())) {
            throw new IllegalArgumentException("Duplicate criterion id " + t2.a());
        }
        v.put(t2.a(), t2);
        return t2;
    }
}

