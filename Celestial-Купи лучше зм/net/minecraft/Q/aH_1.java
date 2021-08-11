/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import java.util.List;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.n.a;
import net.minecraft.q.s;

public class aH
implements K<a> {
    private /* synthetic */ int b;
    private /* synthetic */ List<s<?>> a;

    public List<s<?>> a() {
        return this.a;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.b);
        net.minecraft.q.m.a(this.a, m2);
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.a();
        this.a = net.minecraft.q.m.b(m2);
    }

    public aH() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public aH(int n2, net.minecraft.q.m m2, boolean bl2) {
        block4: {
            block2: {
                aH aH2;
                block3: {
                    boolean bl3 = aD.i();
                    boolean bl4 = bl3;
                    aH2 = this;
                    if (!bl4) break block2;
                    aH2.b = n2;
                    if (!bl2) break block3;
                    this.a = m2.f();
                    m2.g();
                    if (bl4) break block4;
                }
                aH2 = this;
            }
            aH2.a = m2.d();
        }
    }
}

