/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.D.h;
import net.minecraft.Q.aD;
import net.minecraft.n.a;

public class aw
implements K<a> {
    private /* synthetic */ int b;
    private /* synthetic */ String a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public aw(int n2, h h2) {
        block4: {
            block2: {
                aw aw2;
                block3: {
                    boolean bl2 = aD.i();
                    boolean bl3 = bl2;
                    aw2 = this;
                    if (!bl3) break block2;
                    aw2.b = n2;
                    if (h2 != null) break block3;
                    this.a = "";
                    if (bl3) break block4;
                }
                aw2 = this;
            }
            aw2.a = h2.e();
        }
    }

    public String a() {
        return this.a;
    }

    public aw() {
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public int b() {
        return this.b;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.b);
        m2.a(this.a);
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readByte();
        this.a = m2.c(16);
    }
}

