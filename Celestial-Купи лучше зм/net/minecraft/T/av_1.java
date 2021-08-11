/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import java.util.Random;
import net.minecraft.K.b;
import net.minecraft.T.S;
import net.minecraft.U.j;
import net.minecraft.u.c;

public class av
implements j {
    public /* synthetic */ b a;

    public void a(Random random) {
        block3: {
            int n2;
            int n3;
            block6: {
                int n4;
                block7: {
                    int[] arrn;
                    block4: {
                        block5: {
                            block1: {
                                block2: {
                                    n4 = random.nextInt(5);
                                    arrn = S.f();
                                    n3 = n4;
                                    n2 = 1;
                                    if (arrn == null) break block1;
                                    if (n3 > n2) break block2;
                                    this.a = c.l;
                                    if (arrn != null) break block3;
                                }
                                n3 = n4;
                                n2 = 2;
                            }
                            if (arrn == null) break block4;
                            if (n3 > n2) break block5;
                            this.a = c.e;
                            if (arrn != null) break block3;
                        }
                        n3 = n4;
                        n2 = 3;
                    }
                    if (arrn == null) break block6;
                    if (n3 > n2) break block7;
                    this.a = c.t;
                    if (arrn != null) break block3;
                }
                n3 = n4;
                n2 = 4;
            }
            if (n3 <= n2) {
                this.a = c.c;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

