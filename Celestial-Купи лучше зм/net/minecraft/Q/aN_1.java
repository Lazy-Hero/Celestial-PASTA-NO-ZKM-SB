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
import net.minecraft.K.b;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.n.a;

public class aN
implements K<a> {
    private /* synthetic */ int a;
    private /* synthetic */ b b;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public aN() {
    }

    public aN(int n2, b b10) {
        this.a = n2;
        this.b = b10;
    }

    @Nullable
    public b a() {
        return this.b;
    }

    @Nullable
    public x a(z z2) {
        return z2.a(this.a);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
        this.b = net.minecraft.K.b.a(m2.readUnsignedByte());
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
        m2.writeByte(net.minecraft.K.b.a(this.b));
    }
}

