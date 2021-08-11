/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.SettableFuture
 *  javax.annotation.Nullable
 *  org.apache.commons.codec.digest.DigestUtils
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.comparator.LastModifiedFileComparator
 *  org.apache.commons.io.filefilter.IOFileFilter
 *  org.apache.commons.io.filefilter.TrueFileFilter
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.D;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.client.D.C;
import net.minecraft.client.D.D;
import net.minecraft.client.D.J;
import net.minecraft.client.D.M;
import net.minecraft.client.D.N;
import net.minecraft.client.D.O;
import net.minecraft.client.D.a;
import net.minecraft.client.D.g;
import net.minecraft.client.D.h;
import net.minecraft.client.D.i;
import net.minecraft.client.Q;
import net.minecraft.client.b.aX;
import net.minecraft.client.l.c;
import net.minecraft.client.v.m;
import net.minecraft.client.v.o;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w {
    private static final /* synthetic */ Logger a;
    private /* synthetic */ a e;
    private final /* synthetic */ File b;
    public final /* synthetic */ List<i> g;
    private static final /* synthetic */ FileFilter k;
    private static final /* synthetic */ v c;
    public final /* synthetic */ o d;
    private final /* synthetic */ ReentrantLock f;
    private /* synthetic */ ListenableFuture<Object> m;
    private final /* synthetic */ File h;
    private /* synthetic */ List<i> l;
    public final /* synthetic */ a j;
    private static final /* synthetic */ Pattern i;

    public File e() {
        return this.h;
    }

    private boolean a(String string, File file) {
        boolean bl2 = net.minecraft.client.D.h.b();
        try {
            String string2;
            block8: {
                boolean bl3;
                block7: {
                    string2 = DigestUtils.sha1Hex((InputStream)new FileInputStream(file));
                    bl3 = string.isEmpty();
                    if (!bl2) {
                        if (bl3) {
                            a.info("Found file {} without verification hash", (Object)file);
                            return true;
                        }
                        bl3 = string2.toLowerCase(Locale.ROOT).equals(string.toLowerCase(Locale.ROOT));
                    }
                    if (bl2) break block7;
                    if (!bl3) break block8;
                    a.info("Found file {} matching requested hash {}", (Object)file, (Object)string);
                    bl3 = true;
                }
                return bl3;
            }
            a.warn("File {} had wrong hash (expected {}, found {}).", (Object)file, (Object)string, (Object)string2);
        }
        catch (IOException iOException) {
            a.warn("File {} couldn't be hashed.", (Object)file, (Object)iOException);
        }
        return false;
    }

    private a b(File file) {
        M m2;
        block10: {
            boolean bl2;
            block12: {
                block11: {
                    bl2 = net.minecraft.client.D.h.b();
                    if (!file.isDirectory()) break block11;
                    m2 = new O(file);
                    if (!bl2) break block12;
                }
                m2 = new N(file);
            }
            try {
                m m3;
                m m4 = m3 = (m)m2.a(this.d, "pack");
                if (!bl2) {
                    if (m4 == null) break block10;
                    m4 = m3;
                }
                if (m4.b() == 2) {
                    return new D(m2);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return m2;
    }

    @Nullable
    public i j() {
        if (this.e != null) {
            i i2 = new i(this, this.e, null);
            try {
                i2.a();
                return i2;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return null;
    }

    static {
        a = LogManager.getLogger();
        k = new J();
        i = Pattern.compile("^[a-fA-F0-9]{40}$");
        c = new v("textures/misc/unknown_pack.png");
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<File> h() {
        List<File> list;
        boolean bl2 = net.minecraft.client.D.h.b();
        File file = this.h;
        if (!bl2) {
            if (!file.isDirectory()) {
                list = Collections.emptyList();
                return list;
            }
            file = this.h;
        }
        list = Arrays.asList(file.listFiles(k));
        return list;
    }

    public w(File file, File file2, a a10, o o2, c c10) {
        boolean bl2 = net.minecraft.client.D.h.b();
        boolean bl3 = bl2;
        this.f = new ReentrantLock();
        this.l = Lists.newArrayList();
        this.g = Lists.newArrayList();
        this.h = file;
        this.b = file2;
        this.j = a10;
        this.d = o2;
        this.f();
        this.l();
        Iterator<String> iterator = c10.bJ.iterator();
        block0: while (true) {
            boolean bl4 = iterator.hasNext();
            block1: while (bl4) {
                String string = iterator.next();
                for (i i2 : this.l) {
                    block6: {
                        block9: {
                            block7: {
                                int n2;
                                block8: {
                                    block5: {
                                        bl4 = i2.d().equals(string);
                                        if (bl3) continue block1;
                                        if (bl3) break block5;
                                        if (!bl4) break block6;
                                        n2 = i2.c();
                                    }
                                    if (bl3) break block7;
                                    if (n2 == 3) break block8;
                                    n2 = c10.T.contains(i2.d()) ? 1 : 0;
                                    if (bl3) break block7;
                                    if (n2 == 0) break block9;
                                }
                                n2 = this.g.add(i2) ? 1 : 0;
                            }
                            if (!bl3) continue block0;
                        }
                        iterator.remove();
                        a.warn("Removed selected resource pack {} because it's no longer compatible", (Object)i2.d());
                    }
                    if (!bl3) continue;
                }
                if (!bl3) continue block0;
            }
            break;
        }
    }

    public List<i> b() {
        return ImmutableList.copyOf(this.g);
    }

    public void k() {
        boolean bl2 = net.minecraft.client.D.h.b();
        this.f.lock();
        boolean bl3 = bl2;
        try {
            w w2 = this;
            if (!bl3) {
                if (w2.m != null) {
                    this.m.cancel(true);
                }
                this.m = null;
                w2 = this;
            }
            if (!bl3) {
                if (w2.e != null) {
                    this.e = null;
                    Q.P().A();
                }
                w2 = this;
            }
            w2.f.unlock();
        }
        catch (Throwable throwable) {
            this.f.unlock();
            throw throwable;
        }
    }

    static boolean a(w w2, String string, File file) {
        return w2.a(string, file);
    }

    static a a(w w2, File file) {
        return w2.b(file);
    }

    public void l() {
        block15: {
            boolean bl2;
            ArrayList arrayList;
            block14: {
                boolean bl3;
                arrayList = Lists.newArrayList();
                Iterator<Object> iterator = this.h().iterator();
                bl2 = net.minecraft.client.D.h.c();
                while (iterator.hasNext()) {
                    block16: {
                        i i2;
                        block17: {
                            block19: {
                                int n2;
                                int n3;
                                int n4;
                                block18: {
                                    File object = iterator.next();
                                    i2 = new i(this, object, null);
                                    bl3 = this.l.contains(i2);
                                    if (!bl2) break block14;
                                    if (!bl2) break block16;
                                    if (!bl3) break block17;
                                    n3 = n4 = this.l.indexOf(i2);
                                    n2 = -1;
                                    if (!bl2) break block18;
                                    if (n3 <= n2) break block19;
                                    n3 = n4;
                                    if (!bl2) break block19;
                                    n2 = this.l.size();
                                }
                                if (n3 < n2) {
                                    n3 = arrayList.add(this.l.get(n4)) ? 1 : 0;
                                }
                            }
                            if (bl2) break block16;
                        }
                        try {
                            i2.a();
                            arrayList.add(i2);
                        }
                        catch (Exception exception) {
                            arrayList.remove(i2);
                        }
                    }
                    if (bl2) continue;
                }
                bl3 = this.l.removeAll(arrayList);
            }
            for (i i3 : this.l) {
                i3.b();
                if (bl2) {
                    if (bl2) continue;
                }
                break block15;
            }
            this.l = arrayList;
        }
    }

    private void f() {
        block7: {
            boolean bl2;
            block4: {
                block5: {
                    boolean bl3;
                    block9: {
                        boolean bl4;
                        block8: {
                            block6: {
                                bl3 = net.minecraft.client.D.h.c();
                                bl2 = this.h.exists();
                                if (!bl3) break block4;
                                if (!bl2) break block5;
                                bl4 = this.h.isDirectory();
                                if (!bl3) break block6;
                                if (bl4) break block7;
                                bl4 = this.h.delete();
                            }
                            if (!bl3) break block8;
                            if (!bl4) break block9;
                            bl4 = this.h.mkdirs();
                        }
                        if (bl4) break block7;
                    }
                    a.warn("Unable to recreate resourcepack folder, it exists but is not a directory: {}", (Object)this.h);
                    if (bl3) break block7;
                }
                bl2 = this.h.mkdirs();
            }
            if (!bl2) {
                a.warn("Unable to create resourcepack folder: {}", (Object)this.h);
            }
        }
    }

    static Logger g() {
        return a;
    }

    @Nullable
    public a a() {
        return this.e;
    }

    private boolean a(File file) {
        i i2 = new i(this, file, null);
        try {
            i2.a();
            return true;
        }
        catch (Exception exception) {
            a.warn("Server resourcepack is invalid, ignoring it", (Throwable)exception);
            return false;
        }
    }

    private void c() {
        boolean bl2 = net.minecraft.client.D.h.b();
        try {
            ArrayList arrayList = Lists.newArrayList((Iterable)FileUtils.listFiles((File)this.b, (IOFileFilter)TrueFileFilter.TRUE, null));
            Collections.sort(arrayList, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
            int n2 = 0;
            for (File file : arrayList) {
                if (!bl2) {
                    int n3 = n2++;
                    if (!bl2 && n3 >= 10) {
                        a.info("Deleting old server resource pack {}", (Object)file.getName());
                        n3 = FileUtils.deleteQuietly((File)file) ? 1 : 0;
                    }
                    if (!bl2) continue;
                }
                break;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.error("Error while deleting old server resource pack : {}", (Object)illegalArgumentException.getMessage());
        }
    }

    static v i() {
        return c;
    }

    public ListenableFuture<Object> c(File file) {
        boolean bl2 = net.minecraft.client.D.h.b();
        w w2 = this;
        if (!bl2) {
            if (!w2.a(file)) {
                return Futures.immediateFailedFuture((Throwable)new RuntimeException("Invalid resourcepack"));
            }
            w2 = this;
        }
        w2.e = new N(file);
        return Q.P().A();
    }

    public static Map<String, String> d() {
        HashMap hashMap = Maps.newHashMap();
        hashMap.put("X-Minecraft-Username", Q.P().aR().b());
        hashMap.put("X-Minecraft-UUID", Q.P().aR().a());
        hashMap.put("X-Minecraft-Version", "1.12.2");
        return hashMap;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void a(List<i> list) {
        this.g.clear();
        this.g.addAll(list);
    }

    public List<i> m() {
        return ImmutableList.copyOf(this.l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture<Object> a(String string, String string2) {
        String string3 = DigestUtils.sha1Hex((String)string);
        boolean bl2 = net.minecraft.client.D.h.b();
        String string4 = i.matcher(string2).matches() ? string2 : "";
        File file = new File(this.b, string3);
        this.f.lock();
        try {
            ListenableFuture<Object> listenableFuture;
            ListenableFuture<Object> listenableFuture2;
            this.k();
            if (!bl2) {
                if (file.exists()) {
                    boolean bl3 = this.a(string4, file);
                    if (!bl2) {
                        if (bl3) {
                            ListenableFuture<Object> listenableFuture3;
                            ListenableFuture<Object> listenableFuture4;
                            ListenableFuture<Object> listenableFuture5 = listenableFuture4 = (listenableFuture3 = this.c(file));
                            return listenableFuture5;
                        }
                        a.warn("Deleting file {}", (Object)file);
                        bl3 = FileUtils.deleteQuietly((File)file);
                    }
                }
                this.c();
            }
            aX aX2 = new aX();
            Map<String, String> map = w.d();
            Q q2 = Q.P();
            Futures.getUnchecked(q2.a(new g(this, q2, aX2)));
            SettableFuture settableFuture = SettableFuture.create();
            this.m = net.minecraft.ar.O.a(file, string, map, 0x3200000, aX2, q2.au());
            Futures.addCallback(this.m, (FutureCallback)new C(this, string4, file, settableFuture));
            ListenableFuture<Object> listenableFuture6 = listenableFuture2 = (listenableFuture = this.m);
            return listenableFuture6;
        }
        finally {
            this.f.unlock();
        }
    }
}

