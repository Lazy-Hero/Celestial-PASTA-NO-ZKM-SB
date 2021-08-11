/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.E.J;
import net.minecraft.E.aS;
import net.minecraft.N.c;
import net.minecraft.N.d;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.ah.z;
import net.minecraft.ar.Z;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.at.o;
import net.minecraft.c.f;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class j
implements J {
    private /* synthetic */ long i;
    private /* synthetic */ String d;
    private static /* synthetic */ m[] c;
    private static final /* synthetic */ SimpleDateFormat e;
    private /* synthetic */ int a;
    private /* synthetic */ k j;
    private /* synthetic */ boolean b;
    private /* synthetic */ boolean h;
    private final /* synthetic */ aS f;
    private /* synthetic */ String g;

    @Override
    public void a(k k2) {
        block3: {
            j j2;
            block5: {
                z z2;
                block4: {
                    j j3;
                    m[] arrm;
                    block2: {
                        arrm = net.minecraft.N.j.f();
                        j3 = this;
                        if (arrm != null) break block2;
                        if (!j3.b) break block3;
                        j3 = this;
                    }
                    z2 = j3.b();
                    if (arrm != null) break block4;
                    if (z2 == null) break block3;
                    j2 = this;
                    if (arrm != null) break block5;
                    z2 = j2.b();
                }
                if (z2.C) break block3;
                this.j = new g("[" + e.format(new Date()) + "] ").a(k2);
                j2 = this;
            }
            j2.a();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean a(z var1_1) {
        block8: {
            block7: {
                var2_2 = net.minecraft.N.j.f();
                v0 = var1_1.C;
                if (var2_2 != null) return v0;
                if (v0 != false) return false;
                cfr_temp_0 = var1_1.r() - this.i;
                v0 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                if (var2_2 != null) return v0;
                if (v0 == false) return false;
                v1 = "Searge".equalsIgnoreCase(this.g);
                if (var2_2 != null) return v1;
                if (v1) {
                    this.j = new g("#itzlipofutzli");
                    this.a = 1;
                    return true;
                }
                v2 = var3_3 = this.e();
                if (var2_2 != null) break block7;
                if (v2 == null) ** GOTO lbl-1000
                v2 = var3_3;
            }
            v3 = v2.ay();
            if (var2_2 != null) break block8;
            if (!v3) ** GOTO lbl-1000
            v3 = var3_3.P();
        }
        if (v3) {
            try {
                this.j = null;
                this.a = var3_3.u().a(this, this.g);
            }
            catch (Throwable var4_4) {
                var5_5 = net.minecraft.c.f.a(var4_4, "Executing command block");
                var6_6 = var5_5.a("Command to be executed");
                var6_6.a("Command", new c(this));
                var6_6.a("Name", new d(this));
                throw new Z(var5_5);
            }
        } else lbl-1000:
        // 3 sources

        {
            this.a = 0;
        }
        v4 = this;
        if (var2_2 == null) {
            if (v4.h) {
                this.i = var1_1.r();
                if (var2_2 == null) return true;
            }
            v4 = this;
        }
        v4.i = -1L;
        return true;
    }

    public abstract int c();

    public void a(int n2) {
        this.a = n2;
    }

    public static void b(m[] arrm) {
        c = arrm;
    }

    public j() {
        this.i = -1L;
        this.h = true;
        this.b = true;
        this.g = "";
        this.d = "@";
        this.f = new aS();
    }

    public void b(@Nullable k k2) {
        this.j = k2;
    }

    @Override
    public boolean a(int n2, String string) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = n2;
        if (arrm == null) {
            bl2 = bl2 <= BADBOOL 2;
        }
        return bl2;
    }

    @Override
    public void a(net.minecraft.E.d d10, int n2) {
        this.f.a(this.e(), this, d10, n2);
    }

    public void b(String string) {
        this.d = string;
    }

    public boolean g() {
        return this.b;
    }

    public static m[] f() {
        return c;
    }

    public void a(String string) {
        this.g = string;
        this.a = 0;
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }

    public abstract void a();

    public boolean a(net.minecraft.i.j j2) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = j2.b();
        if (arrm == null) {
            if (!bl2) {
                return false;
            }
            bl2 = j2.b().C;
        }
        if (arrm == null) {
            if (bl2) {
                j2.a(this);
            }
            bl2 = true;
        }
        return bl2;
    }

    public abstract void a(ByteBuf var1);

    public r b(r r2) {
        j j2;
        block8: {
            block9: {
                boolean bl2;
                m[] arrm;
                block7: {
                    block5: {
                        block6: {
                            r2.a("Command", this.g);
                            r2.b("SuccessCount", this.a);
                            r2.a("CustomName", this.d);
                            m[] arrm2 = net.minecraft.N.j.f();
                            r2.a("TrackOutput", this.b);
                            arrm = arrm2;
                            j2 = this;
                            if (arrm != null) break block5;
                            if (j2.j == null) break block6;
                            bl2 = this.b;
                            if (arrm != null) break block7;
                            if (bl2) {
                                r2.a("LastOutput", o.a(this.j));
                            }
                        }
                        r2.a("UpdateLastExecution", this.h);
                        j2 = this;
                    }
                    if (arrm != null) break block8;
                    bl2 = j2.h;
                }
                if (!bl2) break block9;
                j2 = this;
                if (arrm != null) break block8;
                if (j2.i > 0L) {
                    r2.a("LastExecution", this.i);
                }
            }
            j2 = this;
        }
        j2.f.a(r2);
        return r2;
    }

    static {
        e = new SimpleDateFormat("HH:mm:ss");
        net.minecraft.N.j.b(null);
    }

    public void a(r r2) {
        block20: {
            block18: {
                j j2;
                block19: {
                    boolean bl2;
                    m[] arrm;
                    block17: {
                        block13: {
                            block16: {
                                j j3;
                                block15: {
                                    boolean bl3;
                                    block14: {
                                        this.g = r2.j("Command");
                                        arrm = net.minecraft.N.j.f();
                                        this.a = r2.m("SuccessCount");
                                        bl3 = r2.a("CustomName", 8);
                                        if (arrm == null) {
                                            if (bl3) {
                                                this.d = r2.j("CustomName");
                                            }
                                            bl3 = r2.a("TrackOutput", 1);
                                        }
                                        if (arrm == null) {
                                            if (bl3) {
                                                this.b = r2.f("TrackOutput");
                                            }
                                            bl3 = r2.a("LastOutput", 8);
                                        }
                                        if (arrm != null) break block14;
                                        if (!bl3) break block15;
                                        j3 = this;
                                        if (arrm != null) break block16;
                                        bl3 = j3.b;
                                    }
                                    if (bl3) {
                                        try {
                                            this.j = o.a(r2.j("LastOutput"));
                                            break block13;
                                        }
                                        catch (Throwable throwable) {
                                            this.j = new g(throwable.getMessage());
                                            if (arrm == null) break block13;
                                        }
                                    }
                                }
                                j3 = this;
                            }
                            j3.j = null;
                        }
                        bl2 = r2.b("UpdateLastExecution");
                        if (arrm != null) break block17;
                        if (bl2) {
                            this.h = r2.f("UpdateLastExecution");
                        }
                        j2 = this;
                        if (arrm != null) break block18;
                        bl2 = j2.h;
                    }
                    if (!bl2 || !r2.b("LastExecution")) break block19;
                    this.i = r2.o("LastExecution");
                    if (arrm == null) break block20;
                }
                j2 = this;
            }
            j2.i = -1L;
        }
        this.f.b(r2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public k e() {
        k k2;
        m[] arrm = net.minecraft.N.j.f();
        j j2 = this;
        if (arrm == null) {
            if (j2.j == null) {
                k2 = new g("");
                return k2;
            }
            j2 = this;
        }
        k2 = j2.j;
        return k2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a() {
        b b10 = this.e();
        m[] arrm = net.minecraft.N.j.f();
        b b11 = b10;
        if (arrm == null) {
            if (b11 == null) return true;
            b11 = b10;
        }
        boolean bl2 = b11.ay();
        if (arrm != null) return bl2;
        if (!bl2) return true;
        bl2 = b10.S[0].M().c("commandBlockOutput");
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public int h() {
        return this.a;
    }

    @Override
    public String g() {
        return this.d;
    }

    public aS b() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

