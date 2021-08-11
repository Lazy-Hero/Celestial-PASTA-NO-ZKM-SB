/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.k;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.c.f;
import net.minecraft.client.Q;
import net.minecraft.client.a.aW;
import net.minecraft.client.k.a;
import net.minecraft.client.k.b;
import net.minecraft.client.k.c;
import net.minecraft.client.k.e;
import net.minecraft.client.k.h;
import net.minecraft.client.k.m;
import net.minecraft.client.k.q;
import net.minecraft.client.k.s;
import net.minecraft.k.n;
import net.minecraft.k.o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class g
implements Runnable {
    private final /* synthetic */ aW c;
    private final /* synthetic */ b a;
    private static final /* synthetic */ Logger b;
    private /* synthetic */ boolean d;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected void b(h var1_1) throws InterruptedException {
        block51: {
            block55: {
                block56: {
                    block47: {
                        block48: {
                            block49: {
                                block50: {
                                    block54: {
                                        block52: {
                                            block53: {
                                                block46: {
                                                    block43: {
                                                        block44: {
                                                            block45: {
                                                                v0 = s.r();
                                                                var1_1.b().lock();
                                                                var2_2 = v0;
                                                                v1 = var1_1;
                                                                if (var2_2 != null) {
                                                                    if (v1.a() == net.minecraft.client.k.a.PENDING) break block43;
                                                                    v1 = var1_1;
                                                                }
                                                                if (var2_2 == null) break block44;
                                                                if (v1.d()) break block45;
                                                                g.b.warn("Chunk render task was {} when I expected it to be pending; ignoring task", (Object)var1_1.a());
                                                            }
                                                            v1 = var1_1;
                                                        }
                                                        v1.b().unlock();
                                                        return;
                                                    }
                                                    var3_3 = new n(Q.P().s);
                                                    var4_4 = var1_1.i().g();
                                                    var5_6 = 16;
                                                    var6_8 = 8;
                                                    var7_10 = 24;
                                                    if (var2_2 == null) break block46;
                                                    if (!(var4_4.a(8, 8, 8).b((net.minecraft.k.m)var3_3) > 576.0)) ** GOTO lbl43
                                                    try {
                                                        var8_12 = var1_1.i().s();
                                                        var9_13 = new o(var4_4);
                                                        if (var2_2 == null) return;
                                                        if (this.a(var9_13.a(var4_4).a(aA.WEST, 16), (z)var8_12) == false) return;
                                                        v2 = this.a(var9_13.a(var4_4).a(aA.NORTH, 16), (z)var8_12);
                                                        if (var2_2 != null) {
                                                            if (v2 == false) return;
                                                            v2 = this.a(var9_13.a(var4_4).a(aA.EAST, 16), (z)var8_12);
                                                        }
                                                        if (var2_2 != null) {
                                                            if (v2 == false) return;
                                                            v2 = this.a(var9_13.a(var4_4).a(aA.SOUTH, 16), (z)var8_12);
                                                        }
                                                        if (!v2) {
                                                            return;
                                                        }
lbl43:
                                                        // 3 sources

                                                        var1_1.a(net.minecraft.client.k.a.COMPILING);
                                                    }
                                                    finally {
                                                        var1_1.b().unlock();
                                                    }
                                                }
                                                v3 = var3_3 = Q.P().Z();
                                                if (var2_2 != null) {
                                                    if (v3 == null) {
                                                        var1_1.f();
                                                        if (var2_2 != null) return;
                                                    }
                                                    var1_1.a(this.a());
                                                    v3 = var3_3;
                                                }
                                                var4_5 = (float)v3.a;
                                                var5_7 = (float)var3_3.aF + var3_3.l();
                                                var6_9 = (float)var3_3.ax;
                                                v4 = var7_11 = var1_1.e();
                                                v5 = net.minecraft.client.k.c.REBUILD_CHUNK;
                                                if (var2_2 == null) break block52;
                                                if (v4 != v5) break block53;
                                                var1_1.i().b(var4_5, var5_7, var6_9, var1_1);
                                                if (var2_2 != null) break block54;
                                            }
                                            v4 = var7_11;
                                            v5 = net.minecraft.client.k.c.RESORT_TRANSPARENCY;
                                        }
                                        if (v4 == v5) {
                                            var1_1.i().a(var4_5, var5_7, var6_9, var1_1);
                                        }
                                    }
                                    var1_1.b().lock();
                                    try {
                                        v6 = var1_1;
                                        if (var2_2 == null) break block47;
                                        if (v6.a() == net.minecraft.client.k.a.COMPILING) break block48;
                                        v7 = var1_1;
                                        if (var2_2 == null) break block49;
                                        if (v7.d()) break block50;
                                        g.b.warn("Chunk render task was {} when I expected it to be compiling; aborting task", (Object)var1_1.a());
                                    }
                                    catch (Throwable var11_16) {
                                        var1_1.b().unlock();
                                        throw var11_16;
                                    }
                                }
                                this.a(var1_1);
                                v7 = var1_1;
                            }
                            v7.b().unlock();
                            return;
                        }
                        var1_1.a(net.minecraft.client.k.a.UPLOADING);
                        v6 = var1_1;
                    }
                    v6.b().unlock();
                    var8_12 = var1_1.h();
                    var9_13 = Lists.newArrayList();
                    v8 = var7_11;
                    v9 = net.minecraft.client.k.c.REBUILD_CHUNK;
                    if (var2_2 == null) break block55;
                    if (v8 != v9) break block56;
                    var10_15 = aC.values();
                    var11_17 = ((ListenableFuture)var10_15).length;
                    var12_18 = 0;
                    while (var12_18 < var11_17) {
                        var13_19 = var10_15[var12_18];
                        if (var2_2 != null) {
                            if (var2_2 != null) {
                                if (var8_12.c((aC)var13_19)) {
                                    var9_13.add(this.a.a((aC)var13_19, var1_1.g().a((aC)var13_19), var1_1.i(), (m)var8_12, var1_1.c()));
                                }
                                ++var12_18;
                            }
                            if (var2_2 != null) continue;
                        }
                        break block51;
                    }
                    if (var2_2 != null) break block51;
                }
                v8 = var7_11;
                v9 = net.minecraft.client.k.c.RESORT_TRANSPARENCY;
            }
            if (v8 == v9) {
                var9_13.add(this.a.a(aC.TRANSLUCENT, var1_1.g().a(aC.TRANSLUCENT), var1_1.i(), (m)var8_12, var1_1.c()));
            }
        }
        var10_15 = Futures.allAsList((Iterable)var9_13);
        var1_1.a(new e(this, var10_15));
        Futures.addCallback((ListenableFuture)var10_15, (FutureCallback)new q(this, var1_1, (m)var8_12));
    }

    /*
     * Enabled aggressive block sorting
     */
    private aW a() throws InterruptedException {
        aW aW2;
        int[] arrn = s.r();
        g g10 = this;
        if (arrn != null) {
            if (g10.c != null) {
                aW2 = this.c;
                return aW2;
            }
            g10 = this;
        }
        aW2 = g10.a.a();
        return aW2;
    }

    static void a(g g10, h h2) {
        g10.a(h2);
    }

    public void b() {
        this.d = false;
    }

    static {
        b = LogManager.getLogger();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public g(b b10, @Nullable aW aW2) {
        this.d = true;
        this.a = b10;
        this.c = aW2;
    }

    private boolean a(n n2, z z2) {
        int[] arrn = s.r();
        z z3 = z2;
        if (arrn != null) {
            if (z3 == null) {
                return false;
            }
            z3 = z2;
        }
        boolean bl2 = z3.b(n2.e() >> 4, n2.a() >> 4).y();
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public void run() {
        while (this.d) {
            try {
                this.b(this.a.g());
            }
            catch (InterruptedException interruptedException) {
                b.debug("Stopping chunk worker due to interrupt");
                return;
            }
            catch (Throwable throwable) {
                f f10 = f.a(throwable, "Batching chunks");
                Q.P().b(Q.P().c(f10));
                return;
            }
        }
    }

    private void a(h h2) {
        block3: {
            g g10;
            block2: {
                int[] arrn = s.r();
                g10 = this;
                if (arrn == null) break block2;
                if (g10.c != null) break block3;
                g10 = this;
            }
            g10.a.a(h2.g());
        }
    }

    public g(b b10) {
        this(b10, null);
    }

    static Logger c() {
        return b;
    }
}

