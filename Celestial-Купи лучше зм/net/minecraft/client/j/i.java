/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.j;

import java.io.Closeable;
import java.io.IOException;
import net.minecraft.ar.v;
import net.minecraft.client.D.t;
import net.minecraft.client.j.e;
import net.minecraft.client.j.p;
import net.minecraft.client.j.u;
import net.minecraft.client.v.q;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i
extends e {
    protected final /* synthetic */ v h;
    private static final /* synthetic */ Logger g;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(t var1_1) throws IOException {
        block12: {
            block10: {
                block11: {
                    v0 = u.c();
                    this.c();
                    var2_2 = v0;
                    var3_3 = null;
                    try {
                        var3_3 = var1_1.a(this.h);
                        var4_4 = p.a(var3_3.c());
                        var5_5 = false;
                        var6_6 = false;
                        v1 = var3_3.a();
                        if (var2_2) ** GOTO lbl29
                        if (v1 == 0) ** GOTO lbl28
                    }
lbl13:
                    // 6 sources

                    catch (Throwable var8_9) {
                        IOUtils.closeQuietly(var3_3);
                        throw var8_9;
                    }
                    v2 = var7_7 = (q)var3_3.a("texture");
                    if (var2_2) ** GOTO lbl24
                    if (v2 == null) ** GOTO lbl28
                    try {
                        var5_5 = var7_7.a();
                        v2 = var7_7;
lbl24:
                        // 2 sources

                        var6_6 = v2.b();
                    }
                    catch (RuntimeException var7_8) {
                        i.g.warn("Failed reading metadata of: {}", (Object)this.h, (Object)var7_8);
                    }
lbl28:
                    // 4 sources

                    v1 = fU.ag();
lbl29:
                    // 2 sources

                    if (var2_2) break block10;
                    if (v1 == 0) break block11;
                    s.a(this.c(), var4_4, var5_5, var6_6, var1_1, this.h, this.a());
                    if (!var2_2) break block12;
                }
                v1 = p.a(this.c(), var4_4, var5_5, var6_6);
            }
            ** try [egrp 6[TRYBLOCK] [7 : 193->194)] { 
            {
            }
        }
        IOUtils.closeQuietly((Closeable)var3_3);
    }

    static {
        g = LogManager.getLogger();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public i(v v2) {
        this.h = v2;
    }
}

