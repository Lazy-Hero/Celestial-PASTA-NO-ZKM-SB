/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.as;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.C.p;
import net.minecraft.C.u;
import net.minecraft.X.a;
import net.minecraft.as.g;
import net.minecraft.as.k;
import net.minecraft.as.l;
import net.minecraft.as.q;
import net.minecraft.at.h;
import net.minecraft.client.Q;

class n
extends Thread {
    final /* synthetic */ int b;
    final /* synthetic */ String a;
    final /* synthetic */ q c;

    private static UnknownHostException a(UnknownHostException unknownHostException) {
        return unknownHostException;
    }

    n(q q2, String string, String string2, int n2) {
        this.c = q2;
        this.a = string2;
        this.b = n2;
        super(string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        block16: {
            block17: {
                var2_1 = null;
                var1_2 = k.m();
                var2_1 = InetAddress.getByName(this.a);
                v0 = q.c(this.c);
                if (var1_2 != 0) {
                    if (v0) {
                        return;
                    }
                    q.a(this.c, u.a(var2_1, this.b, Q.P().ac.i()));
                    v0 = q.c(this.c);
                }
                if (var1_2 != 0) {
                    if (v0) {
                        return;
                    }
                    q.a(this.c).a(new net.minecraft.client.o.p(q.a(this.c), Q.P(), q.b(this.c).d()));
                    v0 = q.c(this.c);
                }
                if (var1_2 == 0) break block16;
                if (!v0) break block17;
                return;
            }
            q.a(this.c).a(new net.minecraft.aa.a(this.a, this.b, p.LOGIN));
            v1 = this.c;
            if (var1_2 == 0) ** GOTO lbl31
            v0 = q.c(v1);
        }
        try {
            if (v0) {
                return;
            }
            v1 = this.c;
lbl31:
            // 2 sources

            q.a(v1).a(new a(Q.P().aR().c()));
            return;
        }
        catch (UnknownHostException var3_3) {
            g.j();
            if (var1_2 == 0) return;
            if (q.c(this.c)) {
                return;
            }
            q.b().error("Couldn't connect to world", (Throwable)var3_3);
            g.a(new l(q.b(this.c), "connect.failed", new h("disconnect.genericReason", new Object[]{"Unknown host '" + this.a + "'"})));
            return;
        }
        catch (Exception var3_4) {
            g.j();
            if (var1_2 != 0) {
                if (q.c(this.c)) {
                    return;
                }
                q.b().error("Couldn't connect to world", (Throwable)var3_4);
            }
            var4_5 = var3_4.toString();
            if (var2_1 != null) {
                var5_6 = var2_1 + ":" + this.b;
                var4_5 = var4_5.replaceAll(var5_6, "");
            }
            g.a(new l(q.b(this.c), "connect.failed", new h("disconnect.genericReason", new Object[]{var4_5})));
        }
    }
}

