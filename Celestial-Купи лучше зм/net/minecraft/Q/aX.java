/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
package net.minecraft.Q;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.List;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.Q.g;
import net.minecraft.Q.h;
import net.minecraft.Q.v;
import net.minecraft.ah.s;
import net.minecraft.i.k;
import net.minecraft.n.a;

public class aX
implements K<a> {
    private final /* synthetic */ List<g> a;
    private /* synthetic */ v b;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public List<g> a() {
        return this.a;
    }

    public aX(v v2, k ... arrk) {
        boolean bl2 = aD.c();
        boolean bl3 = bl2;
        this.a = Lists.newArrayList();
        this.b = v2;
        for (k k2 : arrk) {
            this.a.add(new g(this, k2.m(), k2.cM, k2.c7.e(), k2.H()));
            if (!bl3) continue;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("action", (Object)this.b).add("entries", this.a).toString();
    }

    public v b() {
        return this.b;
    }

    public aX() {
        this.a = Lists.newArrayList();
    }

    public aX(v v2, Iterable<k> iterable) {
        boolean bl2 = aD.c();
        boolean bl3 = bl2;
        this.a = Lists.newArrayList();
        this.b = v2;
        for (k k2 : iterable) {
            this.a.add(new g(this, k2.m(), k2.cM, k2.c7.e(), k2.H()));
            if (!bl3) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(m var1_1) throws IOException {
        this.b = var1_1.a(v.class);
        var2_2 = aD.i();
        var3_3 = var1_1.a();
        var4_4 = 0;
        do {
            if (var4_4 >= var3_3) return;
            var5_5 = null;
            var6_6 = 0;
            var7_7 = null;
            var8_8 = null;
            switch (h.a[this.b.ordinal()]) {
                case 1: {
                    var5_5 = new GameProfile(var1_1.f(), var1_1.c(16));
                    var9_9 = var1_1.a();
                    for (var10_10 = 0; var10_10 < var9_9; ++var10_10) {
                        var11_11 = var1_1.c(32767);
                        var12_12 = var1_1.c(32767);
                        v0 = var1_1.readBoolean() ? 1 : 0;
                        if (var2_2) {
                            if (!var2_2) continue;
                            if (v0 != 0) {
                                var5_5.getProperties().put((Object)var11_11, (Object)new Property(var11_11, var12_12, var1_1.c(32767)));
                                if (var2_2) continue;
                            }
                            var5_5.getProperties().put((Object)var11_11, (Object)new Property(var11_11, var12_12));
                            if (var2_2) continue;
                        }
                        ** GOTO lbl30
                    }
                    v0 = var1_1.a();
lbl30:
                    // 2 sources

                    var7_7 = s.a(v0);
                    var6_6 = var1_1.a();
                    v1 = var1_1;
                    if (var2_2) {
                        if (!v1.readBoolean()) break;
                        v1 = var1_1;
                    }
                    var8_8 = v1.m();
                    break;
                }
                case 2: {
                    var5_5 = new GameProfile(var1_1.f(), null);
                    var7_7 = s.a(var1_1.a());
                    break;
                }
                case 3: {
                    var5_5 = new GameProfile(var1_1.f(), null);
                    var6_6 = var1_1.a();
                    break;
                }
                case 4: {
                    var5_5 = new GameProfile(var1_1.f(), null);
                    v2 = var1_1;
                    if (var2_2) {
                        if (!v2.readBoolean()) break;
                        v2 = var1_1;
                    }
                    var8_8 = v2.m();
                    break;
                }
                case 5: {
                    var5_5 = new GameProfile(var1_1.f(), null);
                    break;
                }
            }
            this.a.add(new g(this, var5_5, var6_6, var7_7, var8_8));
            ++var4_4;
        } while (var2_2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(m var1_1) throws IOException {
        var1_1.a(this.b);
        v0 = aD.c();
        var1_1.d(this.a.size());
        var3_2 = this.a.iterator();
        var2_3 = v0;
        block7: do {
            v1 = var3_2.hasNext();
            block8: while (true) {
                if (v1 == false) return;
                var4_4 = var3_2.next();
                if (var2_3) ** GOTO lbl22
                switch (h.a[this.b.ordinal()]) {
                    case 1: {
                        var1_1.a(var4_4.d().getId());
                        var1_1.a(var4_4.d().getName());
                        var1_1.d(var4_4.d().getProperties().size());
lbl22:
                        // 3 sources

                        for (Property var6_6 : var4_4.d().getProperties().values()) {
                            var1_1.a(var6_6.getName());
                            v2 = var1_1.a(var6_6.getValue());
                            if (var2_3) ** GOTO lbl36
                            v1 = var6_6.hasSignature();
                            if (var2_3) continue block8;
                            if (!v1) ** GOTO lbl35
                            var1_1.writeBoolean(true);
                            var1_1.a(var6_6.getSignature());
                            if (!var2_3) ** GOTO lbl36
lbl35:
                            // 2 sources

                            v2 = var1_1.writeBoolean(false);
lbl36:
                            // 3 sources

                            if (!var2_3) continue;
                        }
                        var1_1.d(var4_4.b().c());
                        var1_1.d(var4_4.a());
                        if (!var2_3) {
                            if (var4_4.c() == null) {
                                var1_1.writeBoolean(false);
                                if (!var2_3) continue block7;
                            }
                            var1_1.writeBoolean(true);
                            var1_1.a(var4_4.c());
                        }
                        if (!var2_3) continue block7;
                    }
                    case 2: {
                        var1_1.a(var4_4.d().getId());
                        var1_1.d(var4_4.b().c());
                        if (!var2_3) continue block7;
                    }
                    case 3: {
                        var1_1.a(var4_4.d().getId());
                        var1_1.d(var4_4.a());
                        if (!var2_3) continue block7;
                    }
                    case 4: {
                        var1_1.a(var4_4.d().getId());
                        if (!var2_3) {
                            if (var4_4.c() == null) {
                                var1_1.writeBoolean(false);
                                if (!var2_3) continue block7;
                            }
                            var1_1.writeBoolean(true);
                            var1_1.a(var4_4.c());
                        }
                        if (!var2_3) continue block7;
                    }
                    case 5: {
                        var1_1.a(var4_4.d().getId());
                        break block8;
                    }
                }
                break;
            }
        } while (!var2_3);
    }
}

