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
import net.minecraft.ar.v;
import net.minecraft.n.a;

public class D
implements K<a> {
    @Nullable
    private /* synthetic */ v a;

    public D() {
    }

    @Nullable
    public v a() {
        return this.a;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(m m2) throws IOException {
        block0: {
            if (!m2.readBoolean()) break block0;
            this.a = m2.e();
        }
    }

    @Override
    public void b(m m2) throws IOException {
        block0: {
            m2.writeBoolean(this.a != null);
            if (this.a == null) break block0;
            m2.a(this.a);
        }
    }

    public D(@Nullable v v2) {
        this.a = v2;
    }
}

