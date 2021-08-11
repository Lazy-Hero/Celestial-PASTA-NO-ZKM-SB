/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.k;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import net.minecraft.ar.aC;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.R;
import net.minecraft.client.a.aW;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.k.f;
import net.minecraft.client.k.g;
import net.minecraft.client.k.h;
import net.minecraft.client.k.k;
import net.minecraft.client.k.l;
import net.minecraft.client.k.m;
import net.minecraft.client.k.s;
import net.minecraft.client.k.t;
import net.minecraft.client.k.u;
import net.minecraft.client.y.c;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b {
    private static final /* synthetic */ Logger j;
    private static final /* synthetic */ ThreadFactory h;
    private final /* synthetic */ g k;
    private final /* synthetic */ R c;
    private final /* synthetic */ PriorityBlockingQueue<h> d;
    private final /* synthetic */ BlockingQueue<aW> f;
    private final /* synthetic */ Queue<u> g;
    private final /* synthetic */ List<Thread> i;
    private final /* synthetic */ net.minecraft.client.a.Q b;
    private final /* synthetic */ int a;
    private final /* synthetic */ List<g> e;

    public void e() {
        block4: {
            int[] arrn = s.r();
            this.b();
            int[] arrn2 = arrn;
            ArrayList arrayList = Lists.newArrayList();
            while (arrayList.size() != this.a) {
                this.a(Long.MAX_VALUE);
                try {
                    arrayList.add(this.a());
                    if (arrn2 != null) {
                        continue;
                    }
                    break block4;
                }
                catch (InterruptedException interruptedException) {
                    if (arrn2 != null) continue;
                }
            }
            this.f.addAll(arrayList);
        }
    }

    public b(int n2) {
        block15: {
            block11: {
                int n3;
                int n4;
                int[] arrn;
                block14: {
                    block13: {
                        block12: {
                            int[] arrn2 = s.r();
                            this.i = Lists.newArrayList();
                            this.e = Lists.newArrayList();
                            this.d = Queues.newPriorityBlockingQueue();
                            arrn = arrn2;
                            this.b = new net.minecraft.client.a.Q();
                            this.c = new R();
                            this.g = Queues.newPriorityQueue();
                            int n5 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / 0xA00000);
                            n4 = Math.max(1, net.minecraft.k.h.c(Runtime.getRuntime().availableProcessors(), 1, n5 / 5));
                            if (arrn == null) break block12;
                            if (n2 >= 0) break block13;
                            this.a = net.minecraft.k.h.c(n4, 1, n5);
                        }
                        if (arrn != null) break block14;
                    }
                    this.a = n2;
                }
                int n6 = n4;
                if (arrn != null) {
                    if (n6 > 1) {
                        for (n3 = 0; n3 < n4; ++n3) {
                            g g10 = new g(this);
                            Thread thread = h.newThread(g10);
                            thread.start();
                            this.e.add(g10);
                            this.i.add(thread);
                            if (arrn != null) {
                                if (arrn != null) continue;
                            }
                            break;
                        }
                    } else {
                        this.f = Queues.newArrayBlockingQueue((int)this.a);
                    }
                    n6 = n3 = 0;
                }
                while (n3 < this.a) {
                    this.f.add(new aW());
                    ++n3;
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block11;
                }
                this.k = new g(this, new aW());
            }
            if (!net.minecraft.k.m.c()) break block15;
            s.b(new int[2]);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean a(long l2) {
        long l3;
        int n2 = 0;
        int[] arrn = s.r();
        do {
            Object object;
            Queue<Comparable<h>> queue;
            int n3;
            block10: {
                block9: {
                    n3 = 0;
                    if (!this.i.isEmpty()) break block9;
                    queue = this.d;
                    if (arrn == null || arrn == null) break block10;
                    object = (h)((PriorityBlockingQueue)queue).poll();
                    if (object != null) {
                        try {
                            this.k.b((h)object);
                            n3 = 1;
                        }
                        catch (InterruptedException interruptedException) {
                            j.warn("Skipped task due to interrupt");
                        }
                    }
                }
                queue = this.g;
            }
            object = queue;
            // MONITORENTER : queue
            Object object2 = this.g;
            if (arrn != null) {
                if (!object2.isEmpty()) {
                    u.b(this.g.poll()).run();
                    n3 = 1;
                    n2 = 1;
                }
                object2 = object;
            }
            // MONITOREXIT : object2
            long l4 = l2 - 0L;
            l3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (arrn == null) return (boolean)l3;
            if (l3 == false) break;
            l3 = n3;
            if (arrn == null) return (boolean)l3;
        } while (l3 != false && (l2 >= System.nanoTime() || arrn == null) && arrn != null);
        l3 = n2;
        return (boolean)l3;
    }

    static {
        j = LogManager.getLogger();
        h = new ThreadFactoryBuilder().setNameFormat("Chunk Batcher %d").setDaemon(true).build();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(s s2) {
        boolean bl2;
        int[] arrn = s.r();
        s2.q().lock();
        int[] arrn2 = arrn;
        try {
            boolean bl3;
            block8: {
                boolean bl4;
                h h2;
                h h3;
                block7: {
                    h2 = h3 = s2.l();
                    if (arrn2 == null) break block7;
                    if (h2 == null) break block8;
                    h2 = h3;
                }
                h2.a(new f(this, h3));
                boolean bl5 = bl4 = this.d.offer(h3);
                return bl5;
            }
            bl2 = bl3 = true;
        }
        finally {
            s2.q().unlock();
        }
        return bl2;
    }

    public h g() throws InterruptedException {
        return this.d.take();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(s s2) {
        boolean bl2;
        s2.q().lock();
        try {
            h h2 = s2.o();
            try {
                this.k.b(h2);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            bl2 = true;
        }
        finally {
            s2.q().unlock();
        }
        return bl2;
    }

    public String c() {
        return this.i.isEmpty() ? String.format("pC: %03d, single-threaded", this.d.size()) : String.format("pC: %03d, pU: %1d, aB: %1d", this.d.size(), this.g.size(), this.f.size());
    }

    public void a(aW aW2) {
        this.f.add(aW2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture<Object> a(aC aC2, I i2, s s2, m m2, double d10) {
        block6: {
            block8: {
                block7: {
                    boolean bl2;
                    int[] arrn;
                    block5: {
                        arrn = s.r();
                        bl2 = Q.P().d();
                        if (arrn == null) break block5;
                        if (!bl2) break block6;
                        bl2 = as.f();
                    }
                    if (!bl2) break block7;
                    this.a(i2, s2.a(aC2.ordinal()));
                    if (arrn != null) break block8;
                }
                this.a(i2, ((t)s2).a(aC2, m2), s2);
            }
            i2.a(0.0, 0.0, 0.0);
            return Futures.immediateFuture(null);
        }
        ListenableFutureTask listenableFutureTask = ListenableFutureTask.create((Runnable)new k(this, aC2, i2, s2, m2, d10), null);
        Queue<u> queue = this.g;
        synchronized (queue) {
            this.g.add(new u(this, listenableFutureTask, d10));
            return listenableFutureTask;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(s s2) {
        boolean bl2;
        int[] arrn = s.r();
        s2.q().lock();
        int[] arrn2 = arrn;
        try {
            boolean bl3;
            h h2 = s2.o();
            h2.a(new l(this, h2));
            boolean bl4 = bl3 = this.d.offer(h2);
            if (arrn2 != null) {
                if (!bl4) {
                    h2.f();
                }
                bl4 = bl3;
            }
            bl2 = bl4;
        }
        finally {
            s2.q().unlock();
        }
        return bl2;
    }

    public void f() {
        block6: {
            Runnable runnable;
            Iterator<Runnable> iterator;
            int[] arrn;
            block5: {
                int[] arrn2 = s.r();
                this.b();
                arrn = arrn2;
                iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    runnable = iterator.next();
                    ((g)runnable).b();
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block5;
                }
                iterator = this.i.iterator();
            }
            while (iterator.hasNext()) {
                runnable = (Thread)iterator.next();
                try {
                    ((Thread)runnable).interrupt();
                    ((Thread)runnable).join();
                    if (arrn == null) break block6;
                }
                catch (InterruptedException interruptedException) {
                    j.warn("Interrupted whilst waiting for worker to die", (Throwable)interruptedException);
                }
                if (arrn != null) continue;
            }
            this.f.clear();
        }
    }

    static PriorityBlockingQueue a(b b10) {
        return b10.d;
    }

    public boolean d() {
        return this.f.isEmpty();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean h() {
        int[] arrn = s.r();
        boolean bl2 = this.d.isEmpty();
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.g.isEmpty();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public void b() {
        int[] arrn = s.r();
        while (!this.d.isEmpty()) {
            block4: {
                h h2;
                block3: {
                    h h3;
                    h2 = h3 = this.d.poll();
                    if (arrn == null) break block3;
                    if (h2 == null) break block4;
                    h2 = h3;
                }
                h2.f();
            }
            if (arrn != null) continue;
        }
    }

    private void a(I i2, c c10) {
        this.c.a(c10);
        this.c.a(i2);
    }

    public aW a() throws InterruptedException {
        return this.f.take();
    }

    private void a(I i2, int n2, s s2) {
        v.d(n2, 4864);
        v.M();
        s2.n();
        this.b.a(i2);
        v.B();
        v.w();
    }

    public b() {
        this(-1);
    }
}

