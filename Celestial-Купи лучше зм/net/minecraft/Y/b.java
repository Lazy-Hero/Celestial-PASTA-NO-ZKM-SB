/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.y;

import net.minecraft.P.r;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class b {
    private static /* synthetic */ String d;
    private /* synthetic */ int c;
    private /* synthetic */ d b;
    private /* synthetic */ int e;
    private /* synthetic */ d f;
    private /* synthetic */ d a;
    private /* synthetic */ boolean g;

    public boolean j() {
        String string = net.minecraft.y.b.f();
        int n2 = this.c;
        if (string == null) {
            n2 = n2 >= this.e ? 1 : 0;
        }
        return n2 != 0;
    }

    static {
        if (net.minecraft.y.b.f() != null) {
            net.minecraft.y.b.b("TshTNb");
        }
    }

    public void a(r r2) {
        block10: {
            block9: {
                String string;
                block8: {
                    block7: {
                        r r3 = r2.h("buy");
                        this.a = new d(r3);
                        r r4 = r2.h("sell");
                        string = net.minecraft.y.b.f();
                        this.b = new d(r4);
                        boolean bl2 = r2.a("buyB", 10);
                        if (string == null) {
                            if (bl2) {
                                this.f = new d(r2.h("buyB"));
                            }
                            bl2 = r2.a("uses", 99);
                        }
                        if (string == null) {
                            if (bl2) {
                                this.c = r2.m("uses");
                            }
                            bl2 = r2.a("maxUses", 99);
                        }
                        if (!bl2) break block7;
                        this.e = r2.m("maxUses");
                        if (string == null) break block8;
                    }
                    this.e = 7;
                }
                if (!r2.a("rewardExp", 1)) break block9;
                this.g = r2.f("rewardExp");
                if (string == null) break block10;
            }
            this.g = true;
        }
    }

    public b(d d10, d d11) {
        this(d10, net.minecraft.w.d.m, d11);
    }

    public d d() {
        return this.f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b() {
        return this.e;
    }

    public b(d d10, d d11, d d12, int n2, int n3) {
        this.a = net.minecraft.w.d.m;
        this.f = net.minecraft.w.d.m;
        this.b = net.minecraft.w.d.m;
        this.a = d10;
        this.f = d11;
        this.b = d12;
        this.c = n2;
        this.e = n3;
        this.g = true;
    }

    public static void b(String string) {
        d = string;
    }

    public d k() {
        return this.a;
    }

    public b(r r2) {
        this.a = net.minecraft.w.d.m;
        this.f = net.minecraft.w.d.m;
        this.b = net.minecraft.w.d.m;
        this.a(r2);
    }

    public void a(int n2) {
        this.e += n2;
    }

    public int c() {
        return this.c;
    }

    public b(d d10, d d11, d d12) {
        this(d10, d11, d12, 0, 7);
    }

    public void h() {
        ++this.c;
    }

    public static String f() {
        return d;
    }

    public r e() {
        r r2 = new r();
        String string = net.minecraft.y.b.f();
        r2.a("buy", this.a.a(new r()));
        String string2 = string;
        r2.a("sell", this.b.a(new r()));
        if (string2 == null) {
            if (!this.f.G()) {
                r2.a("buyB", this.f.a(new r()));
            }
            r2.b("uses", this.c);
            r2.b("maxUses", this.e);
            r2.a("rewardExp", this.g);
        }
        return r2;
    }

    public void a() {
        this.c = this.e;
    }

    public boolean i() {
        String string = net.minecraft.y.b.f();
        boolean bl2 = this.f.G();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public boolean g() {
        return this.g;
    }

    public d l() {
        return this.b;
    }

    public b(d d10, k k2) {
        this(d10, new d(k2));
    }
}

