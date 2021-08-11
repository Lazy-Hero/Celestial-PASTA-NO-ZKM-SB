/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ad;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.U.C;
import net.minecraft.ad.b;
import net.minecraft.ad.c;
import net.minecraft.ad.d;
import net.minecraft.ad.e;
import net.minecraft.ad.f;
import net.minecraft.ad.g;
import net.minecraft.ad.h;
import net.minecraft.ad.i;
import net.minecraft.ad.j;
import net.minecraft.ad.k;
import net.minecraft.ad.l;
import net.minecraft.ad.m;
import net.minecraft.ar.a2;

public abstract class a {
    private /* synthetic */ String s;
    public static final /* synthetic */ a p;
    public static final /* synthetic */ a n;
    public static final /* synthetic */ a t;
    private /* synthetic */ boolean f;
    public static final /* synthetic */ a k;
    public static final /* synthetic */ a r;
    public static final /* synthetic */ a g;
    public static final /* synthetic */ a m;
    public static final /* synthetic */ a[] h;
    public static final /* synthetic */ a b;
    private final /* synthetic */ int c;
    public static final /* synthetic */ a o;
    private /* synthetic */ boolean l;
    private /* synthetic */ net.minecraft.w.d e;
    private final /* synthetic */ String a;
    public static final /* synthetic */ a j;
    public static final /* synthetic */ a q;
    public static final /* synthetic */ a d;
    private /* synthetic */ net.minecraft.ax.h[] i;
    public static final /* synthetic */ a u;

    public int h() {
        return this.c;
    }

    public boolean a(@Nullable net.minecraft.ax.h h2) {
        String[] arrstring = C.aa();
        if (h2 != null) {
            net.minecraft.ax.h[] arrh = this.i;
            int n2 = arrh.length;
            int n3 = 0;
            while (n3 < n2) {
                net.minecraft.ax.h h3 = arrh[n3];
                if (arrstring == null) {
                    if (h3 == h2) {
                        return true;
                    }
                    ++n3;
                }
                if (arrstring == null) continue;
            }
        }
        return false;
    }

    public void a(a2<net.minecraft.w.d> a22) {
        block1: {
            Iterator<net.minecraft.w.k> iterator = net.minecraft.w.k.q.iterator();
            String[] arrstring = C.aa();
            while (iterator.hasNext()) {
                net.minecraft.w.k k2 = iterator.next();
                k2.a(this, a22);
                if (arrstring == null) continue;
            }
            if (!net.minecraft.k.m.c()) break block1;
            C.b(new String[5]);
        }
    }

    public String i() {
        String[] arrstring = C.aa();
        String string = "itemGroup." + this.d();
        if (arrstring != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
        return string;
    }

    public boolean k() {
        return this.f;
    }

    public abstract net.minecraft.w.d e();

    public a(int n2, String string) {
        this.s = "items.png";
        this.f = true;
        this.l = true;
        this.i = new net.minecraft.ax.h[0];
        this.c = n2;
        this.a = string;
        this.e = net.minecraft.w.d.m;
        net.minecraft.ad.a.h[n2] = this;
    }

    public int g() {
        return this.c % 6;
    }

    public net.minecraft.ax.h[] b() {
        return this.i;
    }

    public net.minecraft.w.d l() {
        String[] arrstring = C.aa();
        net.minecraft.w.d d10 = this.e;
        if (arrstring == null) {
            if (d10.G()) {
                this.e = this.e();
            }
            d10 = this.e;
        }
        return d10;
    }

    public boolean a() {
        String[] arrstring = C.aa();
        boolean bl2 = this.g();
        if (arrstring == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public a a(net.minecraft.ax.h ... arrh) {
        this.i = arrh;
        return this;
    }

    public boolean j() {
        return this.l;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean n() {
        String[] arrstring = C.aa();
        boolean bl2 = this.c;
        if (arrstring == null) {
            bl2 = bl2 < BADBOOL 6;
        }
        return bl2;
    }

    public a a(String string) {
        this.s = string;
        return this;
    }

    public String m() {
        return this.s;
    }

    static {
        h = new a[12];
        r = new b(0, "buildingBlocks");
        j = new f(1, "decorations");
        p = new g(2, "redstone");
        t = new h(3, "transportation");
        n = new i(6, "misc");
        b = new j(5, "search").a("item_search.png");
        k = new k(7, "food");
        d = new l(8, "tools").a(net.minecraft.ax.h.ALL, net.minecraft.ax.h.DIGGER, net.minecraft.ax.h.FISHING_ROD, net.minecraft.ax.h.BREAKABLE);
        o = new m(9, "combat").a(net.minecraft.ax.h.ALL, net.minecraft.ax.h.ARMOR, net.minecraft.ax.h.ARMOR_FEET, net.minecraft.ax.h.ARMOR_HEAD, net.minecraft.ax.h.ARMOR_LEGS, net.minecraft.ax.h.ARMOR_CHEST, net.minecraft.ax.h.BOW, net.minecraft.ax.h.WEAPON, net.minecraft.ax.h.WEARABLE, net.minecraft.ax.h.BREAKABLE);
        q = new c(10, "brewing");
        m = n;
        u = new d(4, "hotbar");
        g = new e(11, "inventory").a("inventory.png").c().f();
    }

    public a f() {
        this.l = false;
        return this;
    }

    public String d() {
        return this.a;
    }

    public a c() {
        this.f = false;
        return this;
    }
}

