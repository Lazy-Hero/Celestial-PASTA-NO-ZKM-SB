/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 */
package net.minecraft.client.a;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import net.minecraft.client.Q;
import net.minecraft.client.a.A;
import net.minecraft.client.a.I;
import net.minecraft.client.j.p;
import org.apache.commons.io.FileUtils;

class aA
extends Thread {
    final /* synthetic */ A a;

    aA(A a10, String string) {
        this.a = a10;
        super(string);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        String string;
        HttpURLConnection httpURLConnection;
        block37: {
            HttpURLConnection httpURLConnection2;
            block28: {
                block29: {
                    block31: {
                        A a10;
                        block30: {
                            httpURLConnection = null;
                            string = I.j();
                            A.h().debug("Downloading http texture from {} to {}", (Object)A.e(this.a), (Object)A.b(this.a));
                            a10 = this.a;
                            if (string != null) break block30;
                            if (!A.c(a10)) break block31;
                            a10 = this.a;
                        }
                        A.d(a10);
                        if (string == null) return;
                    }
                    try {
                        BufferedImage bufferedImage;
                        block36: {
                            block35: {
                                File file;
                                block34: {
                                    block33: {
                                        block32: {
                                            httpURLConnection = (HttpURLConnection)new URL(A.e(this.a)).openConnection(Q.P().au());
                                            httpURLConnection.setDoInput(true);
                                            httpURLConnection.setDoOutput(false);
                                            httpURLConnection.connect();
                                            httpURLConnection2 = httpURLConnection;
                                            if (string != null) break block32;
                                            if (httpURLConnection2.getResponseCode() / 100 == 2) break block33;
                                            httpURLConnection2 = httpURLConnection;
                                        }
                                        if (string == null) {
                                            if (httpURLConnection2.getErrorStream() != null) {
                                                fU.b(httpURLConnection.getErrorStream());
                                            }
                                            httpURLConnection2 = httpURLConnection;
                                        }
                                        if (string != null) break block28;
                                        break block29;
                                    }
                                    file = A.b(this.a);
                                    if (string != null) break block34;
                                    if (file == null) break block35;
                                    FileUtils.copyInputStreamToFile((InputStream)httpURLConnection.getInputStream(), (File)A.b(this.a));
                                    file = A.b(this.a);
                                }
                                bufferedImage = ImageIO.read(file);
                                if (string == null) break block36;
                            }
                            bufferedImage = p.a(httpURLConnection.getInputStream());
                        }
                        A a11 = this.a;
                        if (string == null) {
                            if (A.f(a11) != null) {
                                bufferedImage = A.f(this.a).a(bufferedImage);
                            }
                            a11 = this.a;
                        }
                        a11.a(bufferedImage);
                        return;
                    }
                    catch (Exception exception) {
                        A.h().error("Couldn't download http texture: " + exception.getMessage());
                        return;
                    }
                }
                if (httpURLConnection2 == null) break block37;
                httpURLConnection2 = httpURLConnection;
            }
            httpURLConnection2.disconnect();
        }
        A.a(this.a);
        return;
        finally {
            if (string == null) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                A.a(this.a);
            }
        }
    }
}

