/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.n.a;

public class c
implements K<a> {
    private /* synthetic */ long b;
    private /* synthetic */ long a;

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readLong();
        this.b = m2.readLong();
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeLong(this.a);
        m2.writeLong(this.b);
    }

    public long b() {
        return this.b;
    }

    public long a() {
        return this.a;
    }

    public c() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public c(long l2, long l3, boolean bl2) {
        block3: {
            block4: {
                c c10;
                boolean bl3;
                block2: {
                    boolean bl4 = aD.i();
                    this.a = l2;
                    this.b = l3;
                    boolean bl5 = bl4;
                    bl3 = bl2;
                    if (!bl5) break block2;
                    if (bl3) break block3;
                    this.b = -this.b;
                    c10 = this;
                    if (!bl5) break block4;
                    long l4 = c10.b - 0L;
                    bl3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                }
                if (bl3) break block3;
                c10 = this;
            }
            c10.b = -1L;
        }
    }
}

