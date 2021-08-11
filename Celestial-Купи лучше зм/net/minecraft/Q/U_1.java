/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.ah.e;
import net.minecraft.n.a;

public class U
implements K<a> {
    private /* synthetic */ boolean b;
    private /* synthetic */ e a;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public e a() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = e.a(m2.readUnsignedByte());
    }

    public U() {
    }

    public U(e e10, boolean bl2) {
        this.a = e10;
        this.b = bl2;
    }

    public boolean b() {
        return this.b;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.a.a());
    }
}

