/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.n.a;

public class aS
implements K<a> {
    private /* synthetic */ String[] a;

    @Override
    public void b(m m2) throws IOException {
        boolean bl2 = aD.c();
        m2.d(this.a.length);
        boolean bl3 = bl2;
        for (String string : this.a) {
            m2.a(string);
            if (!bl3) continue;
        }
    }

    public aS(String[] arrstring) {
        this.a = arrstring;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = new String[m2.a()];
        boolean bl2 = aD.i();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = m2.c(32767);
            if (bl2) continue;
        }
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public String[] a() {
        return this.a;
    }

    public aS() {
    }
}

