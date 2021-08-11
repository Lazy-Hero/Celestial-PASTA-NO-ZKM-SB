/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.E;

import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import net.minecraft.client.E.l;

public class q {
    private final /* synthetic */ String b;
    private final /* synthetic */ int a;

    private static int a(String string, int n2) {
        try {
            return Integer.parseInt(string.trim());
        }
        catch (Exception exception) {
            return n2;
        }
    }

    private q(String string, int n2) {
        this.b = string;
        this.a = n2;
    }

    private static String[] a(String string) {
        try {
            String string2 = "com.sun.jndi.dns.DnsContextFactory";
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            Hashtable<String, String> hashtable = new Hashtable<String, String>();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns:");
            hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            Attributes attributes = initialDirContext.getAttributes("_minecraft._tcp." + string, new String[]{"SRV"});
            String[] arrstring = attributes.get("srv").get().toString().split(" ", 4);
            return new String[]{arrstring[3], arrstring[2]};
        }
        catch (Throwable throwable) {
            return new String[]{string, Integer.toString(25565)};
        }
    }

    public String a() {
        try {
            return IDN.toASCII(this.b);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return "";
        }
    }

    public int b() {
        return this.a;
    }

    public static q b(String string) {
        int n2;
        String[] arrstring;
        Object object;
        String[] arrstring2;
        String string2;
        block15: {
            int n3;
            block11: {
                block12: {
                    int n4;
                    String string3;
                    block13: {
                        block14: {
                            int n5;
                            string2 = l.d();
                            String string4 = string;
                            if (string2 == null) {
                                if (string4 == null) {
                                    return null;
                                }
                                string4 = string;
                            }
                            arrstring2 = string4.split(":");
                            n3 = string.startsWith("[");
                            if (string2 != null) break block11;
                            if (n3 == 0) break block12;
                            n3 = n5 = string.indexOf("]");
                            if (string2 != null) break block11;
                            if (n3 <= 0) break block12;
                            string3 = string.substring(1, n5);
                            object = string.substring(n5 + 1).trim();
                            n4 = ((String)object).startsWith(":");
                            if (string2 != null) break block13;
                            if (n4 == 0) break block14;
                            n4 = ((String)object).isEmpty() ? 1 : 0;
                            if (string2 != null) break block13;
                            if (n4 != 0) break block14;
                            object = ((String)object).substring(1);
                            arrstring2 = new String[]{string3, object};
                            if (string2 == null) break block12;
                        }
                        n4 = 1;
                    }
                    String[] arrstring3 = new String[n4];
                    arrstring3[0] = string3;
                    arrstring2 = arrstring3;
                }
                arrstring = arrstring2;
                if (string2 != null) break block15;
                n3 = arrstring.length;
            }
            if (n3 > 2) {
                arrstring2 = new String[]{string};
            }
            arrstring = arrstring2;
        }
        String string5 = arrstring[0];
        int n5 = arrstring2.length;
        if (string2 == null) {
            n5 = n2 = n5 > 1 ? q.a(arrstring2[1], 25565) : 25565;
        }
        if (n2 == 25565) {
            object = q.a(string5);
            string5 = object[0];
            n2 = q.a(object[1], 25565);
        }
        return new q(string5, n2);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

