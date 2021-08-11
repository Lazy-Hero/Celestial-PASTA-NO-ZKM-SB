/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import java.util.List;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.U.x;
import net.minecraft.n.a;

public class aq
implements K<a> {
    private /* synthetic */ int[] b;
    private /* synthetic */ int a;

    public aq() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
        m2.a(this.b);
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public int b() {
        return this.a;
    }

    public int[] a() {
        return this.b;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
        this.b = m2.d();
    }

    public aq(x x2) {
        boolean bl2 = aD.c();
        boolean bl3 = bl2;
        this.a = x2.W();
        List<x> list = x2.j();
        this.b = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.b[i2] = list.get(i2).W();
            if (!bl3) continue;
        }
    }
}

