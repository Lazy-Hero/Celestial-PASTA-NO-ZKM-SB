/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class a_ {
    private final /* synthetic */ List<eC> b;
    private /* synthetic */ eV n;
    private /* synthetic */ boolean t;
    private /* synthetic */ long l;
    private /* synthetic */ long c;
    private static final /* synthetic */ String o;
    private /* synthetic */ Proxy e;
    public static final /* synthetic */ int h;
    public static final /* synthetic */ int r;
    private /* synthetic */ InputStream s;
    private /* synthetic */ aM p;
    private /* synthetic */ String q;
    private /* synthetic */ int j;
    private static final /* synthetic */ Pattern a;
    private /* synthetic */ OutputStream f;
    private /* synthetic */ int d;
    private /* synthetic */ Socket m;
    private /* synthetic */ int i;
    private final /* synthetic */ List<eC> k;
    private /* synthetic */ boolean g;

    public synchronized eC l() throws InterruptedException {
        return this.a(this.b, false);
    }

    private void b() {
        block3: {
            long l2;
            a_ a_2;
            block2: {
                String string = K.d();
                a_2 = this;
                if (string != null) break block2;
                if (a_2.m == null) break block3;
                a_2 = this;
            }
            long l3 = a_2.c;
            if (this.b.size() > 0) {
                l3 = 5000L;
            }
            if ((l2 = System.currentTimeMillis()) > this.l + l3) {
                this.a(new InterruptedException("Timeout " + l3));
            }
        }
    }

    public synchronized boolean e() {
        String string = K.d();
        int n2 = this.t;
        if (string == null) {
            if (n2 != 0) {
                return true;
            }
            n2 = this.j;
        }
        if (string == null) {
            n2 = n2 >= this.d ? 1 : 0;
        }
        return n2 != 0;
    }

    public synchronized OutputStream i() throws InterruptedException, IOException {
        a_ a_2;
        block2: {
            String string = K.d();
            while (this.f == null) {
                this.b();
                a_2 = this;
                if (string == null) {
                    a_2.wait(1000L);
                    if (string == null) continue;
                }
                break block2;
            }
            a_2 = this;
        }
        return a_2.f;
    }

    private String[] a(String string, char c10) {
        int n2;
        block3: {
            int n3;
            block2: {
                n2 = string.indexOf(c10);
                String string2 = K.d();
                n3 = n2;
                if (string2 != null) break block2;
                if (n3 >= 0) break block3;
                n3 = 1;
            }
            String[] arrstring = new String[n3];
            arrstring[0] = string;
            return arrstring;
        }
        String string3 = string.substring(0, n2);
        String string4 = string.substring(n2 + 1);
        return new String[]{string3, string4};
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void b(Exception exception) {
        block4: {
            int n2;
            String string;
            block3: {
                string = K.d();
                n2 = this.b.size();
                if (string != null) break block3;
                if (n2 <= 0) break block4;
                n2 = this.g ? 1 : 0;
            }
            boolean bl2 = true;
            do {
                eC eC2;
                block6: {
                    block5: {
                        if (!bl2 || (bl2 = false)) break block5;
                        if (string != null) break block6;
                        if (n2 == 0) {
                            eC2 = this.b.remove(0);
                            eC2.b().a(eC2.a(), exception);
                            eC2.a(true);
                        }
                    }
                    n2 = this.b.size();
                }
                if (n2 <= 0) break;
                eC2 = this.b.remove(0);
                gh.a(eC2);
            } while (string == null);
        }
    }

    private void a(cM cM2) {
        block16: {
            String string;
            String string2;
            block15: {
                String string3;
                String string4;
                block13: {
                    block14: {
                        String string5 = cM2.a("Connection");
                        string2 = K.d();
                        string4 = string5;
                        if (string2 != null) break block13;
                        if (string4 == null) break block14;
                        string4 = string5;
                        if (string2 != null) break block13;
                        if (!string4.equalsIgnoreCase("keep-alive")) {
                            this.a(new EOFException("Connection not keep-alive"));
                        }
                    }
                    string4 = cM2.a("Keep-Alive");
                }
                string = string3 = string4;
                if (string2 != null) break block15;
                if (string == null) break block16;
                string = string3;
            }
            String[] arrstring = fU.c(string, ",;");
            int n2 = 0;
            while (n2 < arrstring.length) {
                block17: {
                    block18: {
                        int n3;
                        block21: {
                            int n4;
                            String[] arrstring2;
                            block19: {
                                block20: {
                                    String string6 = arrstring[n2];
                                    arrstring2 = this.a(string6, '=');
                                    if (string2 != null) break block17;
                                    if (arrstring2.length < 2) break block18;
                                    n4 = arrstring2[0].equals("timeout");
                                    if (string2 != null) break block19;
                                    if (n4 == 0) break block20;
                                    n4 = n3 = fU.b(arrstring2[1], -1);
                                    if (string2 != null) break block19;
                                    if (n4 > 0) {
                                        this.c = n3 * 1000;
                                    }
                                }
                                n4 = arrstring2[0].equals("max");
                            }
                            if (string2 != null) break block21;
                            if (n4 == 0) break block18;
                            n4 = n3 = fU.b(arrstring2[1], -1);
                        }
                        if (string2 != null) break block17;
                        if (n3 > 0) {
                            this.d = n3;
                        }
                    }
                    ++n2;
                }
                if (string2 == null) continue;
            }
        }
    }

    private void a(eC eC2, List<eC> list) {
        list.add(eC2);
        this.notifyAll();
    }

    public synchronized void a(eC eC2) {
        block3: {
            a_ a_2;
            block2: {
                String string = K.d();
                a_2 = this;
                if (string != null) break block2;
                if (a_2.t) break block3;
                a_2 = this;
            }
            a_2.a();
        }
    }

    public synchronized void a(Socket socket) throws IOException {
        block6: {
            a_ a_2;
            String string;
            block5: {
                string = K.d();
                a_2 = this;
                if (string != null) break block5;
                if (a_2.t) break block6;
                a_2 = this;
            }
            Socket socket2 = a_2.m;
            if (string == null) {
                if (socket2 != null) {
                    throw new IllegalArgumentException("Already connected");
                }
                socket2 = this.m = socket;
            }
            socket2.setTcpNoDelay(true);
            this.s = this.m.getInputStream();
            this.f = new BufferedOutputStream(this.m.getOutputStream());
            this.a();
            this.notifyAll();
        }
    }

    private String a(String string, gg gg2) {
        String string2;
        int n2;
        String string3;
        String string4;
        block13: {
            int n3;
            block12: {
                String string5;
                String string6;
                block11: {
                    boolean bl2;
                    block10: {
                        string6 = K.d();
                        bl2 = a.matcher(string).matches();
                        if (string6 != null) break block10;
                        if (bl2) {
                            return string;
                        }
                        string5 = string;
                        if (string6 != null) break block11;
                        bl2 = string5.startsWith("//");
                    }
                    if (bl2) {
                        return "http:" + string;
                    }
                    string5 = gg2.d();
                }
                string4 = string5;
                n3 = gg2.a();
                if (string6 != null) break block12;
                if (n3 != 80) {
                    string4 = string4 + ":" + gg2.a();
                }
                string3 = string;
                if (string6 != null) break block13;
                n3 = string3.startsWith("/") ? 1 : 0;
            }
            if (n3 != 0) {
                return "http://" + string4 + string;
            }
            string3 = gg2.b();
        }
        return (n2 = (string2 = string3).lastIndexOf("/")) >= 0 ? "http://" + string4 + string2.substring(0, n2 + 1) + string : "http://" + string4 + "/" + string;
    }

    public synchronized InputStream d() throws InterruptedException, IOException {
        a_ a_2;
        block2: {
            String string = K.d();
            while (this.s == null) {
                this.b();
                a_2 = this;
                if (string == null) {
                    a_2.wait(1000L);
                    if (string == null) continue;
                }
                break block2;
            }
            a_2 = this;
        }
        return a_2.s;
    }

    public int c() {
        return this.i;
    }

    private eC a(List<eC> list, boolean bl2) throws InterruptedException {
        Object object;
        block8: {
            block7: {
                String string = K.d();
                while (list.size() <= 0) {
                    this.b();
                    this.wait(1000L);
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block7;
                }
                object = this;
                if (string != null) break block8;
                ((a_)object).a();
            }
            if (bl2) {
                return list.remove(0);
            }
            object = list.get(0);
        }
        return (eC)object;
    }

    public a_(String string, int n2) {
        this(string, n2, Proxy.NO_PROXY);
    }

    public synchronized boolean b(eC eC2) {
        String string = K.d();
        boolean bl2 = this.e();
        if (string == null) {
            if (bl2) {
                return false;
            }
            this.a(eC2, this.b);
            this.a(eC2, this.k);
            ++this.j;
            bl2 = true;
        }
        return bl2;
    }

    public synchronized boolean h() {
        String string = K.d();
        boolean bl2 = this.b.size();
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public synchronized void a(eC var1_1, cM var2_2) {
        block12: {
            block14: {
                block13: {
                    var3_3 = K.d();
                    v0 = this.t;
                    if (var3_3 != null) break block13;
                    if (v0 != 0) return;
                    this.g = true;
                    this.a();
                    v1 = this.b;
                    if (var3_3 != null) break block14;
                    v0 = v1.size();
                }
                if (v0 <= 0) throw new IllegalArgumentException("Response out of order: " + var1_1);
                v1 = this.b.get(0);
            }
            if (var3_3 == null) {
                if (v1 != var1_1) throw new IllegalArgumentException("Response out of order: " + var1_1);
                v1 = this.b.remove(0);
            }
            var1_1.a(true);
            var4_4 = var2_2.a("Location");
            if (var2_2.d() / 100 == 3 && var4_4 != null) {
                v2 = var1_1;
                if (var3_3 == null) {
                    if (v2.a().e() < 5) {
                        try {
                            var4_4 = this.a(var4_4, var1_1.a());
                            var5_5 = gh.a(var4_4, var1_1.a().h());
                            var5_5.a(var1_1.a().e() + 1);
                            var6_8 = new eC(var5_5, var1_1.b());
                            gh.a(var6_8);
                            break block12;
                        }
                        catch (IOException var5_6) {
                            var1_1.b().a(var1_1.a(), var5_6);
                            if (var3_3 == null) break block12;
                        }
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 4 sources

            {
                v2 = var1_1;
            }
            var5_7 = v2.b();
            var5_7.a(var1_1.a(), var2_2);
        }
        this.a(var2_2);
        if (var3_3 == null) return;
        throw new IllegalArgumentException("Response out of order: " + var1_1);
    }

    public String f() {
        return this.q;
    }

    static {
        o = "\n";
        h = 5000;
        r = 5000;
        a = Pattern.compile("^[a-zA-Z]+://.*");
    }

    public Proxy j() {
        return this.e;
    }

    public synchronized eC g() throws IOException, InterruptedException {
        a_ a_2;
        block4: {
            block5: {
                String string = K.d();
                a_2 = this;
                if (string != null) break block4;
                if (a_2.k.size() > 0) break block5;
                a_2 = this;
                if (string != null) break block4;
                if (a_2.f != null) {
                    this.f.flush();
                }
            }
            a_2 = this;
        }
        return a_2.a(this.k, true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private synchronized void a(Exception var1_1) {
        block8: {
            var2_2 = K.d();
            v0 = this;
            if (var2_2 == null) {
                if (v0.t != false) return;
                this.t = true;
                this.b(var1_1);
                v0 = this;
            }
            if (var2_2 == null) {
                if (v0.n != null) {
                    this.n.interrupt();
                }
                v0 = this;
            }
            if (var2_2 != null) ** GOTO lbl17
            if (v0.p != null) {
                this.p.interrupt();
            }
            try {
                v0 = this;
lbl17:
                // 2 sources

                v1 = v0.m;
                if (var2_2 == null) {
                    if (v1 == null) break block8;
                    v1 = this.m;
                }
                v1.close();
            }
            catch (IOException var3_3) {
                // empty catch block
            }
        }
        this.m = null;
        this.s = null;
        this.f = null;
    }

    public int k() {
        return this.j;
    }

    public synchronized void b(eC eC2, Exception exception) {
        this.a(exception);
    }

    private static Exception c(Exception exception) {
        return exception;
    }

    public synchronized void a(eC eC2, Exception exception) {
        this.a(exception);
    }

    private void a() {
        this.l = System.currentTimeMillis();
    }

    public a_(String string, int n2, Proxy proxy) {
        this.q = null;
        this.i = 0;
        this.e = Proxy.NO_PROXY;
        this.b = new LinkedList<eC>();
        this.k = new LinkedList<eC>();
        this.m = null;
        this.s = null;
        this.f = null;
        this.n = null;
        this.p = null;
        this.j = 0;
        this.g = false;
        this.c = 5000L;
        this.d = 1000;
        this.l = System.currentTimeMillis();
        this.t = false;
        this.q = string;
        this.i = n2;
        this.e = proxy;
        this.n = new eV(this);
        this.n.start();
        this.p = new aM(this);
        this.p.start();
    }
}

