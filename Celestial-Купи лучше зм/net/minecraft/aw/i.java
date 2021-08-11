/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aw;

import net.minecraft.aw.C;
import net.minecraft.aw.w;

public class i {
    private final /* synthetic */ byte c;
    private final /* synthetic */ byte a;
    private final /* synthetic */ byte b;
    private final /* synthetic */ C d;

    public boolean equals(Object object) {
        byte by2;
        block13: {
            byte by3;
            block12: {
                String[] arrstring = w.d();
                Object object2 = this;
                if (arrstring != null) {
                    if (object2 == object) {
                        return true;
                    }
                    object2 = object;
                }
                if (arrstring != null) {
                    if (!(object2 instanceof i)) {
                        return false;
                    }
                    object2 = object;
                }
                i i2 = (i)object2;
                i i3 = this;
                if (arrstring != null) {
                    if (i3.d != i2.d) {
                        return false;
                    }
                    i3 = this;
                }
                by2 = i3.a;
                by3 = i2.a;
                if (arrstring != null) {
                    if (by2 != by3) {
                        return false;
                    }
                    by2 = this.c;
                    by3 = i2.c;
                }
                if (arrstring == null) break block12;
                if (by2 != by3) {
                    return false;
                }
                by2 = this.b;
                if (arrstring == null) break block13;
                by3 = i2.b;
            }
            by2 = by2 == by3 ? (byte)1 : 0;
        }
        return by2 != 0;
    }

    public byte c() {
        return this.b;
    }

    public byte a() {
        return this.c;
    }

    public byte b() {
        return this.a;
    }

    public int hashCode() {
        int n2 = this.d.c();
        n2 = 31 * n2 + this.c;
        n2 = 31 * n2 + this.b;
        n2 = 31 * n2 + this.a;
        return n2;
    }

    public boolean e() {
        return this.d.d();
    }

    public i(C c10, byte by2, byte by3, byte by4) {
        this.d = c10;
        this.c = by2;
        this.b = by3;
        this.a = by4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public byte d() {
        return this.d.c();
    }

    public C f() {
        return this.d;
    }
}

