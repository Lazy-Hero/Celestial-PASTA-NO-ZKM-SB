/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.o;

import net.minecraft.client.D.h;
import net.minecraft.client.b.ao;
import net.minecraft.client.o.j;
import net.minecraft.client.o.s;

class k
implements Runnable {
    final /* synthetic */ j b;
    final /* synthetic */ String a;
    final /* synthetic */ String c;

    k(j j2, String string, String string2) {
        this.b = j2;
        this.c = string;
        this.a = string2;
    }

    @Override
    public void run() {
        j.c(this.b).a(new ao(new s(this), h.a("multiplayer.texturePrompt.line1", new Object[0]), h.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
    }
}

