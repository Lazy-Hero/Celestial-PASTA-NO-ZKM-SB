/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.b;
import net.minecraft.w.d;

public class E
implements K<b> {
    private /* synthetic */ d a;
    private /* synthetic */ int b;

    @Override
    public void b(m m2) throws IOException {
        m2.writeShort(this.b);
        m2.a(this.a);
    }

    public E() {
        this.a = d.m;
    }

    public int a() {
        return this.b;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readShort();
        this.a = m2.j();
    }

    public E(int n2, d d10) {
        this.a = d.m;
        this.b = n2;
        this.a = d10.C();
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public d b() {
        return this.a;
    }
}

