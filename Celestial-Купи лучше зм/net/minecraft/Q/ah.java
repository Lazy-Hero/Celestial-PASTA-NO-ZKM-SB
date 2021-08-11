/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.at.k;
import net.minecraft.n.a;

public class ah
implements K<a> {
    private /* synthetic */ k a;
    private /* synthetic */ net.minecraft.at.a b;

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.m();
        this.b = net.minecraft.at.a.a(m2.readByte());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        boolean bl2 = aD.i();
        net.minecraft.at.a a10 = this.b;
        net.minecraft.at.a a11 = net.minecraft.at.a.SYSTEM;
        if (bl2) {
            if (a10 == a11) return true;
            a10 = this.b;
            a11 = net.minecraft.at.a.GAME_INFO;
        }
        if (a10 != a11) return false;
        return true;
    }

    public ah(k k2) {
        this(k2, net.minecraft.at.a.SYSTEM);
    }

    public ah(k k2, net.minecraft.at.a a10) {
        this.a = k2;
        this.b = a10;
    }

    public net.minecraft.at.a a() {
        return this.b;
    }

    public ah() {
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public k c() {
        return this.a;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
        m2.writeByte(this.b.a());
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

