/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 */
package net.minecraft.client.o;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import net.minecraft.client.E.a;
import net.minecraft.client.E.c;
import net.minecraft.client.E.p;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.ai;
import net.minecraft.client.o.j;
import net.minecraft.client.o.k;
import net.minecraft.d.d;

class s
implements ai {
    final /* synthetic */ k a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(boolean bl2, int n2) {
        a a10;
        block7: {
            block9: {
                a a11;
                block8: {
                    int[] arrn;
                    block4: {
                        block6: {
                            a a12;
                            block5: {
                                int[] arrn2 = j.b();
                                j.a(this.a.b, Q.P());
                                a10 = j.c(this.a.b).s();
                                arrn = arrn2;
                                if (!bl2) break block4;
                                a12 = a10;
                                if (arrn == null) break block5;
                                if (a12 == null) break block6;
                                a12 = a10;
                            }
                            a12.a(c.ENABLED);
                        }
                        j.b(this.a.b).a(new d(net.minecraft.d.k.ACCEPTED));
                        Futures.addCallback(j.c(this.a.b).aa().a(this.a.c, this.a.a), (FutureCallback)j.a(this.a.b));
                        if (arrn != null) break block7;
                    }
                    a11 = a10;
                    if (arrn == null) break block8;
                    if (a11 == null) break block9;
                    a11 = a10;
                }
                a11.a(c.DISABLED);
            }
            j.b(this.a.b).a(new d(net.minecraft.d.k.DECLINED));
        }
        p.b(a10);
        j.c(this.a.b).a((L)null);
    }

    s(k k2) {
        this.a = k2;
    }
}

