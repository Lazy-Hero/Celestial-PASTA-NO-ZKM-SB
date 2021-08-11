/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.P.r;

public class g {
    public /* synthetic */ boolean d;
    private static /* synthetic */ String f;
    private /* synthetic */ float h;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean g;
    public /* synthetic */ boolean e;
    public /* synthetic */ boolean c;
    private /* synthetic */ float a;

    public static void b(String string) {
        f = string;
    }

    public void b(r r2) {
        block4: {
            String string;
            r r3;
            String string2;
            block3: {
                string2 = net.minecraft.i.g.b();
                r3 = r2;
                string = "abilities";
                if (string2 != null) break block3;
                if (!r3.a(string, 10)) break block4;
                r3 = r2;
                string = "abilities";
            }
            r r4 = r3.h(string);
            this.b = r4.f("invulnerable");
            this.e = r4.f("flying");
            this.d = r4.f("mayfly");
            this.g = r4.f("instabuild");
            boolean bl2 = r4.a("flySpeed", 99);
            if (string2 == null) {
                if (bl2) {
                    this.a = r4.d("flySpeed");
                    this.h = r4.d("walkSpeed");
                }
                bl2 = r4.a("mayBuild", 1);
            }
            if (bl2) {
                this.c = r4.f("mayBuild");
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        if (net.minecraft.i.g.b() != null) {
            net.minecraft.i.g.b("trmB8");
        }
    }

    public void a(r r2) {
        r r3 = new r();
        r3.a("invulnerable", this.b);
        r3.a("flying", this.e);
        r3.a("mayfly", this.d);
        r3.a("instabuild", this.g);
        r3.a("mayBuild", this.c);
        r3.a("flySpeed", this.a);
        r3.a("walkSpeed", this.h);
        r2.a("abilities", r3);
    }

    public void a(float f10) {
        this.a = f10;
    }

    public g() {
        this.c = true;
        this.a = 0.05f;
        this.h = 0.1f;
    }

    public float c() {
        return this.h;
    }

    public void b(float f10) {
        this.h = f10;
    }

    public float a() {
        return this.a;
    }

    public static String b() {
        return f;
    }
}

