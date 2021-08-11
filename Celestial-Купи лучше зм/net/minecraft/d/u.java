/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.b;

public class u
implements K<b> {
    private /* synthetic */ boolean b;
    private /* synthetic */ boolean a;

    public boolean b() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readBoolean();
        this.a = m2.readBoolean();
    }

    public u(boolean bl2, boolean bl3) {
        this.b = bl2;
        this.a = bl3;
    }

    public u() {
    }

    public boolean a() {
        return this.b;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeBoolean(this.b);
        m2.writeBoolean(this.a);
    }
}

