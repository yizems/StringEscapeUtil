import org.apache.commons.lang3.StringEscapeUtils;

public class Test {
    public static void main(String[] args) {
        System.out.println(StringEscapeUtils.unescapeJava("\"hahahha\""));
        System.out.println(StringEscapeUtils.unescapeXml("\"<div>\\\"<div>\""));
        System.out.println(StringEscapeUtils.unescapeJson("\"{}\""));
        System.out.println(StringEscapeUtils.escapeJava("hahha\""));
    }
}
