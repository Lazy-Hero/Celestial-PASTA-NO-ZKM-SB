/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class a3
implements K<a> {
    private /* synthetic */ int b;
    private /* synthetic */ int a;

    public a3(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public int b() {
        return this.b;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeInt(this.a);
        m2.writeInt(this.b);
    }

    public int a() {
        return this.a;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readInt();
        this.b = m2.readInt();
    }

    public a3() {
    }
}

