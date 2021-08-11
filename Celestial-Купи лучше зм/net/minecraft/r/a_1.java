/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.r.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a
implements net.minecraft.av.a {
    private static final /* synthetic */ Logger a;

    @Override
    public int a() {
        return 1125;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        a = LogManager.getLogger();
    }

    @Override
    public r a(r r2) {
        block6: {
            int n2 = 416;
            String string = m.b();
            try {
                r r3 = r2.h("Level");
                int n3 = r3.m("xPos");
                int n4 = r3.m("zPos");
                u u2 = r3.c("TileEntities", 10);
                u u3 = r3.c("Sections", 10);
                int n5 = 0;
                block2: while (true) {
                    int n6 = n5;
                    int n7 = u3.b();
                    block3: while (n6 < n7) {
                        r r4 = u3.d(n5);
                        byte by2 = r4.r("Y");
                        byte[] arrby = r4.a("Blocks");
                        if (string != null) break block6;
                        for (int i2 = 0; i2 < arrby.length; ++i2) {
                            int n8;
                            int n9;
                            n6 = 416;
                            n7 = (arrby[i2] & 0xFF) << 4;
                            if (string != null) continue block3;
                            if (string == null) {
                                if (n6 != n7) continue;
                                n9 = i2;
                                n8 = 15;
                            }
                            int n10 = n9 & n8;
                            int n11 = i2 >> 8 & 0xF;
                            int n12 = i2 >> 4 & 0xF;
                            r r5 = new r();
                            r5.a("id", "bed");
                            r5.b("x", n10 + (n3 << 4));
                            r5.b("y", n11 + (by2 << 4));
                            r5.b("z", n12 + (n4 << 4));
                            u2.a(r5);
                            if (string == null) continue;
                        }
                        ++n5;
                        if (string == null) continue block2;
                    }
                    break block6;
                    break;
                }
                {
                    break block6;
                    break;
                }
            }
            catch (Exception exception) {
                a.warn("Unable to datafix Bed blocks, level format may be missing tags.");
            }
        }
        return r2;
    }
}

