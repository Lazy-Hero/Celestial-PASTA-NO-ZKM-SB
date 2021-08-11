/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.E;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import net.minecraft.P.f;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.client.E.a;
import net.minecraft.client.E.l;
import net.minecraft.client.Q;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p {
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ Q b;
    private final /* synthetic */ List<a> c;

    static {
        a = LogManager.getLogger();
    }

    public void b(int n2) {
        this.c.remove(n2);
    }

    public void a(int n2, a a10) {
        this.c.set(n2, a10);
    }

    public int a() {
        return this.c.size();
    }

    public void b() {
        String string = l.d();
        try {
            r r2;
            this.c.clear();
            r r3 = r2 = f.a(new File(this.b.aJ, "servers.dat"));
            if (string == null) {
                if (r3 == null) {
                    return;
                }
                r3 = r2;
            }
            u u2 = r3.c("servers", 10);
            for (int i2 = 0; i2 < u2.b(); ++i2) {
                this.c.add(net.minecraft.client.E.a.a(u2.d(i2)));
                if (string == null && string == null) continue;
                break;
            }
        }
        catch (Exception exception) {
            a.error("Couldn't load server list", (Throwable)exception);
        }
    }

    public static void b(a a10) {
        block4: {
            p p2 = new p(Q.P());
            p2.b();
            int n2 = 0;
            String string = l.d();
            while (n2 < p2.a()) {
                a a11 = p2.a(n2);
                if (string == null) {
                    if (string == null) {
                        if (a11.c.equals(a10.c) && a11.h.equals(a10.h)) {
                            p2.a(n2, a10);
                            if (string == null) break;
                        }
                        ++n2;
                    }
                    if (string == null) continue;
                }
                break block4;
            }
            p2.c();
        }
    }

    public void a(int n2, int n3) {
        a a10 = this.a(n2);
        this.c.set(n2, this.a(n3));
        this.c.set(n3, a10);
        this.c();
    }

    public void c() {
        block4: {
            String string = l.d();
            try {
                u u2 = new u();
                for (a a10 : this.c) {
                    u2.a(a10.c());
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block4;
                }
                r r2 = new r();
                r2.a("servers", u2);
                f.a(r2, new File(this.b.aJ, "servers.dat"));
            }
            catch (Exception exception) {
                a.error("Couldn't save server list", (Throwable)exception);
            }
        }
    }

    public a a(int n2) {
        return this.c.get(n2);
    }

    public p(Q q2) {
        this.c = Lists.newArrayList();
        this.b = q2;
        this.b();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void a(a a10) {
        this.c.add(a10);
    }
}

