/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.s;

public class W
extends L {
    private final /* synthetic */ String z;
    private final /* synthetic */ String y;

    @Override
    protected void a(s s2) throws IOException {
        this.m.a((L)null);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.a(0, 0, (double)h, (double)w, -12574688, -11530224);
        this.b(this.v, this.z, h / 2, 90, 0xFFFFFF);
        this.b(this.v, this.y, h / 2, 110, 0xFFFFFF);
        super.a(n2, n3, f10);
    }

    public W(String string, String string2) {
        this.z = string;
        this.y = string2;
    }

    @Override
    public void r() {
        super.r();
        this.t.add(new s(0, h / 2 - 100, 140, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
    }
}

