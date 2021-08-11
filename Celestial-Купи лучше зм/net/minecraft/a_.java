/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Functions
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft;

import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.a1;
import net.minecraft.a9;
import net.minecraft.aG;
import net.minecraft.aN;
import net.minecraft.ar.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a_ {
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ Set<aN> e;
    private /* synthetic */ a9 c;
    private final /* synthetic */ Set<aN> d;
    private final /* synthetic */ Map<v, aN> b;

    static {
        a = LogManager.getLogger();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(@Nullable a9 a92) {
        block6: {
            aN aN2;
            Iterator<aN> iterator;
            boolean bl2;
            block4: {
                a_ a_2;
                block5: {
                    bl2 = aG.b();
                    a_2 = this;
                    if (!bl2) break block5;
                    a_2.c = a92;
                    if (a92 == null) break block6;
                    a_2 = this;
                }
                iterator = a_2.e.iterator();
                while (iterator.hasNext()) {
                    aN2 = iterator.next();
                    a92.c(aN2);
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block4;
                }
                iterator = this.d.iterator();
            }
            while (iterator.hasNext()) {
                aN2 = iterator.next();
                a92.d(aN2);
                if (bl2) continue;
            }
        }
    }

    private void a(aN aN2) {
        block10: {
            a9 a92;
            block11: {
                boolean bl2;
                block7: {
                    block8: {
                        a9 a93;
                        block9: {
                            block6: {
                                Iterator<aN> iterator = aN2.j().iterator();
                                bl2 = aG.a();
                                while (iterator.hasNext()) {
                                    aN aN3 = iterator.next();
                                    this.a(aN3);
                                    if (!bl2) {
                                        if (!bl2) continue;
                                    }
                                    break block6;
                                }
                                a.info("Forgot about advancement " + aN2.f());
                                this.b.remove(aN2.f());
                            }
                            if (bl2) break block7;
                            if (aN2.b() != null) break block8;
                            this.e.remove(aN2);
                            a93 = this.c;
                            if (bl2) break block9;
                            if (a93 == null) break block10;
                            a93 = this.c;
                        }
                        a93.b(aN2);
                        if (!bl2) break block10;
                    }
                    this.d.remove(aN2);
                }
                a92 = this.c;
                if (bl2) break block11;
                if (a92 == null) break block10;
                a92 = this.c;
            }
            a92.a(aN2);
        }
    }

    public a_() {
        this.b = Maps.newHashMap();
        this.e = Sets.newLinkedHashSet();
        this.d = Sets.newLinkedHashSet();
    }

    @Nullable
    public aN a(v v2) {
        return this.b.get(v2);
    }

    public Iterable<aN> c() {
        return this.e;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(Map<v, a1> var1_1) {
        var3_2 = Functions.forMap(this.b, null);
        var2_3 = aG.b();
        block0: while (!var1_1.isEmpty()) {
            block5: {
                var4_4 = false;
                if (var2_3 == false) return;
                var5_5 = var1_1.entrySet().iterator();
                while (var5_5.hasNext()) {
                    block7: {
                        block11: {
                            block8: {
                                block9: {
                                    block10: {
                                        block6: {
                                            var6_6 = var5_5.next();
                                            var7_7 = var6_6.getKey();
                                            v0 = var8_8 = var6_6.getValue();
                                            if (!var2_3) break block6;
                                            v1 = v0.a((Function<v, aN>)var3_2);
                                            if (!var2_3) break block5;
                                            if (!v1) break block7;
                                            v0 = var8_8;
                                        }
                                        var9_9 = v0.a(var7_7);
                                        this.b.put(var7_7, var9_9);
                                        var4_4 = true;
                                        var5_5.remove();
                                        if (!var2_3) break block8;
                                        if (var9_9.b() != null) break block9;
                                        this.e.add(var9_9);
                                        v2 = this.c;
                                        if (!var2_3) break block10;
                                        if (v2 == null) break block7;
                                        v2 = this.c;
                                    }
                                    v2.c(var9_9);
                                    if (var2_3) break block7;
                                }
                                this.d.add(var9_9);
                            }
                            v3 = this.c;
                            if (!var2_3) break block11;
                            if (v3 == null) break block7;
                            v3 = this.c;
                        }
                        v3.d(var9_9);
                    }
                    if (var2_3) continue;
                }
                v1 = var4_4;
            }
            if (v1) ** GOTO lbl53
            var5_5 = var1_1.entrySet().iterator();
            while (var5_5.hasNext() || !var2_3) {
                var6_6 = var5_5.next();
                a_.a.error("Couldn't load advancement " + var6_6.getKey() + ": " + var6_6.getValue());
                if (var2_3) continue;
lbl53:
                // 2 sources

                if (var2_3) continue block0;
            }
            break block0;
        }
        a_.a.info("Loaded " + this.b.size() + " advancements");
    }

    public void a(Set<v> set) {
        Iterator<v> iterator = set.iterator();
        boolean bl2 = aG.a();
        while (iterator.hasNext()) {
            block5: {
                aN aN2;
                block4: {
                    block3: {
                        v v2 = iterator.next();
                        aN2 = this.b.get(v2);
                        if (bl2) break block3;
                        if (aN2 != null) break block4;
                        a.warn("Told to remove advancement " + v2 + " but I don't know what that is");
                    }
                    if (!bl2) break block5;
                }
                this.a(aN2);
            }
            if (!bl2) continue;
        }
    }

    public void a() {
        block3: {
            a9 a92;
            block2: {
                this.b.clear();
                boolean bl2 = aG.a();
                this.e.clear();
                this.d.clear();
                boolean bl3 = bl2;
                a92 = this.c;
                if (bl3) break block2;
                if (a92 == null) break block3;
                a92 = this.c;
            }
            a92.a();
        }
    }

    public Iterable<aN> b() {
        return this.b.values();
    }
}

