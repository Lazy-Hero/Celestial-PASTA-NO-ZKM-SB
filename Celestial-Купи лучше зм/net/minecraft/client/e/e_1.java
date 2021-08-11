/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.E;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.C.u;
import net.minecraft.at.g;
import net.minecraft.client.D.h;
import net.minecraft.client.E.a;
import net.minecraft.client.E.d;
import net.minecraft.client.E.l;
import net.minecraft.client.E.q;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.s;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e
extends L {
    private static final /* synthetic */ Logger y;
    private static final /* synthetic */ AtomicInteger z;
    private /* synthetic */ boolean C;
    private final /* synthetic */ L A;
    private /* synthetic */ u B;

    static u a(e e10, u u2) {
        e10.B = u2;
        return e10.B;
    }

    static L c(e e10) {
        return e10.A;
    }

    @Override
    public void e() {
        block3: {
            u u2;
            block4: {
                block5: {
                    String string;
                    block2: {
                        string = net.minecraft.client.E.l.d();
                        u2 = this.B;
                        if (string != null) break block2;
                        if (u2 == null) break block3;
                        u2 = this.B;
                    }
                    if (string != null) break block4;
                    if (!u2.j()) break block5;
                    this.B.i();
                    if (string == null) break block3;
                }
                u2 = this.B;
            }
            u2.e();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public e(L l2, Q q2, a a10) {
        P.a = a10;
        this.m = q2;
        this.A = l2;
        q q3 = q.b(a10.h);
        q2.a((l)null);
        q2.a(a10);
        this.a(q3.a(), q3.b());
    }

    private void a(String string, int n2) {
        y.info("[NeverHook Network] Connecting to {}, {}", (Object)string, (Object)n2);
        new d(this, "Server Connector #" + z.incrementAndGet(), string, n2).start();
    }

    static boolean e(e e10) {
        return e10.C;
    }

    static Q a(e e10) {
        return e10.m;
    }

    static Q h(e e10) {
        return e10.m;
    }

    static u b(e e10) {
        return e10.B;
    }

    static Q d(e e10) {
        return e10.m;
    }

    @Override
    public void r() {
        this.t.clear();
        this.t.add(new s(0, h / 2 - 100, w / 4 + 120 + 12, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
    }

    static Q f(e e10) {
        return e10.m;
    }

    @Override
    protected void a(s s2) throws IOException {
        block6: {
            String string;
            block5: {
                string = net.minecraft.client.E.l.d();
                if (string != null) break block5;
                if (s2.g != 0) break block6;
                this.C = true;
            }
            e e10 = this;
            if (string == null) {
                if (e10.B != null) {
                    this.B.a(new g("Aborted"));
                }
                e10 = this;
            }
            e10.m.a(this.A);
        }
    }

    static Logger a() {
        return y;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block4: {
            e e10;
            block2: {
                block3: {
                    String string = net.minecraft.client.E.l.d();
                    this.n();
                    String string2 = string;
                    e10 = this;
                    if (string2 != null) break block2;
                    if (e10.B != null) break block3;
                    this.b(this.v, net.minecraft.client.D.h.a("connect.connecting", new Object[0]), h / 2, w / 2 - 50, 0xFFFFFF);
                    if (string2 == null) break block4;
                }
                e10 = this;
            }
            e10.b(this.v, net.minecraft.client.D.h.a("connect.authorizing", new Object[0]), h / 2, w / 2 - 50, 0xFFFFFF);
        }
        super.a(n2, n3, f10);
    }

    static {
        z = new AtomicInteger(0);
        y = LogManager.getLogger();
    }

    public e(L l2, Q q2, String string, int n2) {
        this.m = q2;
        this.A = l2;
        q2.a((l)null);
        this.a(string, n2);
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
    }

    static Q g(e e10) {
        return e10.m;
    }
}

