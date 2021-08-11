/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.E;

import net.minecraft.P.r;
import net.minecraft.client.E.c;
import net.minecraft.client.E.l;

public class a {
    private /* synthetic */ c a;
    public /* synthetic */ String h;
    public /* synthetic */ int g;
    public /* synthetic */ String c;
    public /* synthetic */ String d;
    public /* synthetic */ String j;
    private /* synthetic */ String f;
    public /* synthetic */ String k;
    private /* synthetic */ boolean e;
    public /* synthetic */ boolean l;
    public /* synthetic */ long b;
    public /* synthetic */ String i;

    public c a() {
        return this.a;
    }

    public String d() {
        return this.f;
    }

    public a(String string, String string2, boolean bl2) {
        this.g = 340;
        this.i = "1.12.2";
        this.a = net.minecraft.client.E.c.PROMPT;
        this.c = string;
        this.h = string2;
        this.e = bl2;
    }

    public static a a(r r2) {
        a a10;
        block7: {
            block5: {
                String string;
                block6: {
                    boolean bl2;
                    block4: {
                        a10 = new a(r2.j("name"), r2.j("ip"), false);
                        string = net.minecraft.client.E.l.d();
                        bl2 = r2.a("icon", 8);
                        if (string == null) {
                            if (bl2) {
                                a10.a(r2.j("icon"));
                            }
                            bl2 = r2.a("acceptTextures", 1);
                        }
                        if (string != null) break block4;
                        if (!bl2) break block5;
                        bl2 = r2.f("acceptTextures");
                    }
                    if (!bl2) break block6;
                    a10.a(net.minecraft.client.E.c.ENABLED);
                    if (string == null) break block7;
                }
                a10.a(net.minecraft.client.E.c.DISABLED);
                if (string == null) break block7;
            }
            a10.a(net.minecraft.client.E.c.PROMPT);
        }
        return a10;
    }

    public void a(String string) {
        this.f = string;
    }

    public r c() {
        r r2;
        block5: {
            c c10;
            c c11;
            block3: {
                block4: {
                    r2 = new r();
                    String string = net.minecraft.client.E.l.d();
                    r2.a("name", this.c);
                    r2.a("ip", this.h);
                    String string2 = string;
                    a a10 = this;
                    if (string2 == null) {
                        if (a10.f != null) {
                            r2.a("icon", this.f);
                        }
                        a10 = this;
                    }
                    c11 = a10.a;
                    c10 = net.minecraft.client.E.c.ENABLED;
                    if (string2 != null) break block3;
                    if (c11 != c10) break block4;
                    r2.a("acceptTextures", true);
                    if (string2 == null) break block5;
                }
                c11 = this.a;
                c10 = net.minecraft.client.E.c.DISABLED;
            }
            if (c11 == c10) {
                r2.a("acceptTextures", false);
            }
        }
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(c c10) {
        this.a = c10;
    }

    public void a(a a10) {
        this.h = a10.h;
        this.c = a10.c;
        this.a(a10.a());
        this.f = a10.f;
        this.e = a10.e;
    }

    public boolean b() {
        return this.e;
    }
}

