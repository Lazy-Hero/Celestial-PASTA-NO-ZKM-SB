/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.I;

import net.minecraft.I.a;
import net.minecraft.k.m;

public class d {
    private final /* synthetic */ a a;
    private static /* synthetic */ String c;
    private final /* synthetic */ String b;

    static {
        if (d.b() != null) {
            d.b("yIADc");
        }
    }

    public d(a a10, String string) {
        this.a = a10;
        this.b = string;
    }

    public a d() {
        return this.a;
    }

    public boolean equals(Object object) {
        block9: {
            Object object2;
            String string;
            block10: {
                string = d.b();
                Object object3 = this;
                if (string == null) {
                    if (object3 == object) {
                        return true;
                    }
                    object3 = object;
                }
                if (object3 == null) break block9;
                object2 = this.getClass();
                if (string != null) break block10;
                if (object2 != object.getClass()) break block9;
                object2 = object;
            }
            d d10 = (d)object2;
            d d11 = this;
            if (string == null) {
                if (d11.a != d10.a) {
                    return false;
                }
                d11 = this;
            }
            String string2 = d11.b;
            if (string == null) {
                if (string2 != null) {
                    return this.b.equals(d10.b);
                }
                string2 = d10.b;
            }
            return string2 == null;
        }
        return false;
    }

    public String toString() {
        String string;
        block0: {
            String string2 = d.b();
            string = "ClickEvent{action=" + (Object)((Object)this.a) + ", value='" + this.b + '\'' + '}';
            if (m.d()) break block0;
            d.b("tMd6Cc");
        }
        return string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int hashCode() {
        var2_1 = this.a.hashCode();
        var1_2 = d.b();
        v0 = this.b;
        if (var1_2 != null) ** GOTO lbl7
        if (v0 != null) {
            v0 = this.b;
lbl7:
            // 2 sources

            v1 = v0.hashCode();
        } else {
            v1 = 0;
        }
        var2_1 = 31 * var2_1 + v1;
        if (var1_2 == null) return var2_1;
        m.b(m.d() == false);
        return var2_1;
    }

    public static String b() {
        return c;
    }

    public String c() {
        return this.b;
    }

    public static void b(String string) {
        c = string;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

