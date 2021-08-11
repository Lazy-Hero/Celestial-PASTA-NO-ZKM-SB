/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import net.minecraft.P.m;
import net.minecraft.P.u;
import net.minecraft.k.n;

public class t {
    protected final /* synthetic */ float c;
    protected final /* synthetic */ float b;
    protected final /* synthetic */ float a;

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        float f10;
        block7: {
            boolean bl2;
            block8: {
                t t2;
                block6: {
                    bl2 = n.g();
                    Object object2 = object;
                    if (bl2) {
                        if (!(object2 instanceof t)) {
                            return false;
                        }
                        object2 = object;
                    }
                    t2 = (t)object2;
                    float f11 = this.a - t2.a;
                    f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (!bl2) break block6;
                    if (f10 != false) break block7;
                    float f12 = this.b - t2.b;
                    f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                }
                if (!bl2) break block8;
                if (f10 != false) break block7;
                float f13 = this.c - t2.c;
                f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
            }
            if (!bl2) return (boolean)f10;
            if (f10 == false) {
                f10 = 1.0f;
                return (boolean)f10;
            }
        }
        f10 = 0.0f;
        return (boolean)f10;
    }

    public u b() {
        u u2 = new u();
        u2.a(new m(this.a));
        u2.a(new m(this.b));
        u2.a(new m(this.c));
        return u2;
    }

    public t(float f10, float f11, float f12) {
        this.a = !Float.isInfinite(f10) && !Float.isNaN(f10) ? f10 % 360.0f : 0.0f;
        this.b = !Float.isInfinite(f11) && !Float.isNaN(f11) ? f11 % 360.0f : 0.0f;
        this.c = !Float.isInfinite(f12) && !Float.isNaN(f12) ? f12 % 360.0f : 0.0f;
    }

    public float c() {
        return this.a;
    }

    public float a() {
        return this.c;
    }

    public float d() {
        return this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public t(u u2) {
        this(u2.f(0), u2.f(1), u2.f(2));
    }
}

