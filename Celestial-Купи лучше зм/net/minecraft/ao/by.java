/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ao;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.a8;
import net.minecraft.ao.aB;
import net.minecraft.ao.aP;
import net.minecraft.ao.ac;
import net.minecraft.ao.af;
import net.minecraft.ao.ag;
import net.minecraft.ao.ax;
import net.minecraft.ao.b1;
import net.minecraft.ao.b7;
import net.minecraft.ao.bT;
import net.minecraft.ao.bl;
import net.minecraft.ao.bn;
import net.minecraft.ao.bu;
import net.minecraft.ao.bv;
import net.minecraft.ao.bw;
import net.minecraft.ao.h;
import net.minecraft.ao.t;
import net.minecraft.ao.u;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class by {
    private static final /* synthetic */ Map<Class<? extends ac>, String> b;
    private static final /* synthetic */ Logger d;
    private static final /* synthetic */ Map<String, Class<? extends ac>> c;
    private static final /* synthetic */ Map<Class<? extends u>, String> a;
    private static final /* synthetic */ Map<String, Class<? extends u>> e;

    private static Exception a(Exception exception) {
        return exception;
    }

    static void b(Class<? extends u> class_, String string) {
        e.put(string, class_);
        a.put(class_, string);
    }

    @Nullable
    public static ac b(r r2, z z2) {
        ac ac2;
        block7: {
            block6: {
                ac ac3;
                String[] arrstring;
                block5: {
                    block4: {
                        ac2 = null;
                        arrstring = u.b();
                        try {
                            Class<? extends ac> class_ = c.get(r2.j("id"));
                            Object object = class_;
                            if (arrstring != null) {
                                if (object == null) break block4;
                                object = class_.newInstance();
                            }
                            ac2 = (ac)object;
                        }
                        catch (Exception exception) {
                            d.warn("Failed Start with id {}", (Object)r2.j("id"));
                            exception.printStackTrace();
                        }
                    }
                    ac3 = ac2;
                    if (arrstring == null) break block5;
                    if (ac3 == null) break block6;
                    ac3 = ac2;
                }
                ac3.a(z2, r2);
                if (arrstring != null) break block7;
            }
            d.warn("Skipping Structure with id {}", (Object)r2.j("id"));
        }
        return ac2;
    }

    static {
        d = LogManager.getLogger();
        c = Maps.newHashMap();
        b = Maps.newHashMap();
        e = Maps.newHashMap();
        a = Maps.newHashMap();
        by.a(bw.class, "Mineshaft");
        by.a(b1.class, "Village");
        by.a(aB.class, "Fortress");
        by.a(bu.class, "Stronghold");
        by.a(a8.class, "Temple");
        by.a(bv.class, "Monument");
        by.a(ax.class, "EndCity");
        by.a(bl.class, "Mansion");
        aP.a();
        h.a();
        bT.a();
        b7.c();
        bn.a();
        af.a();
        t.a();
        ag.a();
    }

    public static String a(u u2) {
        return a.get(u2.getClass());
    }

    public static u a(r r2, z z2) {
        u u2;
        block7: {
            block6: {
                u u3;
                String[] arrstring;
                block5: {
                    block4: {
                        u2 = null;
                        arrstring = u.b();
                        try {
                            Class<? extends u> class_ = e.get(r2.j("id"));
                            Object object = class_;
                            if (arrstring != null) {
                                if (object == null) break block4;
                                object = class_.newInstance();
                            }
                            u2 = (u)object;
                        }
                        catch (Exception exception) {
                            d.warn("Failed Piece with id {}", (Object)r2.j("id"));
                            exception.printStackTrace();
                        }
                    }
                    u3 = u2;
                    if (arrstring == null) break block5;
                    if (u3 == null) break block6;
                    u3 = u2;
                }
                u3.a(z2, r2);
                if (arrstring != null) break block7;
            }
            d.warn("Skipping Piece with id {}", (Object)r2.j("id"));
        }
        return u2;
    }

    public static String a(ac ac2) {
        return b.get(ac2.getClass());
    }

    private static void a(Class<? extends ac> class_, String string) {
        c.put(string, class_);
        b.put(class_, string);
    }
}

