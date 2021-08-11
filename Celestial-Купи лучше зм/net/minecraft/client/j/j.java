/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.j;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.ar.Z;
import net.minecraft.c.f;
import net.minecraft.c.l;
import net.minecraft.client.j.b;
import net.minecraft.client.j.c;
import net.minecraft.client.j.e;
import net.minecraft.client.j.k;
import net.minecraft.client.j.n;
import net.minecraft.client.j.p;
import net.minecraft.client.j.r;
import net.minecraft.client.j.t;
import net.minecraft.client.j.u;
import net.minecraft.client.j.v;
import net.minecraft.k.h;
import net.minecraft.k.m;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class j
extends e
implements v {
    public static final /* synthetic */ net.minecraft.ar.v x;
    private /* synthetic */ int o;
    private /* synthetic */ int k;
    private /* synthetic */ int m;
    public static final /* synthetic */ net.minecraft.ar.v n;
    private final /* synthetic */ r r;
    private /* synthetic */ int q;
    private final /* synthetic */ Map<String, c> u;
    private final /* synthetic */ Map<String, c> j;
    public /* synthetic */ int i;
    private /* synthetic */ double s;
    private final /* synthetic */ c w;
    public /* synthetic */ int h;
    private final /* synthetic */ String g;
    private final /* synthetic */ List<c> v;
    private static final /* synthetic */ Logger y;
    private /* synthetic */ int p;
    private /* synthetic */ double l;
    private /* synthetic */ c[] t;

    private int a(Map map, net.minecraft.client.D.t t2) {
        int n2;
        int n3;
        boolean bl2;
        block8: {
            int n4;
            int n5;
            block7: {
                n5 = this.a(map, t2, 20);
                bl2 = net.minecraft.client.j.u.d();
                n3 = n5;
                n4 = 16;
                if (!bl2) break block7;
                if (n3 < n4) {
                    n5 = 16;
                }
                n3 = n5 = net.minecraft.k.h.e(n5);
                if (!bl2) break block8;
                n4 = 16;
            }
            if (n3 > n4) {
                fU.e("Sprite size: " + n5);
            }
            n3 = net.minecraft.k.h.c(n5);
        }
        int n6 = n2 = n3;
        if (bl2) {
            if (n6 < 4) {
                n2 = 4;
            }
            n6 = n2;
        }
        return n6;
    }

    @Nullable
    public c a(String string) {
        return this.j.get(string);
    }

    private int[] b(int n2) {
        BufferedImage bufferedImage = new BufferedImage(16, 16, 2);
        bufferedImage.setRGB(0, 0, 16, 16, net.minecraft.client.j.p.e, 0, 16);
        BufferedImage bufferedImage2 = fp.a(bufferedImage, n2);
        int[] arrn = new int[n2 * n2];
        bufferedImage2.getRGB(0, 0, n2, n2, arrn, 0, n2);
        return arrn;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private int a(Map var1_1, net.minecraft.client.D.t var2_2, int var3_3) {
        block21: {
            block17: {
                var5_4 = new HashMap<Integer, Integer>();
                var4_5 = net.minecraft.client.j.u.d();
                for (Map.Entry<K, V> var7_8 : var1_1.entrySet()) {
                    block18: {
                        block19: {
                            block20: {
                                var8_10 = (c)var7_8.getValue();
                                var9_11 = new net.minecraft.ar.v(var8_10.e());
                                var10_14 = this.b(var9_11);
                                v0 = var8_10.a(var2_2, var9_11);
                                if (!var4_5) break block17;
                                if (v0 != 0) break block18;
                                v1 = var11_16 = var2_2.a((net.minecraft.ar.v)var10_14);
                                if (var4_5) {
                                    if (v1 == null) break block18;
                                    v1 = var11_16;
                                }
                                v2 = var12_21 = v1.c();
                                if (var4_5) {
                                    if (v2 == null) break block18;
                                    v2 = var12_21;
                                }
                                v3 = var13_22 = fp.a((InputStream)v2, "png");
                                if (!var4_5) ** GOTO lbl24
                                if (v3 == null) break block18;
                                v3 = var13_22;
lbl24:
                                // 2 sources

                                var14_24 = v3.width;
                                var15_25 = net.minecraft.k.h.e(var14_24);
                                v4 = var5_4.containsKey(var15_25);
                                if (!var4_5) break block19;
                                if (v4 != 0) break block20;
                                var5_4.put(var15_25, 1);
                                if (var4_5) break block18;
                            }
                            v4 = (Integer)var5_4.get(var15_25);
                        }
                        try {
                            var16_26 = v4;
                            var5_4.put(var15_25, var16_26 + 1);
                        }
                        catch (Exception var11_17) {
                            // empty catch block
                        }
                    }
                    if (var4_5) continue;
                }
                v0 = 0;
            }
            var6_7 = v0;
            var7_9 = var5_4.keySet();
            var8_10 = new TreeSet<K>(var7_9);
            var10_14 = var8_10.iterator();
            while (var10_14.hasNext()) {
                var11_19 = (Integer)var10_14.next();
                var9_12 = (Integer)var5_4.get(var11_19);
                v5 = var6_7 + var9_12;
                if (var4_5) {
                    var6_7 = v5;
                    if (var4_5) continue;
                }
                break block21;
            }
            v5 = 16;
        }
        var10_15 = v5;
        var11_20 = 0;
        var9_13 = var6_7 * var3_3 / 100;
        var12_21 = var8_10.iterator();
        while (var12_21.hasNext()) {
            var13_23 = (Integer)var12_21.next();
            var14_24 = (Integer)var5_4.get(var13_23);
            var11_20 += var14_24;
            v6 = var13_23;
            if (var4_5 == false) return v6;
            v7 = var10_15;
            if (var4_5) {
                if (v6 > v7) {
                    var10_15 = var13_23;
                }
                v8 = var11_20;
                if (var4_5 == false) return v8;
                v7 = var9_13;
            }
            if (v8 > v7) {
                v8 = var10_15;
                return v8;
            }
            if (var4_5) continue;
        }
        v6 = var10_15;
        return v6;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(c c10) {
        boolean bl2 = net.minecraft.client.j.u.d();
        c c11 = c10;
        c c12 = fp.D;
        if (bl2) {
            if (c11 == c12) return fU.S();
            c11 = c10;
            c12 = fp.ai;
        }
        if (bl2) {
            if (c11 == c12) return fU.S();
            c11 = c10;
            c12 = fp.Y;
        }
        if (bl2) {
            if (c11 == c12) return fU.al();
            c11 = c10;
            c12 = fp.aa;
        }
        if (bl2) {
            if (c11 == c12) return fU.al();
            c11 = c10;
            c12 = fp.e;
        }
        if (bl2) {
            if (c11 == c12) return fU.aK();
            c11 = c10;
            c12 = fp.am;
        }
        if (bl2) {
            if (c11 == c12) return fU.aK();
            c11 = c10;
            c12 = fp.y;
        }
        if (bl2) {
            if (c11 == c12) {
                return fU.as();
            }
            c11 = c10;
            c12 = fp.P;
        }
        if (bl2) {
            if (c11 == c12) return true;
            c11 = c10;
            c12 = fp.as;
        }
        if (c11 == c12) return true;
        boolean bl3 = fU.E();
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public j(String string, boolean bl2) {
        this(string, null, bl2);
    }

    public j(String string, r r2, boolean bl2) {
        this.t = null;
        this.p = -1;
        this.m = -1;
        this.k = -1;
        this.s = -1.0;
        this.l = -1.0;
        this.o = 0;
        this.i = 0;
        this.h = 0;
        this.v = Lists.newArrayList();
        this.j = Maps.newHashMap();
        this.u = Maps.newHashMap();
        this.w = new c("missingno");
        this.g = string;
        this.r = r2;
    }

    public net.minecraft.ar.v a(c c10) {
        net.minecraft.ar.v v2 = new net.minecraft.ar.v(c10.e());
        return this.b(v2);
    }

    public j(String string, @Nullable r r2) {
        this(string, r2, false);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public c c(net.minecraft.ar.v v2) {
        c c10;
        block6: {
            c c11;
            block7: {
                boolean bl2 = net.minecraft.client.j.u.c();
                Object object = v2;
                if (!bl2) {
                    if (object == null) {
                        throw new IllegalArgumentException("Location cannot be null!");
                    }
                    object = this.j.get(v2.toString());
                }
                c10 = c11 = (c)object;
                if (bl2) break block6;
                if (c10 != null) break block7;
                c11 = net.minecraft.client.j.c.a(v2);
                this.j.put(v2.toString(), c11);
                c10 = c11;
                if (bl2) break block6;
                if (c10.h() < 0) {
                    c11.d(this.o++);
                }
            }
            c10 = c11;
        }
        return c10;
    }

    @Override
    public void a(net.minecraft.client.D.t t2) throws IOException {
        block3: {
            j j2;
            block2: {
                s.j = t2;
                boolean bl2 = net.minecraft.client.j.u.c();
                j2 = this;
                if (bl2) break block2;
                if (j2.r == null) break block3;
                j2 = this;
            }
            j2.a(t2, this.r);
        }
    }

    public c b() {
        return this.w;
    }

    static {
        y = LogManager.getLogger();
        n = new net.minecraft.ar.v("missingno");
        x = new net.minecraft.ar.v("textures/atlas/blocks.png");
    }

    private boolean a(net.minecraft.ar.v v2) {
        String string = v2.a();
        return this.c(string);
    }

    private c lambda$loadTextureAtlas$0(net.minecraft.ar.v v2) {
        return this.j.get(v2.toString());
    }

    public void a(net.minecraft.client.D.t t2, r r2) {
        this.j.clear();
        this.o = 0;
        boolean bl2 = net.minecraft.client.j.u.d();
        cq.e(cq.n, this);
        r2.a(this);
        boolean bl3 = bl2;
        j j2 = this;
        if (bl3) {
            if (j2.q >= 4) {
                this.q = this.a(this.j, t2);
                fU.e("Mipmap levels: " + this.q);
            }
            this.f();
            this.c();
            j2 = this;
        }
        j2.b(t2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b(net.minecraft.client.D.t var1_1) {
        block89: {
            block85: {
                block65: {
                    block86: {
                        block82: {
                            block80: {
                                block81: {
                                    block63: {
                                        s.j = var1_1;
                                        var2_2 = net.minecraft.client.j.u.c();
                                        fU.b("Multitexture: " + fU.aR());
                                        v0 = fU.aR();
                                        if (!var2_2) {
                                            if (v0 != 0) {
                                                for (c var4_5 : this.u.values()) {
                                                    var4_5.c();
                                                    if (!var2_2) {
                                                        if (!var2_2) continue;
                                                        net.minecraft.k.m.b(net.minecraft.k.m.c() == false);
                                                    }
                                                    break;
                                                }
                                            } else {
                                                cJ.b(this);
                                                b1.a(this);
                                                aB.b(this);
                                            }
                                            v0 = fp.b();
                                        }
                                        var3_4 = v0;
                                        var4_6 = new net.minecraft.client.j.s(var3_4, var3_4, 0, this.q);
                                        this.u.clear();
                                        this.v.clear();
                                        var5_7 = 0x7FFFFFFF;
                                        this.p = var6_8 = this.d();
                                        var7_9 = 1 << this.q;
                                        var8_10 = new ArrayList<c>(this.j.values());
                                        for (var9_11 = 0; var9_11 < var8_10.size(); ++var9_11) {
                                            block70: {
                                                block79: {
                                                    block76: {
                                                        block74: {
                                                            block75: {
                                                                block78: {
                                                                    block77: {
                                                                        block72: {
                                                                            block73: {
                                                                                block71: {
                                                                                    block69: {
                                                                                        block68: {
                                                                                            block67: {
                                                                                                block66: {
                                                                                                    var10_12 = eP.a(var8_10, var9_11, this);
                                                                                                    var11_14 = this.a(var10_12);
                                                                                                    var12_16 = null;
                                                                                                    v1 = var10_12.h();
                                                                                                    if (var2_2) break block63;
                                                                                                    if (!var2_2) {
                                                                                                        if (v1 < 0) {
                                                                                                            var10_12.d(this.o++);
                                                                                                        }
                                                                                                        v2 = var10_12.a(var1_1, (net.minecraft.ar.v)var11_14);
                                                                                                    }
                                                                                                    if (var2_2) break block66;
                                                                                                    if (!v2) break block67;
                                                                                                    v2 = var10_12.a(var1_1, (net.minecraft.ar.v)var11_14, (Function<net.minecraft.ar.v, c>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$loadTextureAtlas$0(net.minecraft.ar.v ), (Lnet/minecraft/ar/v;)Lnet/minecraft/client/j/c;)((j)this));
                                                                                                }
                                                                                                if (v2) {
                                                                                                    fU.b("Custom loader (skipped): " + var10_12);
                                                                                                    if (!var2_2) continue;
                                                                                                }
                                                                                                fU.b("Custom loader: " + var10_12);
                                                                                                if (!var2_2) break block68;
                                                                                            }
                                                                                            try {
                                                                                                var13_18 = net.minecraft.client.j.n.a(var1_1.a((net.minecraft.ar.v)var11_14));
                                                                                                var12_16 = fU.ag() != false ? s.a(var1_1, (net.minecraft.ar.v)var11_14) : var1_1.a((net.minecraft.ar.v)var11_14);
                                                                                                var14_25 = var12_16.a("animation") != null ? 1 : 0;
                                                                                                var10_12.a(var13_18, (boolean)var14_25);
                                                                                            }
                                                                                            catch (RuntimeException var13_19) {
                                                                                                net.minecraft.client.j.j.y.error("Unable to parse metadata from {}", var11_14, (Object)var13_19);
                                                                                                ea.a((net.minecraft.ar.v)var11_14, var13_19.getMessage());
                                                                                                {
                                                                                                    catch (Throwable var15_30) {
                                                                                                        IOUtils.closeQuietly(var12_16);
                                                                                                        throw var15_30;
                                                                                                    }
                                                                                                }
                                                                                                IOUtils.closeQuietly((Closeable)var12_16);
                                                                                                continue;
                                                                                                catch (IOException var13_20) {
                                                                                                    net.minecraft.client.j.j.y.error("Using missing texture, unable to load " + var11_14 + ", " + var13_20.getClass().getName());
                                                                                                    ea.a((net.minecraft.ar.v)var11_14);
                                                                                                    IOUtils.closeQuietly((Closeable)var12_16);
                                                                                                    continue;
                                                                                                }
                                                                                            }
                                                                                            IOUtils.closeQuietly((Closeable)var12_16);
                                                                                        }
                                                                                        var13_21 = var10_12.f();
                                                                                        var14_25 = var10_12.b();
                                                                                        v3 = var13_21;
                                                                                        v4 = 1;
                                                                                        if (var2_2) break block69;
                                                                                        if (v3 < v4) break block70;
                                                                                        v3 = var14_25;
                                                                                        v4 = 1;
                                                                                    }
                                                                                    if (var2_2) break block71;
                                                                                    if (v3 < v4) break block70;
                                                                                    v3 = var13_21;
                                                                                    if (var2_2) break block72;
                                                                                    v4 = var6_8;
                                                                                }
                                                                                if (v3 < v4) break block73;
                                                                                v5 = this.q;
                                                                                if (var2_2) break block74;
                                                                                if (v5 <= 0) break block75;
                                                                            }
                                                                            v3 = this.q;
                                                                        }
                                                                        if (var2_2) ** GOTO lbl96
                                                                        if (v3 > 0) {
                                                                            v6 = fp.b(var13_21, var6_8);
                                                                        } else {
                                                                            v3 = var13_21;
lbl96:
                                                                            // 2 sources

                                                                            v6 = fp.a(v3, var6_8);
                                                                        }
                                                                        v7 = var15_29 = v6;
                                                                        v8 = var13_21;
                                                                        if (var2_2) break block76;
                                                                        if (v7 == v8) break block75;
                                                                        if (fp.c(var13_21)) break block77;
                                                                        fU.e("Scaled non power of 2: " + var10_12.e() + ", " + var13_21 + " -> " + var15_29);
                                                                        if (!var2_2) break block78;
                                                                    }
                                                                    fU.e("Scaled too small texture: " + var10_12.e() + ", " + var13_21 + " -> " + var15_29);
                                                                }
                                                                var16_33 = var14_25 * var15_29 / var13_21;
                                                                var10_12.c(var15_29);
                                                                var10_12.b(var16_33);
                                                            }
                                                            var5_7 = Math.min(var5_7, Math.min(var10_12.f(), var10_12.b()));
                                                            v5 = Math.min(Integer.lowestOneBit(var10_12.f()), Integer.lowestOneBit(var10_12.b()));
                                                        }
                                                        v7 = var15_29 = v5;
                                                        if (var2_2) break block79;
                                                        v8 = var7_9;
                                                    }
                                                    if (v7 < v8) {
                                                        net.minecraft.client.j.j.y.warn("Texture {} with size {}x{} limits mip level from {} to {}", var11_14, (Object)var10_12.f(), (Object)var10_12.b(), (Object)net.minecraft.k.h.c(var7_9), (Object)net.minecraft.k.h.c(var15_29));
                                                        var7_9 = var15_29;
                                                    }
                                                    v7 = this.a(var1_1, var10_12) ? 1 : 0;
                                                }
                                                if (v7 != 0) {
                                                    var4_6.a(var10_12);
                                                }
                                                if (!var2_2) continue;
                                            }
                                            fU.h("Invalid sprite size: " + var10_12);
                                            if (!var2_2) continue;
                                        }
                                        var9_11 = Math.min(var5_7, var7_9);
                                        v1 = net.minecraft.k.h.c(var9_11);
                                    }
                                    v9 = var10_13 = v1;
                                    if (!var2_2) {
                                        if (v9 < 0) {
                                            var10_13 = 0;
                                        }
                                        v9 = var10_13;
                                    }
                                    if (v9 < this.q) {
                                        net.minecraft.client.j.j.y.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", (Object)this.g, (Object)this.q, (Object)var10_13, (Object)var9_11);
                                        this.q = var10_13;
                                    }
                                    this.w.e(this.q);
                                    var4_6.a(this.w);
                                    var4_6.b();
                                    net.minecraft.client.j.j.y.info("Created: {}x{} {}-atlas", (Object)var4_6.a(), (Object)var4_6.d(), (Object)this.g);
                                    v10 = fU.ag();
                                    if (var2_2) break block80;
                                    if (v10 == 0) break block81;
                                    s.a(this.c(), this.q, var4_6.a(), var4_6.d(), var4_6, this);
                                    if (!var2_2) break block82;
                                }
                                v10 = this.c();
                            }
                            net.minecraft.client.j.p.a(v10, this.q, var4_6.a(), var4_6.d());
                        }
                        var11_14 = Maps.newHashMap(this.j);
                        var12_16 = var4_6.c().iterator();
                        while (var12_16.hasNext()) {
                            block64: {
                                var13_22 = (c)var12_16.next();
                                v11 = fU.ag();
                                if (var2_2) ** GOTO lbl195
                                if (v11) {
                                    s.a(s.a(var13_22).e());
                                }
                                var14_27 = var13_22.e();
                                var11_14.remove(var14_27);
                                this.u.put(var14_27, var13_22);
                                try {
                                    block84: {
                                        block83: {
                                            if (var2_2) break block83;
                                            if (!fU.ag()) break block84;
                                            s.b(var13_22.f(0), var13_22.f(), var13_22.b(), var13_22.n(), var13_22.q(), false, false);
                                        }
                                        if (!var2_2) break block64;
                                    }
                                    net.minecraft.client.j.p.a(var13_22.f(0), var13_22.f(), var13_22.b(), var13_22.n(), var13_22.q(), false, false);
                                }
                                catch (Throwable var15_31) {
                                    var16_34 = net.minecraft.c.f.a(var15_31, "Stitching texture atlas");
                                    var17_36 = var16_34.a("Texture being stitched together");
                                    var17_36.a("Atlas path", this.g);
                                    var17_36.a("Sprite", var13_22);
                                    throw new Z(var16_34);
                                }
                            }
                            v12 = var13_22.d();
                            if (!var2_2 && v12) {
                                v12 = this.v.add(var13_22);
                            }
                            if (!var2_2) continue;
                        }
                        var12_16 = var11_14.values().iterator();
                        do {
                            v11 = var12_16.hasNext();
lbl195:
                            // 2 sources

                            if (!v11) break;
                            var13_23 = (c)var12_16.next();
                            var13_23.a(this.w);
                            if (var2_2) break block65;
                        } while (!var2_2);
                        v13 = fU.aR();
                        if (var2_2) break block85;
                        if (!v13) break block86;
                        var12_17 = var4_6.a();
                        var13_24 = var4_6.d();
                        for (c var15_32 : var4_6.c()) {
                            block88: {
                                block87: {
                                    var15_32.s = var12_17;
                                    var15_32.z = var13_24;
                                    var15_32.h = this.q;
                                    var16_35 = var15_32.p;
                                    if (var2_2) break block65;
                                    v14 = var16_35;
                                    if (var2_2) break block87;
                                    if (v14 == null) break block88;
                                    v14 = var16_35;
                                }
                                v15 = v14.f();
                                if (!var2_2) {
                                    if (v15 <= false) {
                                        var16_35.c(var15_32.f());
                                        var16_35.b(var15_32.b());
                                        var16_35.a(var15_32.f(), var15_32.b(), 0, 0, false);
                                        var16_35.p();
                                        var17_38 = var15_32.k();
                                        var16_35.a(var17_38);
                                        var16_35.a(var15_32.t());
                                    }
                                    var16_35.s = var12_17;
                                    var16_35.z = var13_24;
                                    var16_35.h = this.q;
                                    var15_32.s();
                                    v15 = false;
                                }
                                var17_37 = v15;
                                var18_39 = true;
                                try {
                                    net.minecraft.client.j.p.a(var16_35.f(0), var16_35.f(), var16_35.b(), var16_35.n(), var16_35.q(), var17_37, var18_39);
                                }
                                catch (Exception var19_40) {
                                    fU.b("Error uploading sprite single: " + var16_35 + ", parent: " + var15_32);
                                    var19_40.printStackTrace();
                                }
                            }
                            if (!var2_2) continue;
                        }
                        fU.aX().aN().b(net.minecraft.client.j.j.x);
                    }
                    cq.e(cq.an, new Object[]{this});
                    this.a(var4_6.a(), var4_6.d());
                }
                v16 = System.getProperty("saveTextureMap");
                if (var2_2) break block89;
                v13 = fU.a((Object)v16, (Object)"true");
            }
            if (v13 == false) return;
            fU.b("Exporting texture map: " + this.g);
            v16 = "debug/" + this.g.replaceAll("/", "_");
        }
        fp.a(v16, this.c(), this.q, var4_6.a(), var4_6.d());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(String string) {
        String string2 = string.toLowerCase();
        boolean bl2 = net.minecraft.client.j.u.c();
        boolean bl3 = string2.startsWith("mcpatcher/");
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = string2.startsWith("optifine/");
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public int a() {
        return this.o;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void g() {
        block37: {
            block38: {
                block53: {
                    block26: {
                        block46: {
                            block47: {
                                block39: {
                                    block40: {
                                        block29: {
                                            block30: {
                                                block25: {
                                                    block24: {
                                                        var1_1 = net.minecraft.client.j.u.d();
                                                        v0 = fU.ag();
                                                        if (var1_1) {
                                                            if (v0 != 0) {
                                                                s.n = this.a();
                                                            }
                                                            v0 = 0;
                                                        }
                                                        var2_2 = v0;
                                                        var3_3 = 0;
                                                        net.minecraft.client.j.p.a(this.c());
                                                        for (c var5_5 : this.v) {
                                                            block28: {
                                                                block27: {
                                                                    if (!var1_1) break block27;
                                                                    v1 = this.c(var5_5);
                                                                    if (!var1_1) break block24;
                                                                    if (v1 == 0) break block28;
                                                                    var5_5.j();
                                                                }
                                                                v2 = var5_5.i;
                                                                if (var1_1) {
                                                                    if (v2 != null) {
                                                                        var2_2 = 1;
                                                                    }
                                                                    v2 = var5_5.b;
                                                                }
                                                                if (v2 != null) {
                                                                    var3_3 = 1;
                                                                }
                                                            }
                                                            if (var1_1) continue;
                                                        }
                                                        v1 = fU.aR();
                                                    }
                                                    if (!var1_1) break block29;
                                                    if (v1 == 0) break block30;
                                                    for (c var5_5 : this.v) {
                                                        block31: {
                                                            block35: {
                                                                block36: {
                                                                    block33: {
                                                                        block34: {
                                                                            block32: {
                                                                                v3 = this.c(var5_5) ? 1 : 0;
                                                                                if (!var1_1) break block25;
                                                                                if (v3 == 0) break block31;
                                                                                v4 = var6_6 = var5_5.p;
                                                                                if (!var1_1) break block32;
                                                                                if (v4 == null) break block31;
                                                                                v4 = var5_5;
                                                                            }
                                                                            v5 = fp.P;
                                                                            if (!var1_1) break block33;
                                                                            if (v4 == v5) break block34;
                                                                            v6 = var5_5;
                                                                            if (!var1_1) break block35;
                                                                            if (v6 != fp.as) break block36;
                                                                        }
                                                                        v4 = var6_6;
                                                                        v5 = var5_5;
                                                                    }
                                                                    v4.m = v5.m;
                                                                }
                                                                var5_5.s();
                                                                v6 = var6_6;
                                                            }
                                                            v6.j();
                                                        }
                                                        if (var1_1) continue;
                                                    }
                                                    v3 = this.c();
                                                }
                                                net.minecraft.client.j.p.a(v3);
                                            }
                                            v1 = fU.ag();
                                        }
                                        if (!var1_1) break block37;
                                        if (v1 == 0) break block38;
                                        v7 = var2_2;
                                        if (!var1_1) break block39;
                                        if (v7 == 0) break block40;
                                        net.minecraft.client.j.p.a(this.a().c);
                                        var4_4 = this.v.iterator();
                                        while (var4_4.hasNext()) {
                                            block41: {
                                                block44: {
                                                    block45: {
                                                        block42: {
                                                            block43: {
                                                                var5_5 = var4_4.next();
                                                                v8 = var5_5.i;
                                                                if (!var1_1) ** GOTO lbl102
                                                                if (v8 == null || !this.c(var5_5)) break block41;
                                                                v9 = var5_5;
                                                                v10 = fp.P;
                                                                if (!var1_1) break block42;
                                                                if (v9 == v10) break block43;
                                                                v11 = var5_5;
                                                                if (!var1_1) break block44;
                                                                if (v11 != fp.as) break block45;
                                                            }
                                                            v9 = var5_5.i;
                                                            v10 = var5_5;
                                                        }
                                                        v9.m = v10.m;
                                                    }
                                                    v11 = var5_5.i;
                                                }
                                                v11.j();
                                            }
                                            if (var1_1) continue;
                                        }
                                    }
                                    v7 = var3_3;
                                }
                                if (!var1_1) break block46;
                                if (v7 == 0) break block47;
                                net.minecraft.client.j.p.a(this.a().a);
                                for (c var5_5 : this.v) {
                                    block48: {
                                        block51: {
                                            block52: {
                                                block49: {
                                                    block50: {
                                                        if (!var1_1) break block26;
                                                        v8 = var5_5.b;
lbl102:
                                                        // 2 sources

                                                        if (v8 == null || !this.c(var5_5)) break block48;
                                                        v12 = var5_5;
                                                        v13 = fp.P;
                                                        if (!var1_1) break block49;
                                                        if (v12 == v13) break block50;
                                                        v14 = var5_5;
                                                        if (!var1_1) break block51;
                                                        if (v14 != fp.as) break block52;
                                                    }
                                                    v12 = var5_5.i;
                                                    v13 = var5_5;
                                                }
                                                v12.m = v13.m;
                                            }
                                            v14 = var5_5.b;
                                        }
                                        v14.j();
                                    }
                                    if (var1_1) continue;
                                }
                            }
                            v7 = var2_2;
                        }
                        if (!var1_1) break block53;
                        if (v7 != 0) break block26;
                        v1 = var3_3;
                        if (!var1_1) break block37;
                        if (v1 == 0) break block38;
                    }
                    v7 = this.c();
                }
                net.minecraft.client.j.p.a(v7);
            }
            v1 = fU.ag();
        }
        if (v1 == 0) return;
        s.n = null;
    }

    private void f() {
        int n2 = this.d();
        int[] arrn = this.b(n2);
        this.w.c(n2);
        this.w.b(n2);
        int[][] arrarrn = new int[this.q + 1][];
        arrarrn[0] = arrn;
        this.w.a(Lists.newArrayList((Object[])new int[][][]{arrarrn}));
        this.w.d(this.o++);
    }

    @Override
    public void a() {
        this.g();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public c a(double d10, double d11) {
        int n2;
        boolean bl2 = net.minecraft.client.j.u.d();
        if (this.t == null) {
            return null;
        }
        int n3 = (int)(d10 / this.s);
        int n4 = (int)(d11 / this.l);
        int n5 = n2 = n4 * this.m + n3;
        if (bl2) {
            if (n5 < 0) return null;
            n5 = n2;
        }
        if (n5 > this.t.length) return null;
        c c10 = this.t[n2];
        return c10;
    }

    public j(String string) {
        this(string, null);
    }

    private void a(int n2, int n3) {
        block10: {
            j j2;
            boolean bl2;
            block9: {
                this.m = -1;
                this.k = -1;
                bl2 = net.minecraft.client.j.u.c();
                this.t = null;
                j2 = this;
                if (bl2) break block9;
                if (j2.p <= 0) break block10;
                this.m = n2 / this.p;
                this.k = n3 / this.p;
                this.t = new c[this.m * this.k];
                this.s = 1.0 / (double)this.m;
                this.l = 1.0 / (double)this.k;
                j2 = this;
            }
            Iterator<c> iterator = j2.u.values().iterator();
            block0: while (true) {
                int n4 = iterator.hasNext();
                block1: while (n4 != 0) {
                    c c10 = iterator.next();
                    double d10 = 0.5 / (double)n2;
                    double d11 = 0.5 / (double)n3;
                    double d12 = (double)Math.min(c10.i(), c10.l()) + d10;
                    double d13 = (double)Math.min(c10.u(), c10.m()) + d11;
                    double d14 = (double)Math.max(c10.i(), c10.l()) - d10;
                    double d15 = (double)Math.max(c10.u(), c10.m()) - d11;
                    int n5 = (int)(d12 / this.s);
                    int n6 = (int)(d13 / this.l);
                    int n7 = (int)(d14 / this.s);
                    int n8 = (int)(d15 / this.l);
                    int n9 = n5;
                    block2: while (true) {
                        int n10 = n9;
                        block3: while (n10 <= n7) {
                            block18: {
                                block12: {
                                    int n11;
                                    block13: {
                                        int n12;
                                        block11: {
                                            n4 = n9;
                                            if (bl2) continue block1;
                                            if (bl2) break block11;
                                            if (n4 < 0) break block12;
                                            n12 = n9;
                                        }
                                        if (bl2) break block13;
                                        if (n12 >= this.m) break block12;
                                        n12 = n11 = n6;
                                    }
                                    while (n11 <= n8) {
                                        block17: {
                                            block15: {
                                                int n13;
                                                int n14;
                                                block16: {
                                                    block14: {
                                                        n10 = n11;
                                                        if (bl2) continue block3;
                                                        if (bl2) break block14;
                                                        if (n10 < 0) break block15;
                                                        n14 = n11;
                                                    }
                                                    n13 = this.m;
                                                    if (bl2) break block16;
                                                    if (n14 >= n13) break block15;
                                                    n14 = n11 * this.m;
                                                    n13 = n9;
                                                }
                                                int n15 = n14 + n13;
                                                this.t[n15] = c10;
                                                if (!bl2) break block17;
                                            }
                                            fU.h("Invalid grid V: " + n11 + ", icon: " + c10.e());
                                        }
                                        ++n11;
                                        if (!bl2) continue;
                                    }
                                    if (!bl2) break block18;
                                }
                                fU.h("Invalid grid U: " + n9 + ", icon: " + c10.e());
                            }
                            ++n9;
                            if (!bl2) continue block2;
                        }
                        break;
                    }
                    if (!bl2) continue block0;
                }
                break;
            }
        }
    }

    public boolean e() {
        int n2 = net.minecraft.client.a.v.N();
        boolean bl2 = net.minecraft.client.j.u.d();
        int n3 = this.c();
        int n4 = n2;
        if (bl2) {
            n4 = n4 == n3 ? 1 : 0;
        }
        return n4 != 0;
    }

    private int d() {
        int n2 = 1 << this.q;
        boolean bl2 = net.minecraft.client.j.u.d();
        int n3 = n2;
        if (bl2) {
            if (n3 < 8) {
                n2 = 8;
            }
            n3 = n2;
        }
        return n3;
    }

    public boolean b(c c10) {
        String string = c10.e();
        boolean bl2 = net.minecraft.client.j.u.c();
        boolean bl3 = this.j.containsKey(string);
        if (!bl2) {
            if (!bl3) {
                this.j.put(string, c10);
                int n2 = c10.h();
                if (!bl2) {
                    if (n2 < 0) {
                        c10.d(this.o++);
                    }
                    n2 = 1;
                }
                return n2 != 0;
            }
            bl3 = false;
        }
        return bl3;
    }

    public net.minecraft.ar.v b(net.minecraft.ar.v v2) {
        return this.a(v2) ? new net.minecraft.ar.v(v2.c(), v2.a() + ".png") : new net.minecraft.ar.v(v2.c(), String.format("%s/%s%s", this.g, v2.a(), ".png"));
    }

    public void a(int n2) {
        this.q = n2;
    }

    public c d(net.minecraft.ar.v v2) {
        return this.j.get(v2.toString());
    }

    public int h() {
        return this.q;
    }

    public String c() {
        return this.g;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(net.minecraft.client.D.t t2, c c10) {
        block10: {
            boolean bl2;
            net.minecraft.client.D.v v2;
            net.minecraft.ar.v v3;
            block13: {
                c c11;
                boolean bl3;
                block12: {
                    v3 = this.a(c10);
                    bl3 = net.minecraft.client.j.u.c();
                    v2 = null;
                    c11 = c10;
                    if (bl3) break block12;
                    if (!c11.a(t2, v3)) break block13;
                    c11 = c10;
                }
                fp.a(c11, this.q);
                if (!bl3) break block10;
            }
            try {
                v2 = t2.a(v3);
                c10.a(v2, this.q + 1);
                break block10;
            }
            catch (RuntimeException runtimeException) {
                y.error("Unable to parse metadata from {}", (Object)v3, (Object)runtimeException);
                bl2 = false;
            }
            catch (IOException iOException) {
                boolean bl4;
                boolean bl5;
                y.error("Using missing texture, unable to load {}", (Object)v3, (Object)iOException);
                boolean bl6 = bl5 = (bl4 = false);
                return bl6;
            }
            finally {
                IOUtils.closeQuietly((Closeable)v2);
            }
            return bl2;
        }
        try {
            c10.e(this.q);
            return true;
        }
        catch (Throwable throwable) {
            f f10 = net.minecraft.c.f.a(throwable, "Applying mipmap");
            l l2 = f10.a("Sprite being mipmapped");
            l2.a("Sprite name", new k(this, c10));
            l2.a("Sprite size", new t(this, c10));
            l2.a("Sprite frames", new b(this, c10));
            l2.a("Mipmap levels", this.q);
            throw new Z(f10);
        }
    }

    public c d(String string) {
        net.minecraft.ar.v v2 = new net.minecraft.ar.v(string);
        return this.j.get(v2.toString());
    }

    public c b(String string) {
        c c10 = this.u.get(string);
        boolean bl2 = net.minecraft.client.j.u.d();
        c c11 = c10;
        if (bl2) {
            if (c11 == null) {
                c10 = this.w;
            }
            c11 = c10;
        }
        return c11;
    }
}

