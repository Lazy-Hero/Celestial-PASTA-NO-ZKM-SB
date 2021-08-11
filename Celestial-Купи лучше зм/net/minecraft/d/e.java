/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.b;

public class e
implements K<b> {
    private /* synthetic */ int b;
    private /* synthetic */ int a;

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public int b() {
        return this.a;
    }

    public e() {
    }

    public e(int n2, int n3) {
        this.b = n2;
        this.a = n3;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.b);
        m2.writeByte(this.a);
    }

    public int a() {
        return this.b;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readByte();
        this.a = m2.readByte();
    }
}

