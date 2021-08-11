/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import net.minecraft.C.m;
import net.minecraft.e.a;
import net.minecraft.e.i;
import net.minecraft.k.h;

public class f {
    public /* synthetic */ float i;
    public /* synthetic */ boolean j;
    public /* synthetic */ f n;
    public /* synthetic */ float h;
    public final /* synthetic */ int f;
    public final /* synthetic */ int m;
    public /* synthetic */ float c;
    public final /* synthetic */ int g;
    public /* synthetic */ int l;
    public /* synthetic */ a b;
    public /* synthetic */ float e;
    public /* synthetic */ float k;
    public /* synthetic */ float d;
    private final /* synthetic */ int a;

    public float b(f f10) {
        float f11 = f10.g - this.g;
        float f12 = f10.m - this.m;
        float f13 = f10.f - this.f;
        return net.minecraft.k.h.a(f11 * f11 + f12 * f12 + f13 * f13);
    }

    public float a(f f10) {
        float f11 = f10.g - this.g;
        float f12 = f10.m - this.m;
        float f13 = f10.f - this.f;
        return f11 * f11 + f12 * f12 + f13 * f13;
    }

    public boolean a() {
        int n2 = net.minecraft.e.i.n();
        boolean bl2 = this.l;
        if (n2 != 0) {
            bl2 = bl2 >= false;
        }
        return bl2;
    }

    public f a(int n2, int n3, int n4) {
        f f10 = new f(n2, n3, n4);
        f10.l = this.l;
        f10.d = this.d;
        f10.c = this.c;
        f10.h = this.h;
        f10.n = this.n;
        f10.j = this.j;
        f10.i = this.i;
        f10.k = this.k;
        f10.e = this.e;
        f10.b = this.b;
        return f10;
    }

    public f(int n2, int n3, int n4) {
        this.l = -1;
        this.b = net.minecraft.e.a.BLOCKED;
        this.g = n2;
        this.m = n3;
        this.f = n4;
        this.a = net.minecraft.e.f.b(n2, n3, n4);
    }

    public String toString() {
        return this.g + ", " + this.m + ", " + this.f;
    }

    public static f a(m m2) {
        f f10 = new f(m2.readInt(), m2.readInt(), m2.readInt());
        f10.i = m2.readFloat();
        f10.k = m2.readFloat();
        f10.e = m2.readFloat();
        f10.j = m2.readBoolean();
        f10.b = net.minecraft.e.a.values()[m2.readInt()];
        f10.h = m2.readFloat();
        return f10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int hashCode() {
        return this.a;
    }

    public float c(f f10) {
        float f11 = Math.abs(f10.g - this.g);
        float f12 = Math.abs(f10.m - this.m);
        float f13 = Math.abs(f10.f - this.f);
        return f11 + f12 + f13;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n2 = net.minecraft.e.i.g();
        Object object2 = object;
        if (n2 == 0) {
            if (!(object2 instanceof f)) {
                return false;
            }
            object2 = object;
        }
        f f10 = (f)object2;
        int n3 = this.a;
        int n4 = f10.a;
        if (n2 == 0) {
            if (n3 != n4) return 0 != 0;
            n3 = this.g;
            n4 = f10.g;
        }
        if (n2 == 0) {
            if (n3 != n4) return 0 != 0;
            n3 = this.m;
            n4 = f10.m;
        }
        if (n2 == 0) {
            if (n3 != n4) return 0 != 0;
            n3 = this.f;
            if (n2 != 0) return n3 != 0;
            n4 = f10.f;
        }
        if (n3 != n4) return 0 != 0;
        return 1 != 0;
    }

    public static int b(int n2, int n3, int n4) {
        int n5 = net.minecraft.e.i.g();
        int n6 = n2;
        if (n5 == 0) {
            n6 = n6 < 0 ? Integer.MIN_VALUE : 0;
        }
        int n7 = n3 & 0xFF | (n2 & 0x7FFF) << 8 | (n4 & 0x7FFF) << 24 | n6;
        int n8 = n4;
        if (n5 == 0) {
            n8 = n8 < 0 ? 32768 : 0;
        }
        return n7 | n8;
    }
}

