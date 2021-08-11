/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ThreadLocalRandom
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.j;

import io.netty.util.internal.ThreadLocalRandom;
import java.util.Random;
import java.util.UUID;
import net.minecraft.k.h;
import net.minecraft.k.m;
import org.apache.commons.lang3.Validate;

public class f {
    private final /* synthetic */ int d;
    private static /* synthetic */ m[] c;
    private /* synthetic */ boolean e;
    private final /* synthetic */ String a;
    private final /* synthetic */ UUID f;
    private final /* synthetic */ double b;

    public String toString() {
        return "AttributeModifier{amount=" + this.b + ", operation=" + this.d + ", name='" + this.a + '\'' + ", id=" + this.f + ", serialize=" + this.e + '}';
    }

    public boolean a() {
        return this.e;
    }

    public f a(boolean bl2) {
        this.e = bl2;
        return this;
    }

    public double f() {
        return this.b;
    }

    static {
        if (net.minecraft.j.f.b() == null) {
            net.minecraft.j.f.b(new m[1]);
        }
    }

    public f(String string, double d10, int n2) {
        this(h.a((Random)ThreadLocalRandom.current()), string, d10, n2);
    }

    public String d() {
        return this.a;
    }

    public f(UUID uUID, String string, double d10, int n2) {
        this.e = true;
        this.f = uUID;
        this.a = string;
        this.b = d10;
        this.d = n2;
        Validate.notEmpty((CharSequence)string, (String)"Modifier name cannot be empty", (Object[])new Object[0]);
        Validate.inclusiveBetween((long)0L, (long)2L, (long)n2, (String)"Invalid operation");
    }

    public boolean equals(Object object) {
        block7: {
            Object object2;
            m[] arrm;
            block8: {
                arrm = net.minecraft.j.f.b();
                Object object3 = this;
                if (arrm != null) {
                    if (object3 == object) {
                        return true;
                    }
                    object3 = object;
                }
                if (object3 == null) break block7;
                object2 = this.getClass();
                if (arrm == null) break block8;
                if (object2 != object.getClass()) break block7;
                object2 = object;
            }
            f f10 = (f)object2;
            UUID uUID = this.f;
            if (arrm != null) {
                if (uUID != null) {
                    return this.f.equals(f10.f);
                }
                uUID = f10.f;
            }
            return uUID == null;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int hashCode() {
        m[] arrm = net.minecraft.j.f.b();
        UUID uUID = this.f;
        if (arrm != null) {
            if (uUID == null) return 0;
            uUID = this.f;
        }
        int n2 = uUID.hashCode();
        return n2;
    }

    public UUID c() {
        return this.f;
    }

    public static m[] b() {
        return c;
    }

    public int e() {
        return this.d;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(m[] arrm) {
        c = arrm;
    }
}

