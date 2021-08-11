/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.ar.U;
import net.minecraft.at.k;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.am;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.q;
import net.minecraft.k.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class M
extends L
implements net.minecraft.ar.q {
    private static final /* synthetic */ Logger B;
    private /* synthetic */ String A;
    private /* synthetic */ long z;
    private /* synthetic */ int D;
    private /* synthetic */ String E;
    protected /* synthetic */ aq y;
    private /* synthetic */ U C;

    @Override
    public void e() {
        this.y.i();
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block12: {
            String string;
            block14: {
                String[] arrstring;
                block22: {
                    int n3;
                    block23: {
                        int n4;
                        block20: {
                            block21: {
                                block18: {
                                    block19: {
                                        block16: {
                                            block17: {
                                                block15: {
                                                    block13: {
                                                        block10: {
                                                            block11: {
                                                                block9: {
                                                                    U u2;
                                                                    block7: {
                                                                        block8: {
                                                                            arrstring = q.b();
                                                                            u2 = this.C;
                                                                            if (arrstring == null) break block7;
                                                                            u2.b();
                                                                            if (n2 != 15) break block8;
                                                                            this.C.a();
                                                                            if (arrstring != null) break block9;
                                                                        }
                                                                        u2 = this.C;
                                                                    }
                                                                    u2.c();
                                                                }
                                                                n3 = n2;
                                                                n4 = 1;
                                                                if (arrstring == null) break block10;
                                                                if (n3 != n4) break block11;
                                                                this.m.a((L)null);
                                                                if (arrstring != null) break block12;
                                                            }
                                                            n3 = n2;
                                                            n4 = 28;
                                                        }
                                                        if (arrstring == null) break block13;
                                                        if (n3 == n4) break block14;
                                                        n3 = n2;
                                                        n4 = 156;
                                                    }
                                                    if (arrstring == null) break block15;
                                                    if (n3 == n4) break block14;
                                                    n3 = n2;
                                                    n4 = 200;
                                                }
                                                if (arrstring == null) break block16;
                                                if (n3 != n4) break block17;
                                                this.a(-1);
                                                if (arrstring != null) break block12;
                                            }
                                            n3 = n2;
                                            n4 = 208;
                                        }
                                        if (arrstring == null) break block18;
                                        if (n3 != n4) break block19;
                                        this.a(1);
                                        if (arrstring != null) break block12;
                                    }
                                    n3 = n2;
                                    n4 = 201;
                                }
                                if (arrstring == null) break block20;
                                if (n3 != n4) break block21;
                                this.m.n.f().b(this.m.n.f().a() - 1);
                                if (arrstring != null) break block12;
                            }
                            n3 = n2;
                            if (arrstring == null) break block22;
                            n4 = 209;
                        }
                        if (n3 != n4) break block23;
                        this.m.n.f().b(-this.m.n.f().a() + 1);
                        if (arrstring != null) break block12;
                    }
                    n3 = this.y.a(c10, n2) ? 1 : 0;
                }
                if (arrstring != null) break block12;
            }
            if (!(string = this.y.n().trim()).isEmpty()) {
                this.d(string);
            }
            this.m.a((L)null);
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        double d10 = M.a(this.z);
        String[] arrstring = q.b();
        net.minecraft.client.a.v.b(0.0, 14.0 - 14.0 * d10, 0.0);
        M.a(2, w - 14, h - 2, w - 2, Integer.MIN_VALUE);
        this.y.d();
        String[] arrstring2 = arrstring;
        this.y.d();
        k k2 = this.m.n.f().a(Mouse.getX(), Mouse.getY());
        if (arrstring2 != null) {
            if (k2 != null && k2.e().d() != null) {
                this.a(k2, n2, n3);
            }
            super.a(n2, n3, f10);
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        B = LogManager.getLogger();
    }

    public M() {
        this.E = "";
        this.D = -1;
        this.A = "";
    }

    public void a(int n2) {
        block5: {
            int n3;
            block8: {
                M m2;
                int n4;
                int n5;
                block6: {
                    String[] arrstring;
                    int n6;
                    block7: {
                        block4: {
                            n3 = this.D + n2;
                            n6 = this.m.n.f().f().size();
                            n3 = net.minecraft.k.h.c(n3, 0, n6);
                            arrstring = q.b();
                            n5 = n3;
                            n4 = this.D;
                            if (arrstring == null) break block4;
                            if (n5 == n4) break block5;
                            n5 = n3;
                            n4 = n6;
                        }
                        if (arrstring == null) break block6;
                        if (n5 != n4) break block7;
                        this.D = n6;
                        this.y.a(this.E);
                        if (arrstring != null) break block5;
                    }
                    m2 = this;
                    if (arrstring == null) break block8;
                    n5 = m2.D;
                    n4 = n6;
                }
                if (n5 == n4) {
                    this.E = this.y.n();
                }
                this.y.a(this.m.n.f().f().get(n3));
                m2 = this;
            }
            m2.D = n3;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(int var1_1, int var2_2, int var3_3) throws IOException {
        block4: {
            var4_4 = q.b();
            v0 = var3_3;
            if (var4_4 == null) break block4;
            if (v0 != 0) ** GOTO lbl-1000
            var5_5 = this.m.n.f().a(Mouse.getX(), Mouse.getY());
            if (var4_4 == null) return;
            if (var5_5 != null) {
                v0 = this.a(var5_5) ? 1 : 0;
                if (var4_4 != null) {
                    if (v0 != 0) {
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 4 sources

            {
                v0 = this.y.a(var1_1, var2_2, var3_3) ? 1 : 0;
            }
        }
        super.a(var1_1, var2_2, var3_3);
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.m.n.f().g();
        this.z = System.currentTimeMillis();
    }

    public static float a(long l2) {
        return Math.min(1.0f, (float)Math.pow((double)(System.currentTimeMillis() - l2) / 10.0, 1.4) / 80.0f);
    }

    @Override
    protected void b(String string, boolean bl2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = q.b();
                    if (arrstring == null) break block0;
                    if (!bl2) break block1;
                    this.y.a(string);
                }
                if (arrstring != null) break block2;
            }
            this.y.b(string);
        }
    }

    @Override
    public void r() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.D = this.m.n.f().f().size();
        this.y = new aq(0, this.v, 4, w - 12, h - 4, 12);
        this.y.b(256);
        this.y.d(false);
        this.y.c(true);
        this.y.a(this.A);
        this.y.b(false);
        this.C = new am(this.y);
        this.z = System.currentTimeMillis();
    }

    @Override
    public void k() throws IOException {
        block9: {
            int n2;
            block13: {
                int n3;
                block12: {
                    String[] arrstring;
                    block11: {
                        int n4;
                        block10: {
                            block8: {
                                String[] arrstring2 = q.b();
                                super.k();
                                arrstring = arrstring2;
                                n3 = n2 = Mouse.getEventDWheel();
                                if (arrstring == null) break block8;
                                if (n3 == 0) break block9;
                                n3 = n2;
                            }
                            n4 = 1;
                            if (arrstring == null) break block10;
                            if (n3 > n4) {
                                n2 = 1;
                            }
                            n3 = n2;
                            if (arrstring == null) break block11;
                            n4 = -1;
                        }
                        if (n3 < n4) {
                            n2 = -1;
                        }
                        n3 = M.o() ? 1 : 0;
                    }
                    if (arrstring == null) break block12;
                    if (n3 != 0) break block13;
                    n3 = n2 * 7;
                }
                n2 = n3;
            }
            this.m.n.f().b(n2);
        }
    }

    @Override
    public void a(String ... arrstring) {
        this.C.a(arrstring);
    }

    public M(String string) {
        this.E = "";
        this.D = -1;
        this.A = "";
        this.A = string;
    }
}

