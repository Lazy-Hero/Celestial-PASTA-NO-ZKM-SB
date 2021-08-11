/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 */
package net.minecraft.q;

import com.google.common.base.Optional;
import java.io.IOException;
import java.util.UUID;
import net.minecraft.q.f;
import net.minecraft.q.m;
import net.minecraft.q.r;

final class b
implements f<Optional<UUID>> {
    @Override
    public void a(net.minecraft.C.m m2, Optional<UUID> optional) {
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
            m3.a((UUID)object);
        }
    }

    b() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Optional<UUID> a(net.minecraft.C.m m2) throws IOException {
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
        optional = Optional.of((Object)m3.f());
        return optional;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public r<Optional<UUID>> a(int n2) {
        return new r<Optional<UUID>>(n2, this);
    }

    @Override
    public Optional<UUID> a(Optional<UUID> optional) {
        return optional;
    }
}

