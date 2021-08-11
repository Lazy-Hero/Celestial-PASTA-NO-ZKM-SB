/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.net.UnknownHostException;
import net.minecraft.at.l;
import net.minecraft.client.D.h;
import net.minecraft.client.b.aN;

class a
implements Runnable {
    final /* synthetic */ aN a;

    a(aN aN2) {
        this.a = aN2;
    }

    @Override
    public void run() {
        try {
            aN.b(this.a).c().b(aN.a(this.a));
        }
        catch (UnknownHostException unknownHostException) {
            aN.a((aN)this.a).b = -1L;
            aN.a((aN)this.a).k = (Object)((Object)l.DARK_RED) + h.a("multiplayer.status.cannot_resolve", new Object[0]);
        }
        catch (Exception exception) {
            aN.a((aN)this.a).b = -1L;
            aN.a((aN)this.a).k = (Object)((Object)l.DARK_RED) + h.a("multiplayer.status.cannot_connect", new Object[0]);
        }
    }
}

