/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.as;

import net.minecraft.C.u;
import net.minecraft.as.g;
import net.minecraft.as.k;
import net.minecraft.as.n;
import net.minecraft.at.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class q {
    private volatile /* synthetic */ boolean b;
    private static final /* synthetic */ Logger c;
    private final /* synthetic */ k a;
    private /* synthetic */ u d;

    static boolean c(q q2) {
        return q2.b;
    }

    static u a(q q2, u u2) {
        q2.d = u2;
        return q2.d;
    }

    static Logger b() {
        return c;
    }

    public q(k k2) {
        this.a = k2;
    }

    static k b(q q2) {
        return q2.a;
    }

    public void c() {
        block3: {
            u u2;
            block4: {
                block5: {
                    int n2;
                    block2: {
                        n2 = k.k();
                        u2 = this.d;
                        if (n2 != 0) break block2;
                        if (u2 == null) break block3;
                        u2 = this.d;
                    }
                    if (n2 != 0) break block4;
                    if (!u2.j()) break block5;
                    this.d.i();
                    if (n2 == 0) break block3;
                }
                u2 = this.d;
            }
            u2.e();
        }
    }

    public void a(String string, int n2) {
        g.a(true);
        new n(this, "Realms-connect-task", string, n2).start();
    }

    static u a(q q2) {
        return q2.d;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a() {
        block3: {
            u u2;
            block4: {
                int n2;
                block2: {
                    this.b = true;
                    n2 = k.k();
                    u2 = this.d;
                    if (n2 != 0) break block2;
                    if (u2 == null) break block3;
                    u2 = this.d;
                }
                if (n2 != 0) break block4;
                if (!u2.j()) break block3;
                this.d.a(new h("disconnect.genericReason", new Object[0]));
                u2 = this.d;
            }
            u2.e();
        }
    }

    static {
        c = LogManager.getLogger();
    }
}

