/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  javax.annotation.Nullable
 */
package net.minecraft.ao;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.P.i;
import net.minecraft.P.r;
import net.minecraft.aA.h;
import net.minecraft.ah.z;
import net.minecraft.ao.aK;
import net.minecraft.ao.aL;
import net.minecraft.ao.ac;
import net.minecraft.ao.aj;
import net.minecraft.ao.b;
import net.minecraft.ao.by;
import net.minecraft.ao.e;
import net.minecraft.ao.u;
import net.minecraft.ar.Z;
import net.minecraft.k.f;
import net.minecraft.k.n;
import net.minecraft.o.l;

public abstract class j
extends h {
    private /* synthetic */ aL e;
    protected /* synthetic */ Long2ObjectMap<ac> f;

    public boolean a(n n2) {
        String[] arrstring = u.b();
        j j2 = this;
        if (arrstring != null) {
            if (j2.d == null) {
                return false;
            }
            this.a(this.d);
            j2 = this;
        }
        return j2.b(n2) != null;
    }

    @Nullable
    protected ac b(n n2) {
        ObjectIterator objectIterator = this.f.values().iterator();
        String[] arrstring = u.b();
        while (objectIterator.hasNext()) {
            block4: {
                ac ac2;
                ac ac3;
                block5: {
                    boolean bl2;
                    block3: {
                        ac3 = (ac)objectIterator.next();
                        bl2 = ac3.a();
                        if (arrstring == null) break block3;
                        if (!bl2) break block4;
                        ac2 = ac3;
                        if (arrstring == null) break block5;
                        bl2 = ac2.f().a(n2);
                    }
                    if (!bl2) break block4;
                    ac2 = ac3;
                }
                Iterator<u> iterator = ac2.d().iterator();
                while (iterator.hasNext() || arrstring == null) {
                    u u2 = iterator.next();
                    if ((!u2.a().a(n2) || arrstring == null) && arrstring != null) continue;
                    return ac3;
                }
                continue;
            }
            if (arrstring != null) continue;
        }
        return null;
    }

    protected abstract ac a(int var1, int var2);

    protected void a(z z2) {
        block5: {
            aL aL2;
            String[] arrstring;
            block6: {
                block7: {
                    arrstring = u.b();
                    if (this.e != null || z2 == null) break block5;
                    aL2 = this.e = (aL)z2.a(aL.class, this.a());
                    if (arrstring == null) break block6;
                    if (aL2 != null) break block7;
                    this.e = new aL(this.a());
                    z2.a(this.a(), this.e);
                    if (arrstring != null) break block5;
                }
                aL2 = this.e;
            }
            r r2 = aL2.a();
            for (String string : r2.d()) {
                block9: {
                    int n2;
                    r r3;
                    block11: {
                        block10: {
                            i i2;
                            block8: {
                                i i3;
                                i2 = i3 = r2.g(string);
                                if (arrstring == null) break block8;
                                if (i2.d() != 10) break block9;
                                i2 = i3;
                            }
                            r3 = (r)i2;
                            n2 = r3.b("ChunkX");
                            if (arrstring == null) break block10;
                            if (n2 == 0) break block9;
                            n2 = r3.b("ChunkZ");
                        }
                        if (arrstring == null) break block11;
                        if (n2 == 0) break block9;
                        n2 = r3.m("ChunkX");
                    }
                    int n3 = n2;
                    int n4 = r3.m("ChunkZ");
                    ac ac2 = by.b(r3, z2);
                    Object object = ac2;
                    if (arrstring != null && object != null) {
                        object = this.f.put(net.minecraft.k.f.a(n3, n4), (Object)ac2);
                    }
                }
                if (arrstring != null) continue;
            }
        }
    }

    public boolean a(z z2, n n2) {
        boolean bl2;
        block3: {
            String[] arrstring = u.b();
            this.a(z2);
            ObjectIterator objectIterator = this.f.values().iterator();
            String[] arrstring2 = arrstring;
            while (objectIterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block6: {
                        block4: {
                            ac ac2 = (ac)objectIterator.next();
                            bl2 = ac2.a();
                            if (arrstring2 == null) break block3;
                            if (arrstring2 == null) break block4;
                            if (!bl2) break block5;
                            bl3 = ac2.f().a(n2);
                        }
                        if (arrstring2 == null) break block6;
                        if (!bl3) break block5;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (arrstring2 != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public j() {
        this.f = new Long2ObjectOpenHashMap(1024);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Nullable
    public abstract n a(z var1, n var2, boolean var3);

    /*
     * Exception decompiling
     */
    protected static n a(z var0, j var1_1, n var2_2, int var3_3, int var4_4, int var5_5, boolean var6_6, int var7_7, boolean var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private void a(int n2, int n3, ac ac2) {
        this.e.a(ac2.a(n2, n3), n2, n3);
        this.e.b();
    }

    public abstract String a();

    public synchronized boolean a(z z2, Random random, f f10) {
        boolean bl2;
        block3: {
            String[] arrstring = u.b();
            this.a(z2);
            int n2 = (f10.c << 4) + 8;
            String[] arrstring2 = arrstring;
            int n3 = (f10.b << 4) + 8;
            boolean bl3 = false;
            for (ac ac2 : this.f.values()) {
                block5: {
                    boolean bl4;
                    block7: {
                        block6: {
                            block4: {
                                bl2 = ac2.a();
                                if (arrstring2 == null) break block3;
                                if (arrstring2 == null) break block4;
                                if (!bl2) break block5;
                                bl4 = ac2.b(f10);
                            }
                            if (arrstring2 == null) break block6;
                            if (!bl4) break block5;
                            bl4 = ac2.f().a(n2, n3, n2 + 15, n3 + 15);
                        }
                        if (arrstring2 == null) break block7;
                        if (!bl4) break block5;
                        ac2.a(z2, random, new b(n2, n3, n2 + 15, n3 + 15));
                        ac2.a(f10);
                        bl4 = true;
                    }
                    bl3 = bl4;
                    this.a(ac2.e(), ac2.b(), ac2);
                }
                if (arrstring2 != null) continue;
            }
            bl2 = bl3;
        }
        return bl2;
    }

    protected abstract boolean b(int var1, int var2);

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected final synchronized void a(z var1_1, int var2_2, int var3_3, int var4_4, int var5_5, l var6_6) {
        block7: {
            v0 = u.b();
            this.a(var1_1);
            var7_7 = v0;
            v1 = this.f.containsKey(net.minecraft.k.f.a(var2_2, var3_3));
            if (var7_7 == null) ** GOTO lbl15
            if (v1 != false) return;
            this.a.nextInt();
            try {
                block8: {
                    v2 = this;
                    v3 = var2_2;
                    v4 = var3_3;
                    if (var7_7 == null) break block8;
                    v1 = v2.b(v3, v4);
lbl15:
                    // 2 sources

                    if (v1 == false) return;
                    v2 = this;
                    v3 = var2_2;
                    v4 = var3_3;
                }
                var8_8 = v2.a(v3, v4);
                v5 = this;
                if (var7_7 == null) break block7;
                v5.f.put(net.minecraft.k.f.a(var2_2, var3_3), (Object)var8_8);
                if (var8_8.a() == false) return;
                v5 = this;
            }
            catch (Throwable var8_9) {
                var9_10 = net.minecraft.c.f.a(var8_9, "Exception preparing structure feature");
                var10_11 = var9_10.a("Feature being prepared");
                var10_11.a("Is feature chunk", new aK(this, var2_2, var3_3));
                var10_11.a("Chunk location", String.format("%d,%d", new Object[]{var2_2, var3_3}));
                var10_11.a("Chunk pos hash", new e(this, var2_2, var3_3));
                var10_11.a("Structure type", new aj(this));
                throw new Z(var9_10);
            }
        }
        v5.a(var2_2, var3_3, var8_8);
    }
}

