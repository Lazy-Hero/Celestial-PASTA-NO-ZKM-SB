/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.a;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.ar.v;
import net.minecraft.client.D.t;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.aA;
import net.minecraft.client.a.al;
import net.minecraft.client.j.i;
import net.minecraft.client.j.p;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class A
extends i {
    private /* synthetic */ boolean q;
    @Nullable
    private final /* synthetic */ al p;
    @Nullable
    private /* synthetic */ BufferedImage i;
    public /* synthetic */ Boolean n;
    @Nullable
    private final /* synthetic */ File l;
    private static final /* synthetic */ Logger j;
    public /* synthetic */ boolean o;
    private static final /* synthetic */ AtomicInteger k;
    @Nullable
    private /* synthetic */ Thread m;
    private final /* synthetic */ String r;

    static boolean c(A a10) {
        return a10.g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(t t2) throws IOException {
        A a10;
        block16: {
            block17: {
                String string;
                block14: {
                    block15: {
                        string = I.j();
                        a10 = this;
                        if (string != null) break block14;
                        if (a10.i != null) break block15;
                        a10 = this;
                        if (string != null) break block14;
                        if (a10.h != null) {
                            super.a(t2);
                        }
                    }
                    a10 = this;
                }
                if (string == null) {
                    if (a10.m != null) return;
                    a10 = this;
                }
                if (string != null) break block16;
                if (a10.l == null) break block17;
                a10 = this;
                if (string != null) break block16;
                if (a10.l.isFile()) {
                    j.debug("Loading http texture from local cache ({})", (Object)this.l);
                    try {
                        this.i = ImageIO.read(this.l);
                        A a11 = this;
                        if (string == null) {
                            if (a11.p != null) {
                                this.a(this.p.a(this.i));
                            }
                            a11 = this;
                        }
                        a11.d();
                        return;
                    }
                    catch (IOException iOException) {
                        j.error("Couldn't load skin {}", (Object)this.l, (Object)iOException);
                        this.f();
                        if (string == null) return;
                    }
                }
            }
            a10 = this;
        }
        a10.f();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() {
        String string = I.j();
        try {
            BufferedImage bufferedImage;
            block19: {
                ByteArrayInputStream byteArrayInputStream;
                block18: {
                    File file;
                    block17: {
                        cM cM2;
                        gg gg2 = gh.a(this.r, Q.P().au());
                        cM cM3 = cM2 = gh.a(gg2);
                        if (string == null) {
                            if (cM3.d() / 100 != 2) {
                                return;
                            }
                            cM3 = cM2;
                        }
                        byte[] arrby = cM3.a();
                        byteArrayInputStream = new ByteArrayInputStream(arrby);
                        file = this.l;
                        if (string != null) break block17;
                        if (file == null) break block18;
                        FileUtils.copyInputStreamToFile((InputStream)byteArrayInputStream, (File)this.l);
                        file = this.l;
                    }
                    bufferedImage = ImageIO.read(file);
                    if (string == null) break block19;
                }
                bufferedImage = net.minecraft.client.j.p.a(byteArrayInputStream);
            }
            A a10 = this;
            if (string == null) {
                if (a10.p != null) {
                    bufferedImage = this.p.a(bufferedImage);
                }
                this.a(bufferedImage);
                a10 = this;
            }
            a10.d();
        }
        catch (Exception exception) {
            j.error("Couldn't download http texture: " + exception.getClass().getName() + ": " + exception.getMessage());
            return;
        }
        finally {
            this.d();
        }
    }

    static al f(A a10) {
        return a10.p;
    }

    static void a(A a10) {
        a10.d();
    }

    static String e(A a10) {
        return a10.r;
    }

    static {
        j = LogManager.getLogger();
        k = new AtomicInteger(0);
    }

    @Override
    public int c() {
        this.e();
        return super.c();
    }

    static Logger h() {
        return j;
    }

    static File b(A a10) {
        return a10.l;
    }

    public A(@Nullable File file, String string, v v2, @Nullable al al2) {
        super(v2);
        this.n = null;
        this.o = false;
        this.l = file;
        this.r = string;
        this.p = al2;
    }

    public void a(BufferedImage bufferedImage) {
        this.i = bufferedImage;
        String string = I.j();
        A a10 = this;
        if (string == null) {
            if (a10.p != null) {
                this.p.a();
            }
            a10 = this;
        }
        a10.n = this.i != null;
    }

    protected void f() {
        this.m = new aA(this, "Texture Downloader #" + k.incrementAndGet());
        this.m.setDaemon(true);
        this.m.start();
    }

    private void e() {
        block6: {
            A a10;
            String string;
            block7: {
                block5: {
                    string = I.j();
                    a10 = this;
                    if (string != null) break block5;
                    if (a10.q) break block6;
                    a10 = this;
                }
                if (string != null) break block7;
                if (a10.i == null) break block6;
                this.q = true;
                a10 = this;
            }
            if (string == null) {
                if (a10.h != null) {
                    this.c();
                }
                a10 = this;
            }
            net.minecraft.client.j.p.a(super.c(), this.i);
        }
    }

    private void d() {
        block3: {
            al al2;
            block2: {
                String string = I.j();
                this.n = this.i != null;
                al2 = this.p;
                if (string != null) break block2;
                if (!(al2 instanceof hw)) break block3;
                al2 = this.p;
            }
            hw hw2 = (hw)al2;
            hw2.b();
        }
    }

    private boolean g() {
        block10: {
            Proxy.Type type;
            Proxy.Type type2;
            block9: {
                String string;
                block8: {
                    boolean bl2;
                    block7: {
                        string = I.j();
                        bl2 = this.o;
                        if (string != null) break block7;
                        if (bl2) break block8;
                        bl2 = false;
                    }
                    return bl2;
                }
                Proxy proxy = Q.P().au();
                type2 = proxy.type();
                type = Proxy.Type.DIRECT;
                if (string != null) break block9;
                if (type2 == type) break block10;
                type2 = proxy.type();
                type = Proxy.Type.SOCKS;
            }
            if (type2 != type) {
                return false;
            }
        }
        return this.r.startsWith("http://");
    }

    static void d(A a10) {
        a10.a();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

