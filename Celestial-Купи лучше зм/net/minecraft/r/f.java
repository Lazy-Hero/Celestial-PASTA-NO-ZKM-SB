/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class f
implements a {
    private static final /* synthetic */ Random a;

    @Override
    public int a() {
        return 502;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(int n2) {
        String string = m.b();
        int n3 = n2;
        if (string == null) {
            if (n3 < 0) return -1;
            n3 = n2;
        }
        if (string != null) return n3;
        if (n3 >= 6) return -1;
        n3 = n2;
        return n3;
    }

    @Override
    public r a(r r2) {
        r r3;
        block10: {
            block9: {
                String string;
                r r4;
                block11: {
                    block12: {
                        int n2;
                        block14: {
                            int n3;
                            block13: {
                                boolean bl2;
                                String string2;
                                block8: {
                                    string2 = m.b();
                                    bl2 = "Zombie".equals(r2.j("id"));
                                    if (string2 != null) break block8;
                                    if (!bl2) break block9;
                                    r3 = r2;
                                    if (string2 != null) break block10;
                                    bl2 = r3.f("IsVillager");
                                }
                                if (!bl2) break block9;
                                r4 = r2;
                                string = "ZombieType";
                                if (string2 != null) break block11;
                                if (r4.a(string, 99)) break block12;
                                n2 = -1;
                                n3 = r2.a("VillagerProfession", 99);
                                if (string2 == null) {
                                    if (n3 != 0) {
                                        try {
                                            n2 = this.a(r2.m("VillagerProfession"));
                                        }
                                        catch (RuntimeException runtimeException) {
                                            // empty catch block
                                        }
                                    }
                                    n3 = n2;
                                }
                                if (string2 != null) break block13;
                                if (n3 != -1) break block14;
                                n3 = this.a(a.nextInt(6));
                            }
                            n2 = n3;
                        }
                        r2.b("ZombieType", n2);
                    }
                    r4 = r2;
                    string = "IsVillager";
                }
                r4.k(string);
            }
            r3 = r2;
        }
        return r3;
    }

    static {
        a = new Random();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

