/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.d;

import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.ah.A;

public class b
implements K<net.minecraft.n.b> {
    private /* synthetic */ UUID a;

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.f();
    }

    @Nullable
    public x a(A a10) {
        return a10.a(this.a);
    }

    public b() {
    }

    public b(UUID uUID) {
        this.a = uUID;
    }

    @Override
    public void a(net.minecraft.n.b b10) {
        b10.a(this);
    }
}

