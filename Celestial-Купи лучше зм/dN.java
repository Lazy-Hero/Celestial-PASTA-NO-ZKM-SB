/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Q;
import net.minecraft.k.m;

public class dN {
    private static /* synthetic */ m[] b;
    public /* synthetic */ File d;
    public /* synthetic */ File c;

    public void a() {
        m[] arrm;
        ArrayList<String> arrayList;
        block11: {
            arrayList = new ArrayList<String>();
            arrm = dN.c();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
                String string = bufferedReader.readLine();
                while (string != null) {
                    arrayList.add(string);
                    string = bufferedReader.readLine();
                    if (arrm == null) {
                        if (arrm == null) continue;
                        m.b(!m.c());
                        break;
                    }
                    break block11;
                }
                bufferedReader.close();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        for (String string : arrayList) {
            block14: {
                hH hH2;
                String[] arrstring;
                block21: {
                    boolean bl2;
                    hH hH3;
                    block19: {
                        block20: {
                            block17: {
                                block18: {
                                    block15: {
                                        block16: {
                                            bE bE2;
                                            boolean bl3;
                                            block12: {
                                                block13: {
                                                    arrstring = string.split(":");
                                                    bl3 = string.toLowerCase().startsWith("module:");
                                                    if (arrm != null) break block12;
                                                    if (!bl3) break block13;
                                                    bE bE3 = bE2 = cj.b.i.a(arrstring[1]);
                                                    if (arrm == null) {
                                                        if (bE3 == null && arrm == null) continue;
                                                        bE2.b(Boolean.parseBoolean(arrstring[2]));
                                                        bE3 = bE2;
                                                    }
                                                    bE3.a(Integer.parseInt(arrstring[3]));
                                                    if (arrm == null) break block14;
                                                }
                                                bl3 = string.toLowerCase().startsWith("setting:");
                                            }
                                            if (!bl3 && arrm == null || (bE2 = cj.b.i.a(arrstring[2])) == null && arrm == null) continue;
                                            hH hH4 = hH3 = cj.b.f.a(arrstring[1]);
                                            if (arrm == null) {
                                                if (hH4 == null && arrm == null) continue;
                                                hH4 = hH3;
                                            }
                                            bl2 = hH4.d();
                                            if (arrm != null) break block15;
                                            if (!bl2) break block16;
                                            hH3.b(Boolean.parseBoolean(arrstring[3]));
                                            if (arrm == null) break block14;
                                        }
                                        bl2 = hH3.k();
                                    }
                                    if (arrm != null) break block17;
                                    if (!bl2) break block18;
                                    hH3.a(arrstring[3]);
                                    if (arrm == null) break block14;
                                }
                                bl2 = hH3.h();
                            }
                            if (arrm != null) break block19;
                            if (!bl2) break block20;
                            hH3.a(Double.parseDouble(arrstring[3]));
                            if (arrm == null) break block14;
                        }
                        hH2 = hH3;
                        if (arrm != null) break block21;
                        bl2 = hH2.s();
                    }
                    if (!bl2) break block14;
                    hH2 = hH3;
                }
                hH2.a(Integer.parseInt(arrstring[3]));
            }
            if (arrm == null) continue;
        }
    }

    public void b() {
        block13: {
            Iterator iterator;
            m[] arrm;
            Object object;
            ArrayList<String> arrayList;
            block12: {
                arrayList = new ArrayList<String>();
                object = cj.b.i.a().iterator();
                arrm = dN.c();
                while (object.hasNext()) {
                    iterator = object.next();
                    arrayList.add("Module:" + ((bE)((Object)iterator)).a() + ":" + ((bE)((Object)iterator)).i() + ":" + ((bE)((Object)iterator)).n());
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block12;
                }
                object = N.a().iterator();
            }
            while (object.hasNext()) {
                block16: {
                    boolean bl2;
                    block19: {
                        block20: {
                            block17: {
                                block18: {
                                    block14: {
                                        block15: {
                                            iterator = (hH)object.next();
                                            if (arrm != null) break block13;
                                            bl2 = ((hH)((Object)iterator)).d();
                                            if (arrm != null) break block14;
                                            if (!bl2) break block15;
                                            arrayList.add("Setting:" + ((hH)((Object)iterator)).a() + ":" + ((hH)((Object)iterator)).j().a() + ":" + ((hH)((Object)iterator)).l());
                                            if (arrm == null) break block16;
                                        }
                                        bl2 = ((hH)((Object)iterator)).k();
                                    }
                                    if (arrm != null) break block17;
                                    if (!bl2) break block18;
                                    arrayList.add("Setting:" + ((hH)((Object)iterator)).a() + ":" + ((hH)((Object)iterator)).j().a() + ":" + ((hH)((Object)iterator)).m());
                                    if (arrm == null) break block16;
                                }
                                bl2 = ((hH)((Object)iterator)).h();
                            }
                            if (arrm != null) break block19;
                            if (!bl2) break block20;
                            arrayList.add("Setting:" + ((hH)((Object)iterator)).a() + ":" + ((hH)((Object)iterator)).j().a() + ":" + ((hH)((Object)iterator)).f());
                            if (arrm == null) break block16;
                        }
                        bl2 = ((hH)((Object)iterator)).s();
                    }
                    if (arrm == null && bl2) {
                        bl2 = arrayList.add("Setting:" + ((hH)((Object)iterator)).a() + ":" + ((hH)((Object)iterator)).j().a() + ":" + ((hH)((Object)iterator)).o());
                    }
                }
                if (arrm == null) continue;
            }
            try {
                object = new PrintWriter(this.c);
                for (String string : arrayList) {
                    ((PrintWriter)object).println(string);
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block13;
                }
                ((PrintWriter)object).close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static m[] c() {
        return b;
    }

    static {
        if (dN.c() != null) {
            dN.b(new m[2]);
        }
    }

    public dN() {
        block7: {
            dN dN2;
            block6: {
                boolean bl2;
                block5: {
                    m[] arrm = dN.c();
                    m[] arrm2 = arrm;
                    this.d = new File(Q.P().aJ, cj.e);
                    bl2 = this.d.exists();
                    if (arrm2 != null) break block5;
                    if (!bl2) {
                        this.d.mkdir();
                    }
                    this.c = new File(this.d, "config.txt");
                    dN2 = this;
                    if (arrm2 != null) break block6;
                    bl2 = dN2.c.exists();
                }
                if (!bl2) {
                    try {
                        this.c.createNewFile();
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
                dN2 = this;
            }
            dN2.a();
            if (!m.c()) break block7;
            dN.b(new m[2]);
        }
    }

    public static void b(m[] arrm) {
        b = arrm;
    }
}

