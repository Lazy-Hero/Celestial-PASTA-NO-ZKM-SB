/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.aw;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.aw.q;
import net.minecraft.aw.w;

public class h
implements Runnable {
    private volatile /* synthetic */ long e;
    private static final /* synthetic */ h a;
    private final /* synthetic */ List<q> d;
    private volatile /* synthetic */ long b;
    private volatile /* synthetic */ boolean c;

    private h() {
        this.d = Collections.synchronizedList(Lists.newArrayList());
        Thread thread = new Thread((Runnable)this, "File IO Thread");
        thread.setPriority(1);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            this.c();
        }
    }

    public void a(q q2) {
        String[] arrstring = w.d();
        boolean bl2 = this.d.contains(q2);
        if (arrstring != null && !bl2) {
            ++this.e;
            bl2 = this.d.add(q2);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        a = new h();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void c() {
        block7: {
            var1_3 = w.d();
            for (var2_1 = 0; var2_1 < this.d.size(); ++var2_1) {
                var3_4 = this.d.get(var2_1);
                v0 = var4_5 = var3_4.a();
                if (var1_3 == null) break block7;
                if (var1_3 == null) ** GOTO lbl13
                if (!v0) {
                    this.d.remove(var2_1--);
                    ++this.b;
                }
                try {
                    v1 = this.c;
lbl13:
                    // 2 sources

                    Thread.sleep(v1 != false ? 0L : 10L);
                    continue;
                }
                catch (InterruptedException var5_6) {
                    var5_6.printStackTrace();
                }
                if (var1_3 != null) continue;
            }
            v0 = this.d.isEmpty();
        }
        if (v0 == false) return;
        try {
            Thread.sleep(25L);
            return;
        }
        catch (InterruptedException var2_2) {
            var2_2.printStackTrace();
        }
    }

    public static h a() {
        return a;
    }

    public void b() throws InterruptedException {
        block2: {
            this.c = true;
            String[] arrstring = w.d();
            while (this.e != this.b) {
                Thread.sleep(10L);
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block2;
            }
            this.c = false;
        }
    }
}

