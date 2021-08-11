/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.ax;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.U.g;
import net.minecraft.at.l;
import net.minecraft.ax.A;
import net.minecraft.ax.B;
import net.minecraft.ax.C;
import net.minecraft.ax.D;
import net.minecraft.ax.E;
import net.minecraft.ax.F;
import net.minecraft.ax.G;
import net.minecraft.ax.H;
import net.minecraft.ax.I;
import net.minecraft.ax.J;
import net.minecraft.ax.K;
import net.minecraft.ax.L;
import net.minecraft.ax.M;
import net.minecraft.ax.N;
import net.minecraft.ax.O;
import net.minecraft.ax.P;
import net.minecraft.ax.Q;
import net.minecraft.ax.R;
import net.minecraft.ax.T;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.v;
import net.minecraft.ax.w;
import net.minecraft.ax.x;
import net.minecraft.ax.y;
import net.minecraft.ax.z;
import net.minecraft.k.m;
import net.minecraft.w.d;

public abstract class u {
    private final /* synthetic */ X[] d;
    protected /* synthetic */ String a;
    @Nullable
    public /* synthetic */ h b;
    public static final /* synthetic */ net.minecraft.b.d<net.minecraft.ar.v, u> e;
    private final /* synthetic */ a c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b(u u2) {
        String[] arrstring = T.b();
        boolean bl2 = this.a(u2);
        if (arrstring == null) {
            if (!bl2) return false;
            bl2 = u2.a(this);
        }
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public boolean e() {
        return false;
    }

    @Nullable
    public static u c(int n2) {
        return e.a((net.minecraft.ar.v)n2);
    }

    static {
        e = new net.minecraft.b.d();
    }

    public static int c(u u2) {
        return e.c(u2);
    }

    public int f() {
        return 1;
    }

    protected boolean a(u u2) {
        return this != u2;
    }

    public int g() {
        return 1;
    }

    public float a(int n2, g g10) {
        return 0.0f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public u b(String string) {
        this.a = string;
        return this;
    }

    public int a(int n2, net.minecraft.ar.G g10) {
        return 0;
    }

    public a b() {
        return this.c;
    }

    public String a() {
        return "enchantment." + this.a;
    }

    public int b(int n2) {
        return this.a(n2) + 5;
    }

    @Nullable
    public static u a(String string) {
        return e.a(new net.minecraft.ar.v(string));
    }

    public void a(net.minecraft.U.B b10, net.minecraft.U.x x2, int n2) {
    }

    public static void c() {
        X[] arrx = new X[]{X.HEAD, X.CHEST, X.LEGS, X.FEET};
        e.a(0, new net.minecraft.ar.v("protection"), new K(net.minecraft.ax.a.COMMON, R.ALL, arrx));
        e.a(1, new net.minecraft.ar.v("fire_protection"), new K(net.minecraft.ax.a.UNCOMMON, R.FIRE, arrx));
        e.a(2, new net.minecraft.ar.v("feather_falling"), new K(net.minecraft.ax.a.UNCOMMON, R.FALL, arrx));
        e.a(3, new net.minecraft.ar.v("blast_protection"), new K(net.minecraft.ax.a.RARE, R.EXPLOSION, arrx));
        e.a(4, new net.minecraft.ar.v("projectile_protection"), new K(net.minecraft.ax.a.UNCOMMON, R.PROJECTILE, arrx));
        e.a(5, new net.minecraft.ar.v("respiration"), new J(net.minecraft.ax.a.RARE, arrx));
        e.a(6, new net.minecraft.ar.v("aqua_affinity"), new Q(net.minecraft.ax.a.RARE, arrx));
        e.a(7, new net.minecraft.ar.v("thorns"), new M(net.minecraft.ax.a.VERY_RARE, arrx));
        e.a(8, new net.minecraft.ar.v("depth_strider"), new P(net.minecraft.ax.a.RARE, arrx));
        e.a(9, new net.minecraft.ar.v("frost_walker"), new F(net.minecraft.ax.a.RARE, X.FEET));
        e.a(10, new net.minecraft.ar.v("binding_curse"), new z(net.minecraft.ax.a.VERY_RARE, arrx));
        e.a(16, new net.minecraft.ar.v("sharpness"), new A(net.minecraft.ax.a.COMMON, 0, X.MAINHAND));
        e.a(17, new net.minecraft.ar.v("smite"), new A(net.minecraft.ax.a.UNCOMMON, 1, X.MAINHAND));
        e.a(18, new net.minecraft.ar.v("bane_of_arthropods"), new A(net.minecraft.ax.a.UNCOMMON, 2, X.MAINHAND));
        e.a(19, new net.minecraft.ar.v("knockback"), new G(net.minecraft.ax.a.UNCOMMON, X.MAINHAND));
        e.a(20, new net.minecraft.ar.v("fire_aspect"), new D(net.minecraft.ax.a.RARE, X.MAINHAND));
        e.a(21, new net.minecraft.ar.v("looting"), new H(net.minecraft.ax.a.RARE, h.WEAPON, X.MAINHAND));
        e.a(22, new net.minecraft.ar.v("sweeping"), new L(net.minecraft.ax.a.RARE, X.MAINHAND));
        e.a(32, new net.minecraft.ar.v("efficiency"), new B(net.minecraft.ax.a.COMMON, X.MAINHAND));
        e.a(33, new net.minecraft.ar.v("silk_touch"), new N(net.minecraft.ax.a.VERY_RARE, X.MAINHAND));
        e.a(34, new net.minecraft.ar.v("unbreaking"), new C(net.minecraft.ax.a.UNCOMMON, X.MAINHAND));
        String[] arrstring = T.b();
        e.a(35, new net.minecraft.ar.v("fortune"), new H(net.minecraft.ax.a.RARE, h.DIGGER, X.MAINHAND));
        e.a(48, new net.minecraft.ar.v("power"), new v(net.minecraft.ax.a.COMMON, X.MAINHAND));
        e.a(49, new net.minecraft.ar.v("punch"), new y(net.minecraft.ax.a.RARE, X.MAINHAND));
        e.a(50, new net.minecraft.ar.v("flame"), new w(net.minecraft.ax.a.RARE, X.MAINHAND));
        e.a(51, new net.minecraft.ar.v("infinity"), new x(net.minecraft.ax.a.VERY_RARE, X.MAINHAND));
        e.a(61, new net.minecraft.ar.v("luck_of_the_sea"), new H(net.minecraft.ax.a.RARE, h.FISHING_ROD, X.MAINHAND));
        e.a(62, new net.minecraft.ar.v("lure"), new E(net.minecraft.ax.a.RARE, h.FISHING_ROD, X.MAINHAND));
        String[] arrstring2 = arrstring;
        e.a(70, new net.minecraft.ar.v("mending"), new I(net.minecraft.ax.a.RARE, X.values()));
        e.a(71, new net.minecraft.ar.v("vanishing_curse"), new O(net.minecraft.ax.a.VERY_RARE, X.values()));
        if (arrstring2 != null) {
            m.b(!m.d());
        }
    }

    protected u(a a10, h h2, X[] arrx) {
        this.c = a10;
        this.b = h2;
        this.d = arrx;
    }

    public int a(int n2) {
        return 1 + n2 * 10;
    }

    public boolean d() {
        return false;
    }

    public List<d> a(net.minecraft.U.B b10) {
        ArrayList arrayList = Lists.newArrayList();
        X[] arrx = this.d;
        String[] arrstring = T.b();
        int n2 = arrx.length;
        int n3 = 0;
        while (n3 < n2) {
            X x2 = arrx[n3];
            d d10 = b10.b(x2);
            if (arrstring == null) {
                if (!d10.G()) {
                    arrayList.add(d10);
                }
                ++n3;
            }
            if (arrstring == null) continue;
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String d(int n2) {
        String string;
        String string2;
        block7: {
            int n3;
            int n4;
            block6: {
                string2 = net.minecraft.ab.a.a(this.a());
                String[] arrstring = T.b();
                n4 = this.d();
                if (arrstring == null) {
                    if (n4 != 0) {
                        string2 = (Object)((Object)l.RED) + string2;
                    }
                    n4 = n2;
                }
                n3 = 1;
                if (arrstring != null) break block6;
                if (n4 != n3) break block7;
                n4 = this.f();
                n3 = 1;
            }
            if (n4 == n3) {
                string = string2;
                return string;
            }
        }
        string = string2 + " " + net.minecraft.ab.a.a("enchantment.level." + n2);
        return string;
    }

    public void b(net.minecraft.U.B b10, net.minecraft.U.x x2, int n2) {
    }

    public boolean a(d d10) {
        return this.b.a(d10.w());
    }
}

