/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.q.f;
import net.minecraft.q.m;

public class r<T> {
    private final /* synthetic */ f<T> a;
    private final /* synthetic */ int b;

    public f<T> b() {
        return this.a;
    }

    public int a() {
        return this.b;
    }

    public r(int n2, f<T> f10) {
        this.b = n2;
        this.a = f10;
    }

    public boolean equals(Object object) {
        block6: {
            Object object2;
            net.minecraft.k.m[] arrm;
            block7: {
                arrm = m.b();
                Object object3 = this;
                if (arrm != null) {
                    if (object3 == object) {
                        return true;
                    }
                    object3 = object;
                }
                if (object3 == null) break block6;
                object2 = this.getClass();
                if (arrm == null) break block7;
                if (object2 != object.getClass()) break block6;
                object2 = object;
            }
            r r2 = (r)object2;
            int n2 = this.b;
            if (arrm != null) {
                n2 = n2 == r2.b ? 1 : 0;
            }
            return n2 != 0;
        }
        return false;
    }

    public int hashCode() {
        return this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

