/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 *  com.google.gson.TypeAdapterFactory
 *  javax.annotation.Nullable
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.FilenameUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.a1;
import net.minecraft.a3;
import net.minecraft.aD;
import net.minecraft.aE;
import net.minecraft.aG;
import net.minecraft.aN;
import net.minecraft.aX;
import net.minecraft.a_;
import net.minecraft.ar.S;
import net.minecraft.ar.v;
import net.minecraft.at.i;
import net.minecraft.at.k;
import net.minecraft.at.m;
import net.minecraft.at.o;
import net.minecraft.az.t;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a7 {
    private final /* synthetic */ File a;
    private static final /* synthetic */ a_ e;
    private /* synthetic */ boolean b;
    private static final /* synthetic */ Logger c;
    private static final /* synthetic */ Gson d;

    public Iterable<aN> d() {
        return e.b();
    }

    public void b() {
        this.b = false;
        e.a();
        Map<v, a1> map = this.a();
        this.a(map);
        e.a(map);
        Iterator<aN> iterator = e.c().iterator();
        boolean bl2 = aG.b();
        while (iterator.hasNext()) {
            block4: {
                aN aN2;
                block3: {
                    aN aN3;
                    aN2 = aN3 = iterator.next();
                    if (!bl2) break block3;
                    if (aN2.d() == null) break block4;
                    aN2 = aN3;
                }
                aD.a(aN2);
            }
            if (bl2) continue;
        }
    }

    public boolean c() {
        return this.b;
    }

    @Nullable
    public aN a(v v2) {
        return e.a(v2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(Map<v, a1> map) {
        block20: {
            FileSystem fileSystem = null;
            boolean bl2 = aG.a();
            try {
                block23: {
                    block21: {
                        Path path;
                        block26: {
                            boolean bl3;
                            URI uRI;
                            block24: {
                                block25: {
                                    URL uRL = a7.class.getResource("/assets/.mcassetsroot");
                                    if (bl2) break block20;
                                    if (uRL == null) break block23;
                                    uRI = uRL.toURI();
                                    bl3 = "file".equals(uRI.getScheme());
                                    if (bl2) break block24;
                                    if (!bl3) break block25;
                                    path = Paths.get(t.class.getResource("/assets/minecraft/advancements").toURI());
                                    if (!bl2) break block26;
                                }
                                bl3 = "jar".equals(uRI.getScheme());
                            }
                            if (!bl3) {
                                c.error("Unsupported scheme " + uRI + " trying to list all built-in advancements (NYI?)");
                                this.b = true;
                                IOUtils.closeQuietly((Closeable)fileSystem);
                                return;
                            }
                            fileSystem = FileSystems.newFileSystem(uRI, Collections.emptyMap());
                            path = fileSystem.getPath("/assets/minecraft/advancements", new String[0]);
                        }
                        Iterator iterator = Files.walk(path, new FileVisitOption[0]).iterator();
                        while (iterator.hasNext()) {
                            Path path2;
                            String string;
                            v v2;
                            Path path3 = (Path)iterator.next();
                            if (bl2) break block21;
                            if ("json".equals(FilenameUtils.getExtension((String)path3.toString())) && !map.containsKey(v2 = new v("minecraft", string = FilenameUtils.removeExtension((String)(path2 = path.relativize(path3)).toString()).replaceAll("\\\\", "/")))) {
                                BufferedReader bufferedReader = null;
                                try {
                                    bufferedReader = Files.newBufferedReader(path3);
                                    a1 a12 = net.minecraft.ar.aG.a(d, (Reader)bufferedReader, a1.class);
                                    map.put(v2, a12);
                                }
                                catch (JsonParseException jsonParseException) {
                                    c.error("Parsing error loading built-in advancement " + v2, (Throwable)jsonParseException);
                                    this.b = true;
                                }
                                catch (IOException iOException) {
                                    c.error("Couldn't read advancement " + v2 + " from " + path3, (Throwable)iOException);
                                    this.b = true;
                                }
                                finally {
                                    IOUtils.closeQuietly((Reader)bufferedReader);
                                }
                            }
                            if (!bl2) continue;
                        }
                        IOUtils.closeQuietly((Closeable)fileSystem);
                    }
                    return;
                }
                c.error("Couldn't find .mcassetsroot");
                this.b = true;
            }
            catch (IOException | URISyntaxException exception) {
                c.error("Couldn't get a list of all built-in advancement files", (Throwable)exception);
                this.b = true;
                return;
            }
            finally {
                IOUtils.closeQuietly(fileSystem);
            }
        }
    }

    public a7(@Nullable File file) {
        this.a = file;
        this.b();
    }

    static {
        c = LogManager.getLogger();
        d = new GsonBuilder().registerTypeHierarchyAdapter(a1.class, (Object)new aE()).registerTypeAdapter(aX.class, (Object)new a3()).registerTypeHierarchyAdapter(k.class, (Object)new o()).registerTypeHierarchyAdapter(i.class, (Object)new m()).registerTypeAdapterFactory((TypeAdapterFactory)new S()).create();
        e = new a_();
    }

    private Map<v, a1> a() {
        boolean bl2 = aG.b();
        if (this.a == null) {
            return Maps.newHashMap();
        }
        HashMap hashMap = Maps.newHashMap();
        this.a.mkdirs();
        for (File file : FileUtils.listFiles((File)this.a, (String[])new String[]{"json"}, (boolean)true)) {
            block8: {
                String string = FilenameUtils.removeExtension((String)this.a.toURI().relativize(file.toURI()).toString());
                String[] arrstring = string.split("/", 2);
                if (arrstring.length == 2) {
                    v v2 = new v(arrstring[0], arrstring[1]);
                    try {
                        a1 a12;
                        a1 a13 = a12 = net.minecraft.ar.aG.a(d, FileUtils.readFileToString((File)file, (Charset)StandardCharsets.UTF_8), a1.class);
                        if (!bl2) break block8;
                        if (a13 == null) {
                            c.error("Couldn't load custom advancement " + v2 + " from " + file + " as it's empty or null");
                            if (bl2) break block8;
                        }
                        a13 = hashMap.put(v2, a12);
                    }
                    catch (JsonParseException | IllegalArgumentException throwable) {
                        c.error("Parsing error loading custom advancement " + v2, throwable);
                        this.b = true;
                    }
                    catch (IOException iOException) {
                        c.error("Couldn't read custom advancement " + v2 + " from " + file, (Throwable)iOException);
                        this.b = true;
                    }
                }
            }
            if (bl2) continue;
        }
        return hashMap;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

