/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.SettableFuture
 *  javax.annotation.Nullable
 *  org.apache.commons.io.FileUtils
 */
package net.minecraft.client.D;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import javax.annotation.Nullable;
import net.minecraft.client.D.h;
import net.minecraft.client.D.w;
import org.apache.commons.io.FileUtils;

class C
implements FutureCallback<Object> {
    final /* synthetic */ File b;
    final /* synthetic */ String a;
    final /* synthetic */ w c;
    final /* synthetic */ SettableFuture d;

    public void onSuccess(@Nullable Object object) {
        block2: {
            boolean bl2;
            block3: {
                boolean bl3 = h.c();
                bl2 = w.a(this.c, this.a, this.b);
                if (!bl3) break block2;
                if (!bl2) break block3;
                this.c.c(this.b);
                this.d.set(null);
                if (bl3) break block2;
            }
            w.g().warn("Deleting file {}", (Object)this.b);
            bl2 = FileUtils.deleteQuietly((File)this.b);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void onFailure(Throwable throwable) {
        FileUtils.deleteQuietly((File)this.b);
        this.d.setException(throwable);
    }

    C(w w2, String string, File file, SettableFuture settableFuture) {
        this.c = w2;
        this.a = string;
        this.b = file;
        this.d = settableFuture;
    }
}

