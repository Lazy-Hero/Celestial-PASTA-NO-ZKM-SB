/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class a9
implements K<a> {
    private /* synthetic */ String a;
    private /* synthetic */ String b;

    public String a() {
        return this.b;
    }

    public a9() {
    }

    public a9(String string, String string2) {
        this.a = string;
        this.b = string2;
        if (string2.length() > 40) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + string2.length() + ")");
        }
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
        m2.a(this.b);
    }

    public String b() {
        return this.a;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.c(32767);
        this.b = m2.c(40);
    }
}

