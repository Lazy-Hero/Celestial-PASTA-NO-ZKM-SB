/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.v;

import net.minecraft.h.d;
import net.minecraft.v.b;
import net.minecraft.v.c;
import net.minecraft.v.p;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a {
    private final /* synthetic */ d d;
    private /* synthetic */ p a;
    private static final /* synthetic */ Logger b;
    private final /* synthetic */ p[] c;

    static {
        b = LogManager.getLogger();
    }

    public <T extends p> T a(b<T> b10) {
        int n2 = b10.b();
        int[] arrn = net.minecraft.v.c.b();
        p p2 = this.c[n2];
        if (arrn == null) {
            if (p2 == null) {
                this.c[n2] = b10.a(this.d);
            }
            p2 = this.c[n2];
        }
        return (T)p2;
    }

    public p a() {
        return this.a;
    }

    public a(d d10) {
        this.c = new p[net.minecraft.v.b.a()];
        this.d = d10;
        this.b(net.minecraft.v.b.n);
    }

    public void b(b<?> b10) {
        block8: {
            block11: {
                d d10;
                block10: {
                    a a10;
                    int[] arrn;
                    block9: {
                        p p2;
                        block7: {
                            arrn = net.minecraft.v.c.b();
                            p2 = this.a;
                            if (arrn != null) break block7;
                            if (p2 != null && b10 == this.a.b()) break block8;
                            a10 = this;
                            if (arrn != null) break block9;
                            p2 = a10.a;
                        }
                        if (p2 != null) {
                            this.a.d();
                        }
                        this.a = this.a(b10);
                        a10 = this;
                    }
                    d10 = a10.d;
                    if (arrn != null) break block10;
                    if (d10.aG.C) break block11;
                    d10 = this.d;
                }
                d10.E().b(net.minecraft.h.d.cw, b10.b());
            }
            b.debug("Dragon is now in phase {} on the {}", b10, (Object)(this.d.aG.C ? "client" : "server"));
            this.a.c();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

