/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class au
implements K<a> {
    private /* synthetic */ int a;

    public int a() {
        return this.a;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public au() {
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readByte();
    }

    public au(int n2) {
        this.a = n2;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.a);
    }
}

