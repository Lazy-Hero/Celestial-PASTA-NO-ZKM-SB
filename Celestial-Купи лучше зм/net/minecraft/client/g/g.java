/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.b.aR;
import net.minecraft.client.b.q;
import net.minecraft.client.g.a;
import net.minecraft.client.g.b;

class g
implements b {
    private final /* synthetic */ int a;
    private final /* synthetic */ boolean b;

    @Override
    public k b() {
        return this.a < 0 ? new h("spectatorMenu.previous_page", new Object[0]) : new h("spectatorMenu.next_page", new Object[0]);
    }

    @Override
    public void a(float f10, int n2) {
        block2: {
            block1: {
                int n3;
                block0: {
                    int n4 = net.minecraft.client.g.a.c();
                    Q.P().aN().b(aR.j);
                    n3 = n4;
                    if (n3 != 0) break block0;
                    if (this.a >= 0) break block1;
                    q.a(0.0f, 0.0f, 144.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
                }
                if (n3 == 0) break block2;
            }
            q.a(0.0f, 0.0f, 160.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
        }
    }

    @Override
    public boolean a() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        net.minecraft.client.g.a.a(a10, net.minecraft.client.g.a.a(a10) + this.a);
    }

    public g(int n2, boolean bl2) {
        this.a = n2;
        this.b = bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

