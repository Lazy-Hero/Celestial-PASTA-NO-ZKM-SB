/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class q
implements f<String> {
    @Override
    public void a(m m2, String string) {
        m2.a(string);
    }

    @Override
    public String a(String string) {
        return string;
    }

    @Override
    public String a(m m2) throws IOException {
        return m2.c(32767);
    }

    q() {
    }

    @Override
    public r<String> a(int n2) {
        return new r<String>(n2, this);
    }
}

