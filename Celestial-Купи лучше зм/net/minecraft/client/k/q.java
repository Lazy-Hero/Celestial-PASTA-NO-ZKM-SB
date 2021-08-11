/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  javax.annotation.Nullable
 */
package net.minecraft.client.k;

import com.google.common.util.concurrent.FutureCallback;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.annotation.Nullable;
import net.minecraft.c.f;
import net.minecraft.client.Q;
import net.minecraft.client.k.a;
import net.minecraft.client.k.g;
import net.minecraft.client.k.h;
import net.minecraft.client.k.m;
import net.minecraft.client.k.s;

class q
implements FutureCallback<List<Object>> {
    final /* synthetic */ m b;
    final /* synthetic */ h c;
    final /* synthetic */ g a;

    public void a(@Nullable List<Object> list) {
        h h2;
        block5: {
            block6: {
                h h3;
                block7: {
                    block8: {
                        int[] arrn = s.r();
                        g.a(this.a, this.c);
                        int[] arrn2 = arrn;
                        this.c.b().lock();
                        try {
                            h2 = this.c;
                            if (arrn2 == null) break block5;
                            if (h2.a() == net.minecraft.client.k.a.UPLOADING) break block6;
                            h3 = this.c;
                            if (arrn2 == null) break block7;
                        }
                        catch (Throwable throwable) {
                            this.c.b().unlock();
                            throw throwable;
                        }
                        if (h3.d()) break block8;
                        g.c().warn("Chunk render task was {} when I expected it to be uploading; aborting task", (Object)this.c.a());
                    }
                    h3 = this.c;
                }
                h3.b().unlock();
                return;
            }
            this.c.a(net.minecraft.client.k.a.DONE);
            h2 = this.c;
        }
        h2.b().unlock();
        this.c.i().a(this.b);
    }

    q(g g10, h h2, m m2) {
        this.a = g10;
        this.c = h2;
        this.b = m2;
    }

    public void onFailure(Throwable throwable) {
        block2: {
            boolean bl2;
            block1: {
                int[] arrn = s.r();
                g.a(this.a, this.c);
                int[] arrn2 = arrn;
                bl2 = throwable instanceof CancellationException;
                if (arrn2 == null) break block1;
                if (bl2) break block2;
                bl2 = throwable instanceof InterruptedException;
            }
            if (!bl2) {
                Q.P().b(f.a(throwable, "Rendering chunk"));
            }
        }
    }

    private static CancellationException a(CancellationException cancellationException) {
        return cancellationException;
    }
}

