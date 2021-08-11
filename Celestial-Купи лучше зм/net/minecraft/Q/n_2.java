/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 */
package net.minecraft.q;

import com.google.common.base.Optional;
import java.io.IOException;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.q.f;
import net.minecraft.q.m;
import net.minecraft.q.r;

final class n
implements f<Optional<i>> {
    private static Exception a(Exception exception) {
        return exception;
    }

    n() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Optional<i> a(net.minecraft.C.m m2) throws IOException {
        Optional optional;
        int n2 = m2.a();
        net.minecraft.k.m[] arrm = m.b();
        int n3 = n2;
        if (arrm != null) {
            if (n3 == 0) {
                optional = Optional.absent();
                return optional;
            }
            n3 = n2;
        }
        optional = Optional.of((Object)K.a(n3));
        return optional;
    }

    @Override
    public r<Optional<i>> a(int n2) {
        return new r<Optional<i>>(n2, this);
    }

    @Override
    public void a(net.minecraft.C.m m2, Optional<i> optional) {
        block2: {
            block1: {
                net.minecraft.k.m[] arrm;
                block0: {
                    arrm = m.b();
                    if (arrm == null) break block0;
                    if (!optional.isPresent()) break block1;
                    m2.d(K.l((i)optional.get()));
                }
                if (arrm != null) break block2;
            }
            m2.d(0);
        }
    }

    @Override
    public Optional<i> a(Optional<i> optional) {
        return optional;
    }
}

