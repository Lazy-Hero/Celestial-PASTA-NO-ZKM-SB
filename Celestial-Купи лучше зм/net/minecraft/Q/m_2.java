/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.q;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.ar.Z;
import net.minecraft.c.l;
import net.minecraft.q.f;
import net.minecraft.q.h;
import net.minecraft.q.r;
import net.minecraft.q.s;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class m {
    private final /* synthetic */ Map<Integer, s<?>> e;
    private final /* synthetic */ ReadWriteLock b;
    private /* synthetic */ boolean c;
    private static /* synthetic */ net.minecraft.k.m[] f;
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ x d;
    private static final /* synthetic */ Map<Class<? extends x>, Integer> h;
    private /* synthetic */ boolean g;

    @Nullable
    public static List<s<?>> b(net.minecraft.C.m m2) throws IOException {
        List list;
        block6: {
            short s2;
            List list2 = null;
            net.minecraft.k.m[] arrm = m.b();
            while ((s2 = m2.readUnsignedByte()) != 255) {
                block8: {
                    ArrayList arrayList;
                    block7: {
                        list = list2;
                        if (arrm == null) break block6;
                        if (arrm == null) break block7;
                        if (list != null) break block8;
                        arrayList = Lists.newArrayList();
                    }
                    list2 = arrayList;
                }
                int n2 = m2.a();
                f<?> f10 = net.minecraft.q.h.a(n2);
                if (arrm != null) {
                    if (f10 == null) {
                        throw new DecoderException("Unknown serializer type " + n2);
                    }
                    list2.add(new s(f10.a(s2), f10.a(m2)));
                }
                if (arrm != null) continue;
            }
            list = list2;
        }
        return list;
    }

    protected <T> void a(s<T> s2, s<?> s3) {
        s2.a(s3.c());
    }

    public static net.minecraft.k.m[] b() {
        return f;
    }

    public m(x x2) {
        this.e = Maps.newHashMap();
        this.b = new ReentrantReadWriteLock();
        this.c = true;
        this.d = x2;
    }

    public <T> void c(r<T> r2) {
        s.a(this.a(r2), true);
        this.g = true;
    }

    private <T> void a(r<T> r2, T t2) {
        s<T> s2 = new s<T>(r2, t2);
        this.b.writeLock().lock();
        this.e.put(r2.a(), s2);
        this.c = false;
        this.b.writeLock().unlock();
    }

    public boolean c() {
        return this.c;
    }

    public static void b(net.minecraft.k.m[] arrm) {
        f = arrm;
    }

    public static <T> r<T> a(Class<? extends x> class_, f<T> f10) {
        int n2;
        if (a.isDebugEnabled()) {
            try {
                Class<?> class_2 = Class.forName(d6.a(Thread.currentThread().getStackTrace()[2].getClassName()));
                if (!class_2.equals(class_)) {
                    a.debug("defineId called for: {} from {}", class_, class_2, (Object)new RuntimeException());
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        if (h.containsKey(class_)) {
            n2 = h.get(class_) + 1;
        } else {
            int n3 = 0;
            Class<? extends x> class_3 = class_;
            while (class_3 != x.class) {
                if (!h.containsKey(class_3 = class_3.getSuperclass())) continue;
                n3 = h.get(class_3) + 1;
                break;
            }
            n2 = n3;
        }
        if (n2 > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + n2 + "! (Max is " + 254 + ")");
        }
        h.put(class_, n2);
        return f10.a(n2);
    }

    public static void a(List<s<?>> list, net.minecraft.C.m m2) throws IOException {
        net.minecraft.k.m[] arrm = m.b();
        if (arrm != null) {
            if (list != null) {
                int n2 = list.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    s<?> s2 = list.get(i2);
                    m.a(m2, s2);
                    if (arrm != null) {
                        if (arrm != null) continue;
                    }
                    break;
                }
            } else {
                m2.writeByte(255);
            }
        }
    }

    public boolean e() {
        return this.g;
    }

    public <T> void b(r<T> r2, T t2) {
        block3: {
            block2: {
                s<T> s2 = this.a(r2);
                net.minecraft.k.m[] arrm = m.b();
                if (arrm == null) break block2;
                if (!ObjectUtils.notEqual(t2, s2.c())) break block3;
                s2.a(t2);
                this.d.a(r2);
                s2.a(true);
            }
            this.g = true;
        }
    }

    @Nullable
    public List<s<?>> f() {
        List list;
        block4: {
            List list2 = null;
            net.minecraft.k.m[] arrm = m.b();
            this.b.readLock().lock();
            for (s<?> s2 : this.e.values()) {
                list = list2;
                if (arrm != null) {
                    List list3;
                    if (arrm != null) {
                        if (list == null) {
                            list2 = Lists.newArrayList();
                        }
                        list3 = list2;
                    }
                    list3.add(s2.a());
                    if (arrm != null) continue;
                }
                break block4;
            }
            this.b.readLock().unlock();
            list = list2;
        }
        return list;
    }

    public <T> T b(r<T> r2) {
        return this.a(r2).c();
    }

    public void a(List<s<?>> list) {
        block3: {
            this.b.writeLock().lock();
            Iterator<s<?>> iterator = list.iterator();
            net.minecraft.k.m[] arrm = m.b();
            while (iterator.hasNext()) {
                block5: {
                    s<?> s2;
                    block4: {
                        s2 = iterator.next();
                        s<?> s3 = this.e.get(s2.d().a());
                        if (arrm == null) break block3;
                        if (arrm == null) break block4;
                        if (s3 == null) break block5;
                        this.a(s3, s2);
                    }
                    this.d.a(s2.d());
                }
                if (arrm != null) continue;
            }
            this.b.writeLock().unlock();
            this.g = true;
        }
    }

    static {
        a = LogManager.getLogger();
        m.b(new net.minecraft.k.m[1]);
        h = Maps.newHashMap();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void a(net.minecraft.C.m m2) throws IOException {
        block2: {
            this.b.readLock().lock();
            Iterator<s<?>> iterator = this.e.values().iterator();
            net.minecraft.k.m[] arrm = m.b();
            while (iterator.hasNext()) {
                s<?> s2 = iterator.next();
                m.a(m2, s2);
                if (arrm != null) {
                    if (arrm != null) continue;
                    net.minecraft.k.m.b(!net.minecraft.k.m.d());
                    break;
                }
                break block2;
            }
            this.b.readLock().unlock();
            m2.writeByte(255);
        }
    }

    private <T> s<T> a(r<T> r2) {
        s<?> s2;
        this.b.readLock().lock();
        try {
            s2 = this.e.get(r2.a());
        }
        catch (Throwable throwable) {
            net.minecraft.c.f f10 = net.minecraft.c.f.a(throwable, "Getting synched entity data");
            l l2 = f10.a("Synched entity data");
            l2.a("Data ID", r2);
            throw new Z(f10);
        }
        this.b.readLock().unlock();
        return s2;
    }

    private static <T> void a(net.minecraft.C.m m2, s<T> s2) throws IOException {
        r<T> r2 = s2.d();
        int n2 = net.minecraft.q.h.b(r2.b());
        net.minecraft.k.m[] arrm = m.b();
        if (arrm != null) {
            if (n2 < 0) {
                throw new EncoderException("Unknown serializer type " + r2.b());
            }
            m2.writeByte(r2.a());
            m2.d(n2);
            r2.b().a(m2, s2.c());
        }
    }

    public void g() {
        block2: {
            this.g = false;
            this.b.readLock().lock();
            Iterator<s<?>> iterator = this.e.values().iterator();
            net.minecraft.k.m[] arrm = m.b();
            while (iterator.hasNext()) {
                s<?> s2 = iterator.next();
                s2.a(false);
                if (arrm != null) {
                    if (arrm != null) continue;
                }
                break block2;
            }
            this.b.readLock().unlock();
        }
    }

    @Nullable
    public List<s<?>> d() {
        List list;
        block6: {
            block8: {
                m m2;
                net.minecraft.k.m[] arrm;
                block7: {
                    list = null;
                    arrm = m.b();
                    m2 = this;
                    if (arrm == null) break block7;
                    if (!m2.g) break block8;
                    this.b.readLock().lock();
                    m2 = this;
                }
                for (s<?> s2 : m2.e.values()) {
                    block10: {
                        s<?> s3;
                        block9: {
                            if (arrm == null) break block6;
                            s3 = s2;
                            if (arrm == null) break block9;
                            if (!s3.b()) break block10;
                            s3 = s2;
                        }
                        s3.a(false);
                        List list2 = list;
                        if (arrm != null) {
                            if (list2 == null) {
                                list = Lists.newArrayList();
                            }
                            list2 = list;
                        }
                        list2.add(s2.a());
                    }
                    if (arrm != null) continue;
                }
                this.b.readLock().unlock();
            }
            this.g = false;
        }
        return list;
    }

    public <T> void c(r<T> r2, T t2) {
        block5: {
            int n2 = r2.a();
            net.minecraft.k.m[] arrm = m.b();
            int n3 = n2;
            if (arrm != null) {
                if (n3 > 254) {
                    throw new IllegalArgumentException("Data value id is too big with " + n2 + "! (Max is " + 254 + ")");
                }
                n3 = this.e.containsKey(n2) ? 1 : 0;
            }
            if (arrm != null) {
                if (n3 != 0) {
                    throw new IllegalArgumentException("Duplicate id value for " + n2 + "!");
                }
                n3 = net.minecraft.q.h.b(r2.b());
            }
            if (n3 < 0) {
                throw new IllegalArgumentException("Unregistered serializer " + r2.b() + " for " + n2 + "!");
            }
            this.a(r2, t2);
            if (net.minecraft.k.m.d()) break block5;
            m.b(new net.minecraft.k.m[3]);
        }
    }
}

