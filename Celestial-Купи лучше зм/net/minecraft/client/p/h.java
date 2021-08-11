/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.client.p;

import com.google.common.base.Predicate;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.client.p.m;
import net.minecraft.client.x.W;

public class h {
    private static /* synthetic */ String b;
    private final /* synthetic */ W c;
    private final /* synthetic */ m d;

    public int hashCode() {
        return 31 * this.d.hashCode() + this.c.hashCode();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String string = h.b();
        Object object2 = this;
        if (string != null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl2 = object2 instanceof h;
        if (string == null) return bl2;
        if (!bl2) return false;
        h h2 = (h)object;
        bl2 = this.d.equals(h2.d);
        if (string == null) return bl2;
        if (!bl2) return false;
        return this.c.equals(h2.c);
    }

    public static String b() {
        return b;
    }

    static {
        if (h.b() == null) {
            h.b("JcoJG");
        }
    }

    public static void b(String string) {
        b = string;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public W a() {
        return this.c;
    }

    public Predicate<i> a(c c10) {
        return this.d.a(c10);
    }

    public h(m m2, W w2) {
        if (m2 == null) {
            throw new IllegalArgumentException("Missing condition for selector");
        }
        if (w2 == null) {
            throw new IllegalArgumentException("Missing variant for selector");
        }
        this.d = m2;
        this.c = w2;
    }
}

