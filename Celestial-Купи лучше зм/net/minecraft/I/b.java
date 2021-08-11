/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.I;

import net.minecraft.I.c;
import net.minecraft.I.d;
import net.minecraft.at.k;

public class b {
    private final /* synthetic */ c a;
    private final /* synthetic */ k b;

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
            b b10 = (b)object2;
            b b11 = this;
            if (string == null) {
                if (b11.a != b10.a) {
                    return false;
                }
                b11 = this;
            }
            k k2 = b11.b;
            if (string == null) {
                if (k2 != null) {
                    return this.b.equals(b10.b);
                }
                k2 = b10.b;
            }
            return k2 == null;
        }
        return false;
    }

    public String toString() {
        return "HoverEvent{action=" + (Object)((Object)this.a) + ", value='" + this.b + '\'' + '}';
    }

    public b(c c10, k k2) {
        this.a = c10;
        this.b = k2;
    }

    public c b() {
        return this.a;
    }

    public k a() {
        return this.b;
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
            return 31 * var2_1 + v1;
        } else {
            v1 = 0;
        }
        return 31 * var2_1 + v1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

