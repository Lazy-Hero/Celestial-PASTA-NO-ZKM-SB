/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.Q;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.n.a;

public class L
implements K<a> {
    public /* synthetic */ int a;

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
    }

    public L() {
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Nullable
    public x a(z z2) {
        return z2.a(this.a);
    }

    public L(x x2) {
        this.a = x2.W();
    }
}

