/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.t;

import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.P.r;
import net.minecraft.ab.a;
import net.minecraft.ah.L;
import net.minecraft.ar.u;
import net.minecraft.aw.p;
import net.minecraft.aw.w;
import net.minecraft.client.O;
import net.minecraft.k.m;
import net.minecraft.t.b;
import net.minecraft.t.c;
import net.minecraft.t.d;
import net.minecraft.t.f;
import net.minecraft.t.i;
import net.minecraft.t.k;
import net.minecraft.t.l;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class g
extends p {
    private static final /* synthetic */ Logger d;

    @Override
    public void a() {
        net.minecraft.t.d.a();
    }

    public g(File file, net.minecraft.av.b b10) {
        super(file, b10);
    }

    private void a(File file, Iterable<File> iterable, net.minecraft.A.b b10, int n2, int n3, u u2) {
        Iterator<File> iterator = iterable.iterator();
        int n4 = f.d();
        while (iterator.hasNext()) {
            File file2 = iterator.next();
            this.a(file, file2, b10, n2, n3, u2);
            int n5 = (int)Math.round(100.0 * (double)(++n2) / (double)n3);
            u2.a(n5);
            if (n4 != 0) continue;
        }
    }

    private void a(File file, Collection<File> collection) {
        block0: {
            File file2 = new File(file, "region");
            File[] arrfile = file2.listFiles(new k(this));
            if (arrfile == null) break block0;
            Collections.addAll(collection, arrfile);
        }
    }

    static {
        d = LogManager.getLogger();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c(String string) {
        w w2 = this.f(string);
        int n2 = f.e();
        w w3 = w2;
        if (n2 == 0) {
            if (w3 == null) return 0 != 0;
            w3 = w2;
        }
        int n3 = w3.z();
        if (n2 != 0) return n3 != 0;
        if (n3 != 19132) return 0 != 0;
        return 1 != 0;
    }

    private void a(File file, File file2, net.minecraft.A.b b10, int n2, int n3, u u2) {
        block11: {
            int n4 = f.e();
            try {
                String string = file2.getName();
                i i2 = new i(file2);
                i i3 = new i(new File(file, string.substring(0, string.length() - ".mcr".length()) + ".mca"));
                int n5 = 0;
                while (n5 < 32) {
                    int n6;
                    int n7;
                    block12: {
                        int n8;
                        if (n4 != 0) break block11;
                        for (n7 = 0; n7 < 32; ++n7) {
                            DataInputStream dataInputStream;
                            int n9;
                            int n10;
                            i i4;
                            block14: {
                                boolean bl2;
                                block13: {
                                    n8 = i2.b(n5, n7);
                                    if (n4 != 0) break block12;
                                    if (n4 != 0) break block13;
                                    if (n8 == 0) continue;
                                    i4 = i3;
                                    n10 = n5;
                                    n9 = n7;
                                    if (n4 != 0) break block14;
                                    bl2 = i4.b(n10, n9);
                                }
                                if (bl2) continue;
                                i4 = i2;
                                n10 = n5;
                                n9 = n7;
                            }
                            DataInputStream dataInputStream2 = dataInputStream = i4.a(n10, n9);
                            if (n4 == 0) {
                                if (dataInputStream2 == null) {
                                    d.warn("Failed to fetch input stream");
                                    if (n4 == 0) continue;
                                }
                                dataInputStream2 = dataInputStream;
                            }
                            r r2 = net.minecraft.P.f.a(dataInputStream2);
                            dataInputStream.close();
                            r r3 = r2.h("Level");
                            c c10 = b.a(r3);
                            r r4 = new r();
                            r r5 = new r();
                            r4.a("Level", r5);
                            b.a(c10, r5, b10);
                            DataOutputStream dataOutputStream = i3.c(n5, n7);
                            net.minecraft.P.f.a(r4, (DataOutput)dataOutputStream);
                            dataOutputStream.close();
                            if (n4 == 0) continue;
                        }
                        n7 = (int)Math.round(100.0 * (double)(n2 * 1024) / (double)(n3 * 1024));
                        n8 = n6 = (int)Math.round(100.0 * (double)((n5 + 1) * 32 + n2 * 1024) / (double)(n3 * 1024));
                    }
                    if (n4 == 0) {
                        if (n6 > n7) {
                            u2.a(n6);
                        }
                        ++n5;
                    }
                    if (n4 == 0) continue;
                }
                i2.a();
                i3.a();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(String string) {
        w w2 = this.f(string);
        int n2 = f.e();
        w w3 = w2;
        if (n2 == 0) {
            if (w3 == null) return 0 != 0;
            w3 = w2;
        }
        int n3 = w3.z();
        if (n2 != 0) return n3 != 0;
        if (n3 == this.a()) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public net.minecraft.aw.b a(String string, boolean bl2) {
        return new l(this.c, string, bl2, this.a);
    }

    @Override
    public List<net.minecraft.aw.c> b() throws O {
        block6: {
            File[] arrfile;
            boolean bl2;
            int n2;
            block7: {
                File file;
                block5: {
                    n2 = f.d();
                    file = this.c;
                    if (n2 == 0) break block5;
                    if (file == null) break block6;
                    file = this.c;
                }
                bl2 = file.exists();
                if (n2 == 0) break block7;
                if (!bl2) break block6;
                bl2 = this.c.isDirectory();
            }
            if (!bl2) break block6;
            ArrayList arrayList = Lists.newArrayList();
            File[] arrfile2 = arrfile = this.c.listFiles();
            int n3 = arrfile2.length;
            int n4 = 0;
            while (n4 < n3) {
                block8: {
                    block9: {
                        String string;
                        boolean bl3;
                        w w2;
                        String string2;
                        block14: {
                            String string3;
                            block13: {
                                boolean bl4;
                                block12: {
                                    boolean bl5;
                                    block10: {
                                        block11: {
                                            File file = arrfile2[n4];
                                            if (n2 == 0) break block8;
                                            if (!file.isDirectory()) break block9;
                                            string2 = file.getName();
                                            w2 = this.f(string2);
                                            if (n2 == 0) break block8;
                                            if (w2 == null) break block9;
                                            boolean bl5 = w2.z();
                                            bl5 = BADBOOL 19132;
                                            if (n2 == 0) break block10;
                                            if (bl4 == bl5) break block11;
                                            boolean bl5 = w2.z();
                                            bl5 = BADBOOL 19133;
                                            if (n2 == 0) break block10;
                                            if (bl4 != bl5) break block9;
                                        }
                                        bl4 = w2.z();
                                        if (n2 == 0) break block12;
                                        bl5 = this.a();
                                    }
                                    bl4 = bl4 != bl5;
                                }
                                bl3 = bl4;
                                string3 = string = w2.p();
                                if (n2 == 0) break block13;
                                if (!StringUtils.isEmpty((CharSequence)string3)) break block14;
                                string3 = string2;
                            }
                            string = string3;
                        }
                        long l2 = 0L;
                        arrayList.add(new net.minecraft.aw.c(w2, string2, string, 0L, bl3));
                    }
                    ++n4;
                }
                if (n2 != 0) continue;
            }
            return arrayList;
        }
        throw new O(net.minecraft.ab.a.a("selectWorld.load_folder_access"));
    }

    protected int a() {
        return 19133;
    }

    @Override
    public boolean a(String string, u u2) {
        net.minecraft.A.b b10;
        w w2;
        int n2;
        int n3;
        File file;
        File file2;
        File file3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        block11: {
            block10: {
                w w3;
                block9: {
                    u2.a(0);
                    arrayList3 = Lists.newArrayList();
                    arrayList2 = Lists.newArrayList();
                    arrayList = Lists.newArrayList();
                    file3 = new File(this.c, string);
                    file2 = new File(file3, "DIM-1");
                    file = new File(file3, "DIM1");
                    n3 = f.d();
                    d.info("Scanning folders...");
                    this.a(file3, arrayList3);
                    int n4 = file2.exists();
                    if (n3 != 0) {
                        if (n4 != 0) {
                            this.a(file2, arrayList2);
                        }
                        n4 = file.exists();
                    }
                    if (n3 != 0) {
                        if (n4 != 0) {
                            this.a(file, arrayList);
                        }
                        n4 = arrayList3.size() + arrayList2.size() + arrayList.size();
                    }
                    n2 = n4;
                    d.info("Total conversion count is {}", (Object)n2);
                    w3 = w2 = this.f(string);
                    if (n3 == 0) break block9;
                    if (w3 == null) break block10;
                    w3 = w2;
                }
                if (w3.w() != L.g) break block10;
                b10 = new net.minecraft.A.c(net.minecraft.u.d.s);
                if (n3 != 0) break block11;
                m.b(!m.d());
            }
            b10 = new net.minecraft.A.b(w2);
        }
        this.a(new File(file3, "region"), arrayList3, b10, 0, n2, u2);
        this.a(new File(file2, "region"), arrayList2, (net.minecraft.A.b)new net.minecraft.A.c(net.minecraft.u.d.R), arrayList3.size(), n2, u2);
        this.a(new File(file, "region"), arrayList, (net.minecraft.A.b)new net.minecraft.A.c(net.minecraft.u.d.ah), arrayList3.size() + arrayList2.size(), n2, u2);
        w2.c(19133);
        if (n3 != 0) {
            if (w2.w() == L.j) {
                w2.a(L.a);
            }
            this.a(string);
        }
        net.minecraft.aw.b b11 = this.a(string, false);
        b11.a(w2);
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void a(String string) {
        block3: {
            File file;
            File file2;
            File file3;
            block4: {
                File file4;
                block5: {
                    File file5;
                    int n2;
                    block1: {
                        block2: {
                            file4 = new File(this.c, string);
                            n2 = f.d();
                            file5 = file4;
                            if (n2 == 0) break block1;
                            if (file5.exists()) break block2;
                            d.warn("Unable to create level.dat_mcr backup");
                            if (n2 != 0) break block3;
                        }
                        file5 = new File(file4, "level.dat");
                    }
                    file2 = file3 = file5;
                    if (n2 == 0) break block4;
                    if (file2.exists()) break block5;
                    d.warn("Unable to create level.dat_mcr backup");
                    if (n2 != 0) break block3;
                }
                file2 = new File(file4, "level.dat_mcr");
            }
            if (!file3.renameTo(file = file2)) {
                d.warn("Unable to create level.dat_mcr backup");
            }
        }
    }

    @Override
    public String c() {
        return "Anvil";
    }
}

