/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;
import net.minecraft.w.d;

public class aZ
implements K<a> {
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ d a;

    public int c() {
        return this.b;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.b);
        m2.writeShort(this.c);
        m2.a(this.a);
    }

    public d a() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readByte();
        this.c = m2.readShort();
        this.a = m2.j();
    }

    public aZ() {
        this.a = d.m;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public aZ(int n2, int n3, d d10) {
        this.a = d.m;
        this.b = n2;
        this.c = n3;
        this.a = d10.C();
    }

    public int b() {
        return this.c;
    }
}

