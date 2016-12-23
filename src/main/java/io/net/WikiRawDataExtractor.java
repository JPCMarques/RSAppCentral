package io.net;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

/**
 * Created by joaop on 22/12/2016.
 */
public abstract class WikiRawDataExtractor {
    public static final String needlessDataRegex = "(\\{\\{|\\[\\[|\\]\\]|\\}\\})";
    public static String getRawData(String url) throws IOException {
        InputStream dataStream = new URL(url).openStream();
        return IOUtils.toString(dataStream);
    }

    private static String replaceData(String data){
        return data.replaceAll(needlessDataRegex, "");
    }
}
