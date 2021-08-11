/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft;

import net.minecraft.a4;
import net.minecraft.aN;
import net.minecraft.aR;

public class aG<T extends aR> {
    private static /* synthetic */ boolean b;
    private final /* synthetic */ T c;
    private final /* synthetic */ String a;
    private final /* synthetic */ aN d;

    public void a(a4 a42) {
        a42.b(this.d, this.a);
    }

    public static boolean b() {
        return b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl2 = aG.a();
        Object object2 = this;
        if (!bl2) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (object2 == null) return false;
        Object object3 = this.getClass();
        if (!bl2) {
            if (object3 != object.getClass()) return false;
            object3 = object;
        }
        aG aG2 = (aG)object3;
        boolean bl3 = this.c.equals(aG2.c);
        if (!bl2) {
            if (!bl3) {
                return false;
            }
            bl3 = this.d.equals(aG2.d);
        }
        if (!bl2) {
            if (!bl3) return false;
            bl3 = this.a.equals(aG2.a);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int hashCode() {
        int n2 = this.c.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + this.a.hashCode();
        return n2;
    }

    static {
        if (aG.a()) {
            aG.b(true);
        }
    }

    public aG(T t2, aN aN2, String string) {
        this.c = t2;
        this.d = aN2;
        this.a = string;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public T c() {
        return this.c;
    }

    public static boolean a() {
        boolean bl2 = aG.b();
        return !bl2;
    }
}

