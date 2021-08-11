/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.t;

import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.P.i;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ah.F;
import net.minecraft.ah.w;
import net.minecraft.ah.z;
import net.minecraft.av.b;
import net.minecraft.av.g;
import net.minecraft.aw.q;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.o.m;
import net.minecraft.t.d;
import net.minecraft.t.e;
import net.minecraft.t.f;
import net.minecraft.t.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class j
implements e,
q {
    private final /* synthetic */ b a;
    private final /* synthetic */ Map<net.minecraft.k.f, r> d;
    private static final /* synthetic */ Logger f;
    private final /* synthetic */ Set<net.minecraft.k.f> e;
    private /* synthetic */ boolean b;
    private final /* synthetic */ File c;

    private void a(net.minecraft.k.f f10, r r2) throws IOException {
        DataOutputStream dataOutputStream = net.minecraft.t.d.d(this.c, f10.c, f10.b);
        net.minecraft.P.f.a(r2, (DataOutput)dataOutputStream);
        dataOutputStream.close();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(z z2, a a10) throws IOException, w {
        z2.w();
        try {
            r r2 = new r();
            r r3 = new r();
            r2.a("Level", r3);
            r2.b("DataVersion", 1343);
            this.a(a10, z2, r3);
            this.b(a10.A(), r2);
        }
        catch (Exception exception) {
            f.error("Failed to save chunk", (Throwable)exception);
        }
    }

    @Override
    public void a() {
    }

    public static void a(x x2, z z2) {
        block4: {
            x x3;
            int n2;
            block5: {
                boolean bl2;
                block3: {
                    n2 = net.minecraft.t.f.d();
                    bl2 = z2.f(x2);
                    if (n2 == 0) break block3;
                    if (!bl2) break block4;
                    x3 = x2;
                    if (n2 == 0) break block5;
                    bl2 = x3.aU();
                }
                if (!bl2) break block4;
                x3 = x2;
            }
            for (x x4 : x3.j()) {
                j.a(x4, z2);
                if (n2 != 0) continue;
            }
        }
    }

    public j(File file, b b10) {
        this.d = Maps.newConcurrentMap();
        this.e = Collections.newSetFromMap(Maps.newConcurrentMap());
        this.c = file;
        this.a = b10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a() {
        boolean bl2;
        int n2 = net.minecraft.t.f.e();
        Object object = this.d;
        if (n2 == 0) {
            if (object.isEmpty()) {
                boolean bl3 = this.b;
                if (n2 == 0) {
                    if (bl3) {
                        f.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", (Object)this.c.getName());
                    }
                    bl3 = false;
                }
                return bl3;
            }
            object = this.d.keySet().iterator().next();
        }
        net.minecraft.k.f f10 = (net.minecraft.k.f)object;
        try {
            this.e.add(f10);
            r r2 = this.d.remove(f10);
            if (n2 == 0 && r2 != null) {
                try {
                    this.a(f10, r2);
                }
                catch (Exception exception) {
                    f.error("Failed to save chunk", (Throwable)exception);
                }
            }
            bl2 = true;
        }
        finally {
            this.e.remove(f10);
        }
        return bl2;
    }

    public static void a(b b10) {
        b10.a(net.minecraft.av.f.CHUNK, (g)new h());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public static x a(r var0, z var1_1, double var2_2, double var4_3, double var6_4, boolean var8_5) {
        block14: {
            block13: {
                block11: {
                    block12: {
                        var10_6 = j.a(var0, var1_1);
                        var9_7 = net.minecraft.t.f.e();
                        v0 = var10_6;
                        if (var9_7 == 0) {
                            if (v0 == null) {
                                return null;
                            }
                            v0 = var10_6;
                        }
                        v0.c(var2_2, var4_3, var6_4, var10_6.e, var10_6.at);
                        v1 = var8_5;
                        if (var9_7 != 0) break block11;
                        if (!v1) break block12;
                        v1 = var1_1.f(var10_6);
                        if (var9_7 == 0) {
                            if (!v1) {
                                return null;
                            } else {
                                ** GOTO lbl17
                            }
                        }
                        break block11;
                    }
                    v2 = var0;
                    v3 = "Passengers";
                    v4 = 9;
                    if (var9_7 != 0) break block13;
                    v1 = v2.a(v3, v4);
                }
                if (!v1) break block14;
                v2 = var0;
                v3 = "Passengers";
                v4 = 10;
            }
            var11_8 = v2.c(v3, v4);
            var12_9 = 0;
            while (var12_9 < var11_8.b()) {
                var13_10 = j.a(var11_8.d(var12_9), var1_1, var2_2, var4_3, var6_4, var8_5);
                if (var9_7 == 0) {
                    v5 = var13_10;
                    if (var9_7 != 0) return v5;
                    if (v5 != null) {
                        var13_10.a(var10_6, true);
                    }
                    ++var12_9;
                }
                if (var9_7 == 0) continue;
            }
        }
        v5 = var10_6;
        return v5;
    }

    @Override
    public void b(z z2, a a10) throws IOException {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, int n3) {
        net.minecraft.k.f f10 = new net.minecraft.k.f(n2, n3);
        int n4 = net.minecraft.t.f.e();
        r r2 = this.d.get(f10);
        if (r2 != null) return true;
        boolean bl2 = net.minecraft.t.d.c(this.c, n2, n3);
        if (n4 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    protected void b(net.minecraft.k.f f10, r r2) {
        int n2 = net.minecraft.t.f.d();
        if (n2 != 0) {
            if (!this.e.contains(f10)) {
                this.d.put(f10, r2);
            }
            net.minecraft.aw.h.a().a(this);
        }
    }

    @Nullable
    protected static x a(r r2, z z2) {
        try {
            return net.minecraft.U.h.a(r2, z2);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }

    static {
        f = LogManager.getLogger();
    }

    @Override
    @Nullable
    public a a(z z2, int n2, int n3) throws IOException {
        net.minecraft.k.f f10 = new net.minecraft.k.f(n2, n3);
        r r2 = this.d.get(f10);
        if (r2 == null) {
            DataInputStream dataInputStream = net.minecraft.t.d.e(this.c, n2, n3);
            if (dataInputStream == null) {
                return null;
            }
            r2 = this.a.a((net.minecraft.av.d)net.minecraft.av.f.CHUNK, net.minecraft.P.f.a(dataInputStream));
        }
        return this.a(z2, n2, n3, r2);
    }

    @Override
    public void b() {
        try {
            this.b = true;
            while (this.a()) {
            }
        }
        finally {
            this.b = false;
        }
    }

    private a a(z z2, r r2) {
        a a10;
        block22: {
            int n2;
            String string;
            r r3;
            Object object;
            Object object2;
            int n3;
            block24: {
                r r4;
                Object object3;
                block21: {
                    int n4;
                    String string2;
                    r r5;
                    block23: {
                        boolean bl2;
                        block20: {
                            int n5 = r2.m("xPos");
                            int n6 = r2.m("zPos");
                            a10 = new a(z2, n5, n6);
                            n3 = net.minecraft.t.f.e();
                            a10.c(r2.n("HeightMap"));
                            a10.h(r2.f("TerrainPopulated"));
                            a10.f(r2.f("LightPopulated"));
                            a10.a(r2.o("InhabitedTime"));
                            u u2 = r2.c("Sections", 10);
                            int n7 = 16;
                            f[] arrf = new f[16];
                            boolean bl3 = z2.D.h();
                            int n8 = 0;
                            while (n8 < u2.b()) {
                                r r6 = u2.d(n8);
                                byte by2 = r6.r("Y");
                                object3 = new f(by2 << 4, bl3);
                                object2 = r6.a("Blocks");
                                object = new m(r6.a("Data"));
                                bl2 = r6.a("Add", 7);
                                if (n3 == 0) {
                                    m m2 = bl2 ? new m(r6.a("Add")) : null;
                                    ((f)object3).f().a((byte[])object2, (m)object, m2);
                                    ((f)object3).a(new m(r6.a("BlockLight")));
                                    if (n3 == 0) {
                                        if (bl3) {
                                            ((f)object3).b(new m(r6.a("SkyLight")));
                                        }
                                        ((f)object3).g();
                                        arrf[by2] = object3;
                                        ++n8;
                                    }
                                    if (n3 == 0) continue;
                                }
                                break block20;
                            }
                            a10.a(arrf);
                            r5 = r2;
                            string2 = "Biomes";
                            n4 = 7;
                            if (n3 != 0) break block23;
                            bl2 = r5.a(string2, n4);
                        }
                        if (bl2) {
                            a10.a(r2.a("Biomes"));
                        }
                        r5 = r2;
                        string2 = "Entities";
                        n4 = 10;
                    }
                    u u3 = r5.c(string2, n4);
                    for (int i2 = 0; i2 < u3.b(); ++i2) {
                        r r7;
                        r4 = r7 = u3.d(i2);
                        if (n3 == 0) {
                            j.a(r4, z2, a10);
                            a10.d(true);
                            if (n3 == 0) continue;
                        }
                        break block21;
                    }
                    r4 = r2;
                }
                u u4 = r4.c("TileEntities", 10);
                int n9 = 0;
                while (n9 < u4.b()) {
                    object3 = u4.d(n9);
                    object2 = y.a(z2, (r)object3);
                    if (n3 == 0) {
                        if (n3 == 0) {
                            if (object2 != null) {
                                a10.a((y)object2);
                            }
                            ++n9;
                        }
                        if (n3 == 0) continue;
                    }
                    break block22;
                }
                r3 = r2;
                string = "TileTicks";
                n2 = 9;
                if (n3 != 0) break block24;
                if (!r3.a(string, n2)) break block22;
                r3 = r2;
                string = "TileTicks";
                n2 = 10;
            }
            u u5 = r3.c(string, n2);
            for (int i3 = 0; i3 < u5.b(); ++i3) {
                block27: {
                    int n5;
                    block25: {
                        block26: {
                            object2 = u5.d(i3);
                            n5 = ((r)object2).a("i", 8);
                            if (n3 != 0) break block25;
                            if (n5 == 0) break block26;
                            object = K.d(((r)object2).j("i"));
                            if (n3 == 0) break block27;
                        }
                        n5 = ((r)object2).m("i");
                    }
                    object = K.b(n5);
                }
                z2.c(new n(((r)object2).m("x"), ((r)object2).m("y"), ((r)object2).m("z")), (K)object, ((r)object2).m("t"), ((r)object2).m("p"));
                if (n3 == 0) continue;
            }
        }
        return a10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public static x a(r var0, z var1_1, boolean var2_2) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        var4_3 = j.a(var0, var1_1);
                        var3_4 = net.minecraft.t.f.d();
                        if (var4_3 == null) {
                            return null;
                        }
                        v0 = var2_2;
                        if (var3_4 == 0) break block10;
                        if (!v0) break block11;
                        v0 = var1_1.f(var4_3);
                        if (var3_4 != 0) {
                            if (!v0) {
                                return null;
                            } else {
                                ** GOTO lbl13
                            }
                        }
                        break block10;
                    }
                    v1 = var0;
                    v2 = "Passengers";
                    v3 = 9;
                    if (var3_4 == 0) break block12;
                    v0 = v1.a(v2, v3);
                }
                if (!v0) break block13;
                v1 = var0;
                v2 = "Passengers";
                v3 = 10;
            }
            var5_5 = v1.c(v2, v3);
            var6_6 = 0;
            while (var6_6 < var5_5.b()) {
                var7_7 = j.a(var5_5.d(var6_6), var1_1, var2_2);
                if (var3_4 != 0) {
                    v4 = var7_7;
                    if (var3_4 == 0) return v4;
                    if (v4 != null) {
                        var7_7.a(var4_3, true);
                    }
                    ++var6_6;
                }
                if (var3_4 != 0) continue;
            }
        }
        v4 = var4_3;
        return v4;
    }

    @Nullable
    protected a a(z z2, int n2, int n3, r r2) {
        a a10;
        r r3;
        int n4;
        block8: {
            block7: {
                n4 = net.minecraft.t.f.e();
                r r4 = r2;
                String string = "Level";
                if (n4 == 0) {
                    if (!r4.a(string, 10)) {
                        f.error("Chunk file at {},{} is missing level data, skipping", (Object)n2, (Object)n3);
                        return null;
                    }
                    r4 = r2;
                    string = "Level";
                }
                r3 = r4.h(string);
                if (n4 != 0) break block7;
                if (r3.a("Sections", 9)) break block8;
                f.error("Chunk file at {},{} is missing block data, skipping", (Object)n2, (Object)n3);
            }
            return null;
        }
        a a11 = a10 = this.a(z2, r3);
        if (n4 == 0) {
            if (!a11.c(n2, n3)) {
                f.error("Chunk file at {},{} is in the wrong location; relocating. (Expected {}, {}, got {}, {})", (Object)n2, (Object)n3, (Object)n2, (Object)n3, (Object)a10.t, (Object)a10.i);
                r3.b("xPos", n2);
                r3.b("zPos", n3);
                a10 = this.a(z2, r3);
            }
            a11 = a10;
        }
        return a11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(a var1_1, z var2_2, r var3_3) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        var3_3.b("xPos", var1_1.t);
                        var3_3.b("zPos", var1_1.i);
                        v0 = net.minecraft.t.f.d();
                        var3_3.a("LastUpdate", var2_2.r());
                        var3_3.a("HeightMap", var1_1.p());
                        var4_4 = v0;
                        var3_3.a("TerrainPopulated", var1_1.j());
                        var3_3.a("LightPopulated", var1_1.u());
                        var3_3.a("InhabitedTime", var1_1.m());
                        var5_5 = var1_1.n();
                        var6_6 = new u();
                        var7_7 = var2_2.D.h();
                        var8_8 = var5_5;
                        var9_9 = ((f[])var8_8).length;
                        var10_11 = 0;
                        while (var10_11 < var9_9) {
                            block22: {
                                block23: {
                                    block27: {
                                        block25: {
                                            block26: {
                                                block24: {
                                                    var11_14 = var8_8[var10_11];
                                                    if (var4_4 == 0) break block18;
                                                    if (var4_4 == 0) break block22;
                                                    if (var11_14 == net.minecraft.o.a.u) break block23;
                                                    var12_20 = new r();
                                                    var12_20.a("Y", (byte)(var11_14.b() >> 4 & 255));
                                                    var13_21 = new byte[4096];
                                                    var14_22 = new m();
                                                    var15_23 = var11_14.f().a((byte[])var13_21, (m)var14_22);
                                                    var12_20.a("Blocks", (byte[])var13_21);
                                                    var12_20.a("Data", var14_22.a());
                                                    if (var4_4 == 0) break block24;
                                                    if (var15_23 != null) {
                                                        var12_20.a("Add", var15_23.a());
                                                    }
                                                    v1 = var12_20;
                                                    v2 = "BlockLight";
                                                    v3 = var11_14.c().a();
                                                    if (var4_4 == 0) break block25;
                                                    v1.a(v2, v3);
                                                }
                                                if (!var7_7) break block26;
                                                var12_20.a("SkyLight", var11_14.a().a());
                                                if (var4_4 != 0) break block27;
                                            }
                                            v1 = var12_20;
                                            v2 = "SkyLight";
                                            v3 = new byte[var11_14.c().a().length];
                                        }
                                        v1.a(v2, v3);
                                    }
                                    var6_6.a(var12_20);
                                }
                                ++var10_11;
                            }
                            if (var4_4 != 0) continue;
                        }
                        var3_3.a("Sections", var6_6);
                        var3_3.a("Biomes", var1_1.g());
                        var1_1.d(false);
                    }
                    var8_8 = new u();
                    var9_9 = 0;
                    block1: while (true) {
                        v4 = var9_9;
                        block2: while (v4 < var1_1.d().length) {
                            if (var4_4 == 0) break block19;
                            for (x var11_16 : var1_1.d()[var9_9]) {
                                block29: {
                                    block28: {
                                        var12_20 = new r();
                                        if (var4_4 == 0) break block28;
                                        v4 = var11_16.e(var12_20) ? 1 : 0;
                                        if (var4_4 == 0) continue block2;
                                        if (v4 == 0) break block29;
                                        var1_1.d(true);
                                    }
                                    var8_8.a(var12_20);
                                }
                                if (var4_4 != 0) continue;
                            }
                            ++var9_9;
                            if (var4_4 != 0) continue block1;
                        }
                        break;
                    }
                    var3_3.a("Entities", (i)var8_8);
                }
                var9_10 = new u();
                var10_13 = var1_1.l().values().iterator();
                while (var10_13.hasNext()) {
                    var11_18 = var10_13.next();
                    var12_20 = var11_18.a(new r());
                    var9_10.a(var12_20);
                    if (var4_4 != 0) {
                        if (var4_4 != 0) continue;
                    }
                    break block20;
                }
                var3_3.a("TileEntities", var9_10);
            }
            if ((var10_13 = var2_2.a(var1_1, false)) == null) return;
            var11_19 = var2_2.r();
            var13_21 = new u();
            var14_22 = var10_13.iterator();
            while (var14_22.hasNext()) {
                var15_23 = (F)var14_22.next();
                var16_24 = new r();
                var17_25 = K.h.b(var15_23.a());
                v5 = var16_24;
                v6 = "i";
                if (var4_4 == 0) break block21;
                v7 = var17_25;
                if (var4_4 == 0) ** GOTO lbl105
                if (v7 == null) {
                    v8 = "";
                } else {
                    v7 = var17_25;
lbl105:
                    // 2 sources

                    v8 = v7.toString();
                }
                v5.a(v6, v8);
                var16_24.b("x", var15_23.f.e());
                var16_24.b("y", var15_23.f.b());
                var16_24.b("z", var15_23.f.a());
                var16_24.b("t", (int)(var15_23.b - var11_19));
                var16_24.b("p", var15_23.d);
                var13_21.a(var16_24);
                if (var4_4 != 0) continue;
            }
            v5 = var3_3;
            v6 = "TileTicks";
        }
        v5.a(v6, (i)var13_21);
    }

    @Nullable
    public static x a(r r2, z z2, a a10) {
        x x2;
        block8: {
            x x3;
            block10: {
                int n2;
                String string;
                r r3;
                int n3;
                block9: {
                    x3 = j.a(r2, z2);
                    n3 = net.minecraft.t.f.e();
                    if (n3 == 0) {
                        if (x3 == null) {
                            return null;
                        }
                        a10.a(x3);
                    }
                    r3 = r2;
                    string = "Passengers";
                    n2 = 9;
                    if (n3 != 0) break block9;
                    if (!r3.a(string, n2)) break block10;
                    r3 = r2;
                    string = "Passengers";
                    n2 = 10;
                }
                u u2 = r3.c(string, n2);
                int n4 = 0;
                while (n4 < u2.b()) {
                    x x4 = j.a(u2.d(n4), z2, a10);
                    if (n3 == 0) {
                        x2 = x4;
                        if (n3 != 0) break block8;
                        if (x2 != null) {
                            x4.a(x3, true);
                        }
                        ++n4;
                    }
                    if (n3 == 0) continue;
                }
            }
            x2 = x3;
        }
        return x2;
    }
}

