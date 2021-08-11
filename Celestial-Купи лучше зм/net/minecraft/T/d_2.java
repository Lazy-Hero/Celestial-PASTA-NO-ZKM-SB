/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.t;

import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.t.f;
import net.minecraft.t.i;

public class d {
    private static final /* synthetic */ Map<File, i> a;

    public static DataInputStream e(File file, int n2, int n3) {
        i i2 = d.b(file, n2, n3);
        return i2.a(n2 & 0x1F, n3 & 0x1F);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(File file, int n2, int n3) {
        i i2 = d.a(file, n2, n3);
        int n4 = f.d();
        i i3 = i2;
        if (n4 != 0) {
            if (i3 == null) return false;
            i3 = i2;
        }
        boolean bl2 = i3.b(n2 & 0x1F, n3 & 0x1F);
        if (n4 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static synchronized i b(File file, int n2, int n3) {
        File file2;
        int n4;
        File file3;
        block7: {
            i i2;
            block6: {
                i i3;
                file3 = new File(file, "region");
                n4 = f.e();
                file2 = new File(file3, "r." + (n2 >> 5) + "." + (n3 >> 5) + ".mca");
                i2 = i3 = a.get(file2);
                if (n4 != 0) break block6;
                if (i2 == null) break block7;
                i2 = i3;
            }
            return i2;
        }
        int n5 = file3.exists();
        if (n4 == 0) {
            if (n5 == 0) {
                file3.mkdirs();
            }
            n5 = a.size();
        }
        if (n5 >= 256) {
            d.a();
        }
        i i4 = new i(file2);
        a.put(file2, i4);
        return i4;
    }

    public static synchronized i a(File file, int n2, int n3) {
        block10: {
            int n4;
            File file2;
            block11: {
                int n5;
                block9: {
                    File file3;
                    block8: {
                        i i2;
                        block7: {
                            file3 = new File(file, "region");
                            file2 = new File(file3, "r." + (n2 >> 5) + "." + (n3 >> 5) + ".mca");
                            i i3 = a.get(file2);
                            n5 = f.d();
                            i2 = i3;
                            if (n5 == 0) break block7;
                            if (i2 == null) break block8;
                            i2 = i3;
                        }
                        return i2;
                    }
                    n4 = file3.exists();
                    if (n5 == 0) break block9;
                    if (n4 == 0) break block10;
                    n4 = file2.exists();
                }
                if (n5 == 0) break block11;
                if (n4 == 0) break block10;
                n4 = a.size();
            }
            if (n4 >= 256) {
                d.a();
            }
            i i4 = new i(file2);
            a.put(file2, i4);
            return i4;
        }
        return null;
    }

    public static DataOutputStream d(File file, int n2, int n3) {
        i i2 = d.b(file, n2, n3);
        return i2.c(n2 & 0x1F, n3 & 0x1F);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static synchronized void a() {
        block7: {
            Iterator<i> iterator = a.values().iterator();
            int n2 = f.d();
            while (iterator.hasNext()) {
                block8: {
                    i i2 = iterator.next();
                    try {
                        if (n2 == 0) break block7;
                        i i3 = i2;
                        if (n2 != 0) {
                            if (i3 == null) break block8;
                            i3 = i2;
                        }
                        i3.a();
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
                if (n2 != 0) continue;
            }
            a.clear();
        }
    }

    static {
        a = Maps.newHashMap();
    }
}

