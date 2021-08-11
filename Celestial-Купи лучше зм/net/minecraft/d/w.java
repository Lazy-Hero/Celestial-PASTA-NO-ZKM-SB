/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.d.z;
import net.minecraft.n.b;

public class w
implements K<b> {
    private /* synthetic */ String a;

    public String a() {
        return this.a;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.c(256);
    }

    public w(String string) {
        int[] arrn = z.b();
        int[] arrn2 = arrn;
        if (arrn2 != null) {
            if (string.length() > 256) {
                string = string.substring(0, 256);
            }
            this.a = string;
        }
    }

    public w() {
    }
}

