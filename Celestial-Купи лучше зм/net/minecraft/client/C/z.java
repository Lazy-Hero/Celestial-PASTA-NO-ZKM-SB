/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.U.B;
import net.minecraft.ar.b;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.r.s;
import net.minecraft.client.w.n;
import net.minecraft.w.d;

public class z
implements w<B> {
    protected final /* synthetic */ s<?> a;

    private void a(B b10, d d10, net.minecraft.client.x.d d11, b b11) {
        block6: {
            boolean bl2;
            boolean bl3;
            block7: {
                boolean bl4;
                block5: {
                    bl3 = m.d();
                    bl4 = d10.G();
                    if (bl3) break block5;
                    if (bl4) break block6;
                    v.M();
                    this.a(b11);
                    if (bl3) break block7;
                    bl4 = b10.a4();
                }
                if (bl4) {
                    v.b(0.0f, 0.2f, 0.0f);
                }
                v.a(-90.0f, 1.0f, 0.0f, 0.0f);
                v.a(180.0f, 0.0f, 1.0f, 0.0f);
            }
            boolean bl5 = bl2 = b11 == b.LEFT;
            if (!bl3) {
                bl5 = bl5 ? BADBOOL -1 : true;
            }
            v.b((float)bl5 / 16.0f, 0.125f, -0.625f);
            Q.P().X().a(b10, d10, d11, bl2);
            v.B();
        }
    }

    public z(s<?> s2) {
        this.a = s2;
    }

    @Override
    public void a(B b10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block6: {
            z z2;
            d d10;
            block7: {
                boolean bl2;
                d d11;
                block4: {
                    boolean bl3;
                    block5: {
                        bl3 = m.d();
                        boolean bl4 = b10.al() == b.RIGHT;
                        d10 = bl4 ? b10.b() : b10.av();
                        d11 = bl4 ? b10.av() : b10.b();
                        bl2 = d10.G();
                        if (bl3) break block4;
                        if (!bl2) break block5;
                        bl2 = d11.G();
                        if (bl3) break block4;
                        if (bl2) break block6;
                    }
                    v.M();
                    z2 = this;
                    if (bl3) break block7;
                    bl2 = z2.a.b().h;
                }
                if (bl2) {
                    float f17 = 0.5f;
                    v.b(0.0f, 0.75f, 0.0f);
                    v.d(0.5f, 0.5f, 0.5f);
                }
                this.a(b10, d11, net.minecraft.client.x.d.THIRD_PERSON_RIGHT_HAND, b.RIGHT);
                z2 = this;
            }
            z2.a(b10, d10, net.minecraft.client.x.d.THIRD_PERSON_LEFT_HAND, b.LEFT);
            v.B();
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected void a(b b10) {
        ((n)this.a.b()).a(0.0625f, b10);
    }
}

