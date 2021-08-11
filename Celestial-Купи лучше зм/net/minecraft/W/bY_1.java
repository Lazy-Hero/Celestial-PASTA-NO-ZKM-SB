/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class bY
extends K {
    private final /* synthetic */ boolean z;

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.w.k.b(g.as);
    }

    @Override
    public void b(z z2, n n2, i i2) {
        block5: {
            boolean bl2;
            boolean bl3;
            block8: {
                block6: {
                    block7: {
                        block4: {
                            bl3 = cL.e();
                            bl2 = z2.C;
                            if (!bl3) break block4;
                            if (bl2) break block5;
                            bl2 = this.z;
                        }
                        if (!bl3) break block6;
                        if (!bl2) break block7;
                        bl2 = z2.x(n2);
                        if (!bl3) break block6;
                        if (bl2) break block7;
                        z2.a(n2, g.as.d(), 2);
                        if (bl3) break block5;
                    }
                    bl2 = this.z;
                }
                if (!bl3) break block8;
                if (bl2) break block5;
                bl2 = z2.x(n2);
            }
            if (bl3 && bl2) {
                bl2 = z2.a(n2, g.bp.d(), 2);
            }
        }
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block5: {
            boolean bl2;
            boolean bl3;
            block8: {
                block6: {
                    block7: {
                        block4: {
                            bl3 = cL.b();
                            bl2 = z2.C;
                            if (bl3) break block4;
                            if (bl2) break block5;
                            bl2 = this.z;
                        }
                        if (bl3) break block6;
                        if (!bl2) break block7;
                        bl2 = z2.x(n2);
                        if (bl3) break block6;
                        if (bl2) break block7;
                        z2.a(n2, (K)this, 4);
                        if (!bl3) break block5;
                    }
                    bl2 = this.z;
                }
                if (bl3) break block8;
                if (bl2) break block5;
                bl2 = z2.x(n2);
            }
            if (!bl3 && bl2) {
                bl2 = z2.a(n2, g.bp.d(), 2);
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block5: {
            boolean bl2;
            boolean bl3;
            block6: {
                block4: {
                    bl3 = cL.e();
                    bl2 = z2.C;
                    if (!bl3) break block4;
                    if (bl2) break block5;
                    bl2 = this.z;
                }
                if (!bl3) break block6;
                if (!bl2) break block5;
                bl2 = z2.x(n2);
            }
            if (bl3 && !bl2) {
                bl2 = z2.a(n2, g.as.d(), 2);
            }
        }
    }

    public bY(boolean bl2) {
        boolean bl3 = cL.b();
        super(net.minecraft.ac.c.R);
        boolean bl4 = bl3;
        K k2 = this;
        if (!bl4) {
            k2.z = bl2;
            if (bl2) {
                k2 = this.b(1.0f);
            }
        }
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(g.as);
    }

    @Override
    protected d q(i i2) {
        return new d(g.as);
    }
}

