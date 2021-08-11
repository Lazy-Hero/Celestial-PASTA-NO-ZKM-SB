/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.b;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.R;
import net.minecraft.client.b.aZ;
import net.minecraft.client.b.bw;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class at
extends L {
    private /* synthetic */ s F;
    private /* synthetic */ s y;
    private /* synthetic */ s D;
    protected /* synthetic */ L C;
    private static final /* synthetic */ Logger E;
    private /* synthetic */ bw G;
    protected /* synthetic */ String B;
    private /* synthetic */ s z;
    private /* synthetic */ String A;

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void k() throws IOException {
        super.k();
        this.G.f();
    }

    static {
        E = LogManager.getLogger();
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block3: {
            at at2;
            block2: {
                this.A = null;
                String[] arrstring = q.b();
                this.G.b(n2, n3, f10);
                this.b(this.v, this.B, h / 2, 20, 0xFFFFFF);
                String[] arrstring2 = arrstring;
                super.a(n2, n3, f10);
                at2 = this;
                if (arrstring2 == null) break block2;
                if (at2.A == null) break block3;
                at2 = this;
            }
            at2.a(Lists.newArrayList((Iterable)Splitter.on((String)"\n").split((CharSequence)this.A)), n2, n3);
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        this.G.a(n2, n3, n4);
    }

    public void a(String string) {
        this.A = string;
    }

    @Override
    protected void a(s s2) throws IOException {
        block2: {
            aZ aZ2;
            block16: {
                int n2;
                aZ aZ3;
                String[] arrstring;
                block14: {
                    block15: {
                        block11: {
                            block12: {
                                aZ aZ4;
                                block13: {
                                    int n3;
                                    block9: {
                                        block10: {
                                            block6: {
                                                block7: {
                                                    aZ aZ5;
                                                    block8: {
                                                        block3: {
                                                            block4: {
                                                                aZ aZ6;
                                                                block5: {
                                                                    arrstring = q.b();
                                                                    if (!s2.h) break block2;
                                                                    aZ3 = this.G.b();
                                                                    n2 = s2.g;
                                                                    n3 = 2;
                                                                    if (arrstring == null) break block3;
                                                                    if (n2 != n3) break block4;
                                                                    aZ6 = aZ3;
                                                                    if (arrstring == null) break block5;
                                                                    if (aZ6 == null) break block2;
                                                                    aZ6 = aZ3;
                                                                }
                                                                aZ6.c();
                                                                if (arrstring != null) break block2;
                                                            }
                                                            n2 = s2.g;
                                                            n3 = 1;
                                                        }
                                                        if (arrstring == null) break block6;
                                                        if (n2 != n3) break block7;
                                                        aZ5 = aZ3;
                                                        if (arrstring == null) break block8;
                                                        if (aZ5 == null) break block2;
                                                        aZ5 = aZ3;
                                                    }
                                                    aZ5.b();
                                                    if (arrstring != null) break block2;
                                                }
                                                n2 = s2.g;
                                                n3 = 3;
                                            }
                                            if (arrstring == null) break block9;
                                            if (n2 != n3) break block10;
                                            this.m.a(new R(this));
                                            if (arrstring != null) break block2;
                                        }
                                        n2 = s2.g;
                                        if (arrstring == null) break block11;
                                        n3 = 4;
                                    }
                                    if (n2 != n3) break block12;
                                    aZ4 = aZ3;
                                    if (arrstring == null) break block13;
                                    if (aZ4 == null) break block2;
                                    aZ4 = aZ3;
                                }
                                aZ4.d();
                                if (arrstring != null) break block2;
                            }
                            n2 = s2.g;
                        }
                        if (arrstring == null) break block14;
                        if (n2 != 0) break block15;
                        this.m.a(this.C);
                        if (arrstring != null) break block2;
                    }
                    n2 = s2.g;
                }
                if (n2 != 5) break block2;
                aZ2 = aZ3;
                if (arrstring == null) break block16;
                if (aZ2 == null) break block2;
                aZ2 = aZ3;
            }
            aZ2.a();
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        super.a(n2, n3, n4);
        this.G.b(n2, n3, n4);
    }

    public at(L l2) {
        this.B = "Select world";
        this.C = l2;
    }

    public void a() {
        this.F = this.b(new s(1, h / 2 - 154, w - 52, 150, 20, net.minecraft.client.D.h.a("selectWorld.select", new Object[0])));
        this.b(new s(3, h / 2 + 4, w - 52, 150, 20, net.minecraft.client.D.h.a("selectWorld.create", new Object[0])));
        this.D = this.b(new s(4, h / 2 - 154, w - 28, 72, 20, net.minecraft.client.D.h.a("selectWorld.edit", new Object[0])));
        this.z = this.b(new s(2, h / 2 - 76, w - 28, 72, 20, net.minecraft.client.D.h.a("selectWorld.delete", new Object[0])));
        this.y = this.b(new s(5, h / 2 + 4, w - 28, 72, 20, net.minecraft.client.D.h.a("selectWorld.recreate", new Object[0])));
        this.b(new s(0, h / 2 + 82, w - 28, 72, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.F.h = false;
        this.z.h = false;
        this.D.h = false;
        this.y.h = false;
    }

    public void a(@Nullable aZ aZ2) {
        boolean bl2;
        this.F.h = bl2 = aZ2 != null;
        this.z.h = bl2;
        this.D.h = bl2;
        this.y.h = bl2;
    }

    @Override
    public void r() {
        this.B = net.minecraft.client.D.h.a("selectWorld.title", new Object[0]);
        this.G = new bw(this, this.m, h, w, 32, w - 64, 36);
        this.a();
    }
}

