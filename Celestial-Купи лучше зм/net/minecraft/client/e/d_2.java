/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.E;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.C.p;
import net.minecraft.C.u;
import net.minecraft.X.a;
import net.minecraft.at.h;
import net.minecraft.client.E.e;
import net.minecraft.client.E.l;
import net.minecraft.client.b.U;

class d
extends Thread {
    final /* synthetic */ e a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;

    private static UnknownHostException a(UnknownHostException unknownHostException) {
        return unknownHostException;
    }

    d(e e10, String string, String string2, int n2) {
        this.a = e10;
        this.c = string2;
        this.b = n2;
        super(string);
    }

    @Override
    public void run() {
        InetAddress inetAddress = null;
        String string = l.d();
        try {
            d d10 = this;
            if (string == null) {
                if (e.e(d10.a)) {
                    return;
                }
                d10 = this;
            }
            inetAddress = InetAddress.getByName(d10.c);
            e.a(this.a, u.a(inetAddress, this.b, e.a((e)this.a).ac.i()));
            e.b(this.a).a(new net.minecraft.client.o.p(e.b(this.a), e.h(this.a), e.c(this.a)));
            e.b(this.a).a(new net.minecraft.aa.a(this.c, this.b, p.LOGIN));
            e.b(this.a).a(new a(e.f(this.a).aR().c()));
        }
        catch (UnknownHostException unknownHostException) {
            e e10 = this.a;
            if (string == null) {
                if (e.e(e10)) {
                    return;
                }
                e.a().error("[NeverHook Network] Couldn't connect to server", (Throwable)unknownHostException);
                e10 = this.a;
            }
            e.d(e10).a(new U(e.c(this.a), "connect.failed", new h("disconnect.genericReason", "Unknown host")));
        }
        catch (Exception exception) {
            if (string == null) {
                if (e.e(this.a)) {
                    return;
                }
                e.a().error("[NeverHook Network] Couldn't connect to server", (Throwable)exception);
            }
            String string2 = exception.toString();
            if (inetAddress != null) {
                String string3 = inetAddress + ":" + this.b;
                string2 = string2.replaceAll(string3, "");
            }
            e.g(this.a).a(new U(e.c(this.a), "connect.failed", new h("disconnect.genericReason", string2)));
        }
    }
}

