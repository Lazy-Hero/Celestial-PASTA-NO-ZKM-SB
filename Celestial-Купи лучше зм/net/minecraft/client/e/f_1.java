/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.E;

import net.minecraft.c.k;
import net.minecraft.client.E.l;

class f
implements k<String> {
    final /* synthetic */ l a;

    private static Exception a(Exception exception) {
        return exception;
    }

    f(l l2) {
        this.a = l2;
    }

    public String a() throws Exception {
        return l.c(this.a).ae() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
    }
}

