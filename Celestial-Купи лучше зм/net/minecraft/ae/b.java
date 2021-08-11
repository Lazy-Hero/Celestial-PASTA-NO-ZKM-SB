/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
package net.minecraft.ae;

import com.google.common.base.MoreObjects;
import net.minecraft.ae.a;
import net.minecraft.k.m;

public abstract class b<T extends Comparable<T>>
implements a<T> {
    private final /* synthetic */ Class<T> b;
    private final /* synthetic */ String a;
    private static /* synthetic */ String[] c;

    @Override
    public Class<T> b() {
        return this.b;
    }

    public static String[] b() {
        return c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String[] arrstring = net.minecraft.ae.b.b();
        Object object2 = this;
        if (arrstring != null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (arrstring != null) {
            if (!(object2 instanceof b)) {
                return false;
            }
            object2 = object;
        }
        b b10 = (b)object2;
        boolean bl2 = this.b.equals(b10.b);
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = this.a.equals(b10.a);
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    static {
        if (net.minecraft.ae.b.b() == null) {
            net.minecraft.ae.b.b(new String[2]);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public static void b(String[] arrstring) {
        c = arrstring;
    }

    public int hashCode() {
        return 31 * this.b.hashCode() + this.a.hashCode();
    }

    public String toString() {
        String string;
        block0: {
            String[] arrstring = net.minecraft.ae.b.b();
            string = MoreObjects.toStringHelper((Object)this).add("name", (Object)this.a).add("clazz", this.b).add("values", this.a()).toString();
            if (!m.c()) break block0;
            net.minecraft.ae.b.b(new String[2]);
        }
        return string;
    }

    protected b(String string, Class<T> class_) {
        this.b = class_;
        this.a = string;
    }

    @Override
    public String c() {
        return this.a;
    }
}

