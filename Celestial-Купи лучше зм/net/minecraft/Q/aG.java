/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class aG
implements K<a> {
    private /* synthetic */ int a;

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readUnsignedByte();
    }

    public aG() {
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.a);
    }

    public aG(int n2) {
        this.a = n2;
    }
}

