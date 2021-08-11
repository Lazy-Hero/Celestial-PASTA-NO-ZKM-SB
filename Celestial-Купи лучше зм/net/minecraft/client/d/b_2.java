/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import net.minecraft.client.D.h;

public class b
implements Comparable<b> {
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ String a;
    private final /* synthetic */ String c;

    private static gP a(gP gP2) {
        return gP2;
    }

    public b(String string, String string2, String string3, boolean bl2) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl2 = h.b();
        Object object2 = this;
        if (!bl2) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl3 = object2 instanceof b;
        if (!bl2) {
            if (!bl3) return false;
            bl3 = this.a.equals(((b)object).a);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.d;
    }

    public String toString() {
        return String.format("%s (%s)", this.c, this.b);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int a(b b10) {
        return this.a.compareTo(b10.a);
    }
}

