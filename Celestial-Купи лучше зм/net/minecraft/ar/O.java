/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListeningExecutorService
 *  com.google.common.util.concurrent.MoreExecutors
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ar;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import net.minecraft.ar.aE;
import net.minecraft.ar.u;
import net.minecraft.ar.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class O {
    private static final /* synthetic */ Logger b;
    private static final /* synthetic */ AtomicInteger c;
    public static final /* synthetic */ ListeningExecutorService a;

    static {
        a = MoreExecutors.listeningDecorator((ExecutorService)Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Downloader %d").build()));
        c = new AtomicInteger(0);
        b = LogManager.getLogger();
    }

    public static ListenableFuture<Object> a(File file, String string, Map<String, String> map, int n2, @Nullable u u2, Proxy proxy) {
        ListenableFuture listenableFuture = a.submit((Runnable)new aE(u2, string, proxy, map, file, n2));
        return listenableFuture;
    }

    public static String a(URL uRL, Map<String, Object> map, boolean bl2, @Nullable Proxy proxy) {
        return O.a(uRL, O.a(map), bl2, proxy);
    }

    static Logger a() {
        return b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String a(URL uRL, String string, boolean bl2, @Nullable Proxy proxy) {
        int n2 = v.b();
        try {
            String string2;
            block8: {
                Proxy proxy2;
                block7: {
                    proxy2 = proxy;
                    if (n2 != 0) break block7;
                    if (proxy2 != null) break block8;
                    proxy2 = Proxy.NO_PROXY;
                }
                proxy = proxy2;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection(proxy);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", "" + string.getBytes().length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(string);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string2);
                stringBuffer.append('\r');
                if (n2 != 0) return stringBuffer.toString();
                if (n2 == 0) continue;
            }
            bufferedReader.close();
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            if (bl2) return "";
            b.error("Could not post to {}", (Object)uRL, (Object)exception);
            return "";
        }
    }

    public static String a(Map<String, Object> map) {
        StringBuilder stringBuilder;
        block8: {
            StringBuilder stringBuilder2 = new StringBuilder();
            Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
            int n2 = v.b();
            while (iterator.hasNext()) {
                Map.Entry<String, Object> entry = iterator.next();
                stringBuilder = stringBuilder2;
                if (n2 != 0) break block8;
                if (n2 == 0) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder2.append('&');
                    }
                    try {
                        stringBuilder2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                        unsupportedEncodingException.printStackTrace();
                    }
                }
                if (entry.getValue() != null) {
                    stringBuilder2.append('=');
                    try {
                        stringBuilder2.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                        unsupportedEncodingException.printStackTrace();
                    }
                }
                if (n2 == 0) continue;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int b() throws IOException {
        ServerSocket serverSocket = null;
        int n2 = -1;
        int n3 = v.b();
        try {
            serverSocket = new ServerSocket(0);
            n2 = serverSocket.getLocalPort();
        }
        catch (Throwable throwable) {
            try {
                ServerSocket serverSocket2 = serverSocket;
                if (n3 == 0) {
                    if (serverSocket2 == null) throw throwable;
                    serverSocket2 = serverSocket;
                }
                serverSocket2.close();
                throw throwable;
            }
            catch (IOException iOException) {
                // empty catch block
            }
            throw throwable;
        }
        try {
            ServerSocket serverSocket3 = serverSocket;
            if (n3 == 0) {
                if (serverSocket3 == null) return n2;
                serverSocket3 = serverSocket;
            }
            serverSocket3.close();
            return n2;
        }
        catch (IOException iOException) {
            return n2;
        }
    }
}

