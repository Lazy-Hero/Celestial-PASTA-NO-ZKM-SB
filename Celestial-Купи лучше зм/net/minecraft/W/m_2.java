/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Multimap
 */
package net.minecraft.w;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.UUID;
import net.minecraft.B.X;
import net.minecraft.O.c;
import net.minecraft.O.i;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.W.a3;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.Y;
import net.minecraft.ar.aX;
import net.minecraft.ar.e;
import net.minecraft.ar.t;
import net.minecraft.i.j;
import net.minecraft.j.f;
import net.minecraft.k.n;
import net.minecraft.w.aU;
import net.minecraft.w.af;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class m
extends k {
    public static final /* synthetic */ String[] x;
    private final /* synthetic */ aU z;
    public static final /* synthetic */ c w;
    private static final /* synthetic */ UUID[] v;
    public final /* synthetic */ int t;
    public final /* synthetic */ int s;
    public final /* synthetic */ X A;
    private static final /* synthetic */ int[] y;
    public final /* synthetic */ float u;

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public m(aU aU2, int n2, X x2) {
        this.z = aU2;
        this.A = x2;
        this.s = n2;
        this.t = aU2.b(x2);
        this.d(aU2.a(x2));
        this.u = aU2.e();
        this.f = 1;
        this.a(net.minecraft.ad.a.o);
        a3.B.a(this, w);
    }

    static {
        y = new int[]{13, 15, 16, 11};
        v = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
        x = new String[]{"minecraft:items/empty_armor_slot_boots", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_helmet"};
        w = new af();
    }

    static int[] b() {
        return y;
    }

    public static d a(i i2, d d10) {
        block6: {
            B b10;
            X x2;
            block5: {
                n n2 = i2.e().a(i2.b().b(a3.C));
                List<B> list = i2.a().a(B.class, new net.minecraft.k.k(n2), Predicates.and(net.minecraft.ar.e.e, (Predicate)new Y(d10)));
                int n3 = bl.c();
                Object object = list;
                if (n3 == 0) {
                    if (object.isEmpty()) {
                        return d.m;
                    }
                    object = list.get(0);
                }
                B b11 = (B)object;
                x2 = C.a(d10);
                d d11 = d10.d(1);
                b11.a(x2, d11);
                b10 = b11;
                if (n3 != 0) break block5;
                if (!(b10 instanceof C)) break block6;
                b10 = b11;
            }
            ((C)b10).a(x2, 2.0f);
        }
        return d10;
    }

    @Override
    public Multimap<String, f> a(X x2) {
        Multimap<String, f> multimap;
        block3: {
            block2: {
                multimap = super.a(x2);
                int n2 = bl.g();
                if (n2 == 0) break block2;
                if (x2 != this.A) break block3;
                multimap.put((Object)M.i.c(), (Object)new f(v[x2.a()], "Armor modifier", this.t, 0));
            }
            multimap.put((Object)M.e.c(), (Object)new f(v[x2.a()], "Armor toughness", this.u, 0));
        }
        return multimap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int c(d d10) {
        r r2;
        r r3;
        int n2 = bl.g();
        if (this.z != aU.LEATHER) {
            return 0xFFFFFF;
        }
        r r4 = r3 = d10.v();
        if (n2 != 0) {
            if (r4 == null) return 10511680;
            r4 = r3.h("display");
        }
        r r5 = r2 = r4;
        if (n2 != 0) {
            if (r5 == null) return 10511680;
            r5 = r2;
        }
        int n3 = r5.a("color", 3) ? 1 : 0;
        if (n2 == 0) return n3;
        if (n3 == 0) return 10511680;
        return r2.m("color");
    }

    public void a(d d10, int n2) {
        r r2;
        int n3 = bl.g();
        if (this.z != aU.LEATHER) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        r r3 = r2 = d10.v();
        if (n3 != 0) {
            if (r3 == null) {
                r2 = new r();
                d10.b(r2);
            }
            r3 = r2.h("display");
        }
        r r4 = r3;
        r r5 = r2;
        String string = "display";
        int n4 = 10;
        if (n3 != 0) {
            if (!r5.a(string, n4)) {
                r2.a("display", r4);
            }
            r5 = r4;
            string = "color";
            n4 = n2;
        }
        r5.b(string, n4);
    }

    public aU c() {
        return this.z;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10, d d11) {
        int n2 = bl.g();
        m m2 = this;
        if (n2 != 0) {
            if (m2.z.c() == d11.w()) return true;
            m2 = this;
        }
        boolean bl2 = super.a(d10, d11);
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(d d10) {
        r r2;
        int n2 = bl.c();
        if (this.z != aU.LEATHER) {
            return false;
        }
        r r3 = r2 = d10.v();
        if (n2 == 0) {
            if (r3 == null) return false;
            r3 = r2;
        }
        boolean bl2 = r3.a("display", 10);
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = r2.h("display").a("color", 3);
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public int o() {
        return this.z.d();
    }

    @Override
    public t<d> a(z z2, j j2, net.minecraft.ar.a3 a32) {
        d d10;
        block3: {
            d d11;
            block2: {
                d d12;
                d10 = j2.c(a32);
                int n2 = bl.g();
                X x2 = C.a(d10);
                d11 = d12 = j2.b(x2);
                if (n2 == 0) break block2;
                if (!d11.G()) break block3;
                j2.a(x2, d10.C());
                d11 = d10;
            }
            d11.c(0);
            return new t<d>(aX.SUCCESS, d10);
        }
        return new t<d>(aX.FAIL, d10);
    }

    public void b(d d10) {
        block2: {
            String string;
            r r2;
            block4: {
                r r3;
                r r4;
                int n2;
                block3: {
                    r r5;
                    n2 = bl.c();
                    if (this.z != aU.LEATHER) break block2;
                    r4 = r5 = d10.v();
                    if (n2 != 0) break block3;
                    if (r4 == null) break block2;
                    r4 = r5.h("display");
                }
                r2 = r3 = r4;
                string = "color";
                if (n2 != 0) break block4;
                if (!r2.b(string)) break block2;
                r2 = r3;
                string = "color";
            }
            r2.k(string);
        }
    }

    public X a() {
        return this.A;
    }
}

