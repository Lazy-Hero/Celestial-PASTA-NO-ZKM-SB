/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.P;

import net.minecraft.P.h;

public class g {
    private /* synthetic */ long a;
    private final /* synthetic */ long b;
    public static final /* synthetic */ g c;

    public void a(long l2) {
        this.a += l2 / 8L;
        if (this.a > this.b) {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.a + "bytes where max allowed: " + this.b);
        }
    }

    static {
        c = new h(0L);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public g(long l2) {
        this.b = l2;
    }
}

