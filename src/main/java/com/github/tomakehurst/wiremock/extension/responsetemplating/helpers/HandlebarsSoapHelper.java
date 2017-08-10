package com.github.tomakehurst.wiremock.extension.responsetemplating.helpers;

/**
 * This class uses HandlebarsXmlHelper as a base an just set a prefix which reduce the written handlebars helper to the
 * relevant part
 *
 * @author Christopher Holomek
 */
public class HandlebarsSoapHelper extends HandlebarsXmlHelper {

    @Override
    protected String getXPathPrefix() {
        return "/Envelope/Body/";
    }
}