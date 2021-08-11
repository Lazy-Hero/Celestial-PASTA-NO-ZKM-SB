/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.F.b;

public class a
implements K<b> {
    private /* synthetic */ long a;
    private static /* synthetic */ String[] b;

    static {
        if (net.minecraft.f.a.b() != null) {
            net.minecraft.f.a.b(new String[2]);
        }
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readLong();
    }

    public a() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeLong(this.a);
    }

    public a(long l2) {
        this.a = l2;
    }

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public static String[] b() {
        return b;
    }
}

