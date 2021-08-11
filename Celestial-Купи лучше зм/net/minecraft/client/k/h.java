/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Doubles
 */
package net.minecraft.client.k;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.client.a.aW;
import net.minecraft.client.k.a;
import net.minecraft.client.k.c;
import net.minecraft.client.k.m;
import net.minecraft.client.k.s;

public class h
implements Comparable<h> {
    private /* synthetic */ boolean c;
    private final /* synthetic */ double b;
    private /* synthetic */ aW g;
    private final /* synthetic */ ReentrantLock i;
    private final /* synthetic */ c d;
    private /* synthetic */ a e;
    private final /* synthetic */ s a;
    private /* synthetic */ m h;
    private final /* synthetic */ List<Runnable> f;

    public void f() {
        int[] arrn = s.r();
        this.i.lock();
        int[] arrn2 = arrn;
        try {
            h h2;
            block13: {
                block14: {
                    h2 = this;
                    if (arrn2 == null) break block13;
                    if (h2.d != net.minecraft.client.k.c.REBUILD_CHUNK) break block14;
                    h2 = this;
                    if (arrn2 == null) break block13;
                    if (h2.e != net.minecraft.client.k.a.DONE) {
                        this.a.a(false);
                    }
                }
                this.c = true;
                this.e = net.minecraft.client.k.a.DONE;
                h2 = this;
            }
            for (Runnable runnable : h2.f) {
                runnable.run();
                if (arrn2 != null && arrn2 != null) continue;
                break;
            }
        }
        finally {
            this.i.unlock();
        }
    }

    public m h() {
        return this.h;
    }

    public h(s s2, c c10, double d10) {
        this.i = new ReentrantLock();
        this.f = Lists.newArrayList();
        this.e = net.minecraft.client.k.a.PENDING;
        this.a = s2;
        this.d = c10;
        this.b = d10;
    }

    public c e() {
        return this.d;
    }

    public ReentrantLock b() {
        return this.i;
    }

    public void a(m m2) {
        this.h = m2;
    }

    public int a(h h2) {
        return Doubles.compare((double)this.b, (double)h2.b);
    }

    public aW g() {
        return this.g;
    }

    public a a() {
        return this.e;
    }

    public void a(a a10) {
        this.i.lock();
        try {
            this.e = a10;
        }
        finally {
            this.i.unlock();
        }
    }

    public boolean d() {
        return this.c;
    }

    public void a(aW aW2) {
        this.g = aW2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(Runnable runnable) {
        h h2;
        block3: {
            block4: {
                int[] arrn = s.r();
                this.i.lock();
                int[] arrn2 = arrn;
                try {
                    this.f.add(runnable);
                    h2 = this;
                    if (arrn2 == null) break block3;
                    if (!h2.c) break block4;
                }
                catch (Throwable throwable) {
                    this.i.unlock();
                    throw throwable;
                }
                runnable.run();
            }
            h2 = this;
        }
        h2.i.unlock();
    }

    public s i() {
        return this.a;
    }

    public double c() {
        return this.b;
    }
}

