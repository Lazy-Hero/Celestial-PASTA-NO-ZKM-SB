/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.ar.aC;
import net.minecraft.client.a.I;
import net.minecraft.client.a.aK;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.k.s;
import net.minecraft.client.y.c;

public class aM
extends aK {
    private void a() {
        block4: {
            int n2;
            block2: {
                block3: {
                    String string = I.j();
                    n2 = fU.ag();
                    if (string != null) break block2;
                    if (n2 == 0) break block3;
                    as.e();
                    if (string == null) break block4;
                }
                v.c(3, 5126, 28, 0);
                v.a(4, 5121, 28, 12);
                v.b(2, 5126, 28, 16);
                as.f(as.p);
                v.b(2, 5122, 28, 24);
                n2 = as.U;
            }
            as.f(n2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(aC aC2) {
        block5: {
            block3: {
                aM aM2;
                String string;
                block4: {
                    string = I.j();
                    aM2 = this;
                    if (string != null) break block4;
                    if (!aM2.d) break block5;
                    aM2 = this;
                }
                for (s s2 : aM2.b) {
                    c c10 = s2.a(aC2.ordinal());
                    v.M();
                    this.a(s2);
                    s2.n();
                    c10.b();
                    this.a();
                    c10.a(7);
                    v.B();
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block3;
                }
                as.g(as.n, 0);
                v.p();
            }
            this.b.clear();
        }
    }
}

