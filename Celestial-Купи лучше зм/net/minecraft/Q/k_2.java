/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 */
package net.minecraft.q;

import com.google.common.base.Optional;
import java.io.IOException;
import net.minecraft.k.n;
import net.minecraft.q.f;
import net.minecraft.q.m;
import net.minecraft.q.r;

final class k
implements f<Optional<n>> {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Optional<n> a(net.minecraft.C.m m2) throws IOException {
        Optional optional;
        net.minecraft.k.m[] arrm = m.b();
        net.minecraft.C.m m3 = m2;
        if (arrm != null) {
            if (!m3.readBoolean()) {
                optional = Optional.absent();
                return optional;
            }
            m3 = m2;
        }
        optional = Optional.of((Object)m3.l());
        return optional;
    }

    @Override
    public void a(net.minecraft.C.m m2, Optional<n> optional) {
        block3: {
            Object object;
            net.minecraft.C.m m3;
            block2: {
                net.minecraft.k.m[] arrm = m.b();
                m3 = m2;
                object = optional;
                if (arrm == null) break block2;
                m3.writeBoolean(object.isPresent());
                if (!optional.isPresent()) break block3;
                m3 = m2;
                object = optional.get();
            }
            m3.a((n)object);
        }
    }

    k() {
    }

    @Override
    public Optional<n> a(Optional<n> optional) {
        return optional;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public r<Optional<n>> a(int n2) {
        return new r<Optional<n>>(n2, this);
    }
}

