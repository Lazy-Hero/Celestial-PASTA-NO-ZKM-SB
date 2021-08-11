/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.B;
import net.minecraft.Q.aD;
import net.minecraft.Q.s;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.n.a;

public class P
implements K<a> {
    public /* synthetic */ int b;
    public /* synthetic */ B e;
    public /* synthetic */ k c;
    public /* synthetic */ int d;
    public /* synthetic */ int a;

    public P() {
    }

    public P(net.minecraft.ar.s s2, B b10) {
        this(s2, b10, true);
    }

    @Override
    public void a(m m2) throws IOException {
        block4: {
            block5: {
                P p2;
                B b10;
                B b11;
                block2: {
                    boolean bl2;
                    block3: {
                        this.e = m2.a(B.class);
                        bl2 = aD.c();
                        b11 = this.e;
                        b10 = B.END_COMBAT;
                        if (bl2) break block2;
                        if (b11 != b10) break block3;
                        this.a = m2.a();
                        this.b = m2.readInt();
                        if (!bl2) break block4;
                    }
                    p2 = this;
                    if (bl2) break block5;
                    b11 = p2.e;
                    b10 = B.ENTITY_DIED;
                }
                if (b11 != b10) break block4;
                this.d = m2.a();
                this.b = m2.readInt();
                p2 = this;
            }
            p2.c = m2.m();
        }
    }

    @Override
    public void b(m m2) throws IOException {
        block3: {
            B b10;
            B b11;
            block1: {
                block2: {
                    boolean bl2 = aD.c();
                    m2.a(this.e);
                    boolean bl3 = bl2;
                    b11 = this.e;
                    b10 = B.END_COMBAT;
                    if (bl3) break block1;
                    if (b11 != b10) break block2;
                    m2.d(this.a);
                    m2.writeInt(this.b);
                    if (!bl3) break block3;
                }
                b11 = this.e;
                b10 = B.ENTITY_DIED;
            }
            if (b11 == b10) {
                m2.d(this.d);
                m2.writeInt(this.b);
                m2.a(this.c);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public P(net.minecraft.ar.s var1_1, B var2_2, boolean var3_3) {
        v0 = aD.i();
        super();
        var4_4 = v0;
        this.e = var2_2;
        var5_5 = var1_1.e();
        if (!var4_4) ** GOTO lbl10
        switch (s.a[var2_2.ordinal()]) {
            case 1: {
                this.a = var1_1.b();
lbl10:
                // 2 sources

                v1 = var5_5;
                if (!var4_4) ** GOTO lbl16
                if (v1 == null) {
                    v2 = -1;
                } else {
                    v1 = var5_5;
lbl16:
                    // 2 sources

                    v2 = v1.W();
                }
                this.b = v2;
                if (var4_4 != false) return;
            }
            case 2: {
                this.d = var1_1.a().W();
                v3 = var5_5;
                if (!var4_4) ** GOTO lbl27
                if (v3 == null) {
                    v4 = -1;
                } else {
                    v3 = var5_5;
lbl27:
                    // 2 sources

                    v4 = this.b = v3.W();
                }
                if (!var4_4) ** GOTO lbl31
                if (!var3_3) ** GOTO lbl32
                this.c = var1_1.h();
lbl31:
                // 2 sources

                if (var4_4 != false) return;
lbl32:
                // 2 sources

                this.c = new g("");
                return;
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }
}

