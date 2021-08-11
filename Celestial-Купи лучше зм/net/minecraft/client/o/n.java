/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  javax.annotation.Nullable
 */
package net.minecraft.client.o;

import com.google.common.util.concurrent.FutureCallback;
import javax.annotation.Nullable;
import net.minecraft.client.o.j;
import net.minecraft.d.d;
import net.minecraft.d.k;

class n
implements FutureCallback<Object> {
    final /* synthetic */ j a;

    n(j j2) {
        this.a = j2;
    }

    public void onFailure(Throwable throwable) {
        j.b(this.a).a(new d(k.FAILED_DOWNLOAD));
    }

    public void onSuccess(@Nullable Object object) {
        j.b(this.a).a(new d(k.SUCCESSFULLY_LOADED));
    }
}

