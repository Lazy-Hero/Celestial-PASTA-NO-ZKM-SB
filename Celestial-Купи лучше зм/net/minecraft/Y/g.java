/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
package net.minecraft.y;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.T.aX;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.aB;
import net.minecraft.Z.i;
import net.minecraft.a.o;
import net.minecraft.ac.c;
import net.minecraft.ag.W;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.y.b;
import net.minecraft.y.d;
import net.minecraft.y.f;

public class g {
    private /* synthetic */ int k;
    private /* synthetic */ int h;
    private /* synthetic */ z a;
    private /* synthetic */ n e;
    private final /* synthetic */ Map<String, Integer> g;
    private /* synthetic */ int j;
    private /* synthetic */ int d;
    private final /* synthetic */ List<d> b;
    private final /* synthetic */ List<f> l;
    private /* synthetic */ n f;
    private /* synthetic */ int c;
    private /* synthetic */ int i;

    private void h() {
        block5: {
            int n2;
            String string;
            block6: {
                int n3;
                block7: {
                    n3 = this.b.size();
                    string = net.minecraft.y.b.f();
                    n2 = n3;
                    if (string != null) break block6;
                    if (n2 != 0) break block7;
                    this.f = n.o;
                    this.c = 0;
                    if (string == null) break block5;
                }
                this.f = new n(this.e.e() / n3, this.e.b() / n3, this.e.a() / n3);
                n2 = 0;
            }
            int n4 = n2;
            for (d d10 : this.b) {
                n4 = Math.max(d10.a(this.f), n4);
                if (string == null) {
                    if (string == null) continue;
                }
                break block5;
            }
            this.c = Math.max(32, (int)Math.sqrt(n4) + 1);
        }
    }

    private l a(n n2, int n3, int n4, int n5) {
        int n6 = 0;
        String string = net.minecraft.y.b.f();
        while (n6 < 10) {
            n n7 = n2.a(this.a.J.nextInt(16) - 8, this.a.J.nextInt(6) - 3, this.a.J.nextInt(16) - 8);
            if (string == null) {
                if (this.c(n7) && this.a(new n(n3, n4, n5), n7)) {
                    return new l(n7.e(), n7.b(), n7.a());
                }
                ++n6;
            }
            if (string == null) continue;
        }
        return null;
    }

    public List<d> e() {
        return this.b;
    }

    public void a(z z2) {
        this.a = z2;
    }

    public void b(int n2) {
        block9: {
            l l2;
            g g10;
            block11: {
                int n3;
                block10: {
                    int n4;
                    String string;
                    block8: {
                        this.i = n2;
                        String string2 = net.minecraft.y.b.f();
                        this.i();
                        string = string2;
                        this.f();
                        int n5 = n2 % 20;
                        if (string == null) {
                            if (n5 == 0) {
                                this.c();
                            }
                            n5 = n2 % 30;
                        }
                        if (string == null) {
                            if (n5 == 0) {
                                this.a();
                            }
                            n5 = this.h / 10;
                        }
                        int n6 = n5;
                        n3 = this.k;
                        n4 = n6;
                        if (string != null) break block8;
                        if (n3 >= n4) break block9;
                        n3 = this.b.size();
                        if (string != null) break block10;
                        n4 = 20;
                    }
                    if (n3 <= n4) break block9;
                    g10 = this;
                    if (string != null) break block11;
                    n3 = g10.a.J.nextInt(7000);
                }
                if (n3 != 0) break block9;
                g10 = this;
            }
            if ((l2 = g10.a(this.f, 2, 4, 2)) != null) {
                aX aX2 = new aX(this.a);
                aX2.g(l2.e, l2.d, l2.b);
                this.a.f(aX2);
                ++this.k;
            }
        }
    }

    public g() {
        this.b = Lists.newArrayList();
        this.e = n.o;
        this.f = n.o;
        this.g = Maps.newHashMap();
        this.l = Lists.newArrayList();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int b(String string) {
        Integer n2 = this.g.get(string);
        String string2 = net.minecraft.y.b.f();
        Integer n3 = n2;
        if (string2 == null) {
            if (n3 == null) {
                return 0;
            }
            n3 = n2;
        }
        int n4 = n3;
        return n4;
    }

    public void a(int n2) {
        Iterator<String> iterator = this.g.keySet().iterator();
        String string = net.minecraft.y.b.f();
        while (iterator.hasNext()) {
            String string2 = iterator.next();
            this.a(string2, n2);
            if (string == null) continue;
        }
    }

    public void a(r r2) {
        block8: {
            String string;
            block7: {
                r2.b("PopSize", this.h);
                r2.b("Radius", this.c);
                r2.b("Golems", this.k);
                String string2 = net.minecraft.y.b.f();
                r2.b("Stable", this.d);
                r2.b("Tick", this.i);
                r2.b("MTick", this.j);
                r2.b("CX", this.f.e());
                r2.b("CY", this.f.b());
                r2.b("CZ", this.f.a());
                r2.b("ACX", this.e.e());
                string = string2;
                r2.b("ACY", this.e.b());
                r2.b("ACZ", this.e.a());
                u u2 = new u();
                for (d object : this.b) {
                    r r3 = new r();
                    r3.b("X", object.i().e());
                    r3.b("Y", object.i().b());
                    r3.b("Z", object.i().a());
                    r3.b("IDX", object.f());
                    r3.b("IDZ", object.e());
                    r3.b("TS", object.j());
                    u2.a(r3);
                    if (string == null) {
                        if (string == null) continue;
                        m.b(!m.c());
                        break;
                    }
                    break block7;
                }
                r2.a("Doors", u2);
            }
            u u3 = new u();
            for (String string3 : this.g.keySet()) {
                block9: {
                    r r4 = new r();
                    o o2 = this.a.H().au();
                    try {
                        GameProfile gameProfile = o2.a(string3);
                        if (string != null) break block8;
                        if (string == null) {
                            if (gameProfile == null) break block9;
                            r4.a("UUID", gameProfile.getId().toString());
                            r4.b("S", this.g.get(string3));
                        }
                        u3.a(r4);
                    }
                    catch (RuntimeException runtimeException) {
                        // empty catch block
                    }
                }
                if (string == null) continue;
            }
            r2.a("Players", u3);
        }
    }

    public void d() {
        this.j = this.i;
    }

    private boolean d(n n2) {
        i i2 = this.a.d(n2);
        String string = net.minecraft.y.b.f();
        K k2 = i2.b();
        boolean bl2 = k2 instanceof aB;
        if (string == null) {
            if (bl2) {
                return i2.o() == net.minecraft.ac.c.k;
            }
            bl2 = false;
        }
        return bl2;
    }

    public int k() {
        return this.i - this.d;
    }

    public int j() {
        return this.c;
    }

    public void b(B b10) {
        block3: {
            Iterator<f> iterator = this.l.iterator();
            String string = net.minecraft.y.b.f();
            while (iterator.hasNext()) {
                block5: {
                    block4: {
                        f f10 = iterator.next();
                        if (string != null) break block3;
                        f f11 = f10;
                        if (string != null) break block4;
                        if (f11.a != b10) break block5;
                        f11 = f10;
                    }
                    f11.b = this.i;
                    return;
                }
                if (string == null) continue;
            }
            this.l.add(new f(this, b10, this.i));
        }
    }

    public void b(r r2) {
        block8: {
            Object object;
            r r3;
            String string;
            block7: {
                this.h = r2.m("PopSize");
                string = net.minecraft.y.b.f();
                this.c = r2.m("Radius");
                this.k = r2.m("Golems");
                this.d = r2.m("Stable");
                this.i = r2.m("Tick");
                this.j = r2.m("MTick");
                this.f = new n(r2.m("CX"), r2.m("CY"), r2.m("CZ"));
                this.e = new n(r2.m("ACX"), r2.m("ACY"), r2.m("ACZ"));
                u u2 = r2.c("Doors", 10);
                for (int i2 = 0; i2 < u2.b(); ++i2) {
                    r3 = u2.d(i2);
                    if (string == null) {
                        r r4 = r3;
                        object = new d(new n(r4.m("X"), r4.m("Y"), r4.m("Z")), r4.m("IDX"), r4.m("IDZ"), r4.m("TS"));
                        this.b.add((d)object);
                        if (string == null) continue;
                    }
                    break block7;
                }
                r3 = r2;
            }
            u u3 = r3.c("Players", 10);
            for (int i3 = 0; i3 < u3.b(); ++i3) {
                Object object2 = object = u3.d(i3);
                if (string != null) continue;
                if (((r)object2).b("UUID")) {
                    object2 = this.a;
                    if (string != null) continue;
                    if (object2 != null) {
                        object2 = this.a.H();
                        if (string != null) continue;
                        if (object2 != null) {
                            GameProfile gameProfile;
                            o o2 = this.a.H().au();
                            Object object3 = gameProfile = o2.a(UUID.fromString(((r)object).j("UUID")));
                            if (string == null && object3 != null) {
                                object3 = this.g.put(gameProfile.getName(), ((r)object).m("S"));
                            }
                            if (string == null) continue;
                        }
                    }
                }
                object2 = this.g.put(((r)object).j("Name"), ((r)object).m("S"));
                if (string == null) continue;
            }
            if (m.d()) break block8;
            net.minecraft.y.b.b("OGv25b");
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public B c(B var1_1) {
        block7: {
            block6: {
                var3_2 = 1.7976931348623157E308;
                var2_3 = net.minecraft.y.b.f();
                var5_4 = null;
                var6_5 = 0;
                while (var6_5 < this.l.size()) {
                    var7_6 = this.l.get(var6_5);
                    var8_7 = var7_6.a.s(var1_1);
                    if (var2_3 == null) {
                        if (var2_3 == null) {
                            if (var8_7 <= var3_2) {
                                var5_4 = var7_6;
                                var3_2 = var8_7;
                            }
                            ++var6_5;
                        }
                        if (var2_3 == null) continue;
                    }
                    break block6;
                }
                v0 = var5_4;
                if (var2_3 == null) {
                    if (v0 == null) {
                        return null;
                    } else {
                        ** GOTO lbl21
                    }
                }
                break block7;
            }
            v0 = var5_4;
        }
        v1 = v0.a;
        return v1;
    }

    public void a(d d10) {
        this.b.add(d10);
        this.e = this.e.b(d10.i());
        this.h();
        this.d = d10.j();
    }

    public int m() {
        return this.h;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean l() {
        String string = net.minecraft.y.b.f();
        int n2 = this.j;
        if (string != null) return n2 != 0;
        if (n2 == 0) return 1 != 0;
        n2 = this.i - this.j;
        if (string != null) return n2 != 0;
        if (n2 < 3600) return 0 != 0;
        return 1 != 0;
    }

    private void c() {
        block3: {
            g g10;
            block2: {
                List<W> list = this.a.a(W.class, new k(this.f.e() - this.c, this.f.b() - 4, this.f.a() - this.c, this.f.e() + this.c, this.f.b() + 4, this.f.a() + this.c));
                String string = net.minecraft.y.b.f();
                this.h = list.size();
                g10 = this;
                if (string != null) break block2;
                if (g10.h != 0) break block3;
                g10 = this;
            }
            g10.g.clear();
        }
    }

    private void f() {
        Iterator<f> iterator = this.l.iterator();
        String string = net.minecraft.y.b.f();
        while (iterator.hasNext()) {
            block5: {
                block4: {
                    int n2;
                    block3: {
                        f f10 = iterator.next();
                        n2 = f10.a.aL();
                        if (string != null) break block3;
                        if (n2 == 0) break block4;
                        n2 = Math.abs(this.i - f10.b);
                    }
                    if (n2 <= 300) break block5;
                }
                iterator.remove();
            }
            if (string == null) continue;
        }
    }

    public boolean c(n n2) {
        String string = net.minecraft.y.b.f();
        double d10 = this.f.b(n2) - (double)(this.c * this.c);
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (string == null) {
            d11 = d11 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    private void i() {
        block11: {
            int n2;
            block7: {
                int n3 = 0;
                String string = net.minecraft.y.b.f();
                int n4 = this.a.J.nextInt(50);
                if (string == null) {
                    n4 = n4 == 0 ? 1 : 0;
                }
                int n5 = n4;
                Iterator<d> iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    block10: {
                        int n6;
                        d d10;
                        block8: {
                            block9: {
                                d10 = iterator.next();
                                n2 = n5;
                                if (string != null) break block7;
                                if (string == null) {
                                    if (n2 != 0) {
                                        d10.b();
                                    }
                                    n6 = this.d(d10.i());
                                }
                                if (string != null) break block8;
                                if (n6 == false) break block9;
                                n6 = Math.abs(this.i - d10.j());
                                if (string != null) break block8;
                                if (n6 <= 1200) break block10;
                            }
                            this.e = this.e.c(d10.i());
                            n6 = 1;
                        }
                        n3 = n6;
                        d10.a(true);
                        iterator.remove();
                    }
                    if (string == null) continue;
                }
                n2 = n3;
            }
            if (n2 == 0) break block11;
            this.h();
        }
    }

    public int a(String string, int n2) {
        int n3 = this.b(string);
        int n4 = net.minecraft.k.h.c(n3 + n2, -30, 10);
        this.g.put(string, n4);
        return n4;
    }

    @Nullable
    public d e(n n2) {
        String string = net.minecraft.y.b.f();
        g g10 = this;
        if (string == null) {
            if (g10.f.b(n2) > (double)(this.c * this.c)) {
                return null;
            }
            g10 = this;
        }
        for (d d10 : g10.b) {
            block7: {
                d d11;
                block9: {
                    int n3;
                    int n4;
                    block8: {
                        block6: {
                            n4 = d10.i().e();
                            n3 = n2.e();
                            if (string != null) break block6;
                            if (n4 != n3) break block7;
                            n4 = d10.i().a();
                            n3 = n2.a();
                        }
                        if (string != null) break block8;
                        if (n4 != n3) break block7;
                        d11 = d10;
                        if (string != null) break block9;
                        n4 = Math.abs(d11.i().b() - n2.b());
                        n3 = 1;
                    }
                    if (n4 > n3) break block7;
                    d11 = d10;
                }
                return d11;
            }
            if (string == null) continue;
        }
        return null;
    }

    public boolean g() {
        return this.b.isEmpty();
    }

    public boolean a(String string) {
        String string2 = net.minecraft.y.b.f();
        boolean bl2 = this.b(string);
        if (string2 == null) {
            bl2 = bl2 <= BADBOOL -15;
        }
        return bl2;
    }

    public d b(n n2) {
        d d10;
        block5: {
            d d11 = null;
            int n3 = Integer.MAX_VALUE;
            String string = net.minecraft.y.b.f();
            Iterator<d> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                block8: {
                    int n4;
                    block12: {
                        int n5;
                        d d12;
                        block11: {
                            aA aA2;
                            n n6;
                            block10: {
                                block9: {
                                    block6: {
                                        int n7;
                                        block7: {
                                            d10 = d12 = iterator.next();
                                            if (string != null) break block5;
                                            n7 = n5 = d10.a(n2);
                                            if (string != null) break block6;
                                            if (n7 <= 256) break block7;
                                            n5 *= 1000;
                                            if (string == null) break block6;
                                        }
                                        n7 = n5 = d12.c();
                                    }
                                    if (n5 >= n3) break block8;
                                    n6 = d12.i();
                                    aA2 = d12.d();
                                    n4 = this.a.d(n6.a(aA2, 1)).b().a((t)this.a, n6.a(aA2, 1));
                                    if (string != null) break block9;
                                    if (n4 == 0) break block8;
                                    n4 = this.a.d(n6.a(aA2, -1)).b().a((t)this.a, n6.a(aA2, -1)) ? 1 : 0;
                                }
                                if (string != null) break block10;
                                if (n4 == 0) break block8;
                                n4 = this.a.d(n6.a().a(aA2, 1)).b().a((t)this.a, n6.a().a(aA2, 1)) ? 1 : 0;
                            }
                            if (string != null) break block11;
                            if (n4 == 0) break block8;
                            n4 = this.a.d(n6.a().a(aA2, -1)).b().a((t)this.a, n6.a().a(aA2, -1)) ? 1 : 0;
                        }
                        if (string != null) break block12;
                        if (n4 == 0) break block8;
                        d11 = d12;
                        n4 = n5;
                    }
                    n3 = n4;
                }
                if (string == null) continue;
            }
            d10 = d11;
        }
        return d10;
    }

    public int n() {
        return this.b.size();
    }

    public g(z z2) {
        this.b = Lists.newArrayList();
        this.e = n.o;
        this.f = n.o;
        this.g = Maps.newHashMap();
        this.l = Lists.newArrayList();
        this.a = z2;
    }

    public n b() {
        return this.f;
    }

    public d a(n n2) {
        d d10;
        block3: {
            d d11 = null;
            String string = net.minecraft.y.b.f();
            int n3 = Integer.MAX_VALUE;
            Iterator<d> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                d d12;
                d10 = d12 = iterator.next();
                if (string == null) {
                    int n4;
                    int n5 = n4 = d10.a(n2);
                    if (string == null && n5 < n3) {
                        d11 = d12;
                        n5 = n3 = n4;
                    }
                    if (string == null) continue;
                }
                break block3;
            }
            d10 = d11;
        }
        return d10;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public j a(B b10) {
        double d10 = Double.MAX_VALUE;
        String string = net.minecraft.y.b.f();
        j j2 = null;
        for (String string2 : this.g.keySet()) {
            block6: {
                double d11;
                j j3;
                j j4;
                block7: {
                    g g10;
                    block5: {
                        g10 = this;
                        if (string != null) break block5;
                        if (!g10.a(string2)) break block6;
                        g10 = this;
                    }
                    j3 = j4 = g10.a.c(string2);
                    if (string != null) break block7;
                    if (j3 == null) break block6;
                    j3 = j4;
                }
                double d12 = d11 = j3.s(b10);
                if (string == null && d12 <= d10) {
                    j2 = j4;
                    d12 = d10 = d11;
                }
            }
            if (string == null) continue;
        }
        return j2;
    }

    private void a() {
        List<aX> list = this.a.a(aX.class, new k(this.f.e() - this.c, this.f.b() - 4, this.f.a() - this.c, this.f.e() + this.c, this.f.b() + 4, this.f.a() + this.c));
        this.k = list.size();
    }

    private boolean a(n n2, n n3) {
        int n4;
        block8: {
            String string = net.minecraft.y.b.f();
            int n5 = this.a.d(n3.k()).d();
            if (string == null) {
                if (n5 == 0) {
                    return false;
                }
                n5 = n3.e() - n2.e() / 2;
            }
            int n6 = n5;
            int n7 = n3.a() - n2.a() / 2;
            int n8 = n6;
            block0: while (true) {
                int n9 = n8;
                block1: while (n9 < n6 + n2.e()) {
                    n4 = n3.b();
                    if (string != null) break block8;
                    int n10 = n4;
                    block2: while (true) {
                        int n11 = n10;
                        block3: while (n11 < n3.b() + n2.b()) {
                            n9 = n7;
                            if (string != null) continue block1;
                            for (int i2 = v2195874; i2 < n7 + n2.a(); ++i2) {
                                boolean bl2;
                                n11 = this.a.d(new n(n8, n10, i2)).r() ? 1 : 0;
                                if (string != null) continue block3;
                                if (string == null) {
                                    if (n11 == 0) continue;
                                    bl2 = false;
                                }
                                return bl2;
                            }
                            ++n10;
                            if (string == null) continue block2;
                        }
                        break;
                    }
                    ++n8;
                    if (string == null) continue block0;
                }
                break;
            }
            n4 = 1;
        }
        return n4 != 0;
    }
}

